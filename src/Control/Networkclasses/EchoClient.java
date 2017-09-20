package Control.Networkclasses;

import Control.MainControllerClient;

/**
 * Created by Jean-Pierre on 18.09.2017.
 */
public class EchoClient extends Client{


    private MainControllerClient controller;

    //TODO Diese Klasse muss noch vollständig geschrieben werden.
    public EchoClient(String pServerIP, int pServerPort,MainControllerClient controller) {
        super(pServerIP, pServerPort);
        this.controller = controller;

    }

    @Override
    public void processMessage(String pMessage) {
        System.out.println(pMessage);
        controller.log(pMessage);

    }
}
