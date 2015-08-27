<#macro border>
  <table border=4 cellspacing=0 cellpadding=4>
  	<tr>
  		<td>
    			<#nested>
  		</td>
  	</tr>
  </table>
</#macro>

<#-- 嵌套内容-->
<@border>The bordered text</@border>

<#-- 多次调用-->
<#macro do_thrice>
  <#nested>
  <#nested>
  <#nested>
</#macro>
<@do_thrice>
Anything.
</@do_thrice>

<#macro do_thrice>
  <#nested 1>
  <#nested 2>
  <#nested 3>
</#macro>
<@do_thrice ; x> <#-- 用户自定义指令 使用";"代替"as" -->
  ${x} Anything.
</@do_thrice>


<#macro repeat count>
  <#list 1..count as x>
    <#nested x, x/2, x==count>  <#-- x, x/2, x==count分别对应下面的c, halfc, last参数 -->
  </#list>
</#macro>
<@repeat count=4 ; c, halfc, last>
  ${c}. ${halfc}<#if last> Last!</#if>
</@repeat>

