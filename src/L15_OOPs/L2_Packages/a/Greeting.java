package L15_OOPs.L2_Packages.a;

/*
 * Packages are containers for classes.
 * They help:
 * 1) Organize large projects
 * 2) Avoid class-name conflicts (e.g., multiple List classes)
 *
 * Package hierarchy MUST match directory structure.
 * Example:
 *   package java.awt.image;
 *   → directories: java/awt/image/
 *
 * Java finds packages using:
 * 1) Current working directory (default)
 * 2) CLASSPATH environment variable
 * 3) -classpath option with javac/java
 */

// Static import allows calling static methods directly (without class name)
// Only public static members can be imported
import static L15_OOPs.L2_Packages.b.Message.message;

public class Greeting {

    public static void main(String[] args) {
        System.out.println("Hello world");

        // Calling static method from another package
        message();
    }
}
