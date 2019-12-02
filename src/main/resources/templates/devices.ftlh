<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>
<@c.page>
<div>
    <@l.logout />
    <div>_______________</div>
    <span><a href="/user">Список пользователей</a></span>
    <div>_______________</div>
</div>
<div>Список устройств</div>
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
            <div>
                <td><b>${device.id}</b></td>
                <td><b>${device.serialNo}</b></td>
                <td><i>${device.type}</i></td>
                <td><b>${device.description}</b></td>
                <td><i>${device.createdAt}</i></td>
                <td><strong>${device.ownerName}</strong></td>
            </div>
        <#else>
            <i>Устройств для текущего пользователя нет</i>
            </tr>
        </#list>
        </tbody>
    </table>
    <div>_______________</div>
    <div>
        <a href="/registry/api/devices">Вывести список устройств в формате Json</a>
    </div>
    <div>
        <a href="/registry/devices/add">Добавить новое устройство</a>
    </div>
    <div>
        <a href="/registry/stats">Статистика</a>
    </div>
</@c.page>