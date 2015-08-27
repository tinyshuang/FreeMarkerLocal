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
public class MyTemplateExceptionHandlerDemo {
    public static void main(String[] args) 
    {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("age", 12);
	Writer writer = new OutputStreamWriter(System.out);
	Load.init();
	Environment env;
	try {
	    env = Load.get("hello.ftl").createProcessingEnvironment(map, writer);
	    env.setTemplateExceptionHandler(new MyTemplateExceptionHandler());
	    env.process(); // 处理模板
	    writer.flush();
	} catch (TemplateException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
