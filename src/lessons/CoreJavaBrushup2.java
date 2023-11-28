package lessons;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Program to check if a number in an array is divisible by 2 or not
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0) {
			System.out.println(arr[i]);
			}
			else {
				System.out.println(arr[i]+" is not divisible by 5");
			}
		}
		
//		Line to differentiate the output
		System.out.println("*****************");
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Rahul"); //add method to store a value in an array list
		a.add("Shetty");
		a.add("Academy");
		a.add("Selenium");
		
//		for loop to print all the stored values of an array list with get method
		for(int i=0; i<a.size();i++) { //size method is used to get the size of an array list like for an array we use length method
			System.out.println(a.get(i)); //get method is used for getting the value stored in an array list based on array list index number
		}
		
//		Line to differentiate the output
		System.out.println("*****************");
		
//		enhanced for loop to print all the stored values of an array list without using get method
		for(String val:a) {
			System.out.println(val);
		}
		
//		Line to differentiate the output
		System.out.println("*****************");
		
		System.out.println(a.contains("Selenium"));//contains method is used to check if the value is present in the array list or not
		System.out.println(a.contains("Dibyajyoti"));
		
//		Line to differentiate the output
		System.out.println("*****************");
		
//		Converting normal array to array list
		String[] name= {"Rahul","Shetty","Academy"};//traditional array
		List<String> arraylist1=Arrays.asList(name);//converting to array list
		System.out.println(arraylist1.contains("Academy"));

	}

}
