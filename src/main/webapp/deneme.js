/*var app = angular.module("CustomerManagement", ["RestService"]);
// Controller Part
app.controller("CustomerController" , function($scope, RestService) {

	$scope.message = "Deniz!";
	$scope.articles;
	
	
	getArticles();

	function getArticles() {

		RestService.getArticles().then(function success(response) {

			$scope.articles = response.data;

		}, function failure(response) {

			console.log(response.statusText)
		});
	};	
	
})
