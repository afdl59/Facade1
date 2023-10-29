public class TestFacade {

    public static void main(String[] args) {
        DomoticaFacade home = new DomoticaFacade();

        System.out.println("******* WELCOME TO YOUR DOMOTICA APPLICATION *******\n");
        home.goodMornigRoutine();

        System.out.println("\n(during the day)\n");
        home.activateCamaras();

        System.out.println("\n(12 hours later)\n");

        home.goodNightRoutine();
    }
}