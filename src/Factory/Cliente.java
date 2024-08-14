package Factory;

public class Cliente {
    private Motor motor;
    private Roda roda;
    private Carroceria carroceria;

    public Cliente(CarroFactory factory) {
        this.motor = factory.criarMotor();
        this.roda = factory.criarRoda();
        this.carroceria = factory.criarCarroceria();
    }

    public void montarCarro() {
        motor.montar();
        roda.montar();
        carroceria.montar();
    }

    public static void main(String[] args) {
        CarroFactory carroEletricoFactory = new CarroEletricoFactory();
        Cliente clienteEletrico = new Cliente(carroEletricoFactory);
        clienteEletrico.montarCarro();

        CarroFactory carroCombustaoFactory = new CarroCombustaoFactory();
        Cliente clienteCombustao = new Cliente(carroCombustaoFactory);
        clienteCombustao.montarCarro();
    }
}
