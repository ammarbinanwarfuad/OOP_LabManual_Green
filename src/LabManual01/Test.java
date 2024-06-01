//PRime Number Generation

package LabManual01;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        int firstNumber, lastNumber;
        
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Your First Number = ");
        firstNumber = sc1.nextInt();
        System.out.print("Enter Your Last Number = ");
        lastNumber = sc1.nextInt();

        for(int number = firstNumber; number<=lastNumber; number++){
            int count=0;
            
            if(number<=1){
            count = 1;
            }
            
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                count = 1;
                break;
                }
            }
            if(count == 0){
                System.out.print(" "+number);
            }          
        }

        
        
    }
}
