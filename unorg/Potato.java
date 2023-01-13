import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
class Potato {
    public static void main(String[] args) {
        String command;
        DynamicQueue<String> people = new DynamicQueue<>();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while(!name.equals("")) {
            people.enqueue(name);
            name = scanner.nextLine();
        }
        System.out.println(people.toString());
        while(people.size() > 1) {
            //choose random integer
            int rand = ThreadLocalRandom.current().nextInt(1, people.size() + 1);
            System.out.println(rand + " is the random number chosen!");
            while(rand-- > 0) {
                String person = people.dequeue();
                people.enqueue(person);
            }
            String out = people.dequeue();
            System.out.println(out + " is out!");
            System.out.println(people.toString());
        }
        System.out.println(people.peek() + " is the winner!");
    }
}
