public abstract class Food {

    String name;

    Food(){

    }

    Food(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    abstract void serveFood();


}
