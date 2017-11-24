import com.sun.xml.internal.bind.v2.model.core.ID;
import jdk.nashorn.internal.runtime.NumberToString;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu extends Computer
{
    private int input;
    private String choice;
    private String DesktopName;
    private int DesktopID;
    private String LaptopName;
    private int LaptopID;
    private int ProcessorSpeed;
    private String Ram;
    private String Hdd;
    private Double Price;
    private String Monitor = "";
    private int Weight;
    private ArrayList<Desktop> desktop = new ArrayList<>();
    private ArrayList<Laptop> laptop = new ArrayList<>();

    //Menu
    public void GenerateMenu()
    {
        System.out.println("********************* Artificial Intelligence Co. *********************");
        System.out.println("[1]     Add Information for New Desktop");
        System.out.println("[2]     Add Information for New Laptop");
        System.out.println("[3]     Display all computer Information");
        System.out.println("[4]     Remove Information for Desktop");
        System.out.println("[5]     Remove Information for Laptop");
        System.out.println("[6]     Quit");
        System.out.println("***********************************************************************");
        System.out.print("Please enter either 1 to 6: ");

        Scanner Scan = new Scanner(System.in);
        while (true)
        {
            choice = Scan.next();
            try
            {
                input = Integer.parseInt(choice);
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid Input...\nPlease Re-Enter Your Choice:");
            }
        }

        switch (input)
        {
            case 1:
            {
                NewDesktop();
                break;
            }
            case 2:
            {
                NewLaptop();
                break;
            }
            case 3:
            {
                DisplayAllInfo();
                break;
            }
            case 4:
            {
                RemoveDesktop();
                break;
            }
            case 5:
            {
                RemoveLaptop();
                break;
            }
            case 6:
            {
                System.exit(0);
            }
        }
    }

    //Scanner comName = new Scanner(System.in);
    Scanner comID = new Scanner(System.in);
    Scanner processSpeed = new Scanner(System.in);
    Scanner ram = new Scanner(System.in);
    Scanner hdd = new Scanner(System.in);
    Scanner HDDsize = new Scanner(System.in);
    Scanner price = new Scanner(System.in);
    Scanner monitor = new Scanner(System.in);

    //Add Desktop
    private void NewDesktop()
    {
        /*System.out.print("Computer Name: " );
        DesktopName = comName.next();*/

        //Desktop ID
        Scanner comID = new Scanner(System.in);
        String DDD;
        String dID;
        System.out.println("What is the Computer ID: ");
        while(true)
        {
            String ID = comID.nextLine();
            /**
            for (Desktop d:desktop)
            {
                dID = d.getComputerID();
                if (dID == ID)
                {

                }
            }
            **/

            try
            {
                DesktopID = Integer.parseInt(ID);
                DDD ="D" + DesktopID;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Computer ID Invalid! Please enter valid ID...\nPlease Enter Computer ID: ");
            }
        }

        //Processor Speed
        System.out.println("What is the Processor Speed: ");
        String PPP;
        while (true)
        {
            String sSpeed = processSpeed.next();
            try
            {
                ProcessorSpeed = Integer.parseInt(sSpeed);
                PPP = sSpeed + " GHz";
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid Price Input! Please enter Valid Price...\nPlease Enter Processor Speed: ");
            }
        }

        //RAM
        System.out.print("What is the Ram:\n");
        String RRR;
        int sRam;
        while (true)
        {
            RRR = ram.next();
           try
           {
               sRam = Integer.parseInt(RRR);
               break;
           }
           catch (NumberFormatException e)
           {
               System.out.println("Invalid RAM Input! Please enter Valid Ram...\nPlease Enter RAM: ");
           }
        }

        if(sRam <=64)
        {
            RRR = RRR +" GB";
        }
        else if(sRam > 64 && sRam <1024)
        {
            RRR = RRR + " MB";
        } else if (sRam >= 1024) {
           RRR = Integer.toString(sRam / 1024) + " GB";
        }

        //HDD
        System.out.print("What is the Hard Disk Size: \n");
        int iSize;
        while (true)
        {
            String hSize = HDDsize.next();
            try
            {
                iSize = Integer.parseInt(hSize);
                Hdd = Integer.toString(iSize);
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid Size! Please enter Valid HDD Size...\nPlease Enter HDD Size: ");
            }
        }

        Scanner bytes = new Scanner(System.in);
        System.out.println("HDD Size\n1) GB\n2) TB");
        int Bytes = 0;
        while (Bytes != 1 || Bytes != 2)
        {
            String sBytes = bytes.next();
            try
            {
                Bytes = Integer.parseInt(sBytes);
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid Size! Please enter Valid Size...\nHDD Size:\n1) GB\n2) TB");
            }
        }
        switch (Bytes)
        {
            case 1:
                Hdd += " GB";
                break;
            case 2:
                Hdd += " TB";
                break;
        }

        //Price
        System.out.print("What is the Price: \n$S");
        while (true)
        {
            String sPrice = price.next()+"\n";
            try
            {
                Price = Double.parseDouble(sPrice);
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid Price! Please enter Valid Price...\nPlease Re-Enter Price: ");
            }
        }

        //Monitor
        System.out.print("What is the Monitor Type: \n1) For LED\n2) For LCD\n");
        int iMonitor;
        while (true)
        {
            String sMonitor = monitor.nextLine();
            try
            {
                iMonitor = Integer.parseInt(sMonitor);
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid Option! Please Re-Enter Monitor Type...\n1) For LED\n2) For LCD");
            }
        }
        switch(iMonitor)
        {
            case 1:
                Monitor = "LED";
                break;
            case 2:
                Monitor = "LCD";
        }

        Desktop d1 = new Desktop(DDD,PPP,RRR,Hdd,Price,Monitor);
        desktop.add(d1);

        System.out.println("\nYour information has been added successfully");
        GenerateMenu();
    }

    private void NewLaptop()
    {
        //Scanner comName = new Scanner(System.in);
        Scanner comID = new Scanner(System.in);
        Scanner processSpeed = new Scanner(System.in);
        Scanner ram = new Scanner(System.in);
        //Scanner hdd = new Scanner(System.in);
        Scanner price = new Scanner(System.in);
        Scanner weight = new Scanner(System.in);

        System.out.print("What is the Laptop ID: \n");
        String LLL;
        while(true)
        {
            String ID = comID.nextLine();
            try
            {
                LaptopID = Integer.parseInt(ID);
                LLL ="L" + LaptopID;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Computer ID Invalid! Please enter valid ID...\nPlease Enter Computer ID: ");
            }

        }

        System.out.print("What is the Processor Speed (in GHZ): \n");
        String PPP;
        while (true)
        {
            String sSpeed = processSpeed.next();
            try
            {
                ProcessorSpeed = Integer.parseInt(sSpeed);
                PPP = sSpeed + " GHz";
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid Price Input! Please enter Valid Price...\nPlease Enter Processor Speed: ");
            }
        }

        System.out.print("What is the Ram:\n");
        String RRR;
        int sRam;
        while (true)
        {
            RRR = ram.next();
            try
            {
                sRam = Integer.parseInt(RRR);
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid RAM Input! Please enter Valid Ram...\nPlease Enter RAM: ");
            }
        }

        if(sRam <=64)
        {
            RRR = RRR +" GB";
        }
        else if(sRam > 64 && sRam <1024)
        {
            RRR = RRR + " MB";
        } else if (sRam >= 1024) {
            RRR = Integer.toString(sRam / 1024) + " GB";
        }

        System.out.print("What is the Hard Disk Size: \n");
        int iSize;
        while (true)
        {
            String hSize = HDDsize.next();
            try
            {
                iSize = Integer.parseInt(hSize);
                Hdd = Integer.toString(iSize);
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid Size! Please enter Valid HDD Size...\nPlease Enter HDD Size: ");
            }
        }

        Scanner bytes = new Scanner(System.in);
        System.out.println("HDD Size\n1) GB\n2) TB");
        int Bytes = 0;
        while (Bytes != 1 || Bytes != 2)
        {
            String sBytes = bytes.next();
            try
            {
                Bytes = Integer.parseInt(sBytes);
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid Size! Please enter Valid Size...\nHDD Size:\n1) GB\n2) TB");
            }
        }
        switch (Bytes)
        {
            case 1:
                Hdd += " GB";
                break;
            case 2:
                Hdd += " TB";
                break;
        }

        System.out.print("What is the Price: \nS$");
        while (true)
        {
            String sPrice = price.next();
            try
            {
                Price = Double.parseDouble(sPrice);
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid Price! Please enter Valid Price...\nPlease Re-Enter Price: ");
            }
        }

        System.out.print("What is the Weight: \n");
        while (true)
        {
            String sWeight = weight.next();
            try
            {
                Weight = Integer.parseInt(sWeight);
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid Weight! Please enter Valid Weight...\nPlease Re-Enter Weight: ");
            }
        }

        Laptop l1 = new Laptop(LLL, PPP, RRR, Hdd, Price, Weight);
        laptop.add(l1);

        System.out.println("\nYour information has been added successfully");
        GenerateMenu();
    }

    public void RemoveDesktop()
    {
        int index = -1;
        String ID;
        boolean wResult = true;
        boolean iResult = true;
        while (wResult)
        {
            if (iResult)
            {
                Scanner Remove = new Scanner(System.in);
                System.out.println("Please Enter Computer ID to Delete: \n[Insert 'back' to Return to Menu]");
                ID = Remove.next();

                if (ID.equals("back"))
                {
                    GenerateMenu();
                    wResult = false;
                }

                for (Desktop d: desktop)
                {
                    if (!d.getComputerID().equals(ID))
                    {
                        System.out.println("Invalid Computer Please Try Again... \n");
                    }
                    else
                    {
                        index = desktop.indexOf(d);
                        iResult = false;
                    }
                }
            }
            else
            {
                desktop.remove(index);
                break;
            }
        }
        GenerateMenu();
    }

    public void RemoveLaptop()
    {
        int index = -1;
        String ID;
        boolean wResult = true;
        boolean iResult = true;
        while (wResult)
        {
            if (iResult)
            {
                Scanner Remove = new Scanner(System.in);
                System.out.println("Please Enter Laptop ID to Delete: \n[Insert 'back' to return]");
                ID = Remove.next();

                if (ID.equals("back"))
                {
                    GenerateMenu();
                    wResult = false;
                }

                for (Laptop l : laptop) {
                    if (!l.getComputerID().equals(ID)) {
                        System.out.println("Invalid Computer Please Try Again... \n");
                    } else {
                        index = laptop.indexOf(l);
                        iResult = false;
                    }
                }
            }
            else
            {
                laptop.remove(index);
                break;
            }
        }
        GenerateMenu();
    }

    public void DisplayAllInfo()
    {
        System.out.println("\n=============================   Desktops   ============================");
        for (Desktop d:desktop)
        {
            d.DisplayInfo();
            System.out.println("=======================================================================");
        }

        System.out.println("\n=============================   Laptops   =============================");
        for (Laptop l:laptop)
        {
            l.DisplayInfo();
            System.out.println("=======================================================================");
        }

        GenerateMenu();
    }
}
