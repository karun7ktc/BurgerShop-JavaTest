public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;


    public MealOrder(){
        this("REGULAR","COKE","fries");
    }


    public MealOrder(String burgerType, String drinkType, String sideType){
        this.burger = new Burger(burgerType,4.0);
        this.drink = new Item("DRINK", drinkType , 1.00);
        this.side = new Item ("SIDE", sideType ,1.50);
    }

    public double getPrice(){
        return burger.getAdjustedPrice()+ drink.getAdjustedPrice() + side.getAdjustedPrice();
    }


    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        System.out.println(getPrice());

    }

    public void addToppings(String extra1,String extra2, String extra3){
        burger.addTopping(extra1,extra2,extra3);
    }

    public void setDrinkSize(String size){
        drink.setSize(size.toUpperCase());
    }


}
