package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping=0;
    private int ExtraChees=0;
    private int billDone=0;
    private int takeaway=0;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.bill="Base Price Of The Pizza: 300\n";
        }
        else {
            this.price=400;
            this.bill="Base Price Of The Pizza: 400\n";
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        ExtraChees++;
        if(ExtraChees==1){
            this.price+=80;
            ExtraChees++;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        topping++;
        if(topping==1){
            if(isVeg) {
                this.price += 70;
            }
            else this.price+=120;
            topping++;
        }
    }

    public void addTakeaway(){
        // your code goes here
        takeaway++;
        if(takeaway==1){
            this.price+=20;
            takeaway++;
        }

    }

    public String getBill(){
        // your code goes here

        if(billDone==0){

            billDone++;

            if(ExtraChees>0){

                this.bill+="Extra Cheese Added: 80\n";
                ExtraChees++;

            }
            // for topping
            if(topping>0){
                topping++;
                if(isVeg){
                    this.bill+="Extra Toppings Added: 70\n";
                }else this.bill+="Extra Toppings Added: 120\n";
            }
            // for bags
            if(takeaway>0){
                takeaway++;
                this.bill+="Paperbag Added: 20\n";
            }
            this.bill+="Total Price: " + this.price + "\n";

            return this.bill;


        }
//           else
//        return "Total Price: " + this.price + "\n";
        return this.bill;
    }
}