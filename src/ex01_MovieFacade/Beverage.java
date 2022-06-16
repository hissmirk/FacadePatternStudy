package ex01_MovieFacade;

public class Beverage {

    private String name = "";

    public Beverage(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Prepare a Beverage with " + name);
    }
}
