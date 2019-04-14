import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class TimeTest {
    public static void main(String[] args) {
        Instant i1 = Instant.now();

        for(int i = 0; i < 100; i++){
            System.out.println("miernik czasu");
        }
        Instant i2=Instant.now();

        Duration duration = Duration.between(i1, i2);

        System.out.println("Pętla wykonała się w ciągu "+duration.getNano()+" nanosekund.");

        LocalTime lt1= LocalTime.now();
        LocalTime lt2 = LocalTime.of(12, 0 , 0);

    }
}
