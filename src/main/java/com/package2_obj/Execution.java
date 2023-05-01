package com.package2_obj;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.package1_class.Employee;

public class Execution {

	public static void main(String[] args) {
		Transaction ts=null;
		try
		{
		
		Employee e=new Employee();
		//	e object is adding to session object
		
		Configuration cfg=new Configuration();
		cfg.configure("com\\package3_conf_map\\cong.xml");
		//	from cfg taking sessionFactory object
		
		SessionFactory sf=cfg.buildSessionFactory();
		//	from sf taking Session object
		Session ses=sf.openSession();
		//	 to do commit and rollback operation
		
		ts =ses.beginTransaction();
		
		//	ses object adding our object
		e.setId(120);
		e.setName("Vineeth");
		e.setSal(70000.00f);
		e.setDept("IT");
		System.out.println(e.toString());
		
		ses.save(e);
		
		ts.commit();
		
		System.out.println("Record Updated");
		}
		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
			ts.rollback();
		}
		

	}

}
