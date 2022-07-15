package com.revature.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dtos.ReimbursementDTO;
import com.revature.dtos.UserDTO;
import com.revature.exceptions.ReimbursementNotCreatedException;
import com.revature.exceptions.ReimbursementNotFound;
import com.revature.models.Reimbursement;

import com.revature.services.ReimbursementService;
import com.revature.util.CorsFix;

/**
 * Servlet implementation class ReimbursementServlet
 */
public class ReimbursementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReimbursementService rs = new ReimbursementService();
	private ObjectMapper om = new ObjectMapper();
 

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        InputStream reqBody = req.getInputStream();

        Reimbursement newReimbursement = om.readValue(reqBody, Reimbursement.class);

        try {
            rs.createReimbursement(newReimbursement);

            res.setStatus(201); // Status: Created
        } catch (Exception e) {
//            res.setStatus(400);
            res.sendError(400, "Unable to create new reimbursement.");
            e.printStackTrace();
        }
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CorsFix.addCorsHeader(req.getRequestURI(), res);
		res.addHeader("Content-Type", "application/json");
		
		
		String pathInfo = req.getPathInfo();
		
		if(pathInfo == null ) {
			HttpSession session = req.getSession();
			
			if(session.getAttribute("reimbType")!= null) {
				List<Reimbursement> reimbursements = rs.getReimbursements();
				List<ReimbursementDTO> ReimbursementDTO = new ArrayList();
				
				reimbursements.forEach(reimb -> ReimbursementDTO.add(new ReimbursementDTO(reimb)));
				
				PrintWriter pw = res.getWriter();
				
				pw.write(om.writeValueAsString(ReimbursementDTO));
				pw.close();
				
			}
		else {
				// /1, /11, /{some-value}
				// Have to remove "/" to get the id to be retrieved
			int id = Integer.parseInt(pathInfo.substring(1));
			PrintWriter pw2 = res.getWriter();
			pw2.println("General KENOBI!");
			try (PrintWriter pw = res.getWriter()) {
					// retrieve user by id
				Reimbursement reimb = rs.getReimbursementById(id);
				ReimbursementDTO rDTO = new ReimbursementDTO(reimb);
				System.out.println(reimb);
					
				pw2.println(rs.getReimbursementById(id));
					// convert user to JSON and write to response body
				pw.write(om.writeValueAsString(rDTO));
				res.setStatus(200);
			}catch(Exception e) {
		           res.sendError(400, "Unable to create new reimbursement.");
		           e.printStackTrace();
				}
			}
			
		}
		

		
	}
}
	
	


