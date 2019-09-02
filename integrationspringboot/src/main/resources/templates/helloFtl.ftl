<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Hello World!</title>
</head>
<body>
<h1>Hello.v.2</h1>
<p>${hello}</p>

<p>
<h1 id="show">
</h1>
</p>
<p>
    <input type="button" id="enter1" value="访问网络" onclick="testClick1();"/>
</p>
</body>

<script>
    function testClick1() {
        console.log(document.cookie);
        document.getElementById("show").innerHTML = "返回的值" + document.cookie;
    }
</script>
</html>