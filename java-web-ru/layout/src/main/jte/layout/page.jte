<!DOCTYPE html>
<html>
<head>
    <title>Название сайта</title>
    <!-- Подключаем Bootstrap для стилей (подключите файл с Bootstrap в вашем проекте) -->
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="/">Главная</a></li>
                <li><a href="/users">Все пользователи</a></li>
            </ul>
        </nav>
    </header>
    
    <main>
        {{ body }} <!-- Здесь будет вставляться содержимое разных страниц -->
    </main>
    
    <footer>
        <p>&copy;2021 Мой сайт | <a href="https://gitlab.com/ваш-профиль">Мой GitLab</a></p>
    </footer>
</body>
</html>

