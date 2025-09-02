<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Request Parameter</h1>
    <h3>GET 방식 요청</h3>
    <form action="querystring" method="get">
<%--        label + input--%>
        <label for="name1">이름:</label><input id = "name1" type="text" name="name">
<%--        label이 없어도 작동되지만 가독성을 위해서 있다--%>
<%--        input으로 박스 모양을 만들어주고 그 안에 text 타입에 글자를 쓸 수 있고 그 값을 name에 저장한다.--%>
<%--            for에 적혀있는 id 부분으로 이동한다. --%>
        <br>
        <label>나이: </label><input type="text" name="age">
        <br>
        <label >생일: </label><input type="date" name="birthday">
        <br>
        <label>성별: </label>
<%--        input[type='radio' name='gender' id='male' value='M']--%>
        <input type="radio" name="gender" id="male" value="M">
<%--        radio는 버튼 모양으로 name으로 맟춘 값끼리 값을 자유롭게 누를수 있도록한다--%>
        <label for="male">남자</label>
        <input type="radio" name="gender" id="female" value="F">
        <label for="female">여자</label>
        <br>
        <label>국적: </label>
        <select name="national">
<%--            option*4--%>
            <option value="ko">한국</option>
            <option value="ch">중국</option>
            <option value="jp">일본</option>
            <option value="etc">기타</option>
        </select>
        <br>
        <label>취미: </label>
        <input type="checkbox" name="hobbies" id="movie" value="movie"><label>영화보기</label>
        <input type="checkbox" name="hobbies" id="music" value="music"><label>음악감상</label>
        <input type="checkbox" name="hobbies" id="sleep" value="sleep"><label>잠자기</label>
        <br>
        <button>GET 요청</button>
    </form>

    <h4>a태그의 href 속성에 직접 파라미터를 쿼리스트링 형태로 작성하고 geet요청을 할 수 도 있다.</h4>
    <a href="http://localhost:8080/chap03/querystring?name=%EC%9D%B4%EC%A7%80%EC%9C%A4&age=20&birthday=2025-09-16&gender=M&national=ko&hobbies=movie&hobbies=music">
        a태그 활용
    </a>

    <h3>POST 방식의 요청</h3>
    <h4>Form 태그를 이용한 post 방식 요총</h4>
    <form action="payload" method="post">
        <label for="name1">이름:</label><input id = "name1" type="text" name="name">
        <br>
        <label>나이: </label><input type="text" name="age">
        <br>
        <label >생일: </label><input type="date" name="birthday">
        <br>
        <label>성별: </label>
        <input type="radio" name="gender" id="male" value="M">
        <label for="male">남자</label>
        <input type="radio" name="gender" id="female" value="F">
        <label for="female">여자</label>
        <br>
        <label>국적: </label>
        <select name="national">
            <option value="ko">한국</option>
            <option value="ch">중국</option>
            <option value="jp">일본</option>
            <option value="etc">기타</option>
        </select>
        <br>
        <label>취미: </label>
        <input type="checkbox" name="hobbies" id="movie" value="movie"><label>영화보기</label>
        <input type="checkbox" name="hobbies" id="music" value="music"><label>음악감상</label>
        <input type="checkbox" name="hobbies" id="sleep" value="sleep"><label>잠자기</label>
        <br>
        <button>GET 요청</button>
    </form>
</body>
</html>