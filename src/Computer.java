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
        int iID;
        while (true)
        {
            try
            {
                iID = Integer.parseInt(computerID);
                break;
            }
            catch (NumberFormatException e)
            {
                return true;
            }
        }
        ComputerID = "d" + computerID;
        return false;
    }

    public boolean setProcessorSpeed(String processorSpeed)
    {
        int iSpeed;
        while(true)
        {
            try
            {
                iSpeed = Integer.parseInt(processorSpeed);
                ProcessorSpeed = processorSpeed;
                break;
            }
            catch (NumberFormatException e)
            {
                return true;
            }
        }
        return false;
    }

    public boolean setRam(String ram)
    {
        while(true)
        {
            try
            {
                int iRam;
                iRam = Integer.parseInt(ram);

                if(iRam <= 64)
                {
                    Ram = iRam + " GB";
                }
                else if(iRam > 64 && iRam <1024)
                {
                    Ram = iRam + " MB";
                } else if (iRam >= 1024)
                {
                    Ram = Integer.toString(iRam / 1024) + " GB";
                }
                break;
            }
            catch (NumberFormatException e)
            {
                return true;
            }
        }
        return false;
    }

    public void setHarddisk(String harddisk) {
        HardDisk = harddisk;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setName(String name) { Name = name; }

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

    public String getName() { return Name; }

    //Display Info
    public void DisplayInfo()
    {
        System.out.println("Computer ID: " + getComputerID());
        System.out.println("ProcessorSpeed: " +getProcessorSpeed() + " GHz");
        System.out.println("Ram: " + getRam() );
        System.out.println("Hard Disk: " + getHarddisk());
        System.out.println("Price: " + getPrice());
    }
}
