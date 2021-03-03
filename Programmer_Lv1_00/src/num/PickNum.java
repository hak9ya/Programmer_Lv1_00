package num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PickNum {
	
	public static void main(String[] args) {
		int[] number1 = {2, 1, 3, 4, 1};
		int[] number2 = {5, 0, 2, 7};
		
		int[] answer1 = solution(number1);
		int[] answer2 = solution(number2);
		
		System.out.println(Arrays.toString(answer1));
		System.out.println(Arrays.toString(answer2));
		
	}	
	
	private static int[] solution(int[] numbers) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(!arr.contains(numbers[i] + numbers[j])) {
                	arr.add(numbers[i] + numbers[j]);
                }
            }
        }
    
		Collections.sort(arr);
    	int[] answer = new int[arr.size()];
    	
    	for(int i = 0; i < arr.size(); i++) {
    		answer[i] = arr.get(i);
    	}
		return answer;
	}
}
