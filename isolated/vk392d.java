import java.io.*;
import java.util.*;

public class vk392d {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StaticStack<Character> myStack = new StaticStack<>(str.length());
        for(int i = 0; i < str.length(); ++i) myStack.push(str.charAt(i));
        for(int i = 0; i < str.length(); ++i) System.out.print(myStack.pop());
    }
}
