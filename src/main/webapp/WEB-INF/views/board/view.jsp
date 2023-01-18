<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@
taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <div class="container mt-4">
      <div>board/view</div>
      <div class="fs-3" name="title">${boardBean.title}</div>
      <div class="card">
        <div class="card-header">${boardBean.title}</div>
        <div class="card-body">${boardBean.content}</div>
        <div class="card-footer">${boardBean.userName}</div>
      </div>
      <div class="mt-3">
        <a
          href="/board/edit?uid=${boardBean.userName}"
          class="btn btn btn-outline-secondary"
          >수정</a
        >
        <a href="/board/list" class="btn btn-outline-secondary">목록</a>
      </div>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
