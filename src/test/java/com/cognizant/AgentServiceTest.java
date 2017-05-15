package com.cognizant;

import junit.framework.Assert;

import org.junit.Test;

import com.cognizant.ams.entity.Agent;
import com.cognizant.ams.service.AgentServiceImpl;
import com.cognizant.ams.vo.AgentDetailsVO;

public class AgentServiceTest {

    public static AgentDetailsVO vo = null;
    static {
        vo = new AgentDetailsVO();
        vo.setAc("asd");
        vo.setAddress("asd");
        vo.setCity("asd");
        vo.setCountry("asd");
        vo.setDob("asd");
        vo.setDoj("asd");
        vo.setJobType("asd");
        vo.setName("asd");
        vo.setPc("asd");
        vo.setPin("asd");
        vo.setState("asd");
    }

    @Test
    public void testMapper() {
        AgentServiceImpl impl = new AgentServiceImpl();
        Agent agent = impl.getAgentObject(vo);
        Assert.assertEquals(vo.getEmail(), agent.getEmail());
        Assert.assertEquals(vo.getAddress(), agent.getAddress());
        Assert.assertEquals(vo.getCity(), agent.getCity());
        Assert.assertEquals(vo.getCountry(), agent.getCountry());
        Assert.assertEquals(vo.getPc(), agent.getPincode());
    }
}
