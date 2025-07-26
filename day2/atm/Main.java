import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount: ");
        int amount = sc.nextInt();
        sc.close();
        if (amount>0 && amount%100==0){
        if (amount>=100 && amount>=200 && amount>=500){
            int five = amount/500;
            int two = (amount-five*500)/200;
            int one = (amount-five*500-two*200)/100;
            System.out.println(five+" "+two+" "+one);
            if (five != 0){
                System.out.println("Number of five hundreds: "+five);
            }
            if (two != 0){
                System.out.println("Number of two hundreds: "+two);
            }
            if (one != 0){
                System.out.println("Number of one hundreds: "+one);
            }
        }
        else{
            System.out.println("Invalid amount");
        }
    }
}
}