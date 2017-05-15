package com.cognizant.ams.controller;

import com.cognizant.ams.constant.AgentConstants;
import com.cognizant.ams.entity.Agent;
import com.cognizant.ams.service.AgentService;
import com.cognizant.ams.validator.AgentFormValidator;
import com.cognizant.ams.vo.AgentDetailsReturnVO;
import com.cognizant.ams.vo.AgentDetailsVO;

import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AgentController {
	
	
	@Autowired
	AgentService  agentService;
	
	@Autowired
	@Qualifier("agentValidator")
	private AgentFormValidator agentValidator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(agentValidator);
	}
	
	@ModelAttribute("agentForm")
	public AgentDetailsVO createAgentDetailsVO() {
		// ModelAttribute value should be same as used in the empSave.jsp
		return new AgentDetailsVO();
	}


	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerAgent(@ModelAttribute("agentForm") @Validated AgentDetailsVO agent, BindingResult bindingResult, ModelMap model) {	
		Agent advVo = agentService.getAgentObject(agent);
		if (bindingResult.hasErrors()) {
			System.out.println("Returning custSave.jsp page");
		}		
		//List<AgentDetailsReturnVO> voList = agentService.registerAgent(advVo);
		List<AgentDetailsReturnVO> voList = new ArrayList<AgentDetailsReturnVO>();
			AgentDetailsReturnVO vo = new AgentDetailsReturnVO();
			vo.setAc("a");
			AgentDetailsReturnVO vo1 = new AgentDetailsReturnVO();
			vo1.setAc("a");
			AgentDetailsReturnVO vo2= new AgentDetailsReturnVO();
			vo2.setAc("a");
			AgentDetailsReturnVO vo3= new AgentDetailsReturnVO();
			vo3.setAc("a");
			AgentDetailsReturnVO vo4= new AgentDetailsReturnVO();
			vo4.setAc("a");
			voList.add(vo);voList.add(vo1);	voList.add(vo2);voList.add(vo3);voList.add(vo4);
		model.put("agentList",voList);
		model.put("un", advVo.getAgent_user_id());
		model.put("pwd", advVo.getPassword());
		model.put("message", AgentConstants.successMessage);		
		return AgentConstants.viewAgentJspName;
	}
	
	@RequestMapping(value = "/")
	public String registerAgent(@ModelAttribute("agentForm") AgentDetailsVO agent) {		
		return AgentConstants.addAgentJspName;
	}

}
