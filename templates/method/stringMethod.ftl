字符串截取"substring"
${'abc'?substring(0)}
${'abc'?substring(0, 2)}

首字母大写"cap_first"
${" green mouse"?cap_first}

首字母小写"uncap_first"
${" green mouse"?uncap_first}

字符串的所有单词首字母都大写"capitalize"
${" green mouse"?capitalize}
${"GreEN mouse"?capitalize}

 date，time，datetime 日期，时间，时间日期-->字符串转成日期
<#assign test1 = "10/25/1995"?date("MM/dd/yyyy")>
<#assign test2 = "15:05:30"?time("HH:mm:ss")>
<#assign test3 = "1995-10-25 03:05:20"?datetime("yyyy-MM-dd hh:mm:ss")>
${test1}
${test2}
${test3}

ends_with 以…结尾
${"redhead"?ends_with("head")?string("true","no")}

html HTML 格式的转义文本
${"<>测试"?html}

index_of
${"abcabc"?index_of("bc", 2)}

last_index_of
${"abcabc"?last_index_of("ab")}
你可以指定开始搜索的索引,要注意第二个参数暗示了子串开始的最大索引。
${"abcabc"?last_index_of("ab", 2)}

字符串长度
${"abc"?length}

转小写字母"lower_case"
${"ASDSase"?lower_case}

left_pad 距左边
[${"abc"?left_pad(5)}]

left_pad 距左边补全
[${"abc"?left_pad(5, "-")}]

right_pad 距左边
[${"abc"?right_pad(5)}]

right_pad 距左边补全
[${"abc"?right_pad(5, "-")}]

contains
${"hello"?contains("ll")?string("true","no")}

matches
${"abcabcabc"?matches(".*bc.*")?string("true","no")}
${"acbac"?matches(".*bc.*")?string("true","no")}
 
replace
${"asduujjh"?replace("asd","qwe")} 

split
<#list "abc-dfg-hi-jk"?split("-") as x>
	${x}
</#list>

starts_with
${"helloworld"?starts_with("he")?string("true","no")}

使用trim去除多余空格
${"  trim   "?trim}

使用upper_case转换为大写字母
${"upper"?upper_case}

使用replace的内建函数来替换'foo bAr baar'
i:忽略大小写
f:只是第一个
r:正则

<#assign s = 'foo bAr baar'>
${s?replace('ba', 'XY')}
i: ${s?replace('ba', 'XY', 'i')}
if: ${s?replace('ba', 'XY', 'if')}
r: ${s?replace('ba*', 'XY', 'r')}
ri: ${s?replace('ba*', 'XY', 'ri')}
rif: ${s?replace('ba*', 'XY', 'rif')}

