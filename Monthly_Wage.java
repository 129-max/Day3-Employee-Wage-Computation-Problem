package com.example.bridgelabz;

    public class Monthly_Wage extends SwitchCase {

        public static final int isFulltime = 1, isParttime = 2;

        public static void main(String[] args) {

            int TotalWage = 0;

            for(int Day = 1; Day <= 20; Day++) {

                int check = Switch();

                switch (check) {
                    case isFulltime ->   // full time wage

                            TotalWage += Wager();     // Daily wager
                    case isParttime ->                                                        // part time wage

                            TotalWage += PartTimeWage();
                    default ->                                                    //Absent

                            TotalWage += 0;
                }
            }

            System.out.println(" Employee Monthly wager = "+TotalWage);
        }

    }

