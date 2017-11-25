public class Computer {

    private String Name;
    private String ComputerID;
    private String ProcessorSpeed;
    private String Ram;
    private String HardDisk;
    private double Price;

    //Setter 
    public boolean setComputerID(String computerID)
    {
        if (!computerID.matches("^[A-Za-z0-9]{1,4}$"))
        {
            return true;
        }
        else
        {
            ComputerID = computerID;
            return false;
        }
    }

    public boolean setProcessorSpeed(String processorSpeed)
    {
        int iSpeed;
        try
        {
            iSpeed = Integer.parseInt(processorSpeed);
            ProcessorSpeed = processorSpeed;
        }
        catch (NumberFormatException e)
        {
            return true;
        }
        return false;
    }

    public boolean setRam(String ram)
    {
        try
        {
            int iRam;
            iRam = Integer.parseInt(ram);

            if(iRam <= 64)
            {
                Ram = ram;
            }
            else if(iRam > 64 && iRam <1024)
            {
                Ram = ram;
            } else if (iRam >= 1024)
            {
                Ram = Integer.toString(iRam / 1024);
            }
        }
        catch (NumberFormatException e)
        {
            return true;
        }
        return false;
    }

    public void setHarddisk(String harddisk) {
        HardDisk = harddisk;
    }

    public void setPrice(double price) {
        Price = price;
    }

    //Getter
    public String getRam() {
        return Ram;
    }

    public String getHarddisk() { return HardDisk; }

    public double getPrice() {
        return Price;
    }

    public String getComputerID() {
        return ComputerID;
    }

    public String getProcessorSpeed() {
        return ProcessorSpeed;
    }

    private String RamBits()
    {
        if(Integer.parseInt(Ram) <= 64)
        {
            return " GB";
        }
        else if(Integer.parseInt(Ram) > 64 && Integer.parseInt(getRam()) <1024)
        {
            return " MB";
        } else if (Integer.parseInt(Ram) >= 1024)
        {
            return " GB";
        }
        return "";
    }

    //Display Info
    public void DisplayInfo()
    {
        System.out.println("Computer ID: " + getComputerID());
        System.out.println("ProcessorSpeed: " + getProcessorSpeed() + " GHz");
        System.out.println("Ram: " + getRam() + RamBits());
        System.out.println("Hard Disk: " + getHarddisk());
        System.out.println("Price: " + getPrice());
    }
}
