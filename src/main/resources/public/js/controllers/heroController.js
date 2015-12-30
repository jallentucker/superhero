angular.module('heroTracker').controller('heroCtrl', ['$scope', '$http', function($scope, $http) {
	$http.get("/heroes");
}]);
