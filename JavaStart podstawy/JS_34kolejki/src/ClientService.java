import java.util.LinkedList;
import java.util.Queue;

public class ClientService {
    public static void main(String[] args) {

        Queue<Client> clienQueue = new LinkedList<>();

        clienQueue.offer(new Client("grazynka"));
        clienQueue.offer(new Client("kokoszko"));
        clienQueue.offer(new Client("tyryry"));
        clienQueue.offer(new Client("dumbo"));

        System.out.println("Metoda peek() [1]: "+clienQueue.peek());
        System.out.println("Metoda peek() [2]: "+clienQueue.peek());

        System.out.println("Metoda poll() [1]: "+clienQueue.poll());
        System.out.println("Metoda poll() [2]: "+clienQueue.poll());

        System.out.println("Stan kolejki: "+clienQueue);
        System.out.println("Peek: "+clienQueue.peek());
        System.out.println("Stan kolejki: "+clienQueue);
        System.out.println("Poll: "+clienQueue.poll());
        System.out.println("Stan kolejki: "+clienQueue);
    }
}
