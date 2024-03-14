package generating.factory.abstractfactory.headfirst;

import generating.factory.abstractfactory.headfirst.ingredients.Cheese;
import generating.factory.abstractfactory.headfirst.ingredients.Clams;
import generating.factory.abstractfactory.headfirst.ingredients.Dough;
import generating.factory.abstractfactory.headfirst.ingredients.FreshClams;
import generating.factory.abstractfactory.headfirst.ingredients.Garlic;
import generating.factory.abstractfactory.headfirst.ingredients.MarinaraSauce;
import generating.factory.abstractfactory.headfirst.ingredients.Mushroom;
import generating.factory.abstractfactory.headfirst.ingredients.Onion;
import generating.factory.abstractfactory.headfirst.ingredients.Pepperoni;
import generating.factory.abstractfactory.headfirst.ingredients.RedPepper;
import generating.factory.abstractfactory.headfirst.ingredients.ReggianoCheese;
import generating.factory.abstractfactory.headfirst.ingredients.Sauce;
import generating.factory.abstractfactory.headfirst.ingredients.SlicedPepperoni;
import generating.factory.abstractfactory.headfirst.ingredients.ThinCrustDough;
import generating.factory.abstractfactory.headfirst.ingredients.Veggies;

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