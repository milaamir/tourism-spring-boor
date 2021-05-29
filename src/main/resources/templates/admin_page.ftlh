<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="./css/account.css">
    <link rel="stylesheet" type="text/css" href="./css/header.css">
    <title>Admin Page</title>
</head>
<body>
<div class="header">
    <a class="header_link" href="/account">Профиль</a>
    <a class="header_link" href="/tours">Обзор туров</a>
    <a class="header_link" href="/create-tour">Создать тур</a>
    <a class="header_link" href="/admin">Управление</a>
    <a class="header_link" href="/logout">Выход</a>
</div>
<table class="table" style="text-align: center">
    <thead class="table-dark">
    <tr>
        <td><p class="fw-bold">Email</p></td>
        <td><p class="fw-bold">Статус</p></td>
        <td><p class="fw-bold">Роль</p></td>
        <td></td>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
        <tr>
            <td><p class="fw-bold">${user.email}</p></td>
            <td>
                <#if user.isActive()>
                    <p class="fw-bold">Active</p>
                <#else>
                    <p class="fw-bold">Banned</p>
                </#if>
            </td>
            <td>
                <#if user.isAdmin()>
                    <p class="fw-bold">Admin</p>
                <#else>
                    <p class="fw-bold">User</p>
                </#if>
            </td>
            <td>
                <#if user.isActive()>
                    <form method="post" action="/ban/${user.id}">
                        <input type="submit" class="btn btn-danger" value="Заблокировать">
                    </form>
                <#else>
                    <form method="post" action="/unban/${user.id}">
                        <input type="submit" class="btn btn-success" value="Разблокировать">
                    </form>
                </#if>
            </td>
        </tr>
    </#list>
    </tbody>
</table>

</body>
</html>