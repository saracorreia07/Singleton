
public class CalorieTracker {

    private User user;

    public CalorieTracker(User user){
        this.user = user;
    }

    public void login(){
        //do login
        //{...}

        Log log = Log.getInstance();
        log.logger("User <" + this.user.getUserName() + "> logged in.");
    }

    public void insertCalories(FoodType foodType, int calories){

        Log log = Log.getInstance();
        log.logger("<" + this.user.getUserName() +
                    "> ingested a whole: " + foodType + ". Number of calories: " +
                    calories + ".");
    }
}
