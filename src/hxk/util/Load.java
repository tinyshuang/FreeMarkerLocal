package hxk.util;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * @author Administrator
 * @description 模板的工具类
 */
public class Load {
    private static Configuration cfg;

    // 加载template的配置器
    public static void init()  {
	try {
	    // 设置模板类文件夹路径
	    cfg = new Configuration();
	    cfg.setDirectoryForTemplateLoading(new File("templates"));
	    cfg.setDefaultEncoding("UTF-8"); 
	    //cfg.setObjectWrapper(ObjectWrapper.BEANS_WRAPPER);
	    // 设置异常处理
	    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
	    
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    //加载该模板文件
    public static Template get(String name) {
	Template template = null;
	try {
	     template =  cfg.getTemplate(name);
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return template;
    }
    
    public static void flush(String name,Map<String, Object> map){
	//写出到控制台
	Writer writer = new OutputStreamWriter(System.out);
	try {
	    get(name).process(map, writer);//模板加载,传参数map以及输出的地方
	    writer.flush();
	} catch (TemplateException e) {
	    e.printStackTrace();
	} catch (IOException e) {
    	    e.printStackTrace();
        }
    }
    
    //统一处理流程
    public static void ftl(String name,Map<String, Object> map){
	init();
	flush(name,map);
    }

}
