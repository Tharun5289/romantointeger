import java.util.*;
import java.util.HashMap;
import java.util.Map;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
        	HashMap<Character, Integer> a = new HashMap<>();
        	a.put('I', 1);
        	a.put('V', 5);
        	a.put('X', 10);
        	a.put('L', 50);
        	a.put('C', 100);
        	a.put('D', 500);
        	a.put('M', 1000);

        	int result = 0;
        	int prevValue = 0;
		int currentValue = 0;
        	for (int i = s.length() - 1; i >= 0; i--) {
            	currentValue = a.get(s.charAt(i));

            	if (currentValue < prevValue) {
                	result -= currentValue;
            	} else {
                	result += currentValue;
            	}

            	prevValue =currentValue;
        	}
		System.out.println(result);

           }
}
