angular.module('heroTracker', ['ui.router'])
	.config(['$stateProvider', function($stateProvider) {
		$stateProvider
			.state('hero', {
				url: '/hero',
				controller: 'heroCtrl',
				templateUrl: 'templates/hero.html'
			})
			.state('team', {
				url: '/team',
				controller: 'teamCtrl',
				templateUrl: 'templates/team.html'
			});
	}]);
