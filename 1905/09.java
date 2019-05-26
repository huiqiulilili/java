class A{
	A(String title){
		System.out.println(title);
	}
}


public class Practice{
	
	A a = new A("定义时初始化");
	
	Practice(){
		a = new A("构造方法中初始化");
	}

	{
		a = new A("构造代码块中初始化");	
	}
	
	//静态属性
	static A staticA = new A("静态属性-定义时初始化");
	static {   //1	
		staticA = new A("静态属性-静态代码块1时初始化");
	}

	public static void main(String[] args){
		Practice c1 = new Practice();
		Practice c2 = new Practice();
	
	}
	static {	// 2
		staticA = new A("静态属性-静态代码块2时初始化");
	}
	
}
