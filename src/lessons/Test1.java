package lessons;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		//get the name count which starts with 'A' using for loop
//		int count=0;
//		for(int i=0;i<names.size();i++ ) {
//			String name = names.get(i);
//			if(name.startsWith("A")) {
//				count++;
//			}
//		}
//		System.out.print(count);
		
		//get the name count which starts with 'A' using stream
		Stream<String> c = names.stream();
		Long  count = c.filter(s->s.startsWith("A")).count();

		
//		Long count = c.filter(
//				new Predicate<String>(){
//					public boolean test(String s) {
//						return false;
//						
//					}
//				}).count();
				
				System.out.print(count);
		//To print all names which starts with "A"		
		c.filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
		

	}

	
}
