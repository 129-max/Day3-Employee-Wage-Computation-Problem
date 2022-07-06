package com.example.bridgelabz;

import java.util.Random;


    public class SwitchCase extends PartTime_Wage {

        public static final int isFulltime = 1, isParttime = 2;

        public static int Switch() {

            Random randome = new Random();
            return randome.nextInt(3);
        }

        public static void main(String[] args) {

            int check = Switch();

            switch (check) {
                case isFulltime ->                    // full time wage

                        System.out.println("Employee Full day Wager = " + Wager());
                case isParttime ->                                                        // part time wage

                        System.out.println("Employee Part time Wager = " + PartTimeWage());
                default -> System.out.println("Employee is Absent");               //Absent
            }

        }

    }
