package Zadanie;

public class Computer {
    private String producer;
    private long model;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public long getModel() {
        return model;
    }

    public void setModel(long model) {
        this.model = model;
    }

    public Computer(String producer, long model) {
        this.producer = producer;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj==null)
            return false;

        if(!(obj instanceof Computer))
            return false;
        Computer comp = (Computer) obj;
        if(producer !=null)
            if(producer.equals(comp.getProducer())&&comp.getModel()==this.model)
                return true;

        return false;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "producer='" + producer + '\'' +
                ", model=" + model +
                '}';
    }
}
