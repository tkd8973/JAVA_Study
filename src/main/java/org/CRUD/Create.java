package org.CRUD;

import javax.persistence.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

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
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String WRITER = request.getParameter("WRITER");
        String WRITING = request.getParameter("WRITING");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Board Poster = new Board(WRITER, WRITING);
        em.persist(Poster);

        em.getTransaction().commit();

        em.close();

        response.sendRedirect("./list");
    }

    @Override
    public void destroy() {
        emf.close();
    }
}