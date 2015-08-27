foo
<@upper>
  bar
  <#-- 这里允许使用所有的 FTL -->
  <#list ["red", "green", "blue"] as color>
    ${color}
  </#list>
  baaz
</@upper>
wombat
