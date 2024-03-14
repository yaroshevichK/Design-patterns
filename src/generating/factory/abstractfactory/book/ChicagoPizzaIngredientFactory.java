package generating.factory.abstractfactory.book;

import generating.factory.abstractfactory.book.ingredients.BlackOlives;
import generating.factory.abstractfactory.book.ingredients.Cheese;
import generating.factory.abstractfactory.book.ingredients.Clams;
import generating.factory.abstractfactory.book.ingredients.Dough;
import generating.factory.abstractfactory.book.ingredients.Eggplant;
import generating.factory.abstractfactory.book.ingredients.FrozenClams;
import generating.factory.abstractfactory.book.ingredients.MozzarellaCheese;
import generating.factory.abstractfactory.book.ingredients.Pepperoni;
import generating.factory.abstractfactory.book.ingredients.PlumTomatoSauce;
import generating.factory.abstractfactory.book.ingredients.Sauce;
import generating.factory.abstractfactory.book.ingredients.SlicedPepperoni;
import generating.factory.abstractfactory.book.ingredients.Spinach;
import generating.factory.abstractfactory.book.ingredients.ThickCrustDough;
import generating.factory.abstractfactory.book.ingredients.Veggies;

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