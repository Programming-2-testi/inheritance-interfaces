package part04;

public class Main {

    /**
     * This main method and the accompanying Application and PrinterWithTimestamp
     * classes demonstrate how to use inheritance and polymorphism in Java. It also
     * demonstrates a pattern called dependency injection.
     *
     * First, read the source code and comments of the Application class and the
     * PrinterWithTimestamp class.
     *
     * Note that the Application class does not directly use the
     * PrinterWithTimestamp class, but it uses the PrintStream class, which is a
     * superclass of the that class.
     *
     * The familiar System.out object is an instance of the PrintStream class, so it
     * can be used in the Application by passing it in the constructor. However,
     * we are not limited to just using the System.out object in the Application,
     * but we can also use other PrintStream objects, such as a
     * PrinterWithTimestamp. This way we can modify the behavior of the Application
     * class without changing its code by passing in a different PrintStream object.
     * This is pattern is called dependency injection and it is a common way to make
     * the code more flexible and reusable.
     */
    public static void main(String... args) {

        /*
         * A new application object is created with the System.out object as an
         * argument. Run the code and see the output.
         */
        Application app = new Application(System.out);
        app.run();

        /*
         * After running the application, try creating an Application and passing in an
         * instance of the PrinterWithTimestamp class as an argument. Then run the
         * application again and see what happens.
         *
         * What a nice way to change the behavior of the Java class without changing its
         * code, right?
         */

        PrinterWithTimestamp printer = new PrinterWithTimestamp();
    }
}