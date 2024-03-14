package generating.factory.abstractfactory.headfirst;

import generating.factory.abstractfactory.headfirst.ingredients.BlackOlives;
import generating.factory.abstractfactory.headfirst.ingredients.Cheese;
import generating.factory.abstractfactory.headfirst.ingredients.Clams;
import generating.factory.abstractfactory.headfirst.ingredients.Dough;
import generating.factory.abstractfactory.headfirst.ingredients.Eggplant;
import generating.factory.abstractfactory.headfirst.ingredients.FrozenClams;
import generating.factory.abstractfactory.headfirst.ingredients.MozzarellaCheese;
import generating.factory.abstractfactory.headfirst.ingredients.Pepperoni;
import generating.factory.abstractfactory.headfirst.ingredients.PlumTomatoSauce;
import generating.factory.abstractfactory.headfirst.ingredients.Sauce;
import generating.factory.abstractfactory.headfirst.ingredients.SlicedPepperoni;
import generating.factory.abstractfactory.headfirst.ingredients.Spinach;
import generating.factory.abstractfactory.headfirst.ingredients.ThickCrustDough;
import generating.factory.abstractfactory.headfirst.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies[] veggies = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}