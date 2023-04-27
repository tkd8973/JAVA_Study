package org.CRUD;
import javax.persistence.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/delete")
public class Delete extends HttpServlet{
//    "ALTER TABLE post AUTO_INCREMENT=1;";
    public void deletePost(int postId) {
        // EntityManagerFactory 초기화
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("board");
        EntityManager em = emf.createEntityManager();

        try {
            // 트랜잭션 시작
            em.getTransaction().begin();

            // 게시물 ID에 해당하는 게시물 조회
            Board post = em.find(Board.class, postId);

            // 게시물 삭제
            em.remove(post);

            // 트랜잭션 커밋
            em.getTransaction().commit();

        } catch (Exception e) {
            // 트랜잭션 롤백
            em.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            // EntityManager 종료
            em.close();
            emf.close();
        }
    }
}
