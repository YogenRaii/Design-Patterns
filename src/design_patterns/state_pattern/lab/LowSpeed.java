package design_patterns.state_pattern.lab;

/**
 * Created by ${YogenRai} on 4/24/2016.
 */
public class LowSpeed implements FanState {
    @Override
    public void printState() {
        System.out.println(" low speed ");
    }

    @Override
    public FanState nextState() {
        return new MediumSpeed();
    }

    @Override
    public FanState previousState() {
        return new Off();
    }

}
