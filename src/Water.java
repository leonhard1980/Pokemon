public class Water extends Pokemon {
    private int ammountInLiters;
    private int waterTemperature;
    private int evaperation;
    private int wettnessAmmount;

    public Water(String name, int weight, String color, String superpower, int ammountInLiters, int waterTemperature, int evaperation, int wettnessAmmount){
        super(name, weight, color, superpower);
        this.ammountInLiters = ammountInLiters;
        this.waterTemperature = waterTemperature;
        this.evaperation = evaperation;
        this.wettnessAmmount = wettnessAmmount;
    }

    public int getAmmountInLiters() {
        return ammountInLiters;
    }

    public void setAmmountInLiters(int ammountInLiters) {
        this.ammountInLiters = ammountInLiters;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(int waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public int getEvaperation() {
        return evaperation;
    }

    public void setEvaperation(int evaperation) {
        this.evaperation = evaperation;
    }

    public int getWettnessAmmount() {
        return wettnessAmmount;
    }

    public void setWettnessAmmount(int wettnessAmmount) {
        this.wettnessAmmount = wettnessAmmount;
    }

    @Override
    public void sound(){
        System.out.println("This Pokemon makes Bubbly sound");
    }

    public void hydroPump() {
        System.out.println("I pump hydro.");
    }

}
