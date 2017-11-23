public class Computer {

    private String Name;
    private String ComputerID;
    private String ProcessorSpeed;
    private String Ram;
    private String HardDisk;
    private double Price;

    //Setter 
    public void setComputerID(String computerID) {
        ComputerID = computerID;
    }

    public void setProcessorSpeed(String processorSpeed) {
        ProcessorSpeed = processorSpeed;
    }

    public void setRam(String ram) {
        Ram = ram;
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
        System.out.println("ProcessorSpeed: " +getProcessorSpeed());
        System.out.println("Ram: " + getRam() );
        System.out.println("Hard Disk: " + getHarddisk());
        System.out.println("Price: " + getPrice());
    }
}
