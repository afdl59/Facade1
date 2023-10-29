public class Lighting {

    private Light lightsRoom1;
    private Light lightsRoom2;
    private Light lightsOutside;


    public Lighting() {
        this.lightsRoom1 = new Light();
        this.lightsRoom2 = new Light();
        this.lightsOutside = new Light();
    }

    public void onRoom1() {
        lightsRoom1.on();
    }

    public void offRoom1() {
        lightsRoom1.off();
    }

    public void onRoom2() {
        lightsRoom2.on();
    }

    public void offRoom2() {
        lightsRoom2.off();
    }

    public void onOutside() {
        lightsOutside.on();
    }

    public void offOutside() {
        lightsOutside.off();
    }

}