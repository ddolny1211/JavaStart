package Zadanie;

public class TireWheel extends Part {
    private long size;
    private long width;
    private long rimSize;

    public TireWheel() {
    }

    public TireWheel(long size, long width, long rimSize) {
        this.size = size;
        this.width = width;
        this.rimSize = rimSize;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getRimSize() {
        return rimSize;
    }

    public void setRimSize(long rimSize) {
        this.rimSize = rimSize;
    }

    public void printInfo() {
        System.out.println(getIdentNumber() + ", " + getModel() + ", " + getProducent() + ", " +
                getSeries() + ", " + getSize() + ", " + getWidth() + ", " + getRimSize());
    }
}
