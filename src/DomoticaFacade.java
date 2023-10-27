public class DomoticaFacade {
    private Light light;
    private Temperature temperature;
    private Camera camera;

    public DomoticaFacade(Light light, Temperature temperature, Camera camera) {
        this.light = light;
        this.temperature = temperature;
        this.camera = camera;
    }

    public void encenderLuces() {
        light.on();
    }

    public void apagarLuces() {
        light.off();
    }

    public void regularTemperatura() {
        temperature.increase();
        temperature.decrease();
    }

    public void activarCamaras() {
        camera.activate();
    }

    public void desactivarCamaras() {
        camera.deactivate();
    }
}