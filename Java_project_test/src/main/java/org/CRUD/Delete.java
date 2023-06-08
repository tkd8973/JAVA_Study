//package org.CRUD;
//
//import javax.persistence.*;
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.*;
//
//@WebServlet("/delete")
//public class Delete extends HttpServlet {
//    public void deletePost(int deletedPostId, HttpServletResponse response) throws IOException {
//        EntityManagerFactory emf = null;
//        EntityManager em = null;
//
//        try {
//            emf = Persistence.createEntityManagerFactory("board");
//            em = emf.createEntityManager();
//            em.getTransaction().begin();
//
//            Board deletedPost = em.find(Board.class, deletedPostId);
//            int deletedPostIndex = deletedPost.getID();
//
//            em.remove(deletedPost);
//
//            Query query = em.createQuery("UPDATE Board b SET b.id = b.id - 1 WHERE b.id > :deletedPostIndex");
//            query.setParameter("deletedPostIndex", deletedPostIndex);
//            query.executeUpdate();
//
//            em.getTransaction().commit();
//            response.sendRedirect("./list");
//        } catch (Exception e) {
//            if (em != null && em.getTransaction().isActive()) {
//                em.getTransaction().rollback();
//            }
//            e.printStackTrace();
//            response.sendRedirect("./list");
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//            if (emf != null) {
//                emf.close();
//            }
//        }
//    }
//}
