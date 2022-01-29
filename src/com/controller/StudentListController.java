package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;

/**
 * Servlet implementation class StudentListController
 */
public class StudentListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<StudentBean> students = new ArrayList<StudentBean>();
		StudentDao studentDao = new StudentDao();
		students = studentDao.listOfStudents();

		request.setAttribute("students", students);
		request.getRequestDispatcher("StudentList.jsp").forward(request, response);

		// List<StudentBean> students = new StudentDao().listOfStudents();
	}

}
