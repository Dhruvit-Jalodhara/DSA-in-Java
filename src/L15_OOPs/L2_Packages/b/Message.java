package L15_OOPs.L2_Packages.b;

/*
 * Only public members are accessible outside the package.
 * Since message() is public and static, it can be:
 *  - accessed using Message.message()
 *  - statically imported
 */
public class Message {

    // Entry point not required here, but allowed
    public static void main(String[] args) {
    }

    public static void message() {
        System.out.println("This course is awesome");
    }
}
