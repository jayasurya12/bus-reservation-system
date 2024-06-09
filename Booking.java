package busRevSystem;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    private String passangerName;
    private int busNo;
    private Date date;

    Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of Passenger: " + passangerName);
        
        passangerName = scanner.next();
        System.out.println("Enter Bus No: " + busNo);
        
        busNo = scanner.nextInt();
        System.out.println("Enter date dd-mm-yyyy: " + date);
        
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public String getPassangerName() {
        return passangerName;
    }
    public int getBusNo() {
        return busNo;
    }
    public Date getDate() {
        return date;
    }

    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }
    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isAvailable(ArrayList<Booking> booking, ArrayList<Bus> bus) {
        int capacity = 0;
        for(Bus b : bus) {
            if (b.getBusNo().equals(busNo)) {
                capacity = b.getCapacity();
                break;
            }
        }
        int booked = 0;
        for(Booking book : booking) {
            if (book.busNo == busNo && b.date.equals(date)) booked++;
        }
        return booked < capacity;
    } 
}


