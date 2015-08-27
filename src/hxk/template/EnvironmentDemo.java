package hxk.template;

import hxk.util.Load;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.core.Environment;
import freemarker.template.TemplateException;

/**
 * @author Administrator
 * @description 使用Environment层配置信息
 *2015-4-15  下午2:53:39
 */
public class EnvironmentDemo {
    public static void main(String[] args) throws TemplateException, IOException {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("upper", new UpperDirective());
	Writer writer = new OutputStreamWriter(System.out);
	Load.init();
	Environment env = Load.get("template/upper.ftl").createProcessingEnvironment(map, writer);
	env.setLocale(java.util.Locale.ITALY);
	env.setNumberFormat("0.####");
	env.process(); // 处理模板
	writer.flush();
    }
}
