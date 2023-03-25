import java.io.*;
import java.util.Scanner;
import static java.lang.System.exit;

public class w1898939_java_cw_part1 {
    static String [] queue1 = new String[6];
    static String [] queue2 = new String[6];
    static String [] queue3 = new String[6];
    static int x1=10;
    static int x2=10;
    static int x3=10;
    static int one=0;
    static int two=0;
    static int three=0;
    static int tot=0;
    static int tot2=0;
    static int tot3=0;
    static int x,y,z,e,size,j,size1,size2,p;
    static int c=0;
    static int t=0;
    static int v=0;
    static int w=0;
    static String temp,temp1,temp2;
    static int fuel=6600;
    static int remain=0;
    public static void Menu(){
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
        System.out.println("\t999 or EXT: Exit the Program\n");

    }


    public static void Repeat() {
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
    public static void ViewFuelQueue()
    {
        //View all fuel queues details
        x=one;
        System.out.println("Queue 1:");
        for (x = 0; x <6; x++) {

            if(queue1[x]!="Empty") {

                System.out.println("Customer id:" + x+ " " + "Customer Name:" + queue1[x]);
            }
        }
        System.out.println("Total liters= " + tot);

        y=two;
        System.out.println("Queue 2:");
        for (y = 0; y < 6; y++) {
            if(queue2[y]!="Empty") {
                System.out.println("Customer id:" + y + " " + "Customer Name:" + queue2[y]);
            }
        }
        System.out.println("Total liters= " + tot2);

        z=three;
        System.out.println("Queue 3:");
        for (z = 0; z < 6; z++) {
            if(queue3[z]!="Empty") {
                System.out.println("Customer id:" + z + " " + "Customer Name:" + queue3[z]);
            }
        }
        System.out.println("Total liters= " + tot3);
        System.out.println("\n");
        Repeat();
    }
    public static void ViewEmptyQueue()
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
        Repeat();
    }

    public static void add()
    {//add customer to the queues
        System.out.print("Do you want to add a customer(Y/N):");
        Scanner customer=new Scanner(System.in);
        String answer1=customer.next();
        String answer=answer1.toUpperCase();
        switch (answer){
            case "Y":
                System.out.print("Enter the Queue (1 or 2 or 3): ");
                Scanner add=new Scanner(System.in);
                String num=add.next();
                switch (num){
                    case "1":
                        while (one<=5) {
                            System.out.print("Enter Name: ");
                            Scanner name1=new Scanner(System.in);
                            String Cname=name1.next();
                            queue1[one] = Cname;
                            tot = tot + x1;
                            System.out.println(Cname+" is successfully added to Queue1"+ " " + "\t\t\tTotal liters= "+tot);
                            if(one==5){
                                System.out.println("Queue 1 is full");
                                add();
                            }else {
                                one = one + 1;
                                add();
                            }
                        }

                    case "2":
                        while (two<=5) {
                            System.out.print("Enter Name: ");
                            Scanner name2=new Scanner(System.in);
                            String Cname2=name2.next();
                            queue2[two] = Cname2;
                            tot2 = tot2 + x2;
                            System.out.println(Cname2+" is successfully added to Queue2"+" " +"\t\t\tTotal Litres= "+ tot2);
                            if(two==5){
                                System.out.println("Queue 2 is full");
                                add();

                            }else {
                                two = two + 1;
                                add();
                            }
                        }


                    case "3":
                        while (three<=5) {
                            System.out.print("Enter Name: ");
                            Scanner name3=new Scanner(System.in);
                            String Cname3=name3.next();
                            queue3[three] = Cname3;
                            tot3 = tot3 + x3;
                            System.out.println(Cname3+" is successfully added to Queue3"+ " " +"\t\t\tTotal Liters= "+ tot3);
                            if(three==5){
                                System.out.println("Queue 3 is full");
                                add();
                            }else {
                                three = three + 1;
                                add();
                            }
                        }


                }
            case "N":
                Repeat();


        }


    }

    public static void RemoveCustomer()
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
                System.out.println("Queue 01:");
                System.out.println("CustomerID:" + e+ " CustomerName: " + queue1[e]+" is successfully removed");
                queue1[e] ="Empty";
                for(int y=e;y<6;y++){
                    if(queue1[e+1]!="Empty"){

                        queue1[e]=queue1[e+1];
                        queue1[e+1] = "Empty";

                    }}


                tot = tot - x1;
                System.out.println("\n");
                Repeat();
            case "2":
                System.out.println("Queue 02:");
                System.out.println("CustomerID:"+e+" CustomerName: "+queue2[e]+" is successfully removed");
                queue2[e]= "Empty";
                for(int y=e;y<6;y++){
                    if(queue2[e+1]!="Empty"){

                        queue2[e]=queue2[e+1];
                        queue2[e+1] = "Empty";

                    }}

                tot2=tot2-x2;
                System.out.println("\n");
                Repeat();
            case "3":
                System.out.println("Queue 03:");
                System.out.println("CustomerID:"+e+" CustomeName: "+queue3[e]+" is successfully removed");
                queue3[e]= "Empty";
                for(int y=e;y<6;y++){
                    if(queue3[e+1]!="Empty"){

                        queue3[e]=queue3[e+1];
                        queue3[e+1] = "Empty";

                    }}

