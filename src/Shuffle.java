import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shuffle {
    public void shuffle(String input) {
        List<Character> characters = new ArrayList<Character>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть будь-ласка довжину паролю, яку ви хочете: ");
        int size = scanner.nextInt();
        StringBuilder output = new StringBuilder(input.length());
        while (characters.size() != 0) {
            int randPicker = (int) (Math.random() * characters.size());
            output.append(characters.remove(randPicker));
        }
        for (int i = 0; i < size; i++) {
            output.delete(size, output.length());
        }
//        System.out.println(output.length());
        System.out.println("Ваш сгенерований пароль: " + output.toString());
    }

}
