package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

/**
 * Servlet implementation class StudentDeleteController
 */
public class StudentDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public StudentDeleteController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int sId = Integer.parseInt(request.getParameter("id"));

		StudentDao studentDao = new StudentDao();
		boolean flag = studentDao.deleteStudent(sId);
		if (flag == true) {

			response.sendRedirect("studentlistcontroller");
		} else {

			response.sendRedirect("studentlistcontroller");
		}

	}

}
