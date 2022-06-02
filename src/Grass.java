public class Grass  extends Pokemon {

    private int strenght;
    private String adictiveness;
    private String grow;
    private String photosynthesis;

    public Grass(String name, int weight, String color, String superpower, int strenght, String adictiveness, String grow, String photosynthesis) {
        super(name, weight, color, superpower);
        this.strenght = strenght;
        this.adictiveness = adictiveness;
        this.grow = grow;
        this.photosynthesis = photosynthesis;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public String getAdictiveness() {
        return adictiveness;
    }

    public void setAdictiveness(String adictiveness) {
        this.adictiveness = adictiveness;
    }

    public String getGrow() {
        return grow;
    }

    public void setGrow(String grow) {
        this.grow = grow;
    }

    public String getPhotosynthesis() {
        return photosynthesis;
    }

    public void setPhotosynthesis(String photosynthesis) {
        this.photosynthesis = photosynthesis;
    }

    public void sound(){
        System.out.println("This Pokemon makes an airy sound");
    }

    public void leaveBlade() {
        System.out.println("I am a leaveblade");
    }
}
