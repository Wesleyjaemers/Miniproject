var url="http://localhost:8080/client/1";
var gamesUrl="http://localhost:8080/games/all";
var title = document.getElementById("title");
var http = new XMLHttpRequest();
var http2 = new XMLHttpRequest();
http.onreadystatechange = function (e) {
  if (http.readyState === 4 && http.status === 200) {
    console.log(http.responseText);
  } else {
    console.log(http.statusText);
  }
};
http.open("GET", url, true);
http.send(null);
http.onload = function() {
  var obj = JSON.parse(http.responseText);
  title.innerHTML = "Welcome " + obj.firstName + " " + obj.lastName;
};
http.onerror = function (e) {
  console.error(http.statusText);
};
var gameTable = document.getElementById("gameTable");
var gameTableBody = gameTable.getElementsByTagName("tbody")[0];
http2.onreadystatechange = function (e) {
  if (http2.readyState === 4 && http2.status === 200) {
    console.log(http2.responseText);
  } else {
    console.log(http2.statusText);
  }
};
http2.open("GET", gamesUrl, true);
http2.send(null);
http2.onload = function() {
  var obj = JSON.parse(http2.responseText);
  for (var i in obj) {
    var gameTableRow = gameTableBody.insertRow(gameTableBody.rows.length);
    var naam  = document.createTextNode(obj[i].name);
    var type  = document.createTextNode(obj[i].type);
    var stock  = document.createTextNode(obj[i].stock+" stuks");
    var prijs = document.createTextNode(obj[i].price+" euro");
    var buttonText  = document.createTextNode("button");
    gameTableRow.insertCell(0).appendChild(naam);
    gameTableRow.insertCell(1).appendChild(type);
    gameTableRow.insertCell(2).appendChild(stock);
    gameTableRow.insertCell(3).appendChild(prijs);
    gameTableRow.insertCell(4).appendChild(buttonText);
  }
};
http2.onerror = function (e) {
  console.error(http2.statusText);
};

