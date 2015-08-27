package hxk.template;

import java.util.List;

import freemarker.template.SimpleNumber;
import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

/**
 * @author Administrator
 * @description j定义这样的方法 : ${indexOf("met", x)}
 *2015-4-15  上午11:24:05
 */
public class IndexOfMethod implements TemplateMethodModel {
    public TemplateModel exec(@SuppressWarnings("rawtypes") List args) throws TemplateModelException {
        if (args.size() != 2) {
           throw new TemplateModelException("Wrong arguments");
        }
        return new SimpleNumber(((String) args.get(1)).indexOf((String)args.get(0)));
    }
 }

