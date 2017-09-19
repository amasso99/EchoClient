package Control.Networkclasses;

/**
 * Created by Jean-Pierre on 18.09.2017.
 */
public class EchoServer extends Server{
    //TODO Diese Klasse muss noch vollständig geschrieben werden.
    public EchoServer(int pPort) {
        super(pPort);
    }

    @Override
    public void processNewConnection(String pClientIP, int pClientPort) {

    }

    @Override
    public void processMessage(String pClientIP, int pClientPort, String pMessage) {

    }

    @Override
    public void processClosingConnection(String pClientIP, int pClientPort) {

    }
}
