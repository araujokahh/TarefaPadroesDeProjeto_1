package Factory;

public class MotorCombustao implements Motor {
    @Override
    public void montar() {
        System.out.println("Motor a combustão montado.");
    }
}