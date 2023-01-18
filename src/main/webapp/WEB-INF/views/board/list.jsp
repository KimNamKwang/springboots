<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <div class="container">
      <div>board/list</div>
      <div class="fs-2" name="title">News</div>
      <table class="table table-striped table-hover">
        <thead>
            <tr>
                <th scope=>NO</th>
                <th scope=></th>
                <th scope=></th>
                <th scope=>UserName</th>
                <th scope=>Date</th>
            </tr>
        </thead>
        <tbody>
          <c:forEach var="board" items="${boardList}" varStatus="status">
            <tr>
                <th scope=>${status.count}</th>
                <td colspan=2>
                  <a href="/board/view?uid=${board.userName}"  class="text-decoration-none text-dark">
                   ${board.title}
                  </a>	
                </td>
                <td>${board.userName}</td>
                <td>${board.date}</td>
            </tr>
          </c:forEach>
            
        </tbody>
    </table>

    <hr>
    <a href="/board/form" class="btn btn-outline-secondary">항목추가</a>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
