package hxk.start;

import hxk.util.Load;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Administrator
 * @description 最简单的使用模板输出一个字符串
 *2015-4-14  上午11:13:56
 */
public class Hello {
    
    public static void main(String[] args) {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("name", "小明");
	Load.ftl("start/hello.ftl", map);
    }
}
