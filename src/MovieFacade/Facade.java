package MovieFacade;

public class Facade {

    private String beverageName = "";
    private String movieName = "";

    public Facade(String beverage, String movie) {
        this.beverageName = beverage;
        this.movieName = movie;
    }

    public void viewMovie() {
        Beverage beverage = new Beverage(beverageName);
        RemoteControl remoteControl = new RemoteControl();
        Movie movie = new Movie(movieName);

        beverage.prepare();
        remoteControl.turnOn();
        movie.searchMovie();
        movie.chargeMovie();
        movie.playMovie();
    }

}
