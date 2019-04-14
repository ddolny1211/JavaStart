package Zadanie;

public class SortTest {
    public static void main(String[] args) {
        Sortable sorter = new Sortable() {
            @Override
            public int[] sort(int[] tab) {
//                int[] sortedTab = tab;
                int p;
                int[] sortedTab = tab;
                for(int i=0;i<tab.length-1;i++){
                    for(int j=0;j<tab.length-1;j++){
                        if(tab[j]>tab[j+1]){
                            p=tab[j];
                            tab[j]=tab[j+1];
                            tab[j+1]=p;
                        }
                    }
                }

                for(int i=0;i<tab.length;i++){
                    System.out.print(tab[i]+" ");
                }
                return tab;
            }
        };

        int[] tab={0,4,6,2,3,1,6,11,78,8,99};
        sorter.sort(tab);
    }
}
