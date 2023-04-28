package org.CRUD;

import javax.persistence.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@WebServlet("/Create")
public class Create extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EntityManagerFactory emf;

    @Override
    public void init() throws ServletException {
//        super.init();
        emf = Persistence.createEntityManagerFactory("myPU");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String writer = request.getParameter("WRITER");
        String writing = request.getParameter("WRITING");

        java.util.Date now = new java.util.Date();
        Timestamp timestamp = new Timestamp(now.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String date = sdf.format(timestamp);

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Board post = new Board(writer, writing, timestamp);
        em.persist(post);

        em.getTransaction().commit();

        em.close();

        response.sendRedirect("./list");
    }

    @Override
    public void destroy() {
        emf.close();
    }
}