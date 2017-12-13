package com.company;

public class BirthDate {
    int date;
    String month;
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        // write your code here
        BirthDate myDate = new BirthDate();
        myDate.date = 8;
        myDate.month = "May";
        myDate.setYear(2017);
        System.out.println("Birthdate : " + myDate.date + " " + myDate.month + " " + myDate.getYear());
    }
}
