package ex01_MovieFacade;

public class Movie {

    private String name = "";

    public Movie(String name) {
        this.name = name;
    }

    public void searchMovie() {
        System.out.println("Search a " + name);
    }

    public void chargeMovie() {
        System.out.println("Charge a " + name);
    }

    public void playMovie() {
        System.out.println("Play a " + name);
    }

}
