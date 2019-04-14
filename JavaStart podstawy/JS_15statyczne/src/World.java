public class World {
    public static void main(String[] args){
        Human adam = new Human("Adam", 185.5);
        Human ewa = new Human("Ewa", 167.5);

        double avgHeight = (adam.getHeight()+ewa.getHeight())/2;
        Human.avgHeight=avgHeight;

        System.out.println("Pierwsi ludzie na ziemi: ");
        System.out.println(adam.getName()+", wzrost: "+adam.getHeight()+" cm.");
        System.out.println(ewa.getName()+", wzrost: "+ewa.getHeight()+" cm.");

        System.out.println("Średni wzrost człowieka: ");
        System.out.println(adam.avgHeight);
        System.out.println(ewa.avgHeight);
        System.out.println(Human.avgHeight);
    }
}
