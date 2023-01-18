<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <div class="container mt-3">
      <div>board/edit</div>
      <div>게시물 수정</div>
      <form action="/board/list" method="post">
        <div class="input-group mt-2">
          <label for="" class="input-group-text">게시글 제목</label>
          <textarea
            name="title"
            cols=""
            rows="1"
            class="form-control"
            placeholder="${boardBean.title}"
          ></textarea>
        </div>
        <div class="input-group mt-2">
          <label for="" class="input-group-text">게시글 내용</label>
          <textarea
          name="content"  
          cols=""
            rows="10"
            class="form-control"
            placeholder="${boardBean.content}"
          ></textarea>
        </div>
        <div class="input-group mt-2">
          <label for="" class="input-group-text">작 성 자</label>
          <textarea
          name="username"
            cols=""
            rows="1"
            class="form-control"
            placeholder="${boardBean.userName}"
          ></textarea>
        </div>
        <div class="mt-3">
          <button type="submit" class="btn btn-outline-secondary">수정</button>
          <a href="/board/list" class="btn btn-outline-secondary">목록</a>
        </div>
      </div>
      
    </form>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
