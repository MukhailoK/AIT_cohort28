package ioshop.model;

public class Computer {
    protected long barcode;
    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;

    public Computer() {
        super();
    }

    public Computer(String cpu, int ram, int ssd, String brand, long barcode) {
        super();
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.barcode = barcode;
    }

    public long getBarcode() {
        return barcode;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Barcode: " + barcode + ", Brand: " + brand + ", CPU: " + cpu + ", RAM: " + ram + ", SSD: " + ssd;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Computer other)) {
            return false;
        }
        return barcode == other.barcode;
    }
}
