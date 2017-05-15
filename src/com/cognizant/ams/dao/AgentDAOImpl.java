package com.cognizant.ams.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.cognizant.ams.constant.PhoneTypeEnum;
import com.cognizant.ams.entity.Agent;
import com.cognizant.ams.entity.Contact;
import com.cognizant.ams.vo.AgentDetailsReturnVO;

@Repository
public class AgentDAOImpl implements AgentDAO {

    @Autowired
    SessionFactory sessionFactory;
    String query = "Select a.agent_user_id as id,a.A_Name as name,a.A_email as email,a.A_DOJ as doj,"
                    + "a.A_Type as jobType,c.C_Contact_no as number,c.C_type as contactType from Agent a,"
                    + " Contact c where a.Agent_id = c.Agent_id";

    public List<AgentDetailsReturnVO> insertAgent(Agent agent) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(agent);
        for (Contact obj : agent.getContactList()) {
            obj.setAgent(agent);
            session.save(obj);
        }
        session.getTransaction().commit();
        List<Object[]> emp = session.createSQLQuery(query).list();
        session.close();
        return processResponse(emp);
    }

    private List<AgentDetailsReturnVO> processResponse(List<Object[]> voList) {
        List<AgentDetailsReturnVO> returnList = new ArrayList<AgentDetailsReturnVO>();
        AgentDetailsReturnVO emp = null;
        for (Object[] row : voList) {
            if (CollectionUtils.isEmpty(returnList) || !StringUtils.equals(emp.getId(), row[0].toString())) {
                emp = new AgentDetailsReturnVO();
                emp.setId(row[0].toString());
                emp.setName(row[1].toString());
                emp.setEmail(row[2].toString());
                emp.setDoj(row[3].toString());
                emp.setJobType(row[4].toString());
                emp.setNumber(row[5].toString());
                emp.setConactType(row[6].toString());
                if (emp.getConactType().equals(PhoneTypeEnum.primary.toString())) {
                    emp.setPc(emp.getNumber());
                } else {
                    emp.setAc(emp.getNumber());
                }
                returnList.add(emp);
            } else {
                if (row[6].toString().equals(PhoneTypeEnum.primary.toString())) {
                    emp.setPc(emp.getNumber());
                } else {
                    emp.setAc(emp.getNumber());
                }
            }
        }
        return returnList;

    }
}
