package Zadanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private List<Integer> list = new ArrayList<>();

    public Lotto() {
        generate();
    }

    public void generate(){
        for(int i=0; i<50;i++){
            list.add(i);
        }
    }

    public void randomize(){
        Collections.shuffle(list);
    }

    public int checkResult(List<Integer> userNumbers){
        List<Integer> lottoResult = list.subList(0,6);
        System.out.println("Wynik losowania: ");
        for(Integer num: lottoResult){
            System.out.print(num+" ");
        }
        System.out.println();

        int found=0;
        for(int i = 0; i < 6 ; i++){
            if(lottoResult.contains(userNumbers.get(i))){
                found++;
            }
        }
        return found;
    }
}
