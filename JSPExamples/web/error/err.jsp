<html>
<!--
  Copyright 2004 The Apache Software Foundation

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
-->
<body bgcolor="lightblue">

	<%@ page errorPage="miPropiaPaginaError.jsp" %>
	<jsp:useBean id="foo" scope="request" class="error.Smart" />
	<% 
		String name = null;

		if (request.getParameter("name") == null) {
	%>
	<%@ include file="/error/error.html" %>
	<%
		} else {
		  foo.setName(request.getParameter("name"));
		  if (foo.getName().equalsIgnoreCase("integra"))
		  	name = "acura";
		  if (name.equalsIgnoreCase("acura")) {
	%>

    <H1> Yes!!! <a href="http://www.acura.com">Acura</a> is my favorite car.</H1>

	<% 
		  }
		}	
	%>	
</body>
</html>

