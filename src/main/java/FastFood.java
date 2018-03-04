public class FastFood extends Food {

    FastFood(String name){
        super(name);
    }

    @Override
    void serveFood() {
        System.out.println("I'm serving " + this.name);
    }

    Food getFood(String foodName){
        FastFood fastFood = new FastFood(foodName);
        return fastFood;
    }

}
