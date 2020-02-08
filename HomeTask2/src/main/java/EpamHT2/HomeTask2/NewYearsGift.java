package EpamHT2.HomeTask2;

import java.util.Scanner;
import java.util.*;

public class NewYearsGift {

public static void main(String[] args) {
int quantity = 0, total_candies = 0;
        char n1;
        Sweet collect;
        Boolean n = true;
        float price, weight = 0,totalbox_wt = 0, total_weight = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Fill the NewYear GiftBox with the candies available : ");
        Map< String, Float> hm =  new HashMap< String, Float>();
        while(n) {
        System.out.println("1. Perk");
        System.out.println("2. Milk Chocolate");
        System.out.println("3. White Chocolate");
        System.out.println("4. Kitkat");
        System.out.println("5. Hersheys");
        System.out.println("6. Rasgulla");
        System.out.println("7. Kalakand");
        System.out.println("Choose an option from 1-7 : ");
        try {
       
        switch(sc.next().charAt(0))
        {
        case '1':
        System.out.println("Please enter the quantity : ");
        quantity = sc.nextInt();
        System.out.println("Please enter the weight in grams : ");
        weight = sc.nextInt();
        System.out.println("Enter the price : ");
        price = sc.nextInt();
        collect = new Perk(quantity, weight, price);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies += quantity;
        hm.put("Perk", price);
        System.out.println("Total weight of Perk is : " +total_weight+ "grams");
        System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
        System.out.println("Do you want any other item (y/n) : ");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y') {
             n = true;
                 break;
               }
        else
            {
        n = false;
        System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
        System.out.println("Total number of candies in the giftbox is : " +total_candies);
        break;
            }
        
        case '2':
        System.out.println("Please enter the quantity : ");
        quantity = sc.nextInt();
        System.out.println("Please enter the weight in grams : ");
        weight = sc.nextInt();
        System.out.println("Enter the price : ");
        price = sc.nextInt();
        collect = new MilkChocolate(quantity, weight, price);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies += quantity;
        hm.put("Milk Chocolate", price);
        System.out.println("The total weight of Milkchocolate is : " +total_weight+ "grams");
        System.out.println("The total weight of gift box is : " +totalbox_wt+ "grams");
        System.out.println("Do you want any other item (y/n) : ");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y')
                {
        n = true;
        break;
                }
        else {
        n = false;
        System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
        System.out.println("Total number of candies in the giftbox is : " +total_candies);
        break;
               }
        
        case '3':
        System.out.println("Please enter the quantity : ");
        quantity = sc.nextInt();
        System.out.println("Please enter the weight in grams : ");
        weight = sc.nextInt();
        System.out.println("Enter the price : ");
        price = sc.nextInt();
        collect = new WhiteChocolate(quantity, weight, price);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies += quantity;
        hm.put("White Chocolate", price);
        System.out.println("Total weight of Whitechocolate is : " +total_weight+ "grams");
        System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
        System.out.println("Do you want any other item (y/n) : ");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y') {
        n = true;
        break;
        }
        else {
        n = false;
        System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
        System.out.println("Total number of candies in the giftbox is : " +total_candies);
        break;
        }
        
        case '4':
        System.out.println("Please enter the quantity : ");
        quantity = sc.nextInt();
        System.out.println("Please enter the weight in grams : ");
        weight = sc.nextInt();
        System.out.println("Enter the price : ");
        price = sc.nextInt();
        collect = new Kitkat(quantity, weight, price);
        total_weight = collect.calculateWeight(weight, quantity);
        totalbox_wt = totalbox_wt + total_weight;
        total_candies = total_candies + quantity;
        hm.put("Kitkat", price);

        System.out.println("Total weight of Kitkat is : " +total_weight+ "grams");
        System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
        System.out.println("Do you want any other item (y/n) : ");
        n1 = sc.next().charAt(0);
        if(n1 == 'y'|| n1 == 'Y') {
        n = true;
        break;
        }
        else {
        n = false;
        System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
        System.out.println("Total number of candies in the giftbox is : " +total_candies);
        break;
        }
        
          case '5':
          System.out.println("Please enter the quantity : ");
          quantity = sc.nextInt();
          System.out.println("Please enter the weight in grams : ");
          weight = sc.nextInt();
          System.out.println("Enter the price : ");
          price = sc.nextInt();
          collect = new Hersheys(quantity, weight, price);
          total_weight = collect.calculateWeight(weight, quantity);
          totalbox_wt = totalbox_wt + total_weight;
          total_candies += quantity;
          hm.put("Hersheys", price);

          System.out.println("Total weight of Hersheys is : " +total_weight+ "grams");
          System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
          System.out.println("Do you want any other item (y/n) : ");
          n1 = sc.next().charAt(0);
          if(n1 == 'y'|| n1 == 'Y') {
          n = true;
          break;
          }
          else {
          n = false;
          System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
          System.out.println("Total number of candies in the giftbox is : " +total_candies);
          break;
          }
          
          case '6':
          System.out.println("Please enter the quantity : ");
          quantity = sc.nextInt();
          System.out.println("Please enter the weight in grams : ");
          weight = sc.nextInt();
          System.out.println("Enter the price : ");
          price = sc.nextInt();
          collect = new Rasgulla(quantity, weight, price);
          total_weight = collect.calculateWeight(weight, quantity);
          totalbox_wt = totalbox_wt + total_weight;
          total_candies += quantity;
          hm.put("Rasgulla", price);

          System.out.println("Total weight of Rasgulla is : " +total_weight+ "grams");
          System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
          System.out.println("Do you want any other item (y/n) : ");
          n1 = sc.next().charAt(0);
          if(n1 == 'y'|| n1 == 'Y') {
          n = true;
          break;
          }
          else {
          n = false;
          System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
          System.out.println("Total number of candies in the giftbox is : " +total_candies);
          break;
          }
          
          case '7':
          System.out.println("Please enter the quantity : ");
          quantity = sc.nextInt();
          System.out.println("Please enter the weight in grams : ");
          weight = sc.nextInt();
          System.out.println("Enter the price : ");
          price = sc.nextInt();
          collect = new Kalakand(quantity, weight, price);
          total_weight = collect.calculateWeight(weight, quantity);
          totalbox_wt = totalbox_wt + total_weight;
          total_candies += quantity;
          hm.put("Kalakand", price);

          System.out.println("Total weight of Kalakand is : " +total_weight+ "grams");
          System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
          System.out.println("Do you want any other item (y/n) : ");
          n1 = sc.next().charAt(0);
          if(n1 == 'y'|| n1 == 'Y') {
          n = true;
          break;
          }
          else {
          n = false;
          System.out.println("Total weight of gift box is : " +totalbox_wt+ "grams");
          System.out.println("Total number of candies in the giftbox is : " +total_candies);
          break;
          }
        }
        }
        catch(Exception e)
        {
        System.out.println("Please select from 1-7 options : ");   
        }
        }
        System.out.println("The following candies are present in the Gift Box : ");
        Set< Map.Entry< String, Float> > st = hm.entrySet();
        for (Map.Entry< String, Float> name: st)
        {
            System.out.print("Name : " +name.getKey()+", ");
            System.out.println(" Price : " +name.getValue());
        }
        sc.close();
}
}