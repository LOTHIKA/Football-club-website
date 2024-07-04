package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MatchDao {
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        
        public MatchDao() {
        	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vsbdb" , "root", "Sista@1218");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
        	
        }
        
        public void StoreData(Match m) {
        	String sql = "insert into matchDetails(title, place, matchdate) values(?, ?, ?) ";

        	try {
				pst = con.prepareStatement(sql);
				pst.setString(1,m.getTitle());
				pst.setString(2, m.getPlace());
				pst.setString(3, m.getDt());
				pst.executeUpdate();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
        }

		public ResultSet retrieveMatch() {
			String sql = "select * from matchDetails";
			try {
				pst = con.prepareStatement(sql);
				rs=pst.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
		}
		
		
}
