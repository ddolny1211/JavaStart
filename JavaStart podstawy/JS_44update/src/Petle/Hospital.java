package Petle;

public class Hospital {
    private static final int MAX_PATIENTS=10;
    private static int REVERAGE_PATIENTS=0;

    private Patient[] patients = new Patient[MAX_PATIENTS];

    public void add(Patient patient){
        if(REVERAGE_PATIENTS>=MAX_PATIENTS-1){
            System.out.println("Osiągnięto maksymalną ilość pacjentów");
            return;
        }
        if(REVERAGE_PATIENTS<MAX_PATIENTS){
            patients[REVERAGE_PATIENTS]=patient;
            REVERAGE_PATIENTS++;
        }
    }

    public void printPatients(){
        System.out.println("Lista obecnych pacjentów: ");
        for (int i = 0; i < REVERAGE_PATIENTS; i++) {
            System.out.println(patients[i].getFirstName()+" "+patients[i].getLastName());

        }
    }
}
