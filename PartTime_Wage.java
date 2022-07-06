package com.example.bridgelabz;

import java.util.Random;

public class PartTime_Wage extends Daily_Wage {   // Adding partime employee

    public static int Attendance() {

        Random random = new Random();

        return random.nextInt(3);
    }

    public static int PartTimeWage() {             // adding part time wager

        int WagePerHr = 20, PartThimeHr = 4;
        return WagePerHr * PartThimeHr;


    }

    public static void main(String[] args) {

        int isPresent = 1, isParttime = 2, isAbsent=0;

        int attendance = Attendance();
        int dailyWage = Wager();

        if (attendance == isPresent) {

            System.out.print("Employee Full day wage = "+dailyWage);
        }

        else if(attendance == isParttime) {

            System.out.println("Employee Part time wage = "+PartTimeWage());
        }

        else {

            System.out.println("Employee Daily Wager = "+isAbsent);
        }
    }

}
