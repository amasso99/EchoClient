import Control.MainControllerClient;
import Control.MainControllerServer;
import View.Client.MainFrameClient;
import View.Server.MainFrameServer;

import java.awt.*;

/**
 * Created by Jean-Pierre on 12.01.2017.
 */
public class MainProgram {

    public static void main (String[] args){
        EventQueue.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        MainProgram.setup();
                    }
                });
    }

    private static void setup(){
        MainControllerClient clientController = new MainControllerClient();
        MainFrameClient clientFrame = new MainFrameClient(clientController, "Echo-Client",50,50,1000,600);

        MainControllerServer serverController = new MainControllerServer();
        MainFrameServer  serverFrame = new MainFrameServer(serverController, "Echo-Server", 50,50,1000,600);
    }

}
