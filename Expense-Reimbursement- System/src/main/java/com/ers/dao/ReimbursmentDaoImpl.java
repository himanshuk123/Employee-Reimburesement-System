package com.ers.dao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ers.dbUtil.EmployeeMapper;
import com.ers.dbUtil.HibernateUtil;
import com.ers.dbUtil.ReimbursementMapper;
import com.ers.entity.EmployeeEntity;
import com.ers.entity.ReimEntity;
import com.ers.model.EmployeeModel;
import com.ers.model.ReimModel;

public class ReimbursmentDaoImpl {
	
	
	public void addReimbursment(ReimModel r) {
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			
			session.beginTransaction();  //insert,update,delete
			session.save(ReimbursementMapper.mapReim(r));
			System.out.println("Reimburment Request inserted...");
			session.getTransaction().commit();
			
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
	}
	
	public List<EmployeeEntity> displayparticularemp(String empid){
		List<EmployeeEntity> elist=new ArrayList<EmployeeEntity>();
		try {
		Session session=HibernateUtil.getSessionFactory().openSession();
		String q="From EmployeeEntity f where f.empid=\'"+empid+"\' ";

		Query q1 = session.createQuery(q);
 
		elist=q1.list();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return elist;
	}
	
	public List<ReimEntity> reimforpartemployee(String empid){
		List<ReimEntity> elist = new ArrayList<ReimEntity>();
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			String q="From ReimEntity f where f.empid=\'"+empid+"\' ";
			
			Query q1 = session.createQuery(q);
			elist=q1.list();
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return elist;
	}
	
	public List<ReimEntity> displayalreimbursement(){
		List<ReimEntity> elist = new ArrayList<ReimEntity>();
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			String q="From ReimEntity f";
			
			Query q1 = session.createQuery(q);
			elist=q1.list();
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return elist;
	}
	
	public List<ReimEntity> allrejectedreim(){
		List<ReimEntity> elist = new ArrayList<ReimEntity>();
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			String q="From ReimEntity f where f.reim_status='Rejected'";
			
			Query q1 = session.createQuery(q);
			elist=q1.list();
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return elist;
	}
	
	public List<ReimEntity> allacceptedreim(){
		List<ReimEntity> elist = new ArrayList<ReimEntity>();
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			String q="From ReimEntity f where f.reim_status='Accepted'";
			
			Query q1 = session.createQuery(q);
			elist=q1.list();
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return elist;
	}
	
	public List<ReimEntity> allpendingreim(){
		List<ReimEntity> elist = new ArrayList<ReimEntity>();
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			String q="From ReimEntity f where f.reim_status= null ";
			
			Query q1 = session.createQuery(q);
			elist=q1.list();
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return elist;
	}
	
	public void updatereim2(Integer reim_id,String reim_status){
try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();  
			
		
			ReimEntity rde=session.load(ReimEntity.class, reim_id);
			
			rde.setReim_status(reim_status);
			session.merge(rde);  
		
			System.out.println("Status Updated....");
			session.getTransaction().commit();
			session.close();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}

	}
	
	public void updateemp(EmployeeModel e) {
		
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction(); 
			EmployeeEntity ede = EmployeeMapper.mapEmployee(e);
			EmployeeEntity ede1 = session.load(EmployeeEntity.class,ede.getEmpid());
			ede1.setEmppassword(ede.getEmppassword());
			ede1.setEmpaddress(ede.getEmpaddress());
			ede1.setEmpdesignation(ede.getEmpdesignation());
			ede1.setEmpemail(ede.getEmpemail());
			ede1.setEmpphoneno(ede.getEmpphoneno());
			ede1.setEmpname(ede.getEmpname());
			ede1.setEmpdob(ede.getEmpdob());
			ede1.setEmpgender(ede.getEmpgender());
			ede1.setEmpldept(ede.getEmpldept());
		}
	catch (Exception e1) {
			
			e1.printStackTrace();
		}
	}

	
}
