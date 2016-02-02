<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Project</title>
  </head>
  <body>
    <form action="" method="post">
      <label for="id">ID</label> <input readonly="true" name="id" id="id" value="${project.id}"> <br>
      <label for="name">Name</label> <input name="name" id="name" value="${project.name}"> <br>
      <button type="submit">Submit</button>
    </form>
  </body>
</html>
