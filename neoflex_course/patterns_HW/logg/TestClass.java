package patterns_HW.logg;

public class TestClass {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.classLogg(TestClass.class, "some info");
    }
}
