//Loops
//Everett Rumery
//9/17/24

import java.util.Scanner;


public class main {
    public static void main(String[] args) throws Exception {
        int count = 1;
        int limit = 12;
        while(count < limit) {
            System.out.println(count+" ");
            count++;
        }

        for(int i = 1; i<10; i++) {
            System.out.println("hello");
        }

        for(int i =1; i<limit; i+=2) {
            System.out.println(i+" ");
        }
        Scanner input = new Scanner(System.in);


        String phone;
        do {
            System.out.println("Enter your phone number");
            phone = input.nextLine();
        }while(phone.length()!= 10); 

        for(int i = 0; i < 5; i++) {
            for ( int j = 0; j < 5; j++) {
                System.out.println(i+j);
            }
        }


        //fizz buzz game
        System.out.println("Start of the fizz buzz");
        
        for(int i = 0; i < 101; i++) {
            if(i%3 != 0 && i%5 != 0) {
                System.out.println(i);
            }
            if(i%3 == 0 && i%5 != 0) {
                System.out.println("fizz");
            }
            if(i%5 == 0 && i%3 != 0) {
                System.out.println("buzz");
            }
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("Fizzbuzz!");
            }

        }
    }
}
