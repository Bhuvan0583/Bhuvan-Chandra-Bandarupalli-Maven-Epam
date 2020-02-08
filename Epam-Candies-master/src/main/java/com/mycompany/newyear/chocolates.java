
package com.mycompany.newyear;

/**
 *
 * @bhuvanbandarupalli
 */
public class chocolates {
    int price,weight;
    chocolates(int price,int weight)
    {
        this.price=price;
        this.weight=weight;
    }
        public int getPrice()
    {
        return price;
    }
    public int getWeight()
    {
        return weight;
    }
    String className()
    {
        return "chocolate";
    }
}
