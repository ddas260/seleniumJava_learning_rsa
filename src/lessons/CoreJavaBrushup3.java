package lessons;

public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String is an object
		
//		String literal (if the value is exactly same then only one object will get created, if the value is different then only another object will get created)
		String s1="Rahul Shetty Academy";
		String s2="Hello";
		System.out.println(s1+", "+s2);
		
//		Line to differentiate the output
		System.out.println("*****************");
		
//		String object (dedicated memory allocation, no matter what if the value is same or not, it creates different objects)
		String a1=new String("Rahul Shetty Academy");
		String a2=new String("Hello");
		System.out.println(a1+", "+a2);
		
//		Line to differentiate the output
		System.out.println("*****************");
		
		String b=new String("Dibyajyoti Das Quality Analyst");
		String[] splittedString=b.split(" ");//split method is used to split a string based on the argument
//		Manual style to print an array values
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println(splittedString[3]);
		
//		Line to differentiate the output
		System.out.println("*****************");
		
//		Enhanced for loop to print all the values in an array
		for(String c:splittedString) {
			System.out.println(c);
		}
		
//		Line to differentiate the output
		System.out.println("*****************");
		
		String d=new String("Dibyajyoti Das Quality Analyst");
		String[] splittedString1=d.split("Das");
//		Manual style to print an array values
		System.out.println(splittedString1[0].trim());//Trim is used to remove all the black spaces before and after
		System.out.println(splittedString1[1].trim());
		
//		Line to differentiate the output
		System.out.println("*****************");
		
//		Print all the characters line by line of a string using for loop
		for(int i=0;i<d.length();i++) {
			System.out.println(d.charAt(i));
		}
		
//		Line to differentiate the output
		System.out.println("*****************");
		
//		Print all the characters line by line in reverse order of a string using for loop
		for(int i=d.length()-1;i>=0;i--) {
			System.out.println(d.charAt(i));//charAt is used to get all the characters in a string separately
		}
	}

}
