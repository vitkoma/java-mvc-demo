<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>Projects</title>
  </head>
  <body>
    <h1>Projects</h1>
    <ul>
      <c:forEach items="${projects}" var="project">
        <li>
            <a href="projects/${project.id}">${project.id} - ${project.name}</a>
            &nbsp;
            [<a href="projects/new">Delete</a>]
        </li>
      </c:forEach>
    </ul>
    <a href="projects/new">Create</a>
  </body>
</html>
