package hxk.template;

import hxk.util.Load;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @description 自定义指令
 *2015-4-15  下午2:32:38
 */
public class UpperDemo {
    public static void main(String[] args) {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("upper", new UpperDirective());
	Load.ftl("template/upper.ftl", map);
    }
}
