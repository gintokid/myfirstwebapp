<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Login Page</title>
</head>
<body>
<%--<h1> Welcome to the login page ${name} </h1>--%>
<div class="container">
    <h1> Login page </h1>
    <pre style="color: red">${errorMessage}</pre>
    <form method="post">
        <div>
            <label>
                Username : <input name="name"/>
            </label>
        </div>
        <div>
            <label>
                Password : <input name="password"/>
            </label>
        </div>
        <input type="submit" class="btn btn-success"/>
    </form>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
