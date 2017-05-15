package com.cognizant.ams.service;

import java.util.List;

import com.cognizant.ams.entity.Agent;
import com.cognizant.ams.vo.AgentDetailsReturnVO;
import com.cognizant.ams.vo.AgentDetailsVO;

public interface AgentService {
	public List<AgentDetailsReturnVO> registerAgent(Agent agent);
	public Agent getAgentObject(AgentDetailsVO advo);
	
}
