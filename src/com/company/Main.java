package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 0, b=0, c=0;

        System.out.println("Please choose an option: ");
        System.out.println("1: Teacher");
        System.out.println("2: Student");

        Scanner in = new Scanner(System.in);

        a= in.nextInt();

        switch (a){

            case 1:
                System.out.println("Please choose an option: ");
                System.out.println("1: Add Teacher");
                System.out.println("2: View Teacher");
                System.out.println("3: Delete Teacher");

                Scanner inn = new Scanner(System.in);
                b = inn.nextInt();

                switch (b){
                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    default:
                        System.out.println("!!!WRONG OPTION SELECTED!!!\nBYE");
                        break;
                }
                break;


            case 2:

                System.out.println("Please choose an option: ");
                System.out.println("1: Add Student");
                System.out.println("2: View Student");
                System.out.println("3: Delete Student");

                Scanner innn = new Scanner(System.in);
                c = innn.nextInt();

                switch (b){
                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    default:
                        System.out.println("!!!WRONG OPTION SELECTED!!!\nBYE");
                        break;
                }
                break;


            default:
                System.out.println("!!!WRONG OPTION SELECTED!!!\nBYE");
                break;

        }

    }
}
