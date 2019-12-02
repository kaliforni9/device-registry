<#import "parts/common.ftlh" as c>

<@c.page>
    <div>Список пользователей</div>
    <table>
        <thead>
        <th>Имя пользователя</th>
        <th>Привелегии</th>
        <th></th>
        </thead>
        <tbody>
        <#list users as user>
            <tr>
                <td>${user.username}</td>
                <td><#list user.roles as role>${role}<#sep>, </#list></td>
                <td><a href="/user/${user.id}">ИЗМЕНИТЬ</a></td>
            </tr>
        </#list>
        </tbody>
    </table>
</@c.page>