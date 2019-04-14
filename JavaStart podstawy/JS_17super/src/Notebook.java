public class Notebook extends Computer{
    private int batteryCapacity;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public Notebook(double cpuTemperature, int ramMemory, int batteryCapacity) {
        super(cpuTemperature, ramMemory);
        this.batteryCapacity = batteryCapacity;
    }
    @Override
    public void coolDown(){
        super.coolDown();
        turboCool();
    }
    public void turboCool(){
        setCpuTemperature(getBatteryCapacity()-2);
    }
}
