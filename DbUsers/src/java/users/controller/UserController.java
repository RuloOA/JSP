/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import users.dao.UserDAO;
import users.dao.UserDAOImp;
import users.model.User;


@WebServlet(name="UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {
    private final String LISTA_USERS = "/lista_users.jsp";
    private final String AGREGAR_CAMBIAR = "/user.jsp";
    private UserDAO dao;
    
    public UserController(){
        dao = new UserDAOImp();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String forward = "";
        if(action.equalsIgnoreCase("borrar")){
            forward = LISTA_USERS;
            int dbUserId = Integer.parseInt(
            request.getParameter("dbUserId"));
            dao.borrarUser(dbUserId);
            request.setAttribute("users", dao.desplegarUsers());
        }else if(action.equalsIgnoreCase("cambiar")){
            forward = AGREGAR_CAMBIAR;
            int dbUserId = Integer.parseInt(
            request.getParameter("dbUserId"));
            User user = dao.elegirUser(dbUserId);
            request.setAttribute("user", user);
        } else if(action.equalsIgnoreCase("agregar")){
            forward = AGREGAR_CAMBIAR;
        } else{
            forward = LISTA_USERS;
            request.setAttribute("users",
                    dao.desplegarUsers());
        }
        
        RequestDispatcher view = 
                request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setCreationDate(request.getParameter("creationDate"));
        user.setModificationDate(request.getParameter("modificationDate"));
        user.setUserName(request.getParameter("userName"));
        
        String dbUserId = request.getParameter("dbUserId");
        
        if(dbUserId==null || dbUserId.isEmpty()){
            dao.agregarUser(user);
        }else{
            user.setDbUserId(
                    Integer.parseInt(dbUserId));
            dao.cambiarUser(user);
        }
        
        RequestDispatcher view = 
                request.getRequestDispatcher(LISTA_USERS);
        request.setAttribute("users", 
                dao.desplegarUsers());
        view.forward(request, response);
        
    }
}
