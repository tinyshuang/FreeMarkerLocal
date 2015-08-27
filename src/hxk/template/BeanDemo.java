package hxk.template;

import freemarker.template.TemplateException;
import hxk.model.Person;
import hxk.util.Load;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @description 模板解析java类
 *2015-4-15  上午11:48:35
 */
public class BeanDemo {
    public static void main(String[] args) throws TemplateException, IOException {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("person", new Person("tinys", 15));
	Load.ftl("template/person.ftl", map);
    }
}
