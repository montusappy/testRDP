package com.cognizant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.ams.constant.PhoneTypeEnum;
import com.cognizant.ams.entity.Agent;
import com.cognizant.ams.entity.Contact;

public class AppTest {

	// public static void main(String[] args) {
	@org.junit.Test
	@Ignore
	public void Test() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("app.xml");
		SessionFactory sessionfa = (SessionFactory) appContext.getBean("sessionFactory");
		Session session = sessionfa.openSession();
		session.beginTransaction();
		Agent agent = new Agent();
		agent.setAddress("add");
		agent.setAgenntId(Integer.toString((int) (Math.random() * 50 + 1)));
		session.save(agent);
		Contact contact = new Contact();
		contact.setContact_id(Integer.toString((int) (Math.random() * 50 + 1)));
		contact.setAgent(agent);
		contact.setC_contact_no("sss");
		contact.setContactType(PhoneTypeEnum.primary.toString());
		session.saveOrUpdate(contact);
		agent.getContactList().add(contact);
		session.getTransaction().commit();
		System.out.println("Done");
	}
}
