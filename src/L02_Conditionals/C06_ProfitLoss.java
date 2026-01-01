package L02_Conditionals;

import java.util.Scanner;

public class C06_ProfitLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price of an item : ");
        int cost = sc.nextInt();
        System.out.print("Enter the selling price of an item : ");
        int sell = sc.nextInt();

        if(sell > cost){
            System.out.println("profit of "+ (sell - cost) +" rupees");
        }else{
            System.out.println("loss of "+ (cost - sell) +" rupees");
        }
    }
}

