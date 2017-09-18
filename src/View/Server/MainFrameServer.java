package View.Server;

import Control.MainControllerClient;
import Control.MainControllerServer;
import View.Client.InteractionPanelHandlerClient;

import javax.swing.*;

/**
 * Created by Jean-Pierre on 15.11.2016.
 */
public class MainFrameServer extends JFrame {

    // Attribute

    // Referenzen
    private MainControllerServer mainController;

    private JPanel interactionPanel;

    /**
     * Konstruktor
     * @param name Der Titel des Fensters
     * @param x Die obere linke x-Koordinate des Fensters bzgl. des Bildschirms
     * @param y Die obere linke y-Koordinaite des Fensters bzgl. des Bildschirms
     * @param width Die Breite des Fensters
     * @param height Die Höhe des Fensters
     */
    public MainFrameServer(MainControllerServer mainController, String name, int x, int y, int width, int height) {
        this.mainController = mainController;

        this.interactionPanel = new InteractionPanelHandlerServer(mainController).getPanel();

        this.getContentPane().add(interactionPanel);

        this.setLocation(x,y);
        this.setSize(width,height);
        this.setTitle(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}
