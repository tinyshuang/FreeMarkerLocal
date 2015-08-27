<#assign x = ["red", 16, "blue", "cyan","blue"]>

使用first输出序列的第一个值
${x?first}

使用last输出序列的最后一个值
${x?last}

使用seq_contains来判断序列是否包含某个值
${x?seq_contains("blue")?string("true","false")}

使用seq_index_of来判断值在序列的第几个出现
${x?seq_index_of(16)}
${x?seq_index_of("16")}
第二个参数表示从第几个序列开始找..序号从0开始
${x?seq_index_of(16,2)}

使用seq_last_index_of来判断最后一次出现的位置
${x?seq_last_index_of("blue")}

reverse反转序列
<#list x?reverse as a> 
	${a}
</#list>

size序列大小
${x?size}

sort排序
<#list ["red", "blue", "cyan"]?sort as a> 
	${a}
</#list>

使用sort_by来排序哈希序列
<#assign ls = [
  {"name":"whale", "weight":2000},
  {"name":"Barbara", "weight":53},
  {"name":"zeppelin", "weight":-200},
  {"name":"aardvark", "weight":30},
  {"name":"beetroot", "weight":0.3}
]>
Order by name:
<#list ls?sort_by("name") as i>
- ${i.name}: ${i.weight}
</#list>

chund切块
<#assign seq = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']>
<#list seq?chunk(4) as row>
  <#list row as cell>${cell} </#list>
</#list>

---------------------------------------

<#list seq?chunk(4, '-') as row>
  <#list row as cell>${cell} </#list>
</#list>


