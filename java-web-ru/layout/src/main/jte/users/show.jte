@extends("layout.jte")

@section("body")
    <h1>{{ user.name }}</h1>
    <p>Email: {{ user.email }}</p>
@endsection

