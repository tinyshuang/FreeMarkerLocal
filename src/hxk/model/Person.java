package hxk.model;

/**
 * @author Administrator
 * @description
 *2015-4-14  上午11:54:04
 */
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
	this.name = name;
	this.age = age;
    }
    
    public int add(int a,int b){
	return a+b;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
