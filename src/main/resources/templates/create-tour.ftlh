<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="./css/create-tour.css">
    <title>Login</title>
</head>
<body>
<div class="body-wrapper">
    <div class="header">
        <a class="header_link" href="/account">Профиль</a>
        <a class="header_link" href="/tours">Обзор туров</a>
        <a class="header_link" href="/create-tour">Создать тур</a>
        <a class="header_link" href="/admin">Управление</a>
        <a class="header_link" href="/logout">Выход</a>
    </div>
    <div class="main">
        <h2 class="main_title">Создать тур</h2>
        <div class="main_form-wrapper">
            <form class="form" method="post" action="/create-tour">
                <input name="name" type="text" placeholder="name"/>
                <!--
                <p class="form_label">Страны</p>
                <select name="countries">
                    <#list countries as country>
                        <option value="${country.id}">${country.name}</option>
                    </#list>
                </select>
                -->
                <p class="form_label">Города</p>
                <select name="cities">
                    <#list countries as country>
                        <#list country.cities as city>
                            <option value="${city.id}">${city.name}</option>
                        </#list>
                    </#list>
                </select>
                <p class="form_label">Отель</p>
                <select name="hotels">
                    <#list hotels as hotel>
                        <option value="${hotel.id}">${hotel.name}</option>
                    </#list>
                </select>
                <div class="price">price</div>
                <input type="submit" value="Create tour"/>
            </form>
        </div>
    </div>
</div>


</body>
</html>