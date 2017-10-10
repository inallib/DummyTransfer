var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
	    .when('/dashboard',{
	        templateUrl: '/views/dashboard.html',
	        controller: 'dashboard-controller'
	    })
	    .when('/patient',{
	        templateUrl: '/views/patient.html',
	        controller: 'patient-controller'
	    })
        .when('/results',{
            templateUrl: '/views/results.html',
            controller: 'results-controller'
        })
        .when('/admin',{
            templateUrl: '/views/admin.html',
            controller: 'admin-controller'
        })
        .when('/roles',{
            templateUrl: '/views/roles.html',
            controller: 'rolesController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});

