定义一个哈希 h-->{"name":"mouse", "price":50}
定义一个列表-->h?keys

<#assign h = {"name":"mouse", "price":50}>
<#assign keys = h?keys>
<#list keys as key>${key} = ${h[key]}; </#list>
