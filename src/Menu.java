import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu extends Computer
{
    //private String DesktopName;
    //private String LaptopName;
    private int DesktopID;
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
        int input;
        String choice;
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
                if (input > 6 || input < 1)
                {
                    System.out.println("Invalid Input...\nPlease Re-Enter Your Choice:");
                }
                else
                {
                    break;
                }
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
                System.out.println("Application Program Closed, Bye...");
                System.exit(0);
            }
        }
    }

    private Scanner comID = new Scanner(System.in);
    private Scanner processSpeed = new Scanner(System.in);
    private Scanner ram = new Scanner(System.in);
    private Scanner hdd = new Scanner(System.in);
    private Scanner HDDsize = new Scanner(System.in);
    private Scanner HDDbytes = new Scanner(System.in);
    private Scanner price = new Scanner(System.in);
    private Scanner monitor = new Scanner(System.in);

    //Add Desktop
    private void NewDesktop()
    {

        //Desktop ID
        boolean IDresult = true;
        System.out.println("What is the Desktop's ID: ");
        while(IDresult)
        {
            IDresult = setComputerID(comID.next());
            if (IDresult)
            {
                System.out.println("Invalid Desktop ID! Desktop ID Can Only be 4 Numbers or Characters Long\nPlease Re-Enter Desktop ID: ");
            }
            else
            {
                break;
            }
        }

        //Processor Speed
        boolean Presult = true;
        System.out.println("What is the Processor Speed: ");
        while (Presult)
        {
            Presult = setProcessorSpeed(processSpeed.next());
            if (Presult)
            {
                System.out.println("Invalid Price Input! Please enter Valid Price...\nPlease Enter Processor Speed: ");
            }
            else
            {
                break;
            }
        }

        //RAM
        boolean Rresult = true;
        System.out.println("What is the Ram: ");
        while (Rresult)
        {
            Rresult = setRam(ram.next());
            if (Rresult)
            {
                System.out.println("Invalid RAM Input! Please enter Valid Ram...\\nPlease Enter RAM: ");
            }
            else
            {
                break;
            }
        }

        //HDD
        int iSize;
        System.out.println("What is the Hard Disk Size:");
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

        System.out.println("HDD Size\n1) GB\n2) TB");
        int Bytes;
        while (true)
        {
            String sBytes = HDDbytes.next();
            if (sBytes.equals("1") || sBytes.equals("2"))
            {
                try
                {
                    Bytes = Integer.parseInt(sBytes);
                    break;
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Invalid Option! Please enter Valid Option...\nHDD Size:\n1) GB\n2) TB");
                }
            }
            else
            {
                System.out.println("Invalid Option! Please enter Valid Option...\nHDD Size:\n1) GB\n2) TB");
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
                setPrice(Double.parseDouble(sPrice));
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
            if (sMonitor.equals("1") || sMonitor.equals("2"))
            {
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
            else
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

        Desktop d1 = new Desktop(getComputerID(),getProcessorSpeed(),getRam(),Hdd,getPrice(), Monitor);
        desktop.add(d1);

        System.out.println("\nYour information has been added successfully");
        GenerateMenu();
    }

    private void NewLaptop()
    {
        Scanner comID = new Scanner(System.in);
        Scanner processSpeed = new Scanner(System.in);
        Scanner ram = new Scanner(System.in);
        //Scanner hdd = new Scanner(System.in);
        Scanner price = new Scanner(System.in);
        Scanner weight = new Scanner(System.in);

        //LaptopID
        boolean IDresult = true;
        System.out.println("What is the Laptop's ID: ");
        while(IDresult)
        {
            IDresult = setComputerID(comID.next());
            if (IDresult)
            {
                System.out.println("Invalid Laptop ID! Desktop ID Can Only be 4 Numbers or Characters Long\nPlease Re-Enter Laptop ID: ");
            }
            else
            {
                break;
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

        Laptop l1 = new Laptop(getComputerID(), PPP, RRR, Hdd, Price, Weight);
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
