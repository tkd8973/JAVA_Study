package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/bye")
public class ByeServlet extends HttpServlet {
    // CRUD. Web -> Read -> Get
    // Get 요청이 들어오면 어떠한 응답을 줄 것이냐 (doGet) <- 브라우저에서 특정한 링크에 데이터를 요청
    @Override
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        // req -> request -> 사용자가 요청한 내용들
        // resp -> response -> 서버가 보내줄 내용들
        resp.setContentType("text/html"); // 응답이 HTML 파일 형태
        PrintWriter out = resp.getWriter(); // 응답에 적을 내용을 담을 PrintWriter 객체를 불러오기
        out.println("<html><body>");
        out.println("<h2>Bye, JW!!!!!</h2>");
        out.println("</body></html>");
    }
}