                tot3=tot3-x3;
                System.out.println("\n");
                Repeat();

        }

    }

    public static void RemoveServed()
    {
        //remove the first customer of the queue
        System.out.print("Enter the Queue no:");
        Scanner queNo=new Scanner(System.in);
        String QName=queNo.next();
        switch (QName)
        {
            case "1":

                System.out.println("Queue1-CustomerId:"+p+" CustomerName: "+queue1[p]+" is successfully removed");
                queue1[p]= "Empty";
                for(int e=0;e<5;e++){
                    if(queue1[e+1]!="Empty"){

                        queue1[e]=queue1[e+1];
                        queue1[e+1] = "Empty";

                    }}

               // p=p+1;
                Repeat();
            case "2":

                System.out.println("Queue2-CustomerId:"+t+" CustomerName: "+queue2[t]+" is successfully removed");
                queue2[t]="Empty";
                for(int e=0;e<5;e++){
                    if(queue1[e+1]!="Empty"){

                        queue1[e]=queue1[e+1];
                        queue1[e+1] = "Empty";

                    }}
               // t=t+1;
                Repeat();
            case "3":

                System.out.println("Queue3-CustomerId:"+v+" CustomerName: "+queue3[v]+" is successfully removed");
                queue3[v]="Empty";
                for(int e=0;e<5;e++){
                    if(queue1[e+1]!="Empty"){

                        queue1[e]=queue1[e+1];
                        queue1[e+1] = "Empty";

                    }}
                //v=v+1;
                Repeat();


        }


    }

    public static void ViewCustomerAlphabeticOrder()
    {//Display the customers name in alphabetical order

        size = queue1.length;

        for (int a = 0; a < size - 1; a++) {

            for (j = a + 1; j < queue1.length; j++) {
                if (queue1[a].compareTo(queue1[j]) > 0) {
                    temp = queue1[a];
                    queue1[a] = queue1[j];
                    queue1[j] = temp;
                }
            }

        }
        System.out.println("Queue 1:");
        for (int r=0;r<6;r++) {
            if(queue1[r]!="Empty") {
                System.out.print(queue1[r]+" ");
            }
        }



        size1 = queue2.length;

        for (int a = 0; a < size1 - 1; a++) {

            for (j = a + 1; j < queue2.length; j++) {
                if (queue2[a].compareTo(queue2[j]) > 0) {
                    temp1 = queue2[a];
                    queue2[a] = queue2[j];
                    queue2[j] = temp1;
                }
            }

        }
        System.out.println("\nQueue 2:");

        for (int r=0;r<6;r++) {
            if(queue2[r]!="Empty") {
                System.out.print(queue2[r]+" ");
            }
        }
        size2 = queue3.length;

        for (int a = 0; a < size2 - 1; a++) {

            for (j = a + 1; j < queue3.length; j++) {
                if (queue3[a].compareTo(queue3[j]) > 0) {
                    temp2 = queue3[a];
                    queue3[a] = queue3[j];
                    queue3[j] = temp2;
                }
            }

        }

        System.out.println("\nQueue 3:");

        for(int r=0;r<6;r++) {
            if (queue3[r] != "Empty") {
                System.out.print(queue3[r] + " ");
            }
        }
        System.out.println("\n");
        Repeat();

    }
    public static void ViewRemaining()
    {
        //display the remaining fuel stock
        remain=fuel-(tot+tot2+tot3);
        if(remain==500) {
            System.out.println("Remaining Fuel is  500L" );
            Repeat();
        }
        else {
            System.out.println("Remaining Fuel is " + remain+"L");
            Repeat();
        }
        tot=0;tot2=0;tot3=0;
    }
    public static void AddFuel()
    {
        //display total fuel stock after adding fuel
        System.out.print("How many Literes Do you add? : ");
        Scanner adding=new Scanner(System.in);
        int add1=adding.nextInt();
        fuel=remain+add1;
        System.out.println("Total fuel stock: "+fuel);
        Repeat();
    }

    public static void StoreDta()
    {//store the data to a text file
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter("filename.txt")); //Create a file
            writer.write("---Customers Details---");
            writer.write("\nQueue 1:");//Input data into file
            for (int c = 0; c<6; c++){
                if(queue1[c]!="Empty") {
                    writer.write("\nCustomer Id: " + c + " " + "Customer Name: " + queue1[c]);
                }
            }
            writer.write("\nQueue 2:");//Input data into file
            for (int c = 0; c<6; c++){
                if(queue2[c]!="Empty") {
                    writer.write("\nCustomer Id: " + c + " " + "Customer Name: " + queue2[c]);
                }
            }writer.write("\nQueue 3:");//Input data into file
            for (int c = 0; c<6; c++){
                if(queue3[c]!="Empty") {
                    writer.write("\nCustomer Id: " + c + " " + "Customer Name: " + queue3[c]);
                }

            }
            writer.close();
            Repeat();
        }catch (IOException e){  //handling errors
            e.printStackTrace();
            Repeat();
        }


    }
    public static void LoadData()
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



    public static void start()
    {

        Menu();
        System.out.print("Enter your choice: ");
        Scanner choice=new Scanner(System.in);
        String name1=choice.next();
        String name=name1.toUpperCase();
        switch (name)
        {
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
            case "999":
            case "EXT":
                exit(0);

        }
    }

    public static void main(String[] args) {
        for(int h=0;h<6;h++)
        {
            queue1[h]="Empty";
            queue2[h]="Empty";
            queue3[h]="Empty";
        }

        start();

    }
}
