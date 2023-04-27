package org.CRUD;
import javax.persistence.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/update")
public class Update extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        // 게시물 수정에 필요한 정보를 받아옵니다.
        int id = Integer.parseInt(request.getParameter("id"));
        String writer = request.getParameter("writer");
        String writing = request.getParameter("writing");

        // EntityManager를 생성합니다.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();

        // 게시물을 조회하고, 수정합니다.
        Board board = em.find(Board.class, id);
        board.setWRITER(writer);
        board.setWRITING(writing);

        // 트랜잭션을 시작합니다.
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // 게시물을 업데이트합니다.
        em.persist(board);

        // 트랜잭션을 커밋합니다.
        tx.commit();

        // EntityManager를 종료합니다.
        em.close();
        emf.close();

        // 수정 완료 후, 게시물 목록 화면으로 이동합니다.
        response.sendRedirect("list");
    }
}
