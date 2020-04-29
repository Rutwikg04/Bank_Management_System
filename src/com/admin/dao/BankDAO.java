package com.admin.dao;

import com.admin.beans.BankBean;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BankDAO
{
	public ArrayList getId(int range)
	{
		Connection con=null;
			try {
				con=BankDB.getConnection();
				String sql="Select id from bankEmployee where ID between ? and ? order by ID desc limit 1;";
				PreparedStatement p=con.prepareStatement(sql);
				p.setInt(1,range);
				p.setInt(2,(range+1000));
				ResultSet rs = p.executeQuery();
				ArrayList result = new ArrayList();
				if(rs.next())
					result.add(rs.getInt(1));
				return result;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			return null;
	}
	
	public int addBank(BankBean bb)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String ins_str = "insert into bankEmployee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setInt(1,bb.getId());
			p.setString(2,bb.getEname());
			p.setString(3,bb.getFname());
			p.setString(4,bb.getGender());
			p.setDate(5,bb.getDob());
			p.setString(6,bb.getPan());
			p.setString(7,bb.getAddhar());
			p.setString(8,bb.getAdd());
			p.setString(9,bb.getPhone());
			p.setString(10,bb.getEmail());
			p.setString(11,bb.getMarital());
			p.setString(12,bb.getBlood());
			p.setString(13,bb.getUser());
			p.setString(14,bb.getPass());
			int updateCount = p.executeUpdate(); 
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public int updateBank(BankBean bb)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String ins_str = "update bankEmployee set Employee_Name=?,Father_Name=?,Gender=?,Dob=?,Pan_no=?,Addhar_no=?,Address=?,Phone_Number=?,Email_ID=?,Marital_Status=?,Blood_Group=? where ID=?;";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setInt(12,bb.getId());
			p.setString(1,bb.getEname());
			p.setString(2,bb.getFname());
			p.setString(3,bb.getGender());
			p.setDate(4,bb.getDob());
			p.setString(5,bb.getPan());
			p.setString(6,bb.getAddhar());
			p.setString(7,bb.getAdd());
			p.setString(8,bb.getPhone());
			p.setString(9,bb.getEmail());
			p.setString(10,bb.getMarital());
			p.setString(11,bb.getBlood());
			int updateCount = p.executeUpdate(); 
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public ResultSet loadTable()
	{
		Connection con=null;
		try {
			con=BankDB.getConnection();
			String sql="Select ID,Employee_Name,Phone_Number,Blood_Group from bankEmployee;";
			PreparedStatement p=con.prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			if(rs.next()==false)
				return null;
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null; 
	}
	
	public ResultSet ShowSp(int id)
	{
		try {
			Connection con=BankDB.getConnection();
			String sql="Select Employee_Name,Father_Name,Gender,Dob,Blood_Group,Pan_no,Addhar_no,Address,Phone_Number,Email_ID,Marital_Status,ID from bankEmployee where ID=?;";
			PreparedStatement p=con.prepareStatement(sql);
			p.setInt(1,id);
			ResultSet rs = p.executeQuery();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int Delete(int id)
	{
		try {
			Connection con=BankDB.getConnection();
			String sql="delete from bankEmployee where ID=?;";
			PreparedStatement p=con.prepareStatement(sql);
			p.setInt(1,id);
			int updateCount = p.executeUpdate(); 
			return updateCount;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}