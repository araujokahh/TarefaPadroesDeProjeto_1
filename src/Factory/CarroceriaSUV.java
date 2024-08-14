package Factory;

public class CarroceriaSUV implements Carroceria {
    @Override
    public void montar() {
        System.out.println("Carroceria SUV montada.");
    }
}