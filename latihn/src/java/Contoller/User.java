/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author MaySM
 */
public class User extends ApplicationController {
    private final static String add_action ="new";
    private final static String login_action = "login";
    private final static String update_action ="update";
    private final static String logout_action = "logout";
    private final static String list_action = "list";
    private String message="";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if(action==null){
            action= "login";
        }
        try {
            switch(action){
              case "new":
                ShowNewForm(request, response);
                break;
              case "create":
                  createUser(request,response);
                break;
              case "logout":
                  dologout(request, response);
                  logout(request, response);
                break;
              case "do-login":
                  doLogin(request, response);
                  break;
              case "welcome":
                  mustLoggedIn(request, response);
                  showWelcomePage(request, response);
                  break;
              case "myprofil":
                  mustLoggedIn(request, response);
                  showMyprofil(request, response);
                  break;
              case "uptade":
                  mustLoggedIn(request, response);
                  uptadeUser(request, response);
              case "deluser":
                  mustLoggedIn(request, response);
                  offUser(request, response);
              default:
                  showLoginForm(request, response response);
                  break;
                  
            }
        } catch (SQLException ex){
            throw new ServletException(ex);
        }
        
    }

    private void ShowNewForm(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void dologout(HttpServletRequest request, HttpServletResponse response) {
        throws ServletException, IOException, ServletException {
        String email= request.getParameter("email");
        String passwd= request.getParameter("passwd");
        User user = new User();
        user.setEmail(email);
        
        user.setPassword(passwd);
        lgout(requset, response);
        if(user.doLogin()){
            setloggedIn(user, request, response);
            showWelocmePage(request, response);
            System.out.println("Login berhasil.");
        }else{
            showLoginForm(request, response);
            System.out.println("Login Gagal.");
            }
        
    }
  
      
    }

    private void logout(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void doLogin(HttpServletRequest request, HttpServletResponse response) {
        throws ServletException, IOException, ServletException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("users/login.jps");
    }
    }

    private void mustLoggedIn(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showWelcomePage(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showMyprofil(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void uptadeUser(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void offUser(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showLoginForm(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPassword(String passwd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setloggedIn(User user, HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showWelocmePage(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

   
}
    
            
     
   
