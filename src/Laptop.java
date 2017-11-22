import java.util.ArrayList;

public class Laptop extends Computer{

    private String Weight;


    public String  getWeight() {
        return Weight;
    }

    public void setWeight(String  weight) {
        Weight = weight;
    }

    public Laptop(String id, String s, String r, String h, double p, String w)
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
