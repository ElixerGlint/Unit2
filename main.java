

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


    }
}
