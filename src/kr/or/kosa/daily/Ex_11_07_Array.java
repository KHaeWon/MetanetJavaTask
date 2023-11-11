package kr.or.kosa.daily;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex_11_07_Array {
    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 쉼표(,)로 구분하여 입력하세요: ");
        String input = scanner.nextLine();
        
        String[] arr = input.split(",");
        int[] numbers = new int[arr.length];
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
        	numbers[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }

        Integer[] result = set.toArray(new Integer[0]);
        Arrays.sort(result);
        
        System.out.println(Arrays.toString(result));
    }
}

