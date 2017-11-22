import java.util.ArrayList;

public class Database
{
    private ArrayList desktop = new ArrayList<Desktop>();
    private ArrayList laptop = new ArrayList<Laptop>();

    public ArrayList getDesktop() {
        return desktop;
    }

    public ArrayList getLaptop() {
        return laptop;
    }

    public void AddDesktop(Desktop d)
    {
        desktop.add(d);
    }

    public void AddLaptops(Laptop l)
    {
        laptop.add(l);
    }

    public void DisplayAll()
    {
        
    }
}
