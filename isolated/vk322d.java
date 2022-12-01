import java.io.*;
import java.util.*;

public class vk322d {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<Integer>();
        while(numbers.size() < 10) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        for(int num : numbers) System.out.println(num);
    }
}