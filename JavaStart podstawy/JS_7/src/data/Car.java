package data;


public class Car {


    private int year;
    private String brand;
    private String model;
    private String color;

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        if(year>0) {
            this.year = year;
        }else{
            System.out.println("Rok musi być większy niż 0!");
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(int year, String brand, String model, String color) {
        this.setYear(year);
        this.setBrand(brand);
        this.setModel(model);
        this.setColor(color);

    }
}

