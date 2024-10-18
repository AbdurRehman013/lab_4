package lab.datetime;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    // Default constructor
    public DateTime() {
        LocalDateTime now = LocalDateTime.now();
        this.year = now.getYear();
        this.month = now.getMonthValue();
        this.day = now.getDayOfMonth();
        this.hour = now.getHour();
        this.minute = now.getMinute();
        this.second = now.getSecond();
    }

    // Overloaded constructor for year, month, day
    public DateTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = 0; // Default hour
        this.minute = 0; // Default minute
        this.second = 0; // Default second
    }

    // Overloaded constructor for year, month, day, hour, minute, second
    public DateTime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Set methods
    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Get methods
    public String getDate() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public String getTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String getCurrentDateTime() {
        return "Current Date and Time: " + getDate() + " " + getTime();
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Default constructor
        DateTime dtDefault = new DateTime();
        System.out.println(dtDefault.getCurrentDateTime());

        // Constructor with year, month, day
        DateTime dtCustomDate = new DateTime(2022, 12, 25);
        System.out.println("Custom Date: " + dtCustomDate.getDate());

        // Constructor with year, month, day, hour, minute, second
        DateTime dtCustomFull = new DateTime(2023, 10, 18, 14, 30, 45);
        System.out.println(dtCustomFull.getCurrentDateTime());
    }
}

