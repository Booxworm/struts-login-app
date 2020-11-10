package com.grp61.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
  
public class LoginDaoImpl implements LoginDao {
    private Login login;

    public LoginDaoImpl (String username, String password){
        this.login = new Login(username, password);
    }

    public boolean validate() {
        String username = this.login.getUsername();
        String password = this.login.getPassword();
        boolean status=false;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cz3002_login?user=admin&password=admin&serverTimezone=UTC"
            );

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM login_info " +
                "WHERE username=? AND password=?"
            );
            ps.setString(1,username);
            ps.setString(2,password);

            ResultSet rs = ps.executeQuery();  
            status = rs.next();
            con.close();

        } catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }
}