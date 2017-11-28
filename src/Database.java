import java.util.ArrayList;

public class Database extends Computer
{
    private ArrayList<Desktop> desktop = new ArrayList<>();
    private ArrayList<Laptop> laptop = new ArrayList<>();

    public void addDesktop(Desktop d)
    {
        desktop.add(d);
    }

    public void addLaptop (Laptop l)
    {
        laptop.add(l);
    }

    public void removeDesktop(int Di)
    {
        desktop.remove(Di);
    }

    public void removeLaptop(int Li)
    {
        laptop.remove(Li);
    }

    public int DesktopIndexOf(Desktop DI)
    {
        return desktop.indexOf(DI);
    }

    public int LaptopIndexOf(Laptop LI)
    {
        return laptop.indexOf(LI);
    }

    public int DesktopSize() {return desktop.size();}

    public int LaptopSize() {return laptop.size();}

    public ArrayList<Desktop> getDesktop() { return desktop; }

    public ArrayList<Laptop> getLaptop() { return laptop; }

    public Desktop SelectDesktop(int index)
    {
        return desktop.get(index);
    }

    public Laptop SelectLaptop(int index)
    {
        return laptop.get(index);
    }
}
