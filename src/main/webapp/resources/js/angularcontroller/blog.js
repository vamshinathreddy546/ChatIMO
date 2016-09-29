var app = angular.module('Blog',[])
app.controller('blogcontroller', [ '$scope', '$http', function($scope, $http) {
	
	$scope.submit = function(){
		var BASE_URL='http://localhost:8082/Testpro';
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
		}).error(function(data, status, headers, config) {
			alert("Error");
		});
	};
}]);
