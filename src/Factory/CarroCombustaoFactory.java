package Factory;

public class CarroCombustaoFactory implements CarroFactory {
    @Override
    public Motor criarMotor() {
        return new MotorCombustao();
    }

    @Override
    public Roda criarRoda() {
        return new RodaAco();
    }

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaSUV();
    }
}