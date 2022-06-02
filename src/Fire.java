public class Fire  extends Pokemon {

    private int heat;
    private String light;
    private String temperature;
    private String explosiveness;

    public Fire(String name, int weight, String color, String superpower, int heat, String light, String temperature, String explosiveness) {
        super(name, weight, color, superpower);
        this.heat = heat;
        this.light = light;
        this.temperature = temperature;
        this.explosiveness = explosiveness;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getExplosiveness() {
        return explosiveness;
    }

    public void setExplosiveness(String explosiveness) {
        this.explosiveness = explosiveness;
    }

    public void sound(){
        System.out.println("This Pokemon makes a firy sound");
    }

    public void pyrroBall() {
        System.out.println("Let's play ball!");
    }

}