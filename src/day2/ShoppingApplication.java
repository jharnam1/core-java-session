package day2;

public class ShoppingApplication {

    public static void main(String[] args) {

        Menu womenFashion = new Menu();
        womenFashion.menuId = 1;
        womenFashion.menuName = "Women's Fashion";
        womenFashion.parentMenuId = 0;
        womenFashion.isLeaf = false;

        Menu womenClothing = new Menu();
        womenClothing.menuId = 3;
        womenClothing.menuName = "Clothing";
        womenClothing.parentMenuId = 1;
        womenClothing.isLeaf = false;
        womenClothing.slug = "womens-clothing";

        Menu topAndTShirt = new Menu();
        topAndTShirt.menuId = 4;
        topAndTShirt.menuName = "Tops & T-shirts";
        topAndTShirt.parentMenuId = 3;
        topAndTShirt.isLeaf = true;
        topAndTShirt.slug = "tops";

        Menu menFashion = new Menu();
        menFashion.menuId = 2;
        menFashion.menuName = "Men's Fashion";
        menFashion.parentMenuId = 0;
        menFashion.isLeaf = false;

        Menu electronicDevice = new Menu();
        electronicDevice.menuId = 6;
        electronicDevice.menuName = "Electronic Devices";
        electronicDevice.parentMenuId = 5;
        electronicDevice.isLeaf = false;

        Menu smartphone = new Menu();
        smartphone.menuId = 7;
        smartphone.menuName = "Smartphones";
        smartphone.parentMenuId = 6;
        smartphone.isLeaf = false;
        womenClothing.slug = "smartphones";

        Menu samsungMobile = new Menu();
        samsungMobile.menuId = 8;
        samsungMobile.menuName = "Samsung Mobiles";
        samsungMobile.parentMenuId = 7;
        samsungMobile.isLeaf = false;
        samsungMobile.slug = "samsung-brand";

        Menu featurePhone = new Menu();
        featurePhone.menuId = 9;
        featurePhone.menuName = "Feature Phones";
        featurePhone.parentMenuId = 6;
        featurePhone.isLeaf = true;
        featurePhone.slug = "featurephones";


        String menuName = menFashion.menuName;
        System.out.println(menuName);

    }
}

