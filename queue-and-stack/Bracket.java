import java.util.Scanner;
import java.lang.*;

class Bracket {
    public static void main(String[] args) {
        String input;
        Scanner keyInput = new Scanner(System.in);
        input = keyInput.nextLine().trim();
        StaticStack<Character> charStack = new StaticStack<>(input.length());
        for(char c : input.toCharArray()) {
            switch(c) {
                case '(':
                case '[':
                case '{':
                    charStack.push(c);
                    break;
                case ')':
                    if(charStack.peek() == '(') charStack.pop();
                    else {
                        System.out.println("unbalanced :(");
                        System.exit(0);
                    }
                    break;
                case ']':
                    if(charStack.peek() == '[') charStack.pop();
                    else {
                        System.out.println("unbalanced :(");
                        System.exit(0);
                    }
                    break;
                case '}':
                    if(charStack.peek() == '{') charStack.pop();
                    else {
                        System.out.println("unbalanced :(");
                        System.exit(0);
                    }
                    break;
            }
        }
        if(charStack.isEmpty()) System.out.println("balanced!");
        else System.out.println("unbalanced :(");
    }
}
