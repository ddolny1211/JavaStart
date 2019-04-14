package Zadanie;

public class Part {
    private String identNumber;
    private String producent;
    private String model;
    private String series;

    public Part() {
    }

    public Part(String identNumber, String producent, String model, String series) {
        this.identNumber = identNumber;
        this.producent = producent;
        this.model = model;
        this.series = series;
    }

    public String getIdentNumber() {
        return identNumber;
    }

    public void setIdentNumber(String identNumber) {
        this.identNumber = identNumber;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
