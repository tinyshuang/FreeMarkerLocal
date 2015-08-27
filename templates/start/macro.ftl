<#-- 定义宏指令 -->
<#macro greet person>
  <font size="+2">Hello ${person}!</font>
</#macro>

<@greet person="shuihuo"/>

<#-- 定义带参数的宏指令 -->
<#macro greetDate person date>
  <font size="+2">Hello ${person}! ${date} </font>
</#macro>

<@greetDate person="shuihuo" date="2013-12-12"/>

<#-- 定义带默认值参数的宏指令,如果参数不带默认值就必须传全 -->
<#macro greetDateDefault person date="2014-12-12">
  <font size="+2">Hello ${person}! ${date} </font>
</#macro>

<@greetDateDefault person="shuihuo" />