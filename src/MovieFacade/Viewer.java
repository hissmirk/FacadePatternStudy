package MovieFacade;

public class Viewer {

    public void view() {
        Facade facade = new Facade("Coke", "Avengers");
        facade.viewMovie();
    }

    public static void main(String[] args) {
//        Viewer viewer = new Viewer();
//        viewer.view();
        new Viewer().view();
    }

}
