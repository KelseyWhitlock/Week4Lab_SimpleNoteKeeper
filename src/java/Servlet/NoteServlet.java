/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author Kelsey
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           try{
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            //to read files
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String title = br.readLine();
            String contents = br.readLine();
            Note note = new Note(title, contents);
            request.setAttribute("note",note);
            br.close();
        }catch(Exception e){
            request.setAttribute("message", "This can't be empty");    
        }
           
       getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);     
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        //writing in a file
         PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,false)));
         pw.println(title);
         
            
         
          getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);
    }

   
    

}
