<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>Calculator</h1>
<c:out value="${sum}"/>
<form method="post">
    <input type="number" name="a" id="a" placeholder="a">
    <input type="number" name="b" id="b" placeholder="b">
    <button>Submit</button>
</form>
</body>
</html>
