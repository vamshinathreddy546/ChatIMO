var app = angular.module('Myapp', []);
app.controller('forumcontroller',['$scope','$http',function($scope,$http){
	$scope.submit=function()
	{
		var BASE_URL='http://localhost:8081/Testpro';
		$scope.forum={
				id:$scope.id,
			    name:$scope.name,
		        description:$scope.description
		}
		$http({
			method:'POST',
			url:BASE_URL + '/forum',
			data:$scope.forum
			}).success(function(data, status, headers, config) {
				alert("Success");
				$scope.id ='';
				$scope.name = '';
				$scope.description='';
			}).error(function(data, status, headers, config) {
				alert("Error");
			});
		};
		$scope.getalldetailsf=function() {
			$http({
				method:'GET',
	            url:'getalldetailsf'
			}).success(function(data,status,headers,config){
				$scope.forums = data;
				console.log($scope.forums);
				
			}).error(function(data,status,headers,config){
				alert("error");
			});
			
			};
			
		$scope.deleteforum=function(id){
				$http({
					method:'DELETE',
	              url:'deleteforum/'+id			
				}).success(function(data, status, headers, config) {
				   alert("Success");
				}).error(function(data, status, headers, config) {
					alert("error");
				});
			};
			$scope.editforum=function(id){
				$http({
					method:'GET',
					url:'editforum/'+id
				}).success(function(data, status, headers, config) {
					$scope.forum=data;
					$scope.id=$scope.forum.id;
					$scope.name=$scope.forum.name;
					$scope.description=$scope.forum.description;
					
					
				}).error(function(data, status, headers, config) {
					alert("error");
				});
				
				
				
			};
			

}]);

		
		
		
		
	
	
	
	
