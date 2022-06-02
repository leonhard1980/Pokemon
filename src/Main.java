public class Main {
    public static void main(String[] args) {
        /*
            Deze opdracht is gemaakt door LdP en bestaat uit:
            1 Main class met 4 geinstantieerde Pokemon-objecten vanuit de subclass en één generiek object.
            De Pokemon Superclass heeft 4 variabelen en 2 methoden, waarvan één overschreden wordt door alle subclasses.
            De subclasses hebben vier unieke variabelen en 2 methoden, die beiden worden aangeroepen in de Main-class.*/


        Pokemon water = new Water ("Water", 34, "blue", "slijmen", 34, 23, 56, 51);
        Pokemon grass = new Grass ("Grass", 16, "green", "smoken", 88, "none", "natural", "only when the sun is out");
        Pokemon electric = new Electric("Electric", 19, "grey", "prikkelen", 34, "heavy", "strong", "buddhism");
        Pokemon fire = new Fire("Fire", 12, "red", "burnen", 23, "sure", "very hot", "always!");
        Pokemon generic = new Pokemon("regular joe", 90, "grey", "workslave");

        water.sound();
        fire.sound();
        electric.sound();
        grass.sound();
        generic.sound();
        generic.food();
        water.food();

        System.out.println();
        System.out.println("En nu de methodes van de sublassen");

        ((Electric)electric).voltTackle();
        ((Water)water).hydroPump();
        ((Fire)fire).pyrroBall();
        ((Grass)grass).leaveBlade();







    }
}
