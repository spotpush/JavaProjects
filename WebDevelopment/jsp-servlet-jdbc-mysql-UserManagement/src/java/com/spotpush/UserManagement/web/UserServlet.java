package com.spotpush.UserManagement.web;
/**
 * Page controller to handle all requests from the client
 * @author Stephen Hardy @ spotpush.com
*/

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.sql.SQLException;
import com.spotpush.UserManagement.dao.UserDAO;
import com.spotpush.UserManagement.model.User;
import javax.servlet.RequestDispatcher;

@WebServlet("/")
public class UserServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDAO userDAO;
    
    @Override    
    public void init() {
        userDAO = new UserDAO();
    }
    
    @Override        
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    
    @Override   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        
        try {
            switch (action) {
                case "/AddNewUser":
                    showNewForm(request, response);
                    break;    
                case "/insert":
                    insertUser(request, response);
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        } 
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/user-form.jsp");
        dispatcher.forward(request, response);
    }
    
    private void insertUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User newUser = new User(name, email, country);
        userDAO.insertUser(newUser);
        response.sendRedirect("list");
    }
    
    
}
