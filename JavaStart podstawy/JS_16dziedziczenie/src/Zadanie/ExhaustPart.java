package Zadanie;

public class ExhaustPart extends Part {
    private String ueStandard;

    public ExhaustPart() {
    }

    public ExhaustPart(String ueStandard) {
        this.ueStandard = ueStandard;
    }

    public String getUeStandard() {
        return ueStandard;
    }

    public void setUeStandard(String ueStandard) {
        this.ueStandard = ueStandard;
    }

    public void printInfo() {
        System.out.println(getIdentNumber() + ", " + getModel() + ", " + getProducent() + ", " +
                getSeries() + ", " + getUeStandard());
    }
}
