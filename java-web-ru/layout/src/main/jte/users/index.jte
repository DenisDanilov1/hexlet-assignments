@extends("layout.jte")

@section("body")
    <h1>Список пользователей:</h1>
    <ul>
        {{ for user in users }}
            <li><a href="/users/{{ user.id }}">{{ user.name }}</a></li>
        {{ end }}
    </ul>
@endsection

