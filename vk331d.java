import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class vk331d {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a width as an integer: ");
        int width = scanner.nextInt();
        System.out.println("Enter a height as an integer: ");
        int height = scanner.nextInt();
        int arr[][] = new int[height][width];
        int smallest = 101, largest = 0;
        for(int i = 0; i < height; ++i) { 
            for(int j = 0; j < width; ++j) {
                arr[i][j] = ThreadLocalRandom.current().nextInt(1, 100);
                System.out.print(arr[i][j] + " " + (j == width-1 ? "\n" : ""));
                smallest = Math.min(smallest, arr[i][j]);
                largest = Math.max(largest, arr[i][j]);
            }
        }
        System.out.println("\nsmallest: " + smallest + " largest: " + largest);     
    }
}