public class Electric  extends Pokemon {

    private int ampere;
    private String shockwave;
    private String conduction;
    private String powersource;

    public Electric(String name, int weight, String color, String superpower, int ampere, String shockwave, String conduction, String powersource) {
        super(name, weight, color, superpower);
        this.ampere = ampere;
        this.shockwave = shockwave;
        this.conduction = conduction;
        this.powersource = powersource;
    }

    public int getAmpere() {
        return ampere;
    }

    public void setAmpere(int ampere) {
        this.ampere = ampere;
    }

    public String getShockwave() {
        return shockwave;
    }

    public void setShockwave(String shockwave) {
        this.shockwave = shockwave;
    }

    public String getConduction() {
        return conduction;
    }

    public void setConduction(String conduction) {
        this.conduction = conduction;
    }

    public String getPowersource() {
        return powersource;
    }

    public void setPowersource(String powersource) {
        this.powersource = powersource;
    }

    public void sound(){
        System.out.println("This Pokemon makes ELECTRIC sound");
    }

    public void voltTackle() {
        System.out.println("I tackle volts.");
    }



}
