import java.util.Scanner;

public class Menu extends Computer
{
    private String Hdd;
    private Database database = new Database();
    private Scanner comID = new Scanner(System.in);
    private Scanner processSpeed = new Scanner(System.in);
    private Scanner ram = new Scanner(System.in);
    private Scanner HDDsize = new Scanner(System.in);
    private Scanner HDDbytes = new Scanner(System.in);
    private Scanner price = new Scanner(System.in);
    private Scanner monitor = new Scanner(System.in);

    //NewMenu
    public void NewMenu()
    {
        String input;
        System.out.println("\n********************* Artificial Intelligence Co. *********************");
        System.out.println("[1]     Desktop");
        System.out.println("[2]     Laptop");
        System.out.println("[3]     Display All Computer Information");
        System.out.println("[4]     Quit");
        System.out.println("***********************************************************************");
        System.out.print("Please enter either 1 to 4: ");

        Scanner scan = new Scanner(System.in);
        while (true)
        {
            input = scan.next();

            if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4"))
            {
                switch (input)
                {
                    case "1":
                        DesktopMenu();
                        break;
                    case "2":
                        LaptopMenu();
                        break;
                    case "3":
                        DisplayAllInfo();
                        break;
                    case "4":
                        System.out.println("Application Program Closed, Bye...");
                        System.exit(0);
                        break;

                }
                break;
            }
            else
            {
                System.out.println("Invalid Input...\nPlease Re-Enter Your Choice:");
            }
        }
    }

    //Desktop Menu
    private void DesktopMenu()
    {
        String input;
        System.out.println("\n============================= Desktop Menu ============================");
        System.out.println("[1]     Add New Desktop");
        System.out.println("[2]     Remove Existing Desktop");
        System.out.println("[3]     Edit Existing Desktop");
        System.out.println("[4]     Display all Desktops");
        System.out.println("[5]     Back");
        System.out.println("=======================================================================");
        System.out.print("Please enter either 1 to 5: ");

        Scanner scan = new Scanner(System.in);
        while (true)
        {
            input = scan.next();
            if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5"))
            {
                switch (input)
                {
                    case "1":
                        NewDesktop();
                        break;
                    case"2":
                        RemoveDesktop();
                        break;
                    case "3":
                        EditDesktop();
                        break;
                    case "4":
                        DisplayDesktop();
                        break;
                    case "5":
                        NewMenu();
                        break;
                }
                break;
            }
            else
            {
                System.out.println("Invalid Input...\nPlease Re-Enter Your Choice:");
            }
        }
    }

    //Laptop Menu
    private void LaptopMenu()
    {
        String input;
        System.out.println("\n===================== Artificial Intelligence Co. =====================");
        System.out.println("[1]     Add New Laptop");
        System.out.println("[2]     Remove Existing Laptop");
        System.out.println("[3]     Edit Existing Laptop");
        System.out.println("[4]     Display all Laptops");
        System.out.println("[5]     Back");
        System.out.println("=======================================================================");
        System.out.print("Please enter either 1 to 5: ");

        Scanner scan = new Scanner(System.in);
        while (true)
        {
            input = scan.next();
            if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5"))
            {
                switch (input)
                {
                    case "1":
                        NewLaptop();
                        break;
                    case "2":
                        RemoveLaptop();
                        break;
                    case "3":
                        EditLaptop();
                        break;
                    case "4":
                        DisplayLaptop();
                        break;
                    case "5":
                        NewMenu();
                }
                break;
            }
            else
            {
                System.out.println("Invalid Input...\nPlease Re-Enter Your Choice:");
            }
        }
    }

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
        System.out.println("What is the Hard Disk Size:");

        while (true)
        {
            try
            {
                int iSize = Integer.parseInt(HDDsize.next());
                Hdd = Integer.toString(iSize);
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid Size! Please enter Valid HDD Size...\nPlease Enter HDD Size: ");
            }
        }

        System.out.println("HDD Size\n1) GB\n2) TB");
        while (true)
        {
            String sBytes = HDDbytes.next();
            if (sBytes.equals("1"))
            {
                Hdd += " GB";
                setHardDisk(Hdd);
                break;
            }
            else if (sBytes.equals("2"))
            {
                Hdd += " TB";
                setHardDisk(Hdd);
                break;
            }
            else
            {
                System.out.println("Invalid Option! Please enter Valid Option...\nHDD Size:\n1) GB\n2) TB");
            }
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

        String Monitor = "";
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

        Desktop d1 = new Desktop(getComputerID(),getProcessorSpeed(),getRam(),getHardDisk(),getPrice());
        d1.setMonitor(Monitor);
        database.addDesktop(d1);

        System.out.println("\nYour information has been added successfully");
        NewMenu();
    }

