package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.StudentBean;
import com.util.DBConnection;

public class StudentDao {

	public boolean addSudent(StudentBean studentBean) {
		boolean flag = false;
		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String INSERTSQL = "insert into student(sname,semail,spassword)values(?,?,?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(INSERTSQL);
				pstmt.setString(1, studentBean.getsName());
				pstmt.setString(2, studentBean.getsEmail());
				pstmt.setString(3, studentBean.getsPassword());

				int res = pstmt.executeUpdate();
				if (res > 0) {

					flag = true;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;

	}

	public List<StudentBean> listOfStudents() {

		List<StudentBean> studentsList = new ArrayList<StudentBean>();
		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String SELECTSQL = "select * from student";
			try {
				PreparedStatement pstmt = conn.prepareStatement(SELECTSQL);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					StudentBean studentBean = new StudentBean();
					studentBean.setsId(rs.getInt("sid"));
					studentBean.setsName(rs.getString("sname"));
					studentBean.setsEmail(rs.getString("semail"));
					studentBean.setsPassword(rs.getString("spassword"));
					studentsList.add(studentBean);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return studentsList;
	}

	public boolean deleteStudent(int id) {
		Connection conn = DBConnection.getConnection();
		boolean flag = false;
		if (conn != null) {

			String DELETESQL = " delete from student where sid =?";
			try {
				PreparedStatement pstmt = conn.prepareStatement(DELETESQL);
				pstmt.setInt(1, id);
				int res = pstmt.executeUpdate();
				if (res > 0) {
					flag = true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return flag;

	}

}
