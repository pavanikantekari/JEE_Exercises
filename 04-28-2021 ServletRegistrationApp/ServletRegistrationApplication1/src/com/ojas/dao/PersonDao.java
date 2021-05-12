package com.ojas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ojas.model.Persons;

public class PersonDao {
	Connection con;

	static Connection getConnect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oilc200", "root", "root");
			System.out.println("connected" + con);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public List<Persons> listPerson() {
		List<Persons> list = new ArrayList<Persons>();
		try {
			Connection con = getConnect();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from persons");
			while (rs.next()) {
				Persons p = new Persons(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
				list.add(p);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;

	}

	public static boolean addPerson(Persons person) {
		boolean b = false;
		try {
			Connection con = getConnect();
			PreparedStatement pst = con
					.prepareStatement("insert into persons(ename,contactno,email,gender,address)values(?,?,?,?,?)");
			pst.setString(1, person.getEname());
			pst.setString(2, person.getContactno());
			pst.setString(3, person.getEmail());
			pst.setString(4, person.getGender());
			pst.setString(5, person.getAddress());
			int res = pst.executeUpdate();
			if (res > 0) {
				b = true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}

	public boolean validate(String uname, String upass) {
		boolean b = false;
		try {
			Connection con = getConnect();
			PreparedStatement pst = con.prepareStatement("select * from persons where ename=? and contactno=?");
			pst.setString(1, uname);
			pst.setString(2, upass);

			ResultSet res = pst.executeQuery();
			if (res.next()) {
				b = true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}

	public boolean deletePerson(int num) {
		boolean b = false;
		try {
			Connection con = getConnect();
			PreparedStatement pst = con.prepareStatement("delete from persons where pid=?");
			pst.setInt(1, num);
			int res = pst.executeUpdate();
			if (res > 0) {
				b = false;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}
	 public boolean updatePerson(Persons person) {
	        boolean b = false;
	        try {
	            Connection con = getConnect();
	            PreparedStatement pst = con.prepareStatement("update persons set ename=?,contactno=?,email=?,gender=?,address=? where pid =?");
	            pst.setString(1, person.getEname());
	            pst.setString(2, person.getContactno());
	            pst.setString(3, person.getEmail());
	            pst.setString(4, person.getGender());
	            pst.setString(5, person.getAddress());
	            pst.setInt(6,person.getPid());
	            int res = pst.executeUpdate();
	            if(res > 0) {
	                b = true;
	            }
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	        return b;
	    }
}