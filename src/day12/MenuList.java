package day12;

import java.util.ArrayList;

public class MenuList {

    public static void main(String[] args) {

        ArrayList<Menu> menuList = new ArrayList<>();

        menuList.add(new Menu(1,"Women Fashion", 0, false, "women-fashion"));
        menuList.add(new Menu(2,"Men's Fashion",0,false,"men-fashion"));
        menuList.add(new Menu(3,"Clothing",1,false,"women-fashion-clothing"));

        System.out.println(menuList);

        menuList.remove(new Menu(2,"Men's Fashion",0,false,"men-fashion"));
        System.out.println(menuList);

        menuList.set(1, new Menu(4, "Utensils", 4, true, "home-utensils"));
        System.out.println(menuList);


    }

}
