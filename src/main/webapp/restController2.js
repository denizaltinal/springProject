var app = angular.module("application", []);
app.controller("RestController2", function($scope , $http)

{ var URL= "http://localhost:8080/hello";

	$scope.articles=[];
   $scope.message="sfad";
	   getArticles();
	
	function getArticles() {
		 $http.get(URL).then(function success(response) {

			$scope.articles = response.data;

		}, function failure(response) {

			console.log(response.statusText)
		});
	}
	

	
}

);