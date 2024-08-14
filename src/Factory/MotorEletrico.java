package Factory;

// Motor
public class MotorEletrico implements Motor {
    @Override
    public void montar() {
        System.out.println("Motor elétrico montado.");
    }
}

