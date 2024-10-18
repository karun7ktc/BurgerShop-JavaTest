public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Burger burger = new Burger("small", 4);
//        burger.addTopping("bacon","cheese","salami");
//        burger.printItem();

        MealOrder RegularMeal = new MealOrder();
        RegularMeal.addToppings("Bacon","Cheese","mayo");
        RegularMeal.setDrinkSize("Large");
        RegularMeal.printItemizedList();

    }


}