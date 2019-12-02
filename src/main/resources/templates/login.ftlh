<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>
<@c.page>
    <div>Авторизация</div>
    <div>_______________</div>
<@l.login "/login" />
    <div>_______________</div>
<a href="/registration">Добавить нового пользователя</a>
</@c.page>