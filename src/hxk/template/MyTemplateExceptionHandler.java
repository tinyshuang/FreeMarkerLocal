package hxk.template;

import java.io.IOException;

import freemarker.core.Environment;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * 
 * @author Administrator
 * @description 自定义的模板异常处理
 *2015-4-15  下午6:35:36
 */
public class MyTemplateExceptionHandler implements TemplateExceptionHandler {
   public void handleTemplateException(TemplateException te,Environment env, java.io.Writer out)
          throws TemplateException {
       try {
          out.write("[ERROR: " + te.getMessage() + "]");
       } catch (IOException e) {
          throw new TemplateException("Failed to print error message. Cause: " + e, env);
       }
   }
}

