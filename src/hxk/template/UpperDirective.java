package hxk.template;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

/**
 * 
 * @author Administrator
 * @description 定义<@upper>这样的指令
 *2015-4-15  下午6:37:25
 */
public class UpperDirective implements TemplateDirectiveModel {
    @SuppressWarnings("rawtypes")
    public void execute(Environment env, Map params, TemplateModel[] loopVars,TemplateDirectiveBody body) throws TemplateException, IOException {
	// 检查参数是否传入
	if (!params.isEmpty()) {
	    throw new TemplateModelException(
		    "This directive doesn't allow parameters.");
	}
	if (loopVars.length != 0) {
	    throw new TemplateModelException(
		    "This directive doesn't allow loop variables.");
	}
	// 是否有非空的嵌入内容
	if (body != null) {
	    // 执行嵌入体部分，和 FTL 中的<#nested>一样，除了
	    // 我们使用我们自己的 writer 来代替当前的 output writer.
	    body.render(new UpperCaseFilterWriter(env.getOut()));
	} else {
	    throw new RuntimeException("missing body");
	}
    }

    /**
     * {@link Writer}改变字符流到大写形式， 而且把它发送到另外一个{@link Writer}中。
     */
    private static class UpperCaseFilterWriter extends Writer {
	private final Writer out;

	UpperCaseFilterWriter(Writer out) {
	    this.out = out;
	}

	public void write(char[] cbuf, int off, int len) throws IOException {
	    char[] transformedCbuf = new char[len];
	    for (int i = 0; i < len; i++) {
		transformedCbuf[i] = Character.toUpperCase(cbuf[i + off]);
	    }
	    out.write(transformedCbuf);
	}

	public void flush() throws IOException {
	    out.flush();
	}

	public void close() throws IOException {
	    out.close();
	}
    }
}
