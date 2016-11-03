var guitarApp = angular.module('guitarApp', []);

guitarApp.controller('GuitarController', function GuitarController($scope, $http) {

    $http.get("/test/").then(function(response) {
        $scope.test = response.data;
    })
});