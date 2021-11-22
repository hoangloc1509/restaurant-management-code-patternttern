/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hoang Loc
 */
public class DAO {
    public static Connection con;
    public DAO() {
        if(con == null){
            String dbUrl = 
                "jdbc:mysql://localhost:3307/hotel?autoReconnect=true&useSSL=false";
            String dbClass = "com.mysql.jdbc.Driver";
            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection (dbUrl, "root", "xxx");
            } catch(ClassNotFoundException | SQLException e) {
            }
        }
    }
}
