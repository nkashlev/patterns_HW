package patterns_HW.logg;

import java.time.LocalDate;

public class Logger {
    private static Logger logger;

    private Logger() {
    }

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void classLogg(Object obj, String info) {
        System.out.println("Log info: " + LocalDate.now() + " " + obj.getClass().getName() + " " + info);
    }
}
