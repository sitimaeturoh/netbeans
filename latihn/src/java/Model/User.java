/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MaySM
 */
public class User extends MyConnection{
    public int id;
    public String username;
    public String email;
    public String password;
    private final String tabelName = "user";

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean create(){
        boolean result;
        if(!validate()){
            return false;
        }
        String query ="INSERT INTO "+ tabelName+"(email,password, username) values ('"+this.email+"','"+ this.password+"','"+ this.username+"')";
        try{
            Statement stmt = this.conn().createStatement();
            return stmt.executeUpdate(query)>0;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean validate() {
        boolean status = false;
        if(!"".equals(this.email)&& !"".equals(this.password)&& !"".equals(this.username)){
            status = true;
        }
        return status;
    }
    
    public ArrayList<User> all(){
        String query = "SELECT * FROM " + tabelName;
        ArrayList<User> users = new ArrayList<>();
        try {
            Statement stmt = this.conn().createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                User user = new User();
                user.setEmail(res.getString("email"));
                user.setPassword(res.getString("password"));
                user.setUsername(res.getString("username"));
                
                user.setId(res.getInt("id"));
                users.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }
    
}
    
    

