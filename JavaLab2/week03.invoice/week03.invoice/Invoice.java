package week03.invoice;

import java.util.Scanner;

public class Invoice {
    private String part_number;
    private String part_description;
    private int quantity;
    private double price;

    public Invoice(String part_number, String part_description, int quantity, double price){
        this.part_number=part_number;
        this.part_description=part_description;
        

        if(quantity>0){
            this.quantity=quantity;
        }
        else{
            this.quantity=0;
        }
        if(price>0){
            this.price=price;
        }else{
            this.price=0.0;
        }

    }
    public String getPartNumber(){
        return part_number;
    }
    public String getPartDescription(){
        return part_description;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }

    public void setPartNumber(String part_number){
        this.part_number = part_number;
    }
    public void setPartDescription(String part_description){
        this.part_description = part_description;
    }
    public void setQuantity(int quantity){
        if(quantity>0){
            this.quantity=quantity;
        }
        else{
            quantity=0;
        }
    }
    public void setPrice(double price){
        if(price>0){
            this.price=price;
        }else{
            price=0.0;
        }
    }

    public double getInvoiceAmount(){
        return quantity*price;

    }


}
