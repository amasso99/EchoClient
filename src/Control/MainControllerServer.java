package Control;

import Control.Networkclasses.EchoServer;
import Model.List;
import View.Server.InteractionPanelHandlerServer;

/**
 * Created by Jean-Pierre on 18.09.2017.
 */
public class MainControllerServer {

    private EchoServer server;
    private InteractionPanelHandlerServer panel;

    /**
     * Aktuell ein leerer Konstruktor.
     * Ein Objekt der Klasse MainControllerServer erstellt bei Bedarf ein Objekt der Klasse EchoServer. Diese Klasse muss noch geschrieben werden.
     */
    public MainControllerServer(){
        //TODO Diese Klasse muss noch vollständig geschrieben werden.
    }

    public void setPanel(InteractionPanelHandlerServer panel){
        this.panel = panel;
    }
    public void createServer(int port){
        server = new EchoServer(port,this);
    }

    public void log(String text){
        panel.addToSyslog(text);
    }

    public void updateAllConnections() {
        List<EchoServer.TempClient> list = server.getConnectedClients();
        String output;
        for(list.toFirst();list.hasAccess(); list.next() ){

        }
    }
}
