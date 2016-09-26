package com.koushikchaganti.pincode.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.koushikchaganti.pincode.db.DbCredentials;
import com.koushikchaganti.pincode.exception.DataNotFoundException;

public class ZipcodeService implements DbCredentials{
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	Zipcode zip; 
	public Zipcode getZipcode(int pincode)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(db_conn_str, db_user, db_password);
			pstmt = con.prepareStatement("select * from india_pincodes where pincode=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			pstmt.setInt(1,pincode);
			rs = pstmt.executeQuery();
			rs.beforeFirst();
			if(rs.next())
			{
			 zip = new Zipcode(rs.getInt("pincode"),rs.getString("officename"), rs.getString("officetype"), rs.getString("divisionname"), rs.getString("regionname"),
			rs.getString("circlename"), rs.getString("taluk"), rs.getString("districtname"), rs.getString("statename"), rs.getString("telephone"),
			rs.getString("relatedsuboffice"), rs.getString("relatedheadoffice"), rs.getString("longitude"), rs.getString("latitude"));	
			
			}
			else{
				throw new DataNotFoundException("Zipcode with "+ pincode +" does not exist!");
		        			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		
		return zip;
	}
	
	
	
}
