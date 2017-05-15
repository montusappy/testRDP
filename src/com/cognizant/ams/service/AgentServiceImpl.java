package com.cognizant.ams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ams.dao.AgentDAO;
import com.cognizant.ams.entity.Agent;
import com.cognizant.ams.mapper.ModelToEntityMapper;
import com.cognizant.ams.vo.AgentDetailsReturnVO;
import com.cognizant.ams.vo.AgentDetailsVO;

@Component
public class AgentServiceImpl implements AgentService {

    @Autowired
    AgentDAO agentDao;

    @Override
    @Transactional
    public List<AgentDetailsReturnVO> registerAgent(Agent agent) {
        List<AgentDetailsReturnVO> voList = agentDao.insertAgent(agent);
        return voList;
    }

    private void setPassword(Agent agent) {
        agent.setPassword(agent.getName().substring(0, 1) + agent.getAgenntId());
    }

    public Agent getAgentObject(AgentDetailsVO advo) {
        Agent agent = ModelToEntityMapper.mapToEntity(advo);
        setPassword(agent);
        return agent;
    }
}
