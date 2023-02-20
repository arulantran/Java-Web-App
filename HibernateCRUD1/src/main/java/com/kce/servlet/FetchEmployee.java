package com.kce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kce.bean.Employee;
import com.kce.dao.EmployeeDAO;

@WebServlet("/FetchEmployee")
public class FetchEmployee extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("employeeId");
		Employee e=new Employee();
		e.setEmployeeId(id);
		EmployeeDAO edao=new EmployeeDAO();
		Employee eobj=edao.fetchData(e);
		if(eobj==null)
		{
		//Redirection for Invalid ID	
		}
		else
		{
		//Display Employee Object	
		}
				
		
		
		
		
		
	}

}
