public class Fruit extends Food {

    Fruit(String name){
        super(name);
    }

    @Override
    void serveFood() {
        System.out.println("I'm serving " + this.name);
    }

    Food getFood(String foodName){
        Fruit fruit = new Fruit(foodName);
        return fruit;
    }

}
