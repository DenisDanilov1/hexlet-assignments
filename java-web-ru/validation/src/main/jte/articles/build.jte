@import exercise.dto.articles.BuildArticlePage
@param BuildArticlePage page

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport">
    <title>Sing in</title>
</head>
<body>
@if(page.getErrors() != null)
    <ul>
        @for(var validator : page.getErrors().values())
            @for(var error : validator)
                <li>${error.getMessage()}</li>
            @endfor
        @endfor
    </ul>
@endif

<form action="/articles" method="post">
    <div>
        <label>
            Title
            <input type="text" name="title" value="${page.getTitle()}" />
        </label>
    </div>
    <div>
        <label>
            Content
            <textarea name="content" value="${page.getContent()}"></textarea>
        </label>
    </div>
    <input type="submit" value="Send" />
</form>
</body>
</html>
