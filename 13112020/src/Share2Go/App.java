package Share2Go;

public class App {
    //Singleton Pattern
    private static App instance = null;
    private App() {
    }
    public static App getFacebook() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }

    public void signUp(){

    }

    public void newRent(){

    }

    public void getRentHistory(User user){

    }

    public void allVehicleState(){
        /*TODO: show isRented, position*/
    }

    public void showDrivingTimetAvailable(){

    }
}
