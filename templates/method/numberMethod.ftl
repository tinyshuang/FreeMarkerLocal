数字的基本格式
<#assign x=42>
${x}				                              <#--42-->
${x?string} <#-- the same as ${x} -->             <#--42--> 
${x?string.number}                                <#--42-->
${x?string.currency}                              <#--￥42.00-->
${x?string.percent}                               <#--4,200%-->
${x?string.computer}                              <#--42-->

使用java的数字的格式
<#assign x = 1.234>
${x?string("0")}
${x?string("0.#")}
${x?string("0.##")}
${x?string("0.###")}
${x?string("0.####")}
${1?string("000.00")}
${12.1?string("000.00")}
${123.456?string("000.00")}
${1.2?string("0")}
${1.8?string("0")}
${1.5?string("0")} <-- 1.5, rounded towards even neighbor
${2.5?string("0")} <-- 2.5, rounded towards even neighbor
${12345?string("0.##E0")}

关于取整的
round用于四舍五入
${1.6?round}

floor用于舍弃小数
${1.6?floor}

ceiling用于进一
${1.2?ceiling}


