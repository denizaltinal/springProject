var app= angular.module("RestService",[]);
app.factory("RestService", ["$http",function($http){
	 var URL= "http://localhost:8080/hello";
	 var RestService = {};
	 RestService.getArticles=function(){
		 return $http.get(URL);
	 }
	
	 
	 return RestService;
	 
}]);

