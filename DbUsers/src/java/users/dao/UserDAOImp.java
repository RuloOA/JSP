/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import users.model.User;
import users.util.UtilDB;

/**
 *
 * @author raul
 */
public class UserDAOImp implements UserDAO {
    
    private Connection connection;
    
    public UserDAOImp() {
        connection = UtilDB.getConnection();
    }
    
    @Override
    public void agregarUser(User user) {
        String sql = "INSERT INTO \"dbusers\" "
                + " (\"name\", \"creationdate\", \"modicationdate\", \"username\") "
                + " VALUES(?, ?, ?, ?)";
        
        try {
            PreparedStatement ps
                    = connection.prepareStatement(sql);
            System.out.println("User " + user);
            ps.setString(1, user.getName());
            ps.setString(2, user.getCreationDate());
            ps.setString(3, user.getModificationDate());
            ps.setString(4, user.getUserName());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void borrarUser(int dbUserId) {
        String sql = "DELETE FROM \"dbusers\" WHERE dbuser_id=?";
        
        try {
            PreparedStatement ps
                    = connection.prepareStatement(sql);
            ps.setInt(1, dbUserId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void cambiarUser(User user) {
        String sql = "UPDATE \"dbusers\" SET "
                + " \"name\"=?, \"creationdate\"=?, \"modicationdate\"=?, \"username\"=? "
                + " WHERE dbuser_id=?";
        
        
        try {
            PreparedStatement ps
                    = connection.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getCreationDate());
            ps.setString(3, user.getModificationDate());
            ps.setString(4, user.getUserName());
            ps.setInt(5, user.getDbUserId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<User> desplegarUsers() {
        List<User> users = new ArrayList<User>();
        try {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(
                    "SELECT * FROM \"dbusers\"");
            
            while (rs.next()) {                
                User user = new User(
                        rs.getInt("dbuser_id"),
                        rs.getString("name"),
                        rs.getString("creationdate"),
                        rs.getString("modicationdate"),
                        rs.getString("username"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
    
    @Override
    public User elegirUser(int dbUserId) {
        User user = null;
        try {
            PreparedStatement ps
                    = connection.prepareStatement(
                            "SELECT * FROM \"dbusers\""
                            + " WHERE dbuser_id=?");
            
            ps.setInt(1, dbUserId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                user = new User(
                       rs.getInt("dbuser_id"),
                        rs.getString("name"),
                        rs.getString("creationdate"),
                        rs.getString("modicationdate"),
                        rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
