public class Laptop extends Computer{

    protected int Weight;


    public int  getWeight() {
        return Weight;
    }

    public void setWeight(int  weight)
    {
        Weight = weight;
    }

    public Laptop(String id, String s, String r, String h, double p)
    {
        setComputerID(id);
        setProcessorSpeed(s);
        setRam(r);
        setHardDisk(h);
        setPrice(p);
    }

    public Laptop() {
    }

    public void DisplayInfo()
    {
        super.DisplayInfo();
        System.out.println("Weight: " + getWeight());
    }

}
