<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>
<@c.page>
    <div>Регистрация нового пользователя</div>
    <div>_______________</div>
    ${message?ifExists}
<@l.login "/registration"/>
</@c.page>