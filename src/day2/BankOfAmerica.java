package day2;

public class BankOfAmerica {
    public static void main(String[] args) {

        Menu checking = new Menu();
        checking.menuId = 1;
        checking.menuName = "Checking";
        checking.parentMenuId = 0;
        checking.isLeaf = false;

        Menu onlineBanking = new Menu();
        onlineBanking.menuId = 2;
        onlineBanking.menuName = "Online Banking";
        onlineBanking.parentMenuId = 1;
        onlineBanking.isLeaf = false;
        onlineBanking.slug = "mobile-and-online-banking-features";

        Menu mobileBanking = new Menu();
        mobileBanking.menuId = 3;
        mobileBanking.menuName = "Mobile Banking";
        mobileBanking.parentMenuId = 1;
        mobileBanking.isLeaf = false;
        mobileBanking.slug = "mobile-and-online-banking-features";



    }
}
