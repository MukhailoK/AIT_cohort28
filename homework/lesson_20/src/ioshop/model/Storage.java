package ioshop.model;

public class Storage {
    private Computer[] computers;
    private int size;

    public Storage(int capacity) {
        computers = new Computer[capacity];
    }

    public boolean addArticle(Computer computer) {
        if (size == computers.length) {
            return false;
        }
        computers[size] = computer;
        size++;
        return true;
    }

    public void printAllArticles() {
        for (Computer c : computers) {
            System.out.println(c);
        }
        System.out.println("================================================================");
    }

    public int getSize() {
        return size;
    }

    public Computer findComputer(long barcode) {

        for (Computer c : computers) {
            if (c.getBarcode() == barcode) {
                return c;
            }
        }
        return null;
    }

    public Computer removeComputer(long barcode) {
        Computer victim = null;
        for (int i = 0; i < size; i++) {
            if (computers[i].getBarcode() == barcode) {
                victim = computers[i];
                computers[i] = computers[size - 1];
                computers[size - 1] = null;
                size--;
                break;
            }
        }
        return victim;
    }
}
