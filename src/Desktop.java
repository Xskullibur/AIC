import java.util.ArrayList;

public class Desktop extends Computer {

    private String Monitor;


    public String getMonitor() {
        return Monitor;
    }

    public void setMonitor(String monitor) {
        if(monitor.equals("LCD")) {
            Monitor = monitor;
        }
        else if(monitor.equals("LED")) {
            Monitor =monitor;
        }

    }

    public Desktop(String id, String s, String r, String h, double p, String m) {
        setComputerID(id);
        setProcessorSpeed(s);
        setRam(r);
        setHarddisk(h);
        setPrice(p);
        Monitor = m;
    }

    public Desktop() {
    }

    public void DisplayInfo()
    {
        super.DisplayInfo();
        System.out.println("Monitor: " +  getMonitor());
    }

}



