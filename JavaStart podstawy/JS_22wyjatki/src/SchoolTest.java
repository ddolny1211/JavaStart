public class SchoolTest {
    public static void main(String[] args) {
        School school = new School(3);
        try{
            school.add(new Student(1, "Jan","Kowalski"));
            school.add(new Student(2, "Marek","Kondrat"));
            school.add(new Student(3,"Wtalij","Kliczko"));
            school.add(new Student(4,"Enrique","Iglesias"));
        }catch(NoMoreSpaceException e){
            System.err.println("Nie można dodać tylu osób do tej szkoły");
            System.err.println(e.getMessage());
        }

        try{
            System.out.println(school.find("Jan","Kowalski"));
            System.out.println(school.find("Antonio","Banderas"));
        }catch(NoElementFoundException e){
            //System.err.println("Nie ma takiego ucznia w szkole!");
            System.err.println(e.getMessage());
        }

    }
}
