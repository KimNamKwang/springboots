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
    <div class="container mt-3">
      <div>/board/form</div>
      <form action="/board/list" method="post">
        <div class="mt-3">
            <div class="input-group mt-2">
              <label for="" class="input-group-text">게시글 제목</label>
              <textarea
                name="title"
                cols=""
                rows="1"
                class="form-control"
                placeholder="게시글 제목을 입력하세요"
              ></textarea>
            </div>
            <div class="input-group mt-2">
              <label for="" class="input-group-text">게시글 내용</label>
              <textarea
              name="content"  
              cols=""
                rows="10"
                class="form-control"
                placeholder="게시글 내용을 입력하세요"
              ></textarea>
            </div>
            <div class="input-group mt-2">
              <label for="" class="input-group-text">작 성 자</label>
              <textarea
              name="username"
                cols=""
                rows="1"
                class="form-control"
                placeholder="작성자를 입력하세요"
              ></textarea>
            </div>
            <div class="input-group mt-2">
              <label for="" class="input-group-text">작성일시</label>
              <textarea
              name="date"
                cols=""
                rows="1"
                class="form-control"
                placeholder="2023.01.05. 13:05:22"
                ></textarea>               
            </div>
            <div class="mt-3">
              <button type="submit" class="btn btn-outline-secondary">작성</button>
              <a href="/board/list" class="btn btn-outline-secondary">목록</a>
            </div>
          </div>
        </form>
        </div>
        
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
