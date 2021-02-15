package question3;

public class Computer implements Ethernet {
    private int ramSlot;
    private String videoCardname;

    public boolean cableConnected(){ return true; }

    public int getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(int ramSlot) {
        this.ramSlot = ramSlot;
    }

    public String getVideoCardname() {
        return videoCardname;
    }

    public void setVideoCardname(String videoCardname) {
        this.videoCardname = videoCardname;
    }

}
