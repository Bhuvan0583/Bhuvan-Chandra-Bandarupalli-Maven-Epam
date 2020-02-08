
package com.mycompany.newyear;
import java.util.*;
import java.io.*;
public class NewYear {
    static ArrayList<Sweet> sweetcoll = new ArrayList<Sweet>();
    static ArrayList<choclates> choccoll=new ArrayList<choclates>();
    static ArrayList<Candies> cancoll=new ArrayList<Candies>();
    void total_weight()
    {
        int total=0;
        for(choclates choc: choccoll)
        {
            total=total+choc.getWeight();
        }    
        for(Sweet sweet: sweetcoll)
        {
            total=total+sweet.getWeight();
        }
        System.out.println(total);
    }
    void sort_choc(String type)
    {
        Scanner s=new Scanner(System.in);
        int lower,upper;
        System.out.println("Enter upper limit");
        lower=s.nextInt();
        System.out.println("Enter lower limit");
        upper=s.nextInt();
        if(type.equals("weight"))
        {
       Comparator<choclates> weightComparator = (c1, c2) -> (int) (c1.getWeight() - c2.getWeight());
       choccoll.sort(weightComparator); 
       for(int i=0;i<choccoll.size();i++)
       {
           if((choccoll.get(i)).weight>=lower && (choccoll.get(i).weight)<=upper)
           System.out.println((choccoll.get(i)).className());
       }
        }
        else
        {
       Comparator<choclates> priceComparator = (c1, c2) -> (int) (c1.getPrice() - c2.getPrice());
       choccoll.sort(priceComparator); 
       for(int i=0;i<choccoll.size();i++)
       {
           if((choccoll.get(i)).price>=lower && (choccoll.get(i).price)<=upper)
           System.out.println((choccoll.get(i)).className());
       }
       }
    }
    void sort_cand(String type)
    {
        Scanner s=new Scanner(System.in);
        int lower,upper;
        System.out.println("Enter upper limit");
        lower=s.nextInt();
        System.out.println("Enter lower limit");
        upper=s.nextInt();
        if(type.equals("weight"))
        {
       Comparator<choclates> weightComparator = (c1, c2) -> (int) (c1.getWeight() - c2.getWeight());
       cancoll.sort(weightComparator); 
       for(int i=0;i<choccoll.size();i++)
       {
           if((cancoll.get(i)).weight>=lower && (cancoll.get(i).weight)<=upper)
           System.out.println((choccoll.get(i)).className());
       }
        }
        else
        {
       Comparator<choclates> priceComparator = (c1, c2) -> (int) (c1.getPrice() - c2.getPrice());
       cancoll.sort(priceComparator); 
       for(int i=0;i<choccoll.size();i++)
       {
           if((cancoll.get(i)).price>=lower && (cancoll.get(i).price)<=upper)
           System.out.println((choccoll.get(i)).className());
       }
       }        
    }
    public static void main(String[] args) {
       
        // TODO code application logic here
    }
    void input_choc()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of Choclates");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter type");
            String str=s.next();
            System.out.println("Enter candyname");
            String cname=s.next();
            System.out.println("Enter price and weight");
            int price=s.nextInt();
            int weight=s.nextInt();
            if(str.equals("Candies"))
            {
                if(cname.equals("KachaMango"))
                {
                    KachaMango choc=new KachaMango(price,weight);
                    cancoll.add(choc);
                    choccoll.add(choc);
                }
                else if(cname.equals("Fivestar"))
                {
                    Fivestar choc=new Fivestar(price,weight);
                     cancoll.add(choc);
                     choccoll.add(choc);
                }
		else
		{
		    Kitkat choc=new Kitkat(price,weight);
		    cancoll.add(choc);	
		    choccoll.add(choc);	
		}
            }
            else
            {
                Waffy choc=new Waffy(price,weight);
                
            }
        }
    }
    void input_sweets()
    {
         Scanner s=new Scanner(System.in);
    System.out.println("Enter number of sweets");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Sweet Name");
            String sweets=s.next();
            System.out.println("Enter Sweet Weight");
            int weight=s.nextInt();
            System.out.println("Enter Sweet Price");
            int price=s.nextInt();
            if(sweets.equals("Gulabjamun"))
            {
                Gulabjamun sweet=new Gulabjamun(price,weight);
                sweetcoll.add(sweet);
            }
            else if(sweets.equals("Jangri"))
            {
                Jangri sweet=new Jangri(price,weight);
                sweetcoll.add(sweet);
            }
	    else if(sweets.equals("Kalakand"))
	    {
		Kalakand sweet=new Kalakand(price,weight);
		sweetcoll.add(sweet);
	    }
            else
            {
                KajuBarfi sweet=new KajuBarfi(price,weight);
                sweetcoll.add(sweet);
                
            }
        }
    }
    
}
