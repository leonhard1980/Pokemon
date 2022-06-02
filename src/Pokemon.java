public class Pokemon {
    private String name;
    private int weight;
    private String color;
    private String superpower;

    public Pokemon(String name, int weight, String color, String superpower) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.superpower = superpower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public void food(){
        System.out.println("Let's eat");
    }

    public void sound(){
        System.out.println("This Pokemon makes sound");
    }


}
