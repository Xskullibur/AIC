import java.util.Scanner;
import java.util.ArrayList;

public class Menu extends Computer
{
    private int input;
    private String choice;
    private String DesktopName;
    private String DesktopID;
    private String LaptopName;
    private String LaptopID;
    private String ProcessorSpeed;
    private String Ram;
    private String Hdd;
    private Double Price;
    private String Monitor = "";
    private String Weight;
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
        System.out.print("Please enter either 1 to 4: ");

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
    Scanner price = new Scanner(System.in);
    Scanner monitor = new Scanner(System.in);

    //Add Desktop
    private void NewDesktop()
    {
        /*System.out.print("Computer Name: " );
        DesktopName = comName.next();*/

        //Desktop ID
        System.out.print("What is the Computer ID: ");
        DesktopID = comID.next();

        //Processor Speed
        System.out.print("What is the Processor Speed: ");
        ProcessorSpeed = processSpeed.next();

        //RAM
        System.out.print("What is the  Ram:");
        Ram = ram.next();

        //HDD
        System.out.print("What is the Hard Disk Size: " );
        Hdd = hdd.next();

        //Price
        System.out.print("What is the Price: $S");
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
                System.out.println("\nInvalid Price Input...\nPlease Re-Enter Price:");
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
                System.out.println("Invalid Option Please Re-Enter Monitor Type...\n1) For LED\n2) For LCD");
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

        Desktop d1 = new Desktop(DesktopID,ProcessorSpeed,Ram,Hdd,Price,Monitor);
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
        Scanner hdd = new Scanner(System.in);
        Scanner price = new Scanner(System.in);
        Scanner weight = new Scanner(System.in);

        System.out.print("What is the Laptop ID: ");
        LaptopID = comID.next();
        System.out.print("What is the Processor Speed (in GHZ): ");
        ProcessorSpeed = processSpeed.next();
        System.out.print("What is the Ram:");
        Ram = ram.next();
        System.out.print("What is the Hard Disk Size: " );
        Hdd = hdd.next();
        System.out.print("What is the Price: S$");
        Price = price.nextDouble();
        System.out.print("What is the Weight: ");
        Weight = weight.next();

        Laptop l1 = new Laptop(LaptopID, ProcessorSpeed, Ram, Hdd, Price, Weight);
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
                wResult = false;
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
