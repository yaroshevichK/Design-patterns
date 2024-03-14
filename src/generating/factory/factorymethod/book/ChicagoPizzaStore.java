package generating.factory.factorymethod.book;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}
