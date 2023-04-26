package day2;

public class Menu {
    //UUID

    /*
        Menu Id (long)
        Menu Name (String)
        Parent Menu Id (long)
        Is Leaf (boolean)
        Slug (String)






    Women Fashion

    Menu Id - 1 (long)
    Menu Name - Women Fashion (String)
    Parent Menu Id - 0 (long)
    Is Leaf - false (boolean)
    Slug - women-fashion (String)





   Men's Fashion

    Menu Id - 2
    Menu Name - Men's Fashion
    Parent Menu Id - 0
     Is Leaf - false
     slug - men-fashion



   Women Fashion -> Clothing

    Menu Id - 3
    Menu Name - Clothing
    Parent Menu Id - 1
     Is Leaf - false
     slug - women-fashion-clothing




    Men's Fashion -> Clothing

    Menu Id - 4
    Menu Name - Clothing
    Parent Menu Id - 2
    Is Leaf - false


     Women Fashion -> Clothing -> Tops and T-shirt's

    Menu Id - 5
    Menu Name - Tops and T-shirt's
    Parent Menu Id - 3
    Is Leaf - true
 */

    long menuId;
    String menuName;
    long parentMenuId;
    boolean isLeaf;
    String slug;

}