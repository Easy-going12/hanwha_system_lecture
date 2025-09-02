package com.ohgiraffers.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class ReceiveInformatiionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("userId");
        String passowrd = req.getParameter("password");

        /* 설명.
         *  이 부분에서 입력받아 서버로 넘어온 id와 pwd를 가지고 DB까지 가서 select하고 확인하는
         *  비지니스 로직(BL)이 수행되어야 한다,(그 결과는 해당 회원의 정보가 옹ㄹ겅ㅇ임
         *  우리는 제대로 조회가 되었다는 가정하에 'XXX님 환영합니다.'와 같은 메세지를 가진화면을
         *  만들어 응답해보자.
        *  */
        req.setAttribute("userName", "홍길동");

        RequestDispatcher rd = req.getRequestDispatcher("print");
        rd.forward(req,resp);
    }
}
