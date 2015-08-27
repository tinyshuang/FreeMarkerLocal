package hxk.start;

import hxk.util.Load;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @description 使用模板遍历List
 *2015-4-14  上午11:40:04
 */
public class ListDemo {
    public static void main(String[] args) {
	Map<String, Object> map = new HashMap<String, Object>();
	//放一个list进去
	List<String> list = new ArrayList<String>();
	list.add("first");
	list.add("second");
	map.put("list", list);
	Load.ftl("start/list.ftl", map);
    }
}
