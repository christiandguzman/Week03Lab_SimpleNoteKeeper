/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domain.Note;
import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 683676
 */
public class NoteServlet extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //path to note.txt that holds data
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        //read
        File a = new File(path);
        FileReader aa = new FileReader(a);
        BufferedReader br = new BufferedReader(aa);
        
        
        //read file into a note object (bean)
        Note n = new Note (br.readLine(),br.readLine());
        
        request.setAttribute("title",n.getTitle());
        request.setAttribute("contents",n.getContents());
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
}
