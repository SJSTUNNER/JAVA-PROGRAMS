/*Write a program that creates a Random object and displays the first 100 random integers between 1 and 49 using NextInt(49) methods.*/

import java.util.Random;
public class prac_11 {
    public static void main(String[] args) {
        Random r =  new Random(100);

        for(int i=0;i<100;i++){
            System.out.print(" "+r.nextInt(49));

            if(i%10==0){
                System.out.println();
            }
        }
    }
}
