import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "person.obj";

        Person p1 = new Person("Han","Solo");

        try(
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs);
                ){
            os.writeObject(p1);
            System.out.println("Zapisano obiekt do pliku");
        }catch(IOException e){
            System.out.println("Błąd zapisu pliku "+fileName);
            e.printStackTrace();
        }
    }
}
