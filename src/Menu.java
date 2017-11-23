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
    private boolean result = false;

    //Menu
    public void GenerateMenu()
    {
        System.out.println("********************* Artificial Intelligence Co. *********************");
        System.out.println("[1]     Add information for new Desktop");
        System.out.println("[2]     Add information for new Laptop");
        System.out.println("[3]     Display all computer Information");
        System.out.println("[4]     Quit");
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
    }
}
