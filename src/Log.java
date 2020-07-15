import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Log {

    private final String filename = "log.txt";
    private static Log log = new Log();

    private PrintWriter writer;

    private Log() {
        //System.out.println("im alive");
        try {
            FileWriter fw = new FileWriter(this.filename);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Log getInstance() {
        return log;
    }

    public void logger(String log) {
        this.writer.println("Log: " + log);
    }

}
