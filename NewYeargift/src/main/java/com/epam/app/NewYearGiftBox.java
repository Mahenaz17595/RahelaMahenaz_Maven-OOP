package com.epam.app;

import java.util.*;
public class NewYearGiftBox
{
    public static void main( String[] args )
    { 
        int total_weight = 0;
        int quantity = 0;
        int weight = 0,totalbox_wt = 0, total_candies = 0;
        
        char n1;
        Sweets swtcollect;
        Boolean n=true;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Fill the gift box with different sweets Available:");
        while(n) {
       
        System.out.println("AVAILABLE SWEETS");
        System.out.println("------------------");
        System.out.println("1.DARK CHOCOLATE");
        System.out.println("2.MILK CHOCOLATE");
        System.out.println("3.WHITE CHOCOLATE");
        System.out.println("4.HALVA");
        System.out.println("5.GULABJAMUN");
        
        System.out.println("choose an item between 1 to 5:");
        try {
        	
            switch(sc.next().charAt(0))
            {
            case '1':
            	   System.out.println("please enter the quantity");
            	   quantity=sc.nextInt();
            	   System.out.println("please enter the weight in grams");
            	   weight=sc.nextInt();
            	   swtcollect = new DarkChocolate();
            	   total_weight=swtcollect.calcwt( quantity, weight);
            	   totalbox_wt=totalbox_wt+total_weight;
            	   System.out.println("Total weight of Darkchocolate is:"+total_weight+"grams");
            	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                   
            	   System.out.println("do you want any other item (y/n)");
            	   n1=sc.next().charAt(0);
            	      if(n1=='y'|| n1=='Y')
            	        { 
            	    	  n=true;
            	          break;
            	        }
            	     else
            		    {
            	    	 n=false;
                         System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                         System.out.println("Total number of candies in the giftbox is:"+total_candies);
                         break;
                        }
            case '2':
            	   System.out.println("please enter the quantity");
            	   quantity=sc.nextInt();
            	   System.out.println("please enter the weight in grams");
            	   weight=sc.nextInt();
            	   swtcollect=new MilkChocolate();
            	   total_weight=swtcollect.calcwt(quantity, weight);
            	   totalbox_wt=totalbox_wt+total_weight;

            	   System.out.println("Total weight of MilkChocolate is:"+total_weight+"grams");
            	   System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
            	   System.out.println("do you want any other item (y/n)");
            	   n1=sc.next().charAt(0);
            	      if(n1=='y'|| n1=='Y')
            	        { 
            	    	  n=true;
            	          break; 
            	        }
            	      else
            		    {
            	    	  n=false;
            	          System.out.println("Toatal gift box weight is:"+totalbox_wt+"grams");
            	          System.out.println("Total number of candies in the giftbox is:"+total_candies);
            	          break;
            	        }
            case '3':
            	System.out.println("please enter the quantity");
            	quantity=sc.nextInt();
            	System.out.println("please enter the weight in grams");
            	weight=sc.nextInt();
            	swtcollect=new WhiteChocolate();
            	total_weight=swtcollect.calcwt(quantity, weight);
            	totalbox_wt=totalbox_wt+total_weight;

            	System.out.println("Total weight of whitechocolate is:"+total_weight+"grams");
            	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
            	System.out.println("do you want any other item (y/n)");
            	n1=sc.next().charAt(0);
            	if(n1=='y'|| n1=='Y')
            	    {n=true;
            	break;}
            	else
            		{n=false;
            		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
            		System.out.println("Total number of candies in the giftbox is:"+total_candies);
            	break;}
            case '4':
            	System.out.println("please enter the quantity");
            	quantity=sc.nextInt();
            	System.out.println("please enter the weight in grams");
            	weight=sc.nextInt();
            	swtcollect=new Halva();
            	total_weight=swtcollect.calcwt(quantity, weight);
            	totalbox_wt=totalbox_wt+total_weight;
            	total_candies=total_candies+quantity;

            	System.out.println("Total weight of Halva is:"+total_weight+"grams");
            	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
            	System.out.println("do you want any other item (y/n)");
            	n1=sc.next().charAt(0);
            	if(n1=='y'|| n1=='Y')
            	    {n=true;
            	break;}
            	else
            		{n=false;
            		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                    System.out.println("Total number of candies in the giftbox is:"+total_candies);
                    
            	break;}
            case '5':
            	System.out.println("please enter the quantity");
            	quantity=sc.nextInt();
            	System.out.println("please enter the weight in grams");
            	weight=sc.nextInt();
            	swtcollect=new Candies();
            	total_weight=swtcollect.calcwt(quantity, weight);
            	totalbox_wt=totalbox_wt+total_weight;
            	total_candies=total_candies+quantity;

            	System.out.println("Total weight of Candies is:"+total_weight+"grams");
            	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
            	System.out.println("Do you want any other item (y/n)");
            	n1=sc.next().charAt(0);
            	if(n1=='y'|| n1=='Y')
            	    {n=true;
            	break;}
            	else
            		{n=false;
            		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
                    System.out.println("Total number of candies in the giftbox is:"+total_candies);
                    
            	break;}
            case '6':
            	System.out.println("Please enter the quantity");
            	quantity=sc.nextInt();
            	System.out.println("Please enter the weight in grams");
            	weight=sc.nextInt();
            	swtcollect=new GulabJamun();
            	total_weight=swtcollect.calcwt(quantity, weight);
            	totalbox_wt=totalbox_wt+total_weight;

            	System.out.println("Total weight of Gulabjamun is:"+total_weight+"grams");
            	System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
            	System.out.println("Do you want any other item (y/n)");
            	n1=sc.next().charAt(0);
            	if(n1=='y'|| n1=='Y')
            	    {n=true;
            	break;}
            	else
            		{n=false;
            		System.out.println("Total weight of gift box is:"+totalbox_wt+"grams");
            		System.out.println("Total number of candies in the giftbox is:"+total_candies);
            	break;
            	}
            }
        } catch(Exception e) {
            	System.out.println("please select from the provided options:");
                
            
            
        }
        }
    }
    }