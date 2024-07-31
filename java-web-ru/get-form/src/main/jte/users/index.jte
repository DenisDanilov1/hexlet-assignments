@import  exercise.dto.users.UsersPage
@param UsersPage page

<html>
<head>
    <meta charset="UTF-8">
    <title>Users</title>
</head>
<body>
    <h1>Find users</h1>
    <form action="/users" method="get">
        <label for="SearchTerm">Enter the first name</label>
        <input type="text" id="SearchTerm" name="term" value="${page.getTerm()}">
        <button type="submit">Search</button>
    </form>
    <h2>Result</h2>
    <ul>
        @if(page.getUsers().isEmpty())
            <li>Users not found</li>
        @else
            @for(var user : page.getUsers())
                <li>${user.getFirstName()} ${user.getLastName()}</li>
            @endfor
        @endif
    </ul>
</body>
</html>
