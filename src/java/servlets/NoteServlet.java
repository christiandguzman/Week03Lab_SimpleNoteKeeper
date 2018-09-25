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
        BufferedReader br;
        br = new BufferedReader(aa);
       
        String title=br.readLine();
        String contents="";
        while(br.readLine()!=null){
            contents = br.readLine() + "\n";
        }
        //read file into a note object (bean)
        Note n = new Note (title,contents);
        
        
        br.close();
        
        request.setAttribute("note",n);
        
        if(request.getParameter("edit")!= null) {
            
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            return;
        }
 
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        String title = request.getParameter("title");
         String contents =request.getParameter("contents");
        Note n = new Note (title,contents);
        
        
      
    //writer
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,false)));

        pw.println(n.getTitle());
        pw.print(n.getContents());
        
        pw.close();
        
        request.setAttribute("note",n);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        
       
    }
}
