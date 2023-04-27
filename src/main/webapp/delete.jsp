<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "org.CRUD.Board" %>
<%@ page import="javax.persistence.*" %>
<%
int postId = Integer.parseInt(request.getParameter("id"));

EntityManagerFactory emf = null;
EntityManager em = null;

try {
    emf = Persistence.createEntityManagerFactory("myPU");
    em = emf.createEntityManager();
    em.getTransaction().begin();

    Board post = em.find(Board.class, postId);
    em.remove(post);

    Query query = em.createQuery("UPDATE Board b SET b.id = b.id - 1 WHERE b.id > :postId");
    query.setParameter("postId", postId);
    query.executeUpdate();

    em.getTransaction().commit();

    out.println("<script>alert('삭제되었습니다.'); location.replace(document.referrer);</script>");
} catch (Exception e) {
    if (em != null && em.getTransaction().isActive()) {
        em.getTransaction().rollback();
    }
    out.println("<script>alert('삭제에 실패했습니다.'); history.back();</script>");
} finally {
    if (em != null) {
        em.close();
    }
    if (emf != null) {
        emf.close();
    }
}
%>