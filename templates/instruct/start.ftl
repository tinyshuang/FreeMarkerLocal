if和elseif和else的简单使用
<#assign x=2>
<#if x == 1>
  x is 1
<#elseif x == 2>
  x is 2
<#elseif x == 3>
  x is 3
<#elseif x == 4>
  x is 4
<#else>
  x is not 1 nor 2 nor 3 nor 4
</#if>

switch的使用
<#assign y="medium">
<#switch y>
  <#case "small">
    This will be processed if it is small
    <#break>
  <#case "medium">
    This will be processed if it is medium
    <#break>
  <#case "large">
    This will be processed if it is large
    <#break>
  <#default>
    This will be processed if it is neither
</#switch>


在 list循环中，有两个特殊的循环变量可用：
*item_index ：这是一个包含当前项在循环中的步进索引的数值。
*item_has_next ：来辨别当前项是否是序列的最后一项的布尔值。
例子:
<#assign seq = ["winter", "spring", "summer", "autumn"]>
<#list seq as x>
  ${x_index + 1}. ${x}<#if x_has_next>,</#if>
</#list>

使用数字来计数
<#assign q=3>
<#list 1..q as i>
  ${i}
</#list>

使用noparse来不转换ftl
<#noparse>
  <#list animals as being>
  <tr><td>${being.name}<td>${being.price} Euros
  </#list>
</#noparse>

使用compress减少空格
<#compress>
  1 2 3 4      5
  test only
  
  I said, test only
</#compress>

使用escape来转义html字符
<#assign one="<&>!$">
<#escape x as x?html>
  First name: ${one}
</#escape>

escape的形式
<#noparse>
<#escape identifier as expression>
  ...
  <#noescape>...</#noescape>
  ...
</#escape>
</#noparse>


 t（整体削减）：忽略本行中首和尾的所有空白。
 lt（左侧削减）：忽略本行中首部所有的空白。
 rt（右侧削减）：忽略本行中尾部所有的空白。
--
  1 <#t>
  2<#t>
  3<#lt>
  4
  5<#rt>
  6
--









