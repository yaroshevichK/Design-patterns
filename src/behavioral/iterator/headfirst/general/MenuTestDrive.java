package behavioral.iterator.headfirst.general;

import behavioral.iterator.headfirst.general.menu.DinerMenu;
import behavioral.iterator.headfirst.general.menu.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}