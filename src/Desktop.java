public class Desktop extends Computer {

    private String Monitor;

    public String getMonitor() {
        return Monitor;
    }

    public void setMonitor(String monitor)
    {
        Monitor = monitor;
    }

    public Desktop(String id, String s, String r, String h, double p) {
        setComputerID(id);
        setProcessorSpeed(s);
        setRam(r);
        setHardDisk(h);
        setPrice(p);
    }

    public Desktop() {
    }

    public void DisplayInfo()
    {
        super.DisplayInfo();
        System.out.println("Monitor: " +  getMonitor());
    }

}



