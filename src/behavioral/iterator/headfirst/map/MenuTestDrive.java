package behavioral.iterator.headfirst.map;

import behavioral.iterator.headfirst.map.menu.CafeMenu;
import behavioral.iterator.headfirst.map.menu.DinerMenu;
import behavioral.iterator.headfirst.map.menu.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}