package com.kce.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kce.bean.Employee;
import com.kce.util.HibernateUtil;

public class EmployeeDAO {
	public boolean saveData(Employee employee)
	{
		       // Create Session
				Session session = HibernateUtil.createSession().openSession();
				Transaction tx = null;
				try {
				tx = session.beginTransaction();
				// Inserting Data
				session.saveOrUpdate(employee);				
				tx.commit();
				}
				catch(HibernateException he)
				{
				he.printStackTrace();
				return false;
				}
				finally {
					session.close();
				}
				return true;
	}
	
	public Employee fetchData(Employee employee)
	{
		Session session = HibernateUtil.createSession().openSession();
		Transaction tx = null;
		try {
		tx = session.beginTransaction();
		Employee e=(Employee)session.get(Employee.class,employee.getEmployeeId());				
		tx.commit();
		return e;
		}
		catch(HibernateException he)
		{
		he.printStackTrace();
		return null;
		}
		finally {
			session.close();			
		}	
		
	}
	
	public boolean deleteEmployee(Employee e)
	{
		Session session = HibernateUtil.createSession().openSession();
		Transaction tx = null;
		try {
		tx = session.beginTransaction();
		session.delete(e);
		tx.commit();
		return true;
		}
		catch(HibernateException he)
		{
		he.printStackTrace();
		return false;
		}
		finally {
			session.close();			
		}	
		
		
	}
	
	
	
	
}
