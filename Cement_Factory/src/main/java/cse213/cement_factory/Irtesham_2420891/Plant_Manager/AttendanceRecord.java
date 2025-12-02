package cse213.cement_factory.Irtesham_2420891.Plant_Manager;

import java.time.LocalDate;

public class AttendanceRecord {
    private LocalDate attendance_date;
    private int shift_number;
    private int total_worker,present_worker;

    public LocalDate getAttendance_date() {return attendance_date;}

    public void setAttendance_date(LocalDate attendance_date) {this.attendance_date = attendance_date;}

    public int getShift_number() {return shift_number;}

    public void setShift_number(int shift_number) {
        this.shift_number = shift_number;}

    public int getTotal_worker() {
        return total_worker;
    }

    public void setTotal_worker(int total_worker) {
        this.total_worker = total_worker;
    }

    public int getPresent_worker() {
        return present_worker;
    }

    public void setPresent_worker(int present_worker) {
        this.present_worker = present_worker;
    }

    public AttendanceRecord(LocalDate attendance_date, int shift_number, int total_worker, int present_worker) {
        this.attendance_date = attendance_date;
        this.shift_number = shift_number;
        this.total_worker = total_worker;
        this.present_worker = present_worker;
    }
}
