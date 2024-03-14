package generating.factory.abstractfactory.headfirst;

import generating.factory.abstractfactory.headfirst.ingredients.Cheese;
import generating.factory.abstractfactory.headfirst.ingredients.Clams;
import generating.factory.abstractfactory.headfirst.ingredients.Dough;
import generating.factory.abstractfactory.headfirst.ingredients.Pepperoni;
import generating.factory.abstractfactory.headfirst.ingredients.Sauce;
import generating.factory.abstractfactory.headfirst.ingredients.Veggies;

public interface PizzaIngredientFactory {
 
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
 
}