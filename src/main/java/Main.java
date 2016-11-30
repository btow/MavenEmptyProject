import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * The main class of the server
 * Created by btow on 30.11.2016.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Frontend frontend = new Frontend();

        int port = 8080;
        Server server = new Server(port);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(context);
        String pathSpec = "/authform";
        context.addServlet(new ServletHolder(frontend), pathSpec);

        server.start();
        server.join();

    }

}
