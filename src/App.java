/**
 * Access point for the application.
 *
 * @author Zachary Cockshutt
 * @author Liam Walker
 * @since  2023-08-01
 */
public class App
{
    public App()
    {

    }

    public static void main(String[] args)
    {
        var me = new App();
        me.init();
        me.run();
    }

    /**
     * Handles app initialization.
     */
    private void init()
    {

    }

    /**
     * Handles the runtime logic.
     */
    private void run()
    {
        System.out.println("Hello World!");
    }
}