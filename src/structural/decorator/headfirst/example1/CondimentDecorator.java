package structural.decorator.headfirst.example1;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}