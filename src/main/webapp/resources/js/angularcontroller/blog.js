var app = angular.module('Myapp',[])
app.controller('blogcontroller', [ '$scope', '$http', function($scope, $http) {
	
	$scope.submit = function(){
		var BASE_URL='http://localhost:8081/Testpro';
		$scope.blog= {
				id:$scope.id,
				name:$scope.name,
				description:$scope.description
				
		}
		$http({
			method:'POST',
			url:BASE_URL + '/Blog',
			data:$scope.blog
		}).success(function(data, status, headers, config) {
			alert("Success");
			$scope.id ='';
			$scope.name = '';
			$scope.description='';
		}).error(function(data, status, headers, config) {
			alert("Error");
		});
	};
	
	$scope.getalldetails=function() {
		$http({
			method:'GET',
            url:'getalldetails'
		}).success(function(data,status,headers,config){
			$scope.blogs = data;
			console.log($scope.blogs);
			
		}).error(function(data,status,headers,config){
			alert("error");
		});
		
		};
		
	$scope.deleteblog=function(id){
			$http({
				method:'DELETE',
              url:'deleteblog/'+id			
			}).success(function(data, status, headers, config) {
			   alert("Success");
			}).error(function(data, status, headers, config) {
				alert("error");
			});
		};
		$scope.editblog=function(id){
			$http({
				method:'GET',
				url:'editblog/'+id
			}).success(function(data, status, headers, config) {
				$scope.blog=data;
				$scope.id=$scope.blog.id;
				$scope.name=$scope.blog.name;
				$scope.description=$scope.blog.description;
				
				
			}).error(function(data, status, headers, config) {
				alert("error");
			});
			
			
			
		};
		

}]);
