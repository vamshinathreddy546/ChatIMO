<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html data-ng-app="Blog">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="https://opensource.keycdn.com/angularjs/1.5.8/angular.min.js "></script>
<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/blog.js"></script>
			<%-- <script
			src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
			 --%>
</head>
<body>
	<div>
		<form  data-ng-submit="submit()" data-ng-controller="blogcontroller">
			<div class="form-group">
				<label for="formdata">blog name</label> <input type="text"
					placeholder="blogname" data-ng-model="name">
			</div>
			<div class="form-group">
				<label for="formdata">blog Description</label>
				<textarea draggable="false" style="resize: none" id="formdata"
					class="form-control" rows="13" data-ng-model="description"></textarea>
			</div>
			
			<div align="right">
				<button type="submit" class="btn btn-success">submit</button>
			</div>
			
		</form>
		</div>
		<div data-ng-init="getalldetails()"></div> 
		<table class="table table-bordered">
		 
    <thead>
      <tr>
        <th>BlogId</th>
        <th>Blog Title</th>
        <th>Blog Description</th>
      </tr>
    </thead>
    <tbody data-ng-repeat= "data in lines">
    <tr>
                    <td>{{blog.bid}}</td>
					<td>{{blog.blogName}}</td>
					<td>{{blog.blogDesc}}</td>
    
    </tr>
    </tbody>
</table>
</body>
</html>