package com.cognizant.ams.dao;

import java.util.List;

import com.cognizant.ams.entity.Agent;
import com.cognizant.ams.vo.AgentDetailsReturnVO;
import com.cognizant.ams.vo.AgentDetailsVO;

public interface AgentDAO {
	public List<AgentDetailsReturnVO> insertAgent(Agent agent);

}
