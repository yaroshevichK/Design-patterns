package generating.factory.abstractfactory.book;

import generating.factory.abstractfactory.book.ingredients.Cheese;
import generating.factory.abstractfactory.book.ingredients.Clams;
import generating.factory.abstractfactory.book.ingredients.Dough;
import generating.factory.abstractfactory.book.ingredients.Pepperoni;
import generating.factory.abstractfactory.book.ingredients.Sauce;
import generating.factory.abstractfactory.book.ingredients.Veggies;

public interface PizzaIngredientFactory {
 
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
 
}