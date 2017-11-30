/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DBpackage.garageTypeDB;
import DBpackage.propertiesDB;
import DBpackage.propertyTypeDB;
import DBpackage.styleTypeDB;
import Entities.Properties;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author benmc
 */
@WebServlet(name = "addPropertyServlet", urlPatterns = {"/addPropertyServlet"})
public class addPropertyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int styleID=styleTypeDB.getTypeID(request.getParameter("Style"));
            int garageTypeID=garageTypeDB.getGTypeID(request.getParameter("garageType"));
            int propTypeID=propertyTypeDB.getTypeID(request.getParameter("propertyType"));
            Properties newProp=new Properties();
            int agentId=Integer.parseInt((String) request.getSession().getAttribute("image"));
            newProp.setAgentId(agentId);
            float bathrooms=Float.parseFloat(request.getParameter("bathrooms"));
            newProp.setBathrooms(bathrooms);
            int bedrooms=Integer.parseInt(request.getParameter("bedrooms"));
            newProp.setBedrooms(bedrooms);
            newProp.setBerRating(request.getParameter("berRating"));
            newProp.setCity(request.getParameter("City"));
            DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
            Date date1 = df.parse(request.getParameter("Date"));
            newProp.setDateAdded(date1);
            newProp.setDescription(request.getParameter("Description"));
            newProp.setGarageId(garageTypeID);
            newProp.setGaragesize(Short.parseShort(request.getParameter("garageSize")));
            newProp.setListingNum(Integer.parseInt(request.getParameter("listingNum")));
            newProp.setLotsize(request.getParameter("lotsize"));
            newProp.setPhoto("1234");
            newProp.setPrice(Double.parseDouble(request.getParameter("Price")));
            newProp.setSquarefeet(Integer.parseInt(request.getParameter("sqaureFeet")));
            newProp.setStreet(request.getParameter("Street"));
            newProp.setStyleId(styleID);
            newProp.setTypeId(propTypeID);
            propertiesDB.addPropToDB(newProp);
            request.getRequestDispatcher("/propertyAddedConfirmation.jsp").forward(request, response);
            
            
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(addPropertyServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(addPropertyServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
