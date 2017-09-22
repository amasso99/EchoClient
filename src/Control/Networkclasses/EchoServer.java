package Control.Networkclasses;

import Control.MainControllerServer;
import Model.List;

/**
 * Created by Jean-Pierre on 18.09.2017.
 */
public class EchoServer extends Server{

    public class TempClient{
        private String ip;
        private int port;

        public TempClient(String ip, int port){
            this.ip = ip;
            this.port = port;
        }

        public String getIP(){
            return ip;
        }

        public int getPort(){
            return port;
        }
    }

    private MainControllerServer controller;
    private List<TempClient>list = new List<>();
    //TODO Diese Klasse muss noch vollständig geschrieben werden.
    public EchoServer(int pPort, MainControllerServer mainControllerServer) {
        super(pPort);
        this.controller = mainControllerServer;
    }

    @Override
    public void processNewConnection(String pClientIP, int pClientPort) {
        list.append(new TempClient(pClientIP,pClientPort));
    }

    @Override
    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
        controller.log("Client-IP: "+ pClientIP+" Message: "+pMessage);
        send(pClientIP,pClientPort,pMessage);
    }

    @Override
    public void processClosingConnection(String pClientIP, int pClientPort) {


    }

    public List<TempClient> getConnectedClients(){
        return list;
    }
}