    //Add Laptop
    private void NewLaptop()
    {
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
        while (true)
        {
            String sBytes = HDDbytes.next();
            if (sBytes.equals("1"))
            {
                Hdd += " GB";
                setHardDisk(Hdd);
                break;
            }
            else if (sBytes.equals("2"))
            {
                Hdd += " TB";
                setHardDisk(Hdd);
                break;
            }
            else
            {
                System.out.println("Invalid Option! Please enter Valid Option...\nHDD Size:\n1) GB\n2) TB");
            }
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

        //Weight
        int Weight;
        Scanner weight = new Scanner(System.in);
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

        Laptop l1 = new Laptop(getComputerID(), getProcessorSpeed(), getRam(), getHardDisk(), getPrice());
        l1.setWeight(Weight);
        database.addLaptop(l1);

        System.out.println("\nYour information has been added successfully");
        NewMenu();
    }

    //Remove Desktop
    private void RemoveDesktop()
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
                    NewMenu();
                    wResult = false;
                }

                for (Desktop d: database.getDesktop())
                {
                    if (!d.getComputerID().equals(ID))
                    {
                        System.out.println("Invalid Computer Please Try Again... \n");
                    }
                    else
                    {
                        index = database.DesktopIndexOf(d);
                        iResult = false;
                    }
                }
            }
            else
            {
                database.removeDesktop(index);
                break;
            }
        }
        System.out.println("Desktop Removed Successfully...");
        NewMenu();
    }

    //Remove Laptop
    private void RemoveLaptop()
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
                    NewMenu();
                    wResult = false;
                }

                for (Laptop l : database.getLaptop()) {
                    if (!l.getComputerID().equals(ID)) {
                        System.out.println("Invalid Computer Please Try Again... \n");
                    } else {
                        index = database.LaptopIndexOf(l);
                        iResult = false;
                    }
                }
            }
            else
            {
                database.removeLaptop(index);
                break;
            }
        }
        System.out.println("Laptop Removed Successfully...");
        NewMenu();
    }

    //Display All Info
    private void DisplayAllInfo()
    {
        int Dname = 0;
        if (database.getDesktop().isEmpty())
        {
            System.out.println("\n========================== No Desktop Found! ==========================");
        }
        else
        {
            System.out.println("\n=============================   Desktops   ============================");
            for (Desktop d:database.getDesktop())
            {
                Dname += 1;
                System.out.println("Desktop " + Dname + " of " + database.DesktopSize());
                d.DisplayInfo();
                System.out.println("=======================================================================");
            }
        }

        int Lname = 0;
        if (database.getLaptop().isEmpty())
        {
            System.out.println("========================== No Laptop Found! ===========================\n");
        }
        else
        {
            System.out.println("\n=============================   Laptops   =============================");
            for (Laptop l:database.getLaptop())
            {
                Lname += 1;
                System.out.println("Laptop " + Lname + " of " + database.LaptopSize());
                l.DisplayInfo();
                System.out.println("=======================================================================");
            }
        }
        NewMenu();
    }

    //Display Desktop
    private void DisplayDesktop()
    {
        Scanner back = new Scanner(System.in);
        int Dname = 0;
        if (database.getDesktop().isEmpty())
        {
            System.out.println("\n========================== No Desktop Found! ==========================");
        }
        else
        {
            System.out.println("\n=============================   Desktops   ============================");
            for (Desktop d:database.getDesktop())
            {
                Dname += 1;
                System.out.println("Desktop " + Dname + " of " + database.DesktopSize());
                d.DisplayInfo();
                System.out.println("=======================================================================");
            }
        }

        System.out.println("Please Enter 'back' to Return to Menu: ");
        while(true)
        {
            String input = back.next();
            if (input.equals("back"))
            {
                NewMenu();
                break;
            }
            else
            {
                System.out.println("Invalid Input...\nEnter 'back' to Return to Menu: ");
            }
        }
    }

    //Display Laptop
    private void DisplayLaptop()
    {
        Scanner back = new Scanner(System.in);
        int Lname = 0;
        if (database.getLaptop().isEmpty())
        {
            System.out.println("========================== No Laptop Found! ===========================\n");
        }
        else
        {
            System.out.println("\n=============================   Laptops   =============================");
            for (Laptop l:database.getLaptop())
            {
                Lname += 1;
                System.out.println("Laptop " + Lname + " of " + database.LaptopSize());
                l.DisplayInfo();
                System.out.println("=======================================================================");
            }
        }

        System.out.println("Please Enter 'back' to Return to Menu: ");
        while(true)
        {
            String input = back.next();
            if (input.equals("back"))
            {
                NewMenu();
                break;
            }
            else
            {
                System.out.println("Invalid Input...\nEnter 'back' to Return to Menu: ");
            }
        }
    }

    //Edit Desktop
    private void EditDesktop()
    {
        int index = -1;
        String ID;
        boolean wResult = true;
        boolean iResult = true;
        while (wResult)
        {
            if (iResult)
            {
                Scanner edit = new Scanner(System.in);
                System.out.println("Please Enter Desktop ID to Edit: \n[Insert 'back' to Return Menu]");
                ID = edit.next();

                if (ID.equals("back"))
                {
                    NewMenu();
                    wResult = false;
                }
                else
                {
                    for (Desktop d:database.getDesktop())
                    {
                        if (!d.getComputerID().equals(ID))
                        {
                            System.out.println("Invalid Desktop ID! Please Try Again...");
                        }
                        else
                        {
                            index = database.DesktopIndexOf(d);
                            iResult = false;
                        }
                    }
                }
            }
            else {
                System.out.println("\n********************* Desktop Editor *********************");
                System.out.println("[1]     ID");
                System.out.println("[2]     Processor Speed");
                System.out.println("[3]     Ram");
                System.out.println("[4]     HDD");
                System.out.println("[5]     Price");
                System.out.println("[6]     Monitor");
                System.out.println("[7]     Quit To Main Menu");
                //System.out.println("[7]     Recreate");
                System.out.println("***********************************************************************");
                System.out.print("Please enter either 1 to 4: ");

                Scanner selection = new Scanner(System.in);

                switch (selection.next())
                {
                    case "1":
                        boolean IDresult = true;
                        System.out.println("New Desktop ID: ");
                        while(IDresult)
                        {
                            IDresult = database.SelectDesktop(index).setComputerID(comID.next());
                            if (IDresult)
                            {
                                System.out.println("Invalid Desktop ID! Desktop ID Can Only be 4 Numbers or Characters Long\nPlease Re-Enter Desktop ID: ");
                                wResult = false;
                            }
                            else
                            {
                                break;
                            }
                        }
                        break;

                    case "2":
                        System.out.println("New Desktop Processor: ");
                        boolean Presult = true;
                        while (Presult)
                        {
                            Presult = database.SelectDesktop(index).setProcessorSpeed(processSpeed.next());
                            if (Presult)
                            {
                                System.out.println("Invalid Price Input! Please enter Valid Price...\nPlease Enter Processor Speed: ");
                                wResult = false;
                            }
                            else
                            {
                                break;
                            }
                        }
                        break;

                    case "3":
                        System.out.println("New Desktop Ram:");
                        boolean Rresult = true;
                        while (Rresult)
                        {
                            Rresult = database.SelectDesktop(index).setRam(ram.next());
                            if (Rresult)
                            {
                                System.out.println("Invalid RAM Input! Please enter Valid Ram...\\nPlease Enter RAM: ");
                                wResult = false;
                            }
                            else
                            {
                                break;
                            }
                        }
                        break;
                    case "4":
                        System.out.println("New Hard Disk Size:");
                        while (true)
                        {
                            try
                            {
                                int iSize = Integer.parseInt(HDDsize.next());
                                Hdd = Integer.toString(iSize);
                                break;
                            }
                            catch (NumberFormatException e)
                            {
                                System.out.println("Invalid Size! Please enter Valid HDD Size...\nPlease Enter HDD Size: ");
                            }
                        }

                        System.out.println("New HDD Size\n1) GB\n2) TB");
                        while (true)
                        {
                            String sBytes = HDDbytes.next();
                            if (sBytes.equals("1"))
                            {
                                Hdd += " GB";
                                database.SelectDesktop(index).setHardDisk(Hdd);
                                break;
                            }
                            else if (sBytes.equals("2"))
                            {
                                Hdd += " TB";
                                database.SelectDesktop(index).setHardDisk(Hdd);
                                break;
                            }
                            else
                            {
                                System.out.println("Invalid Option! Please enter Valid Option...\nHDD Size:\n1) GB\n2) TB");
                            }
                        }
                        break;

                    case "5":
                        System.out.print("New Price: \n$S");
                        while (true)
                        {
                            String sPrice = price.next()+"\n";
                            try
                            {
                                database.SelectDesktop(index).setPrice(Double.parseDouble(sPrice));
                                break;
                            }
                            catch(NumberFormatException e)
                            {
                                System.out.println("Invalid Price! Please enter Valid Price...\nPlease Re-Enter Price: ");
                            }
                        }
                        break;

                    case "6":
                        System.out.print("What is the Monitor Type: \n1) For LED\n2) For LCD\n");
                        String Monitor = "";
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
                        database.SelectDesktop(index).setMonitor(Monitor);
                        break;
                    case "7":
                        NewMenu();

                }
                EditDesktop();
            }
        }
    }

    //Edit Laptop
    private void EditLaptop()
    {
        int index = -1;
        String ID;
        boolean wResult = true;
        boolean iResult = true;
        while (wResult)
        {
            if (iResult)
            {
                Scanner edit = new Scanner(System.in);
                System.out.println("Please Enter Laptop ID to Edit: \n[Insert 'back' to Return Menu]");
                ID = edit.next();

                if (ID.equals("back"))
                {
                    NewMenu();
                    wResult = false;
                }
                else
                {
                    for (Laptop d:database.getLaptop())
                    {
                        if (!d.getComputerID().equals(ID))
                        {
                            System.out.println("Invalid Laptop ID! Please Try Again...");
                        }
                        else
                        {
                            index = database.LaptopIndexOf(d);
                            iResult = false;
                        }
                    }
                }
            }
            else {
                System.out.println("\n********************* Laptop Editor *********************");
                System.out.println("[1]     ID");
                System.out.println("[2]     Processor Speed");
                System.out.println("[3]     Ram");
                System.out.println("[4]     HDD");
                System.out.println("[5]     Price");
                System.out.println("[6]     Monitor");
                System.out.println("[7]     Quit To Main Menu");
                //System.out.println("[7]     Recreate");
                System.out.println("***********************************************************************");
                System.out.print("Please enter either 1 to 4: ");

                Scanner selection = new Scanner(System.in);

                switch (selection.next())
                {
                    case "1":
                        boolean IDresult = true;
                        System.out.println("New Laptop ID: ");
                        while(IDresult)
                        {
                            IDresult = database.SelectLaptop(index).setComputerID(comID.next());
                            if (IDresult)
                            {
                                System.out.println("Invalid Laptop ID! Laptop ID Can Only be 4 Numbers or Characters Long\nPlease Re-Enter Laptop ID: ");
                                wResult = false;
                            }
                            else
                            {
                                break;
                            }
                        }
                        break;

                    case "2":
                        System.out.println("New Laptop Processor: ");
                        boolean Presult = true;
                        while (Presult)
                        {
                            Presult = database.SelectLaptop(index).setProcessorSpeed(processSpeed.next());
                            if (Presult)
                            {
                                System.out.println("Invalid Price Input! Please enter Valid Price...\nPlease Enter Processor Speed: ");
                                wResult = false;
                            }
                            else
                            {
                                break;
                            }
                        }
                        break;

                    case "3":
                        System.out.println("New Laptop Ram:");
                        boolean Rresult = true;
                        while (Rresult)
                        {
                            Rresult = database.SelectLaptop(index).setRam(ram.next());
                            if (Rresult)
                            {
                                System.out.println("Invalid RAM Input! Please enter Valid Ram...\\nPlease Enter RAM: ");
                                wResult = false;
                            }
                            else
                            {
                                break;
                            }
                        }
                        break;
                    case "4":
                        System.out.println("New Hard Disk Size:");
                        while (true)
                        {
                            try
                            {
                                int iSize = Integer.parseInt(HDDsize.next());
                                Hdd = Integer.toString(iSize);
                                break;
                            }
                            catch (NumberFormatException e)
                            {
                                System.out.println("Invalid Size! Please enter Valid HDD Size...\nPlease Enter HDD Size: ");
                            }
                        }

                        System.out.println("New HDD Size\n1) GB\n2) TB");
                        while (true)
                        {
                            String sBytes = HDDbytes.next();
                            if (sBytes.equals("1"))
                            {
                                Hdd += " GB";
                                database.SelectLaptop(index).setHardDisk(Hdd);
                                break;
                            }
                            else if (sBytes.equals("2"))
                            {
                                Hdd += " TB";
                                database.SelectLaptop(index).setHardDisk(Hdd);
                                break;
                            }
                            else
                            {
                                System.out.println("Invalid Option! Please enter Valid Option...\nHDD Size:\n1) GB\n2) TB");
                            }
                        }
                        break;

                    case "5":
                        System.out.print("New Price: \n$S");
                        while (true)
                        {
                            String sPrice = price.next()+"\n";
                            try
                            {
                                database.SelectLaptop(index).setPrice(Double.parseDouble(sPrice));
                                break;
                            }
                            catch(NumberFormatException e)
                            {
                                System.out.println("Invalid Price! Please enter Valid Price...\nPlease Re-Enter Price: ");
                            }
                        }
                        break;

                    case "6":
                        int Weight;
                        Scanner weight = new Scanner(System.in);
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
                        database.SelectLaptop(index).setWeight(Weight);
                    case "7":
                        NewMenu();

                }
                EditLaptop();
            }
        }
    }
}
