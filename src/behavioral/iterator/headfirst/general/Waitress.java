package behavioral.iterator.headfirst.general;

import behavioral.iterator.headfirst.general.iterator.Iterator;
import behavioral.iterator.headfirst.general.menu.DinerMenu;
import behavioral.iterator.headfirst.general.menu.MenuItem;
import behavioral.iterator.headfirst.general.menu.PancakeHouseMenu;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + "-- ");
            System.out.println(menuItem.getDescription());
        }
    }
// другие методы
}