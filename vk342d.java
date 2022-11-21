import java.io.*;
import java.time.*;
import java.util.stream.*;
import java.util.*;
import java.lang.*;

public class vk342d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<Integer>();
        while(numbers.size() < 10) {
            int num = scanner.nextInt();
            if(num <= 0) System.exit(0);
            if(numbers.contains(num)) System.out.println("You already entered that integer! ");
            else numbers.add(num);
        }
        Integer numbersArray[] = new Integer[10];
        System.arraycopy(numbers.toArray(), 0, numbersArray, 0, 10);
        for(int num : numbers) System.out.println("First nums: " + num);
        for(int i = 0; i < 10; ++i) numbersArray[i] *= 2;
        for(int num : numbersArray) System.out.println("Multiplied nums: " + num);
        int sum = 0;
        for(int num : numbersArray) sum += num;
        int average = sum/10;
        System.out.println("Sum is: " + sum + "\nAverage is: " + average);
    }
}
