package com.kce.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kce.bean.Employee;
import com.kce.dao.EmployeeDAO;

@WebServlet("/FormHandler")
public class FormHandler extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Employee e=new Employee();
			e.setEmployeeId(request.getParameter("employeeId"));
			e.setEmployeeName(request.getParameter("employeeName"));
			e.setDesignation(request.getParameter("designation"));
			e.setExperience(Integer.valueOf(request.getParameter("experience")));
			EmployeeDAO edao=new EmployeeDAO();
			if(edao.saveData(e))
			{
			//Success Page	
				RequestDispatcher rd=request.getRequestDispatcher("Success.html");
				rd.forward(request, response);
			}
			else
			{
			//Failure Page	
			}
	}

}
