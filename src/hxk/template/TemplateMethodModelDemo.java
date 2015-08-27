package hxk.template;

import hxk.util.Load;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @description 使用自定义的方法在ftl中使用
 *2015-4-15  上午11:25:39
 */
public class TemplateMethodModelDemo {
    public static void main(String[] args) {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("indexOf", new IndexOfMethod());
	Load.ftl("template/templateMethod.ftl", map);
    }
}
