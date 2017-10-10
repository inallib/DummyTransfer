app.controller('usersController',  function($scope) {
    $scope.headingTitle = "User List";
});

app.controller('rolesController', function($scope, $http) {
    $scope.headingTitle = "Roles List";
    
    $scope.showMessage = function() {
    	alert(	$http({
            method: 'GET',
            url: '/message',
         }).success(function(data){
             return data
        }).error(function(){
            alert("error");
        }));
    }
});
