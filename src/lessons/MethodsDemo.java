package lessons;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo name=new MethodsDemo();//Creating a object of the "MethodsDemo" class
		name.getData();//calling the "getData()" method from the MethodsDemo class
		
//		Line to differentiate the output
		System.out.println("*****************");
		
		String a=name.getData();//"name.getData" to call the getData() method and assigning it to a variable
		System.out.println(a);
		
//		Line to differentiate the output
		System.out.println("*****************");
		
		MethodsDemo2 user=new MethodsDemo2();//Creating a object of the "MethodsDemo2" class
		String b=user.getUserData();//"user.getUserData" to call the getUserData() method and assigning it to a variable
		System.out.println(b);
		
//		Line to differentiate the output
		System.out.println("*****************");
		
		getData2();//calling "getData2()" method without creating an object of the "MethodsDemo" class (it is possible because "getData2() is a static method)
		
//		Line to differentiate the output
		System.out.println("*****************");
		
		String c=getData2();
		System.out.println(c);

	}
//	Creating a new public method
	public String getData() {
		System.out.println("You've sucessfully called the 'getData' method");
		return "Rahul Shetty Academy";
	}
	
//	Creating a new public static method
	public static String getData2() {
		System.out.println("You've sucessfully called the 'getData2' method");
		return "Dibyajyoti Das\nSoftware Tester";
	}

}
