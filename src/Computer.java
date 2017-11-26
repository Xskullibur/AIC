public class Computer
{
    private String ComputerID;
    private String ProcessorSpeed;
    private String Ram;
    private String RamBytes;
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
        int iRam;
        try
        {
            iRam = Integer.parseInt(ram);
            Ram = ram;
            if (Integer.parseInt(Ram) <= 64)
            {
                RamBytes = " GB";
            }
            else if (Integer.parseInt(Ram) > 64 && Integer.parseInt(Ram) < 1024)
            {
                RamBytes = " MB";
            }
            else if (Integer.parseInt(Ram) >= 1024)
            {
                Ram = Integer.toString(Integer.parseInt(Ram)/1024);
                RamBytes = " GB";
            }
        }
        catch (NumberFormatException e)
        {
            return true;
        }
        return false;
    }

    public void setHardDisk(String hardDisk) { HardDisk = hardDisk; }

    public void setPrice(double price) {
        Price = price;
    }

    //Getter
    public String getRam() {
        return Ram;
    }

    public double getPrice() {
        return Price;
    }

    public String getComputerID() {
        return ComputerID;
    }

    public String getProcessorSpeed() {
        return ProcessorSpeed;
    }

    public String getHardDisk() { return HardDisk; }

    //Display Info
    public void DisplayInfo()
    {
        System.out.println("Computer ID: " + getComputerID());
        System.out.println("ProcessorSpeed: " + getProcessorSpeed() + " GHz");
        System.out.println("Ram: " + getRam() + RamBytes);
        System.out.println("Hard Disk: " + getHardDisk());
        System.out.println("Price: $" + getPrice());
    }
}
