// one line comment
/*
 * publix -> public means everyone can see it in the scope of work
 * main class must be public for the jvm to see it
 * class -> defines a class
 * HelloWorld -> name of your class
 */
public class HelloWorld {
    // The main method -> this is where the magic starts
    public static void main(String[] args) {
        /*
         * private -> no other file can access this method
         * method -> astract command to run an algorithm can do or return data
         * static -> Helloworld.main() how the method is called
         * void -> empty as in doesnt return anything
         * main(String[] args) -> when running the program you can give the function arguments
         *  java HelloWorld.java ['words','data','and','stuff']
         */
        System.out.println("Hello World");
        /*
         * system -> system module or class
         * out -> subclass of system
         * printIn() -> method to print with a \n at the end of the line
         */
        System.out.print("Hello world");
        System.out.printf("%2.2f%n",12345.6789);
        System.out.println("bob"+"the"+"builder");
        System.out.println(1+2+3);
    }
}
