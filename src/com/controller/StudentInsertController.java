package com.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;

/**
 * Servlet implementation class StudentInsertController
 */
public class StudentInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String sName = request.getParameter("txtStudentName");
		String sEmail = request.getParameter("txtStudentEmail");
		String sPassword = request.getParameter("pwdStudentPassword");
		String sGender = request.getParameter("radioGender");
		String sHobbies[] = request.getParameterValues("chHobbies");
		String sCity = request.getParameter("selectCity");
		String hobby = null;

		hobby = Arrays.toString(sHobbies);

		System.out.println(hobby);
		// we have set this param to studentBean

		StudentBean studentBean = new StudentBean();

		studentBean.setsName(sName);
		studentBean.setsEmail(sEmail);
		studentBean.setsPassword(sPassword);
		studentBean.setsGender(sGender);
		studentBean.setsHobbies(hobby);
		studentBean.setsCity(sCity);

		StudentDao studentDao = new StudentDao();
		boolean flag = studentDao.addSudent(studentBean);
		if (flag == true) {

			response.sendRedirect("studentlistcontroller");
		} else {

			response.sendError(500);
		}

	}

}
