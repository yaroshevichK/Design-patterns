package behavioral.iterator.headfirst.integration;

import behavioral.iterator.headfirst.integration.menu.DinerMenu;
import behavioral.iterator.headfirst.integration.menu.Menu;
import behavioral.iterator.headfirst.integration.menu.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}