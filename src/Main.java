
public class Main {

    public static void main(String[] args) {

        Log log = Log.getInstance();
        log.logger("Application started.");

        User user = new User("God of Thunder");

        CalorieTracker calorieTracker = new CalorieTracker(user);
        calorieTracker.login();
        calorieTracker.insertCalories(FoodType.MANGO, 60);
        calorieTracker.insertCalories(FoodType.APPLE, 45);

        log.logger("Application closed.");
    }
}
