public class Laptop extends Computer{

    private int Weight;


    public int  getWeight() {
        return Weight;
    }

    public void setWeight(int  weight) {
        Weight = weight;
    }

    public Laptop(String id, String s, String r, String h, double p, int w)
    {
        setComputerID(id);
        setProcessorSpeed(s);
        setRam(r);
        setHarddisk(h);
        setPrice(p);
        Weight = w;
    }

    public Laptop() {
    }

    public void DisplayInfo()
    {
        super.DisplayInfo();
        System.out.println("Weight: " + getWeight());
    }

}
