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
        lights.on();
    }

    public void turnOffLigths() {
        lights.off();
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
        turnOnLigths();
        stereo.playMusic();
        temperature.decrease();;
    }

    public void goodNightRoutine() {
        turnOffLigths();
        stereo.stopMusic();
        temperature.increase();
    }
}