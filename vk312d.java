import java.io.*;
import java.util.*;

public class vk312d {
    public static void main(String[] args) throws IOException{
        String friends[] = new String[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; ++i) {
             friends[i] = scanner.nextLine();
        }
        String name = scanner.nextLine();
        for(int i = 0; i < 5; ++i) {
            if(name.equals(friends[i])) {
                System.out.println("That name is already in the array");
                break;
            }
        }
        for(int i = 4; i >= 0; --i) {
            System.out.println(friends[i]);
        }
    }
}