<%--
  Created by IntelliJ IDEA.
  User: Kanwal Nain Singh
  Date: 27/10/13
  Time: 7:39 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Status</title>
</head>
<body>
<h1>What are you Doing?</h1>
<div class="focused">

  <g:formRemote name="updateStatusForm" url="[ action:'updateStatus']" update="message">

   <g:textArea name="message" value=""/>
      <g:submitButton name="Update Status"/>
  </g:formRemote>
<div class="message">

</div>
</div>
</body>
</html>