var btnSubmit = document.getElementById('btnSubmit');
var skyOutput = document.getElementById('skyOutput');
var coordOutput = document.getElementById('coordOutput');
var tempOutput = document.getElementById('tempOutput'); 
btnSubmit.addEventListener('click', getWeather); //get weather function
//var weatherOutput = document.getElementById('weatherOutput');
var cityName = document.getElementById('input');

//var weatherString = null;

function getWeather() { 
  var request = new XMLHttpRequest();
  var url1 ='http://api.openweathermap.org/data/2.5/weather?q=';
  var url2 = '&&appid=43eb6e1f55e024017f7ff34fafbd2d0b';
  var url = url1 + cityName.value + url2;
  request.open('GET', url); //type of request and where its going 
  request.send(); //send request to API
  //req.setRequestHeader('Content-Type', 'application/json'); //key value pair
  request.onload = function(){ 
    //console.log(req.responseText);
    var data = JSON.parse(request.responseText);
    var sOutput = '<p>' + cityName.value + ':' + data.weather[0].description + '<p>';
    skyOutput.innerHTML = sOutput;
    var temp = (data.main.temp - 273.15) * 9/5 + 32;
     var tOutput = '<p>'+ 'Temp: ' + 
    temp.toFixed(2) + ' F' +'<p>';
    tempOutput.innerHTML = tOutput;
    var cOutput = '<p>'+ 'Coord: ' + data.coord.lon.toFixed(2) + ', ' + data.coord.lat.toFixed(2) + '<p>';
    coordOutput.innerHTML = cOutput;
  }
}