package Factory;

public class CarroceriaSedan implements Carroceria {
    @Override
    public void montar() {
        System.out.println("Carroceria sedan montada.");
    }
}