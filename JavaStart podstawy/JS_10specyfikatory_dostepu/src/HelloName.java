public class HelloName {
    public static void main(String[] args){
        final String krzysiek="Krzysiek";
        final String maciek="Maciek";
        final String marek="Marek";

        String name="Marek";

        switch(name){
            case krzysiek:
                System.out.println("Witaj Krzysztofie in the real world");
                break;
            case maciek: case marek:
                System.out.println("Witaj Panie prezesie in the false world");
                break;
            default:
                System.out.println("Witaj nieznajomy in the mystery world");
        }
    }
}
