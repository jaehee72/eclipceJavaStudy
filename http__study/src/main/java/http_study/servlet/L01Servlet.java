package http_study.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
//자바 문서를 톰캣 서버가 실행될 때 리소스 주소로 생성한다.
//HttpServlet : 톰캣서버 등록할 때 같이 참조된 라이브러리에서 제공, 톰캣이 생성할 동적 리소스의 타입
//1. 사용자(클라이언트) 브라우저에서 url 로 tjqjwnth(ip+포트번호)/l01Servlet.do를 호출
//2. 요청을 받은 톰캣 서버가 L01Servlet을 객체로 생성하고 브라우저에 html로 변환해서 응답을 한다.
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/l01Servlet.do")
public class L01Servlet extends HttpServlet{
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //HttpServletRequest req요청 객체
      //HttpServletResponse resp 응답 객체
      resp.getWriter().append("<h1>Hello Servlet 동적 리소스!!"+(100/3)+"</h1>");
   }
   
}