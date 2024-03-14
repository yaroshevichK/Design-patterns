package structural.decorator.book.example1;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
