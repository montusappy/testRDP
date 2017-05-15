package com.cognizant.ams.mapper;

import com.cognizant.ams.constant.PhoneTypeEnum;
import com.cognizant.ams.entity.Agent;
import com.cognizant.ams.entity.Contact;
import com.cognizant.ams.vo.AgentDetailsVO;

public class ModelToEntityMapper {

    public static Agent mapToEntity(AgentDetailsVO advo) {
        // **************************
        Agent agent = new Agent();
        agent.setAddress(advo.getAddress());
        agent.setState(advo.getState());
        agent.setCountry(advo.getCountry());
        agent.setPincode(advo.getPin());
        agent.setCity(advo.getCity());
        agent.setAgenntId(String.valueOf(Math.random()).substring(0, 5));
        agent.setAgent_user_id(advo.getName());
        // **************************
        agent.setEmail(advo.getEmail());
        agent.setDob(advo.getDob());
        agent.setName(advo.getName());
        agent.setDOJ(advo.getDoj());
        agent.setType(advo.getJobType());
        // **************************
        Contact contactPc = new Contact();
        contactPc.setAgent(agent);
        contactPc.setContact_id(String.valueOf(Math.random()).substring(0, 5));
        contactPc.setC_contact_no(advo.getPc());
        contactPc.setContactType(PhoneTypeEnum.primary.toString());

        Contact contactAc = new Contact();
        contactAc.setAgent(agent);
        contactAc.setC_contact_no(advo.getPc());
        contactAc.setContactType(PhoneTypeEnum.alternate.toString());
        contactAc.setContact_id(String.valueOf(Math.random()).substring(0, 5));
        agent.getContactList().add(contactPc);
        agent.getContactList().add(contactAc);

        return agent;
    }
}
