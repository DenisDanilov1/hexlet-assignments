<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport">
    <title>User registration</title>
</head>
<body>
<form action="/users" method="post">
    <div>
        <label>
            First Name
            <input type="text" name="firstName" />
        </label>
    </div>
    <div>
        <label>
            Last name
            <input type="text" name="lastName" />
        </label>
    </div>
    <div>
        <label>
            Email
            <input type="email" name="email" />
        </label>
    </div>
    <div>
        <label>
            Password
            <input type="password" name="password" />
        </label>
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>
</body>
</html>
