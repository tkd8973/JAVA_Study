package org.CRUD;
import javax.persistence.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;
@WebServlet("/list")
public class Read extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EntityManagerFactory emf;
    @Override
    public void init() throws ServletException {
        emf = Persistence.createEntityManagerFactory("myPU");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Board s", Board.class);
        List<Board> postList = query.getResultList();
        em.getTransaction().commit();
        em.close();
        req.setAttribute("postList", postList);
        RequestDispatcher rd = req.getRequestDispatcher("/list.jsp");
        rd.forward(req, resp);
    }
}