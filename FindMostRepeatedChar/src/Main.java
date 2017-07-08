import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String str = getString();

		for(int i=0; i<str.length(); i++){
			String currentString = str.substring(i,i+1);
			
			if (map.containsKey(currentString)){
				map.put(currentString, map.get(currentString) + 1);
			}
			else
				map.put(currentString, 1);
		}
		
		System.out.println(getMostRepeated(map));
		
		
	}

	private static String getMostRepeated(HashMap<String, Integer> map) {
		int maxValueInMap=(Collections.max(map.values()));  
		String result="";
        for (Entry<String, Integer> entry : map.entrySet()) {  
            if (entry.getValue()==maxValueInMap) {
            	result = "Most repeated character: " + entry.getKey()+", Number of repeats: "+entry.getValue();
            }            
        }
		return result;
	}

	private static String getString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String str = scanner.next();
		scanner.close();
		return str;
	}

}
