public class DomoticaFacade {
    private Lighting lights;
    private ClimateControl temperature;
    private SecurityService cameras;
    private MusicSystem stereo;

    public DomoticaFacade() {
        this.lights = new Lighting();
        this.temperature = new ClimateControl();
        this.cameras = new SecurityService();
        this.stereo = new MusicSystem();
    }

    public void turnOnLigths() {
        lights.onRoom1();
        lights.onRoom2();
        lights.onOutside();
    }

    public void turnOffLigths() {
        lights.offRoom1();
        lights.offRoom2();
        lights.offOutside();
    }

    public void regulateTemperature() {
        temperature.increase();
        temperature.decrease();
    }

    public void activateCamaras() {
        cameras.activate();
    }

    public void deactivateCamaras() {
        cameras.deactivate();
    }

    public void goodMornigRoutine() {
        System.out.println("GOOD MORNIG!!!! Let´s start!");
        turnOnLigths();
        stereo.playMusic();
        temperature.decrease();;
    }

    public void goodNightRoutine() {
        System.out.println("What a great day, it´s time to rest!");
        turnOffLigths();
        stereo.stopMusic();
        temperature.increase();
    }
}