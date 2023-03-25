package com.example.w1898939_task2_task3_task4;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Task3_FuelQueue {
    String[][] queue1 = new String[6][4];
    String[][] queue5 = new String[6][4];
    String[][] WaitQueue1 = new String[10][4];
    String[][] WaitQueue2 = new String[10][4];
    String[][] WaitQueue3 = new String[10][4];
    String[][] WaitQueue4 = new String[10][4];
    String[][] WaitQueue5 = new String[100][4];

    static int x1;
    String[][] queue2 = new String[6][4];
    String[][] queue3 = new String[6][4];
    String[][] queue4 = new String[6][4];
    static int x2 = 10;
    static int x3 = 10;
    int x4 = 10;
    int x5 = 10;
    static int one = 0;
    static int two = 0;
    static int three = 0;
    int four = 0;
    int five = 0;
    static int tot = 0;
    static int tot2 = 0;
    static int tot3 = 0;
    int tot4 = 0;
    int tot5 = 0;
    static int x, y, z, e, size, size1, size2, size3, size4, p, u, m;
    static int c = 0;
    static int t = 0;
    static int v = 0;
    static int w = 0;
    static int s = 0;
    static int d = 0;
    static String temp, temp1, temp2, j;
    static int fuel = 6600;
    static int remain = 0;
    int length1 = 0;
    int length2 = 0;
    int length3 = 0;
    int length4 = 0;
    int length5 = 0;
    int i = 0;
    int front = 0;
    int front2 = 0;
    int front3 = 0;
    int front4 = 0;
    int front5 = 0;

    public void Menu() {
        //Display the Menu
        System.out.println("\n");
        System.out.println("------------------Fuel Management System---------------\n");
        System.out.println("\t100 or VFQ: View all Fuel Queues");
        System.out.println("\t101 or VEQ: View all Empty Queues");
        System.out.println("\t102 or ACQ: Add customer to a Queue");
        System.out.println("\t103 or RCQ: Remove a customer from a Queue");
        System.out.println("\t104 or PCQ: Remove a served customer");
        System.out.println("\t105 or VCS: View Customers Sorted in alphabetical order");
        System.out.println("\t106 or SPD: Store Program Data into file");
        System.out.println("\t107 or LPD: Load Program Data from file");
        System.out.println("\t108 or STK: View Remaining Fuel Stock");
        System.out.println("\t109 or AFS: Add Fuel Stock");
        System.out.println("\t110 or IFQ: Print Income Of Each Fuel Queue");
        System.out.println("\t999 or EXT: Exit the Program\n");

    }

    public void start() {
        Menu();
        System.out.print("Enter your choice: ");
        Scanner choice = new Scanner(System.in);
        String name1 = choice.next();
        String name = name1.toUpperCase();
        switch (name) {
            case "100":
            case "VFQ":
                ViewFuelQueue();
            case "101":
            case "VEQ":
                ViewEmptyQueue();
            case "102":
            case "ACQ":
                add();
            case "103":
            case "RCQ":
                RemoveCustomer();
            case "104":
            case "PCQ":
                RemoveServed();
            case "105":
            case "VCS":
                ViewCustomerAlphabeticOrder();
            case "106":
            case "SPD":
                StoreDta();
            case "107":
            case "LPD":
                LoadData();
            case "108":
            case "STK":
                ViewRemaining();
            case "109":
            case "AFS":
                AddFuel();
            case "110":
            case "IFQ":
                PrintIncome();
            case "999":
            case "EXT":
                exit(0);

        }
    }


    public void first() {
        for (int h = 0; h < 6; h++) {
            for (int y = 0; y < 4; y++) {
                queue1[h][y] = "Empty";
                queue2[h][y] = "Empty";
                queue3[h][y] = "Empty";
                queue4[h][y] = "Empty";
                queue5[h][y] = "Empty";
            }
        }
    }

    public void Repeat() {
        System.out.print("Enter 1=Menu  0=Exit: ");
        Scanner no = new Scanner(System.in);
        String view = no.next();
        switch (view) {
            case "1":
                start();
            case "0":
                exit(0);

        }
    }


    public void add() {//add customer to the queues

        System.out.print("Do you want to add a customer(Y/N):");
        Scanner customer = new Scanner(System.in);
        String answer1 = customer.next();
        String answer = answer1.toUpperCase();
        switch (answer) {
            case "Y":

                if ((length1 < length2) && (length1 < length3) && (length1 < length4) && (length1 < length5)) {
                    while (one <= 5) {
                        Passenger obj3 = new Passenger();
                        obj3.adding();

                        queue1[one][0] = obj3.getCname();
                        queue1[one][1] = obj3.getCname2();
                        queue1[one][2] = obj3.getCname3();
                        queue1[one][3] = obj3.getCname4();

                        tot = tot + Integer.parseInt(queue1[one][3]);
                        System.out.println(obj3.getCname() + " is successfully added to Queue1" + " " + "\t\t\tTotal liters= " + tot);
                            one = one + 1;
                            length1=length1+1;
                            add();
                            if(one==5){
                                System.out.println("Queue1 is full. Added to the waiting queue");
                                waiting();


                            }

                        }





                    }



                 else if ((length2 < length1) && (length2 < length3) && (length2 < length4) && (length2 < length5)) {
                    while (two <= 5) {
                        Passenger obj4 = new Passenger();
                        obj4.adding();
                        queue2[two][0] = obj4.getCname();
                        queue2[two][1] = obj4.getCname2();
                        queue2[two][2] = obj4.getCname3();
                        queue2[two][3] = obj4.getCname4();
                        tot2 = tot2 + Integer.parseInt(queue2[two][3]);
                        System.out.println(obj4.getCname() + " is successfully added to Queue2" + " " + "\t\t\tTotal Litres= " + tot2);

                        if (two== 5) {
                            System.out.println("Queue 2 is full");
                            waiting2();


                        } else {
                            two = two + 1;
                            length2=length2+1;
                            add();
                        }


                    }


                } else if ((length3 < length1) && (length3 < length2) && (length3 < length4) && (length3 < length5)) {
                    while (three <= 5) {
                        Passenger obj5 = new Passenger();
                        obj5.adding();
                        queue3[three][0] = obj5.getCname();
                        queue3[three][1] = obj5.getCname2();
                        queue3[three][2] = obj5.getCname3();
                        queue3[three][3] = obj5.getCname4();
                        tot3 = tot3 + Integer.parseInt(queue3[three][3]);
                        System.out.println(obj5.getCname() + " is successfully added to Queue3" + " " + "\t\t\tTotal Liters= " + tot3);


                        if (three == 5) {
                            System.out.println("Queue 3 is full");
                            waiting3();


                        } else {
                            three = three + 1;
                            length3 = length3 + 1;
                            add();
                        }

                    }


                } else if ((length4 < length1) && (length4 < length2) && (length4 < length3) && (length4 < length5)) {
                    while (four <= 5) {
                        Passenger obj6 = new Passenger();
                        obj6.adding();
                        queue4[four][0] = obj6.getCname();
                        queue4[four][1] = obj6.getCname2();
                        queue4[four][2] = obj6.getCname3();
                        queue4[four][3] = obj6.getCname4();
                        tot4 = tot4 + Integer.parseInt(queue4[four][3]);
                        System.out.println(obj6.getCname() + " is successfully added to Queue4" + " " + "\t\t\tTotal Liters= " + tot4);


                        if (four==5) {
                            System.out.println("Queue 4 is full");
                            waiting4();





                        } else {
                            four = four + 1;
                            length4=length4+1;
                            add();
                        }


                    }


                } else if ((length5 < length1) && (length5 < length2) && (length5 < length3) && (length5 < length4)) {
                    while (five <= 5) {
                        Passenger obj78 = new Passenger();
                        obj78.adding();
                        queue5[five][0] = obj78.getCname();
                        queue5[five][1] = obj78.getCname2();
                        queue5[five][2] = obj78.getCname3();
                        queue5[five][3] = obj78.getCname4();
                        tot5 = tot5 + Integer.parseInt(queue5[five][3]);
                        System.out.println(obj78.getCname() + " is successfully added to Queue5" + " " + "\t\t\tTotal Liters= " + tot5);

                        if (five == 5) {
                            System.out.print("Queue 5 is full. ");
                            waiting5();





                        } else {
                            five = five + 1;
                            length5=length5+1;
                            add();
                        }

                    }



                } else if ((length1 == length2) && (length1 == length3) && (length1 == length4) && (length1 == length5)) {

                    while (one <= 5) {
                        Passenger obj3 = new Passenger();
                        obj3.adding();

                        queue1[one][0] = obj3.getCname();
                        queue1[one][1] = obj3.getCname2();
                        queue1[one][2] = obj3.getCname3();
                        queue1[one][3] = obj3.getCname4();

                        tot = tot + Integer.parseInt(queue1[one][3]);
                        System.out.println(queue1[one][0] + " is successfully added to Queue1" + " " + "\t\t\tTotal liters= " + tot);

                        if (one==5) {
                            System.out.print("Queue 1 is full. Added to the waiting Queue");
                            waiting();

                                }


                            else{
                                one = one + 1;
                                length1 = length1 + 1;
                                add();
                            }

                         }

                } else if ((length2 == length3) && (length2 == length4)) {

                    while (two <= 5) {
                        Passenger obj4 = new Passenger();
                        obj4.adding();
                        queue2[two][0] = obj4.getCname();
                        queue2[two][1] = obj4.getCname2();
                        queue2[two][2] = obj4.getCname3();
                        queue2[two][3] = obj4.getCname4();
                        tot2 = tot2 + Integer.parseInt(queue2[two][3]);
                        System.out.println(obj4.getCname() + " is successfully added to Queue2" + " " + "\t\t\tTotal Litres= " + tot2);

                        if (two== 5) {
                            System.out.print("Queue 2 is full. Added to the waiting Queue");
                            waiting2();






                        } else {
                            two = two + 1;
                            length2=length2+1;
                            add();
                        }
                    }


                } else if (length3 == length4) {
                    while (three <= 5) {
                        Passenger obj5 = new Passenger();
                        obj5.adding();
                        queue3[three][0] = obj5.getCname();
                        queue3[three][1] = obj5.getCname2();
                        queue3[three][2] = obj5.getCname3();
                        queue3[three][3] = obj5.getCname4();
                        tot3 = tot3 + Integer.parseInt(queue3[three][3]);
                        System.out.println(obj5.getCname() + " is successfully added to Queue3" + " " + "\t\t\tTotal Liters= " + tot3);

                        if (three == 5) {
                            System.out.print("Queue 3 is full. Added to the waiting Queue");
                            waiting3();




                        } else {
                            three = three + 1;
                            length3=length3+1;
                            add();
                        }


                    }

                }

                else if (length4 == length5) {
            while (four <= 5) {
                Passenger obj6 = new Passenger();
                obj6.adding();
                queue4[four][0] = obj6.getCname();
                queue4[four][1] = obj6.getCname2();
                queue4[four][2] = obj6.getCname3();
                queue4[four][3] = obj6.getCname4();
                tot4 = tot4 + Integer.parseInt(queue4[four][3]);
                System.out.println(obj6.getCname() + " is successfully added to Queue4" + " " + "\t\t\tTotal Liters= " + tot4);
                if (four == 5) {
                    System.out.print("Queue 4 is full. Added to the waiting Queue");
                    waiting4();





                } else {
                    four = four + 1;
                    length4=length4+1;
                    add();
                }

            }



        }


        case "N":
        Repeat();

    }}
    int l=0;
public void waiting()
{

    Passenger objnew=new Passenger();
    objnew.adding();
    WaitQueue1[l][0]= objnew.getCname();
    WaitQueue1[l][1]=objnew.getCname2();
    WaitQueue1[l][2]=objnew.getCname3();
    WaitQueue1[l][3]=objnew.getCname4();
    l=l+1;
    Repeat();
    
}
    public void waiting2()
    {

        Passenger objnew=new Passenger();
        objnew.adding();
        WaitQueue2[l][0]= objnew.getCname();
        WaitQueue2[l][1]=objnew.getCname2();
        WaitQueue2[l][2]=objnew.getCname3();
        WaitQueue2[l][3]=objnew.getCname4();
        l=l+1;
        Repeat();

    }
    public void waiting3()
    {

        Passenger objnew=new Passenger();
        objnew.adding();
        WaitQueue3[l][0]= objnew.getCname();
        WaitQueue3[l][1]=objnew.getCname2();
        WaitQueue3[l][2]=objnew.getCname3();
        WaitQueue3[l][3]=objnew.getCname4();
        l=l+1;
        Repeat();

    }
    public void waiting4()
    {

        Passenger objnew=new Passenger();
        objnew.adding();
        WaitQueue4[l][0]= objnew.getCname();
        WaitQueue4[l][1]=objnew.getCname2();
        WaitQueue4[l][2]=objnew.getCname3();
        WaitQueue4[l][3]=objnew.getCname4();
        l=l+1;
        Repeat();

    }
    public void waiting5()
    {

        Passenger objnew=new Passenger();
        objnew.adding();
        WaitQueue5[l][0]= objnew.getCname();
        WaitQueue5[l][1]=objnew.getCname2();
        WaitQueue5[l][2]=objnew.getCname3();
        WaitQueue5[l][3]=objnew.getCname4();
        l=l+1;
        Repeat();

    }



    public void ViewFuelQueue()
    {

        //View all fuel queues details
        x=one;
        System.out.println("Queue 1:");
        for (x = 0; x <6; x++) {
            if(queue1[x][0]!="Empty") {
                System.out.println("Customer id:" + x + " " + "Customer Name:" + queue1[x][0]);
            }
        }
        System.out.println("Total liters= " + tot);

        y=two;
        System.out.println("Queue 2:");
        for (y = 0; y < 6; y++) {
            if(queue2[y][0]!="Empty") {
                System.out.println("Customer id:" + y + " " + "Customer Name:" + queue2[y][0]);
            }
        }
        System.out.println("Total liters= " + tot2);

        z=three;
        System.out.println("Queue 3:");
        for (z = 0; z < 6; z++) {
            if(queue3[z][0]!="Empty") {
                System.out.println("Customer id:" + z + " " + "Customer Name:" + queue3[z][0]);
            }
        }
        System.out.println("Total liters= " + tot3);

        u=four;
        System.out.println("Queue 4:");
        for (u = 0; u < 6; u++) {
            if(queue4[u][0]!="Empty") {
                System.out.println("Customer id:" + u + " " + "Customer Name:" + queue4[u][0]);
            }
        }
        System.out.println("Total liters= " + tot4);

        m=five;
        System.out.println("Queue 5:");
        for (m = 0; m < 6; m++) {
            if(queue5[m][0]!="Empty") {
                System.out.println("Customer id:" + m + " " + "Customer Name:" + queue5[m][0]);
            }
        }
        System.out.println("Total liters= " + tot5);

        System.out.println("\n");
        Repeat();
    }

    public  void ViewEmptyQueue()
    {//Display empty queues

        if(tot==0)
        {
            System.out.println("Queue1 is empty");
        }
        if(tot2==0)
        {
            System.out.println("Queue2 is empty");
        }
        if(tot3==0)
        {
            System.out.println("Queue3 is empty");
        }
        if(tot4==0){
            System.out.println("Queue4 is empty");
        }
        if(tot5==0){
            System.out.println("Queue5 is empty");
        }
        Repeat();
    }

    public void RemoveCustomer()
    {// remove customers from the queues
        //E,X1,X2,X3
        System.out.print("Enter the Queue no:");
        Scanner que=new Scanner(System.in);
        String QueName=que.next();
        System.out.print("Enter the ID of Customer:");
        Scanner id=new Scanner(System.in);
        String idCustomer=id.next();
        e=Integer.parseInt(idCustomer);
        switch (QueName)
        {
            case "1":
                try {
                    x1 = Integer.parseInt(queue1[e][3]);
                    tot = tot - x1;
                    System.out.println("Queue 01:");
                    System.out.println("CustomerID:" + e + " CustomerName: " + queue1[e][0] + " is successfully removed");
                    for (int r = 0; r < 4; r++) {
                        queue1[e][r] = "Empty";
                    }
                    for(int y=e;y<4;y++){
                        if(queue1[e+1][0]!="Empty"){

                            queue1[e][0]=queue1[e+1][0];
                            queue1[e][1]=queue1[e+1][1];
                            queue1[e][2]=queue1[e+1][2];
                            queue1[e][3]=queue1[e+1][3];

                            for (int r = 0; r < 4; r++) {
                                queue1[e+1][r] = "Empty";
                            }


                        }}
                    System.out.println("\n");
                    Repeat();
                }catch (Exception e){
                    System.out.println(e);
                    Repeat();
                }

            case "2":
                try {
                    tot2 = tot2 - Integer.parseInt(queue2[e][3]);
                    System.out.println("Queue 02:");
                    System.out.println("CustomerID:" + e + " CustomerName: " + queue2[e][0] + " is successfully removed");
                    for (int r = 0; r < 4; r++) {
                        queue2[e][r] = "Empty";
                    }
                    for(int y=e;y<4;y++){
                        if(queue2[e+1][0]!="Empty"){

                            queue2[e][0]=queue2[e+1][0];
                            queue2[e][1]=queue2[e+1][1];
                            queue2[e][2]=queue2[e+1][2];
                            queue2[e][3]=queue2[e+1][3];

                            for (int r = 0; r < 4; r++) {
                                queue2[e+1][r] = "Empty";
                            }

                        }}

                    System.out.println("\n");
                    Repeat();
                }catch (Exception e){
                    System.out.println(e);
                    Repeat();
                }
            case "3":
                try {
                    tot3 = tot3 - Integer.parseInt(queue3[e][3]);
                    System.out.println("Queue 03:");
                    System.out.println("CustomerID:" + e + " CustomeName: " + queue3[e][0] + " is successfully removed");
                    for (int r = 0; r < 4; r++) {
                        queue3[e][r] = "Empty";
                    }
                    for(int y=e;y<4;y++){
                        if(queue3[e+1][0]!="Empty"){

                            queue3[e][0]=queue3[e+1][0];
                            queue3[e][1]=queue3[e+1][1];
                            queue3[e][2]=queue3[e+1][2];
                            queue3[e][3]=queue3[e+1][3];

                            for (int r = 0; r < 4; r++) {
                                queue3[e+1][r] = "Empty";
                            }

                        }}
                    System.out.println("\n");
                    Repeat();
                }catch (Exception e){
                    System.out.println(e);
                    Repeat();
                }

            case "4":
                try {
                    tot4 = tot4 - Integer.parseInt(queue4[e][3]);
                    System.out.println("Queue 04:");
                    System.out.println("CustomerID:" + e + " CustomeName: " + queue4[e][0] + " is successfully removed");
                    for (int r = 0; r < 4; r++) {
                        queue4[e][r] = "Empty";
                    }
                    for(int y=e;y<4;y++){
                        if(queue4[e+1][0]!="Empty"){

                            queue4[e][0]=queue1[e+1][0];
                            queue4[e][1]=queue1[e+1][1];
                            queue4[e][2]=queue1[e+1][2];
                            queue4[e][3]=queue1[e+1][3];

                            for (int r = 0; r < 4; r++) {
                                queue4[e+1][r] = "Empty";
                            }

                        }}
                    System.out.println("\n");
                    Repeat();
                }catch (Exception e){
                    System.out.println(e);
                    Repeat();
                }
            case "5":
                try {
                    tot5 = tot5 - Integer.parseInt(queue5[e][3]);
                    System.out.println("Queue 05:");
                    System.out.println("CustomerID:" + e + " CustomeName: " + queue5[e][0] + " is successfully removed");
                    for (int r = 0; r < 4; r++) {
                        queue5[e][r] = "Empty";
                    }
                    for(int y=e;y<4;y++){
                        if(queue1[e+1][0]!="Empty"){

                            queue5[e][0]=queue1[e+1][0];
                            queue5[e][1]=queue1[e+1][1];
                            queue5[e][2]=queue1[e+1][2];
                            queue5[e][3]=queue1[e+1][3];

                            for (int r = 0; r < 4; r++) {
                                queue5[e+1][r] = "Empty";
                            }

                        }}
                    System.out.println("\n");
                    Repeat();
                }catch (Exception e){
                    System.out.println(e);
                    Repeat();
                }


        }

    }

    public void RemoveServed()
    {
        //remove the first customer of the queue
        System.out.print("Enter the Queue no:");
        Scanner queNo=new Scanner(System.in);
        String QName=queNo.next();
        switch (QName)
        {
            case "1":

                System.out.println("Queue1-CustomerId: 0"  + " CustomerName: " + queue1[0][0] + " is successfully removed");
                for (int r = 0; r < 4; r++) {
                    queue1[0][r] = "Empty";
                }
                for(int e=0;e<4;e++){
                    if(queue1[e+1][0]!="Empty"){

                        queue1[e][0]=queue1[e+1][0];
                        queue1[e][1]=queue1[e+1][1];
                        queue1[e][2]=queue1[e+1][2];
                        queue1[e][3]=queue1[e+1][3];

                        for (int r = 0; r < 4; r++) {
                            queue1[e+1][r] = "Empty";
                        }

                    }}

                Repeat();

            case "2":

                System.out.println("Queue2-CustomerId: 0"+" CustomerName: "+queue2[0][0]+" is successfully removed");
                for (int r=0;r<4;r++) {
                    queue2[0][r]= "Empty";
                }
                for(int e=0;e<4;e++){
                    if(queue2[e+1][0]!="Empty"){

                        queue2[e][0]=queue2[e+1][0];
                        queue2[e][1]=queue2[e+1][1];
                        queue2[e][2]=queue2[e+1][2];
                        queue2[e][3]=queue2[e+1][3];

                        for (int r = 0; r < 4; r++) {
                            queue2[e+1][r] = "Empty";
                        }

                    }}

                Repeat();
            case "3":

                System.out.println("Queue3-CustomerId:0 "+" CustomerName: "+queue3[0][0]+" is successfully removed");
                for (int r=0;r<4;r++) {
                    queue3[v][r] = "Empty";
                }
                for(int e=0;e<4;e++){
                    if(queue3[e+1][0]!="Empty"){

                        queue3[e][0]=queue3[e+1][0];
                        queue3[e][1]=queue3[e+1][1];
                        queue3[e][2]=queue3[e+1][2];
                        queue3[e][3]=queue3[e+1][3];

                        for (int r = 0; r < 4; r++) {
                            queue3[e+1][r] = "Empty";
                        }

                    }}
                Repeat();
            case "4":

                System.out.println("Queue4-CustomerId:0 "+" CustomerName: "+queue4[0][0]+" is successfully removed");
                for (int r=0;r<4;r++) {
                    queue4[0][r] = "Empty";
                }
                for(int e=0;e<4;e++){
                    if(queue4[e+1][0]!="Empty"){

                        queue4[e][0]=queue4[e+1][0];
                        queue4[e][1]=queue4[e+1][1];
                        queue4[e][2]=queue4[e+1][2];
                        queue4[e][3]=queue4[e+1][3];

                        for (int r = 0; r < 4; r++) {
                            queue4[e+1][r] = "Empty";
                        }

                    }}
                Repeat();

            case "5":

                System.out.println("Queue4-CustomerId:0 "+" CustomerName: "+queue5[0][0]+" is successfully removed");
                for (int r=0;r<4;r++) {
                    queue5[0][r] = "Empty";
                }
                for(int e=0;e<4;e++){
                    if(queue5[e+1][0]!="Empty"){

                        queue5[e][0]=queue5[e+1][0];
                        queue5[e][1]=queue5[e+1][1];
                        queue5[e][2]=queue5[e+1][2];
                        queue5[e][3]=queue5[e+1][3];

                        for (int r = 0; r < 4; r++) {
                            queue5[e+1][r] = "Empty";
                        }

                    }}
                Repeat();


        }


    }

    public void ViewCustomerAlphabeticOrder()
    {//Display the customers name in alphabetical order
//one
        size = queue1.length;

        for (int a = 0; a < size - 1; a++) {

            for (int j = a + 1; j < queue1.length; j++) {
                if (queue1[a][0].compareTo(queue1[j][0]) > 0) {
                    temp = queue1[a][0];
                    queue1[a][0]= queue1[j][0];
                    queue1[j][0] = temp;
                }
            }

        }
        System.out.println("Queue 1:");
        for (int r=0;r<6;r++) {
            if (queue1[r][0] != "Empty") {

                System.out.print(queue1[r][0]+ " ");

            }
        }
        //two

        size1 = queue2.length;

        for (int a = 0; a < size1 - 1; a++) {

            for (int j = a + 1; j < queue2.length; j++) {
                if (queue2[a][0].compareTo(queue2[j][0]) > 0) {
                    temp1 = queue2[a][0];
                    queue2[a][0] = queue2[j][0];
                    queue2[j][0] = temp1;
                }
            }

        }
        System.out.println("\nQueue 2:");

        for (int r=0;r<6;r++) {
            if(queue2[r][0]!="Empty") {
                System.out.print(queue2[r][0]+" ");
            }
        }
        //three
        size2 = queue3.length;

        for (int a = 0; a < size2 - 1; a++) {

            for (int j = a + 1; j < queue3.length; j++) {
                if (queue3[a][0].compareTo(queue3[j][0]) > 0) {
                    temp2 = queue3[a][0];
                    queue3[a][0] = queue3[j][0];
                    queue3[j][0] = temp2;
                }
            }

        }

        System.out.println("\nQueue 3:");

        for(int r=0;r<6;r++) {
            if (queue3[r][0]!= "Empty") {
                System.out.print(queue3[r][0] + " ");
            }
        }
        //four
        size3 = queue4.length;

        for (int a = 0; a < size2 - 1; a++) {

            for (int j = a + 1; j < queue4.length; j++) {
                if (queue4[a][0].compareTo(queue4[j][0]) > 0) {
                    temp2 = queue4[a][0];
                    queue4[a][0] = queue4[j][0];
                    queue4[j][0] = temp2;
                }
            }

        }

        System.out.println("\nQueue 4:");

        for(int r=0;r<6;r++) {
            if (queue4[r][0]!= "Empty") {
                System.out.print(queue4[r][0] + " ");
            }
        }
        //five
        size4 = queue5.length;

        for (int a = 0; a < size2 - 1; a++) {

            for (int j = a + 1; j < queue5.length; j++) {
                if (queue5[a][0].compareTo(queue5[j][0]) > 0) {
                    temp2 = queue5[a][0];
                    queue5[a][0] = queue5[j][0];
                    queue5[j][0] = temp2;
                }
            }

        }

        System.out.println("\nQueue 5:");

        for(int r=0;r<6;r++) {
            if (queue5[r][0]!= "Empty") {
                System.out.print(queue5[r][0] + " ");
            }
        }

        System.out.println("\n");
        Repeat();

    }
    public void ViewRemaining()
    {
        //display the remaining fuel stock
        remain=fuel-(tot+tot2+tot3+tot4+tot5);
        if(remain==500) {
            System.out.println("Remaining Fuel is  500L" );
            Repeat();
        }
        else {
            System.out.println("Remaining Fuel is " + remain+"L");
            Repeat();
        }
        tot=0;tot2=0;tot3=0;tot4=0;tot5=0;
    }

    public void AddFuel()
    {
        //display total fuel stock after adding fuel
        System.out.print("How many Literes Do you add? : ");
        Scanner adding=new Scanner(System.in);
        int add1=adding.nextInt();
        fuel=remain+add1;
        System.out.println("Total fuel stock: "+fuel);
        Repeat();
    }

    public void PrintIncome(){
        System.out.println("Queue1 income is Rs."+(430*tot));
        System.out.println("Queue2 income is Rs."+(430*tot2));
        System.out.println("Queue3 income is Rs."+(430*tot3));
        System.out.println("Queue4 income is Rs."+(430*tot4));
        System.out.println("Queue5 income is Rs."+(430*tot5));
        Repeat();
    }

    public void StoreDta()
    {//store the data to a text file
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter("filename.txt")); //Create a file
            writer.write("---Customers Details---");
            writer.write("\nQueue 1:");//Input data into file
            for (int c = 0; c<6; c++){
                if(queue1[c][0]!="Empty") {
                    writer.write("\nCustomer Id: " + c + " " + "Customer Name: " + queue1[c][0]);
                }
            }
            writer.write("\nQueue 2:");//Input data into file
            for (int c = 0; c<6; c++){
                if(queue2[c][0]!="Empty") {
                    writer.write("\nCustomer Id: " + c + " " + "Customer Name: " + queue2[c][0]);
                }
            }
            writer.write("\nQueue 3:");//Input data into file
            for (int c = 0; c<6; c++){
                if(queue3[c][0]!="Empty") {
                    writer.write("\nCustomer Id: " + c + " " + "Customer Name: " + queue3[c][0]);
                }
            }
            writer.write("\nQueue 4:");//Input data into file
            for (int c = 0; c<6; c++){
                if(queue4[c][0]!="Empty") {
                    writer.write("\nCustomer Id: " + c + " " + "Customer Name: " + queue4[c][0]);
                }
            }
            writer.write("\nQueue 5:");//Input data into file
            for (int c = 0; c<6; c++){
                if(queue5[c][0]!="Empty") {
                    writer.write("\nCustomer Id: " + c + " " + "Customer Name: " + queue5[c][0]);
                }
            }
            writer.close();
            Repeat();
        }catch (IOException e){  //handling errors
            e.printStackTrace();
            Repeat();
        }
    }

    public void LoadData()
    {//load data from a text file
        try {
            BufferedReader reader= new BufferedReader(new FileReader("filename.txt"));
            String line;
            while ((line=reader.readLine()) != null){  //Read the file line by line
                System.out.println(line);
            }
            reader.close();
            Repeat();
        }catch (IOException e){       //handling errors
            e.printStackTrace();
            Repeat();
        }

    }


    public static void main(String[] args) {


    }

}
