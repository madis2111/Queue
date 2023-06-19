import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Queue<String> queue = new LinkedList<>(firstClients);

        int i = 1;
        while (queue.peek() != null) {               //  ТО ЕСТЬ если очередь не пустая  //    == это равно ЛИ

            String name = queue.poll();

            System.out.println(name + " сделал новый маникюр");

            if (Math.random() < 0.5) {
                queue.add("a friend of " + name);
            }

            System.out.println(i + " " + queue);
            i++;
        }
    }
}