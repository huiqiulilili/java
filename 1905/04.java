class Person{
	String name;
	int age;
	Person(String n,int m){
		name = n;
		age = m;
		System.out.printf("%s的年龄是%s",name,m);
	}
}
public class Main{
	public static void main(String[] args){
		Person a =new  Person("张三",10);
	}
}
