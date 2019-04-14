package Zadanie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "loremipsum.txt";
        var reader = new BufferedReader(new FileReader(FILE_NAME));
        List<String> words = new ArrayList<>();
        String tmp=null;

        while((tmp = reader.readLine())!=null){
            words.addAll(Arrays.asList(tmp.split(" ")));
        }
        words = words.stream()
                .map(s->s.replaceAll(",","").replaceAll("\\.",""))
                .collect(Collectors.toList());

        long countWords = words.stream()
                .filter(s->s.startsWith("s"))
                .peek(s-> System.out.println(s+" "))
                .count();
        System.out.println();

        long fiveLetters = words.stream()
                .filter(s->s.length()==5)
                .peek(s -> System.out.println(s+" "))
                .count();
        System.out.println();

        System.out.println("Liczba wyrazów na 's': "+countWords);
        System.out.println("Liczba wyrazów z 5 literami: "+fiveLetters);

        reader.close();
    }
}
