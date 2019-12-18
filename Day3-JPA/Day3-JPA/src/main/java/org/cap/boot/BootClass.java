package org.cap.boot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.cap.model.Company;
import org.cap.model.Employee;

public class BootClass {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("jpademo");
		EntityManager entityManager=
				entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=
				entityManager.getTransaction();
		entityTransaction.begin();
		
		
		/*
		 * Company capg=new Company(1001, "Capgemini India Pvt Ltd"); Company tcs=new
		 * Company(1234, "TATA Consultancy Services");
		 * 
		 * 
		 * Employee employee=new Employee("Tom", "Jerry", 34000, capg); Employee
		 * employee1=new Employee("Jack", "Thomson", 34120, capg); Employee
		 * employee2=new Employee("Tim", "Lee", 354600, tcs); Employee employee3=new
		 * Employee("Annie", "George", 90000, tcs); Employee employee4=new
		 * Employee("Annie", "George", 90000, capg);
		 * 
		 * 
		 * entityManager.persist(tcs); entityManager.persist(capg);
		 * 
		 * entityManager.persist(employee4); entityManager.persist(employee3);
		 * entityManager.persist(employee2); entityManager.persist(employee1);
		 * entityManager.persist(employee);
		 */
		
		
		
		
		Query query=entityManager.createNamedQuery("findBySalary");
		query.setParameter("empsal", 10000.0);
		List<Employee> employees= query.getResultList();
		for(Employee employee:employees)
			System.out.println(employee + "-" + employee.getCompany().getCompanyName());
		
		
		//=====================NamedNativeQuery=======================================//
		
		  Query query2=entityManager.createNamedQuery("findAllFirstName");
		  List<Employee> firstNames= query2.getResultList();
		  System.out.println(firstNames); 
		 
		 
		//--------------------------------------------------------------------------
		//Query query3=entityManager.createNativeQuery("select max(salary) from employee"); 
		Query query3=entityManager.createNamedQuery("findMaxSalary");
		List<Double> list=query3.getResultList();
		//double salary= query3.getFirstResult();
		//System.out.println("Salary:" + salary);
		System.out.println(list);
		
		//======================TypedQuery====================//
		
		TypedQuery<Company> typedQuery= 
				entityManager.createQuery("select emp.company from Employee emp",
						Company.class);
		List<Company> companies= typedQuery.getResultList();
		  System.out.println(companies);
		  
		  
		  
		  //=====================Criteria Builder========================//
		  
		  CriteriaBuilder builder= entityManager.getCriteriaBuilder();
		  CriteriaQuery<Object> criteriaQuery= builder.createQuery();
		  
		  Root<Employee> root= criteriaQuery.from(Employee.class);
		  criteriaQuery.select(root);
		  criteriaQuery.orderBy(builder.desc(root.get("firstName")));
		 
		  List<Object> emps=  entityManager.createQuery(criteriaQuery).getResultList();
		  for(Object employee:emps)
			 System.out.println((Employee)employee);
			 
		  
		 
		 
		 
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
