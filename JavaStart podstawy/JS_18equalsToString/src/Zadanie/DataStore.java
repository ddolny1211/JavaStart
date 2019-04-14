package Zadanie;

public class DataStore {
    private static final int MAX_COMP=100;

    private Computer[] computers;
    private int regComp;

    public Computer[] getComputers(){
        Computer[] comps = new Computer[regComp];
        for(int i=0;i<regComp;i++){
            comps[i]=computers[i];
        }
        return comps;

    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getRegComp() {
        return regComp;
    }

    public void setRegComp(int regComp) {
        this.regComp = regComp;
    }

    public DataStore(){
        computers = new Computer[regComp];
        regComp=0;
    }

    public void add(Computer computer){
        if(regComp<MAX_COMP){
            computers[regComp]=computer;
            regComp++;
        }
        else{
            System.out.println("Osiągnięto maksymalną ilość komputerów");
        }
    }
    public int checkAvailability(Computer find){
        if(find==null)
            return 0;

        int count=0;
        for(int i=0;i<regComp;i++){
            if(find.equals(computers[i])){
                count++;
            }
        }
        return count;
    }
}
