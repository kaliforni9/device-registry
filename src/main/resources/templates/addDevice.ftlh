<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>
<@c.page>
    <div>
        <form method="post">
            <input type="text" name="serialNo" placeholder="Введите серийный номер">
            <input type="text" name="type" placeholder="Введите тип">
            <input type="text" name="description" placeholder="Введите описание">
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <button type="submit">Добавить</button>
        </form>
    </div>
    <div>_______________</div>
    <a href="/registry/devices/">Вернуться к списку устройств</a>
</@c.page>