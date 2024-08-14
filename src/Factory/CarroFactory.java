package Factory;

public interface CarroFactory {
    Motor criarMotor();
    Roda criarRoda();
    Carroceria criarCarroceria();
}
