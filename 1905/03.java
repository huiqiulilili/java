class B{
	String name;
	int age;
	B(String n,int m){
		name = n;
		age = m;
	}
	public  void print(String welcom){
		System.out.printf("%s %s 的 %d 位同学们%n ",welcom,name,age);
	}
}

public class Pratice{
	public static void main(String[] args){
		B b = new B("10班",100);
		b.print("欢迎来");
	}
}
