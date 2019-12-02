<#import "parts/common.ftlh" as c>
<@c.page>
    <div><i>5 последних добавленных устройств</i></div>
    <table>
        <thead>
        <th>UUID</th>
        <th>Серийниый номер</th>
        <th>Тип</th>
        <th>Описание</th>
        <th>Добавлено</th>
        <th>Пользователь</th>
        </thead>
        <tbody>
        <#list devices as device>
            <tr>
                <td><b>${device.id}</b></td>
                <td><b>${device.serialNo}</b></td>
                <td><i>${device.type}</i></td>
                <td><b>${device.description}</b></td>
                <td><i>${device.createdAt}</i></td>
                <td><strong>${device.ownerName}</strong></td>
            </tr>
        </#list>
        </tbody>
    </table>
    <div>_______________</div>
    <div><i>5 пользователей, добавивших больше всех устройств</i></div>
    <table>
        <thead>
        <th>Пользователь</th>
        <th>Добавил устройств</th>
        </thead>
        <tbody>
        <#list users as user>
            <tr>
                <td><b>${user.username}</b></td>
                <td><b>${user.count}</b></td>
            </tr>
        </#list>
        </tbody>
    </table>
    <div>_______________</div>
    <div>
        <a href="/registry/devices/">Вернуться назад к списку устройств</a>
    </div>
</@c.page>