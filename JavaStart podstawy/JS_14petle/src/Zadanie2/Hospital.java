package Zadanie2;

public class Hospital {
    public static final int MAX__PATIENTS_NUM=10;
    private Patient[] patients;
    private int regPatients;

    public Hospital(){
        patients = new Patient[MAX__PATIENTS_NUM];
        regPatients=0;
    }
    public void addPatient(Patient patient){
        if(regPatients<MAX__PATIENTS_NUM){
            patients[regPatients]=patient;
            regPatients++;
        }
        else{
            System.out.println("Zapisano maksymalną liczbę pacjentów.");
        }
    }
    public void printPatients(){
        for(int i=0; i<regPatients;i++){
            System.out.println(patients[i].getName()+" "+patients[i].getLastName()+" "+
                    " "+patients[i].getPesel());
        }
    }
}
