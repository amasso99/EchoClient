package Control;

import Control.Networkclasses.EchoClient;
import View.Client.InteractionPanelHandlerClient;
import View.Server.InteractionPanelHandlerServer;

/**
 * Created by Jean-Pierre on 12.01.2017.
 */
public class MainControllerClient {

    private EchoClient client;
    private InteractionPanelHandlerClient panel;

    /**
     * Aktuell ein leerer Konstruktor.
     * Ein Objekt der Klasse MainControllerClient erstellt bei Bedarf ein Objekt der Klasse EchoClient. Diese Klasse muss noch geschrieben werden.
     */
    public MainControllerClient(){
        //TODO Diese Klasse muss noch vollständig geschrieben werden.
    }

    public void setPanel(InteractionPanelHandlerClient panel){
        this.panel = panel;
    }

    public boolean createClient(String ip, int port){
        client = new EchoClient(ip,port,this);
        return client.isConnected();
    }

    public void disconnect(){
        client.close();
        client = null;
    }

    public void send(String text){
        client.send(text);
    }

    public void log(String text){
        panel.addToOutput(text);
    }
}
