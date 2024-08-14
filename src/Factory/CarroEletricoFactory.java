package Factory;

public class CarroEletricoFactory implements CarroFactory {
    @Override
    public Motor criarMotor() {
        return new MotorEletrico();
    }

    @Override
    public Roda criarRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaSedan();
    }
}

