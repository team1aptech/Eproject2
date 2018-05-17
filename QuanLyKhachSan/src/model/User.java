/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.controllerConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author uphoto
 */
public class User {
    String EmployeeID;
    String Username;
    String Pass;

    public User() {
    }

    public User(String EmployeeID, String Username, String Pass) {
        this.EmployeeID = EmployeeID;
        this.Username = Username;
        this.Pass = Pass;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    public static boolean checkPass(String Username, String Pass) throws SQLException, ClassNotFoundException{
        Connection connection = controllerConnectDB.connecDB();
        String request = "Select * from User where Username = ? and Pass = ?";
        PreparedStatement stmt = connection.prepareStatement(request);
        stmt.setString(1, Username);
        stmt.setString(2, Pass);
        ResultSet rs = stmt.executeQuery();
        boolean flag =false;
        if (rs.next()) flag = true;
        rs.close();
        stmt.close();
        connection.close();
        return flag;
    }
    
}
