package com.example.w1898939_task2_task3_task4;

import java.util.Scanner;

public class Task3_Passenger extends Task3_FuelQueue{
    private String Cname2,Cname,Cname3,Cname4;
    public void setDetails(String Fname,String Sname,String Vno,String litres){
        this.Cname=Fname;
        this.Cname2=Sname;
        this.Cname3=Vno;
        this.Cname4=litres;
    }
    public String getCname()
    {
        return Cname;

    }
    public String getCname2(){
        return Cname2;
    }
    public String getCname3()
    {
        return Cname3;
    }
    public String getCname4(){
        return Cname4;
    }
    public void adding(){

        System.out.print("Enter First Name: ");
        Scanner name1=new Scanner(System.in);
        Cname=name1.next();
        System.out.print("Enter Second Name: ");
        Scanner name2=new Scanner(System.in);
        Cname2=name2.next();
        System.out.print("Enter Vehicle Number: ");
        Scanner name3=new Scanner(System.in);
        Cname3=name3.next();
        System.out.print("Enter No. Of Liters required: ");
        Scanner name4=new Scanner(System.in);
        Cname4=name4.next();
    }

    public static void main(String[] args) {
        Passenger NewObj1=new Passenger();






    }

}
