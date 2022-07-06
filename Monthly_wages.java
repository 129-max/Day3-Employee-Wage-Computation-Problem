package com.example.bridgelabz;

public class Monthly_wages extends SwitchCase {

        public static final int isFulltime = 1, isParttime = 2;

        public static void main(String[] args) {

            int TotalWage = 0;
            int day = 0;
            int workingHr;

            int WorkingHr = 0;
            while (day <= 20 || WorkingHr 
                    
                    <= 100) {

                int check = Switch();

                switch (check) {
                    case isFulltime -> {                                                        // full time wage

                        day++;
                        WorkingHr += 8;
                        TotalWage += Wager();     // Daily wager
                    }
                    case isParttime -> {                                                        // part time wage

                        day++;
                        WorkingHr += 4;
                        TotalWage += PartTimeWage();
                    }
                    default -> {                                                                    //Absent
                        day++;
                        WorkingHr += 0;
                        TotalWage += 0;
                    }
                }
            }

            System.out.println(" Employee Monthly wager = " + TotalWage);
        }
    }
