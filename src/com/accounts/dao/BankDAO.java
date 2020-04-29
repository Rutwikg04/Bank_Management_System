package com.accounts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;

import com.accounts.beans.BankBeans;
import com.accounts.dao.BankDB;

public class BankDAO
{
	public String loginPageemp(int id)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String sql="Select Password from bankEmployee where ID = ?;";
			PreparedStatement p=con.prepareStatement(sql);
			p.setInt(1,id);
			ResultSet rs = p.executeQuery();
			if(rs.next())
				return rs.getString(1);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
		
	public String loginPageacc(int id)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String sql="Select Password from bankAccounts where ID = ?;";
			PreparedStatement p=con.prepareStatement(sql);
			p.setInt(1,id);
			ResultSet rs = p.executeQuery();
			if(rs.next())
				return rs.getString(1);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList getId(int range)
	{
		Connection con=null;
		try {
			con=BankDB.getConnection();
			String sql="Select id from bankAccounts where ID between ? and ? order by ID desc limit 1;";
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
	
	public int setPassEmp(int id, String password)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String ins_str = "update bankEmployee set Password=? where ID=?;";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setString(1,password);
			p.setInt(2,id);
			int updateCount = p.executeUpdate();
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public int setPassAcc(int id, String password)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String ins_str = "update bankAccounts set Password=? where ID=?;";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setString(1,password);
			p.setInt(2,id);
			int updateCount = p.executeUpdate();
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public int newAcc(BankBeans bb)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String ins_str = "insert into bankAccounts values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setInt(1,bb.getId());
			p.setString(2,bb.getName());
			p.setString(3,bb.getFname());
			p.setString(4,bb.getPhone());
			p.setDate(5,bb.getDob());
			p.setString(6,bb.getGender());
			p.setString(7,bb.getMarital());
			p.setString(8,bb.getAddress());
			p.setString(9,bb.getEmail());
			p.setString(10,bb.getPan());
			p.setString(11,bb.getAddhar());
			p.setString(12,bb.getEmployement());
			p.setString(13,bb.getNationality());
			p.setString(14,bb.getEducation());
			p.setString(15,Integer.toString(bb.getId()));
			p.setString(16,bb.getPhone());
			int updateCount = p.executeUpdate();
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public float getBalance(int id)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String ins_str = "select Balance from bankTransactions where Transactions_ID=(select MAX(Transactions_ID) from bankTransactions where ID=?);";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setInt(1,id);
			ResultSet result = p.executeQuery();
			float balance = 0;
			if(result.next())
				balance = result.getFloat(1);
			return balance;
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public int deposit(int id,String mode,String ref_no,float amount,float balance)
	{
		Connection con = null;
		try
		{
			
			Date date = new Date(Calendar.getInstance().getTime().getTime());
			String amount1 = Float.toString(amount);
			String balance1 = Float.toString(balance);
			con=BankDB.getConnection();
			String ins_str = "insert into bankTransactions(ID,Date,Particulars,Ref_No,Withdrawal,Deposit,Balance) values( ?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setInt(1,id);
			p.setDate(2,date);
			p.setString(3,mode);
			p.setString(4,ref_no);
			p.setString(5,"");
			p.setString(6,amount1);
			p.setString(7,balance1);
			int updateCount = p.executeUpdate();
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	public int withdraw(int id,String mode,String ref_no,float amount,float balance)
	{
		Connection con = null;
		try
		{
			
			Date date = new Date(Calendar.getInstance().getTime().getTime());
			String amount1 = Float.toString(amount);
			String balance1 = Float.toString(balance);
			con=BankDB.getConnection();
			String ins_str = "insert into bankTransactions(ID,Date,Particulars,Ref_No,Withdrawal,Deposit,Balance) values( ?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setInt(1,id);
			p.setDate(2,date);
			p.setString(3,mode);
			p.setString(4,ref_no);
			p.setString(5,amount1);
			p.setString(6,"");
			p.setString(7,balance1);
			int updateCount = p.executeUpdate();
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public ResultSet ShowSp(int id)
	{
		try {
			Connection con=BankDB.getConnection();
			String sql="Select User_Name,Fathers_Name,Gender,Dob,Nationality,Pan,Addhar,Address,Phone_No,E_mail,Marital,Employement,Education from bankAccounts where ID=?;";
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

	public ResultSet loadTransactions(int id) {
		return null;
	}

	public int updateAcc(BankBeans bb)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String ins_str = "update bankAccounts set User_Name=?,Fathers_Name=?,Phone_No=?,Dob=?,Gender=?,Marital=?,Address=?,E_mail=?,Pan=?,Addhar=?,Employement=?,Nationality=?,Education=? where ID = ?;";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setInt(14,bb.getId());
			p.setString(1,bb.getName());
			p.setString(2,bb.getFname());
			p.setString(3,bb.getPhone());
			p.setDate(4,bb.getDob());
			p.setString(5,bb.getGender());
			p.setString(6,bb.getMarital());
			p.setString(7,bb.getAddress());
			p.setString(8,bb.getEmail());
			p.setString(9,bb.getPan());
			p.setString(10,bb.getAddhar());
			p.setString(11,bb.getEmployement());
			p.setString(12,bb.getNationality());
			p.setString(13,bb.getEducation());
			int updateCount = p.executeUpdate();
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
}