package generating.factory.simplefactory.book;

public class Demo {
    public static void main(String[] args) {
        SimplePizzaFactory factory=new SimplePizzaFactory();
        PizzaStore pizzaStore=new PizzaStore(factory);
        
        Pizza cheese = pizzaStore.orderPizza("cheese");
        Pizza pepperoni = pizzaStore.orderPizza("pepperoni");
        Pizza clam = pizzaStore.orderPizza("clam");
        Pizza veggie = pizzaStore.orderPizza("veggie");


        System.out.println(cheese.getClass().getSimpleName());
        System.out.println(pepperoni.getClass().getSimpleName());
        System.out.println(clam.getClass().getSimpleName());
        System.out.println(veggie.getClass().getSimpleName());
    }
}
