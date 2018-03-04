public class FoodFactory extends Food {

    FoodFactory(){

    }

    @Override
    void serveFood() {

    }


    Food getFood(String foodName) {
        Food foodToReturn = null;
        if (foodName.equals("FastFood")){
            FastFood fastFood = new FastFood(foodName);
            foodToReturn = fastFood;
        } else if (foodName.equals("Fruit")){
            Fruit fruit = new Fruit(foodName);
            foodToReturn = fruit;
        }
        return foodToReturn;
    }


}
//    public static User createUser(String userName) {
//        User user = new User(userName, UserWarehouse.getWarehouseSize());
//        UserWarehouse.addUserToWarehouse(user);
//
//        return user;
//    }