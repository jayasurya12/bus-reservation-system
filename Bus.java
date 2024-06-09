package busRevSystem;

public class Bus {
    int busNo;
    boolean ac;
    int capacity;

    Bus (int busNo, boolean ac, int capacity) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    public int getbusNo() {
        return busNo;
    }
    public boolean getAc() {
        return ac;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setbusNo(int busNo) {
        this.busNo = busNo; // We not going to use this because of we can't change bus number.
    }
    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public void displayBusInfo () {
        System.out.println("Bus No: " + busNo + "AC: " + ac + "Capacity: " + capacity);
        System.out.println();
    }
}


