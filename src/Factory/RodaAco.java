package Factory;

public class RodaAco implements Roda {
    @Override
    public void montar() {
        System.out.println("Roda de aço montada.");
    }
}