package com.company;

import java.util.Scanner;

class Main {
        public static void main (String[] args) {
        System.out.println("Aibek");}


        public class Aibek {
            public static void main(String[] args) {
                String name = "Aibek";
                Scanner scan = new Scanner(System.in);
                System.out.println("Whats your name:");
                if (scan.hasNext(name)) {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Hello!" + name);
                    }

                }

            }

        }
        }



