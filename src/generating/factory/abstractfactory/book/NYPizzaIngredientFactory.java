package generating.factory.abstractfactory.book;

import generating.factory.abstractfactory.book.ingredients.Cheese;
import generating.factory.abstractfactory.book.ingredients.Clams;
import generating.factory.abstractfactory.book.ingredients.Dough;
import generating.factory.abstractfactory.book.ingredients.FreshClams;
import generating.factory.abstractfactory.book.ingredients.Garlic;
import generating.factory.abstractfactory.book.ingredients.MarinaraSauce;
import generating.factory.abstractfactory.book.ingredients.Mushroom;
import generating.factory.abstractfactory.book.ingredients.Onion;
import generating.factory.abstractfactory.book.ingredients.Pepperoni;
import generating.factory.abstractfactory.book.ingredients.RedPepper;
import generating.factory.abstractfactory.book.ingredients.ReggianoCheese;
import generating.factory.abstractfactory.book.ingredients.Sauce;
import generating.factory.abstractfactory.book.ingredients.SlicedPepperoni;
import generating.factory.abstractfactory.book.ingredients.ThinCrustDough;
import generating.factory.abstractfactory.book.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}