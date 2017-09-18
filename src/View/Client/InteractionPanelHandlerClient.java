package View.Client;

import Control.MainControllerClient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jean-Pierre on 13.09.2017.
 */
public class InteractionPanelHandlerClient {

    private MainControllerClient mainController;

    private JPanel panel;
    private JTextField serverIP;
    private JTextField serverPort;
    private JTextField message;
    private JButton buttonConnect, buttonDisconnect, buttonSend;
    private JTextArea output;

    public InteractionPanelHandlerClient(MainControllerClient mainController) {
        this.mainController = mainController;
        createButtons();

        serverIP.setText("172.168.3.22");
        serverPort.setText("1025");
        message.setText("Nachricht, die gespiegelt werden soll.");

        addToOutput("Willkommen beim Echo-Client.");
        addToOutput("Tragen Sie eine IP-Adresse eines Echo-Servers samt passenden Port oben ein. Die Nachricht können Sie überarbeiten.");
        addToOutput("Die Nachricht kann an den Server gesendet werden, der sie dann an den Client zurücksendet.");
        addToOutput("-----------------------------------------------------------------------------------");

    }

    private void createButtons(){
        buttonConnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Verhalten bei Knopfdruck implementieren! Beachte: Bei erfolgreicher Verbindung müssen die anderen Knöpfe dargestellt werden.
            }
        });
        buttonDisconnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Verhalten bei Knopfdruck implementieren! Beachte: Nach dem Abmelden sollte nur der "Verbinden"-Knopf dargestellt werden.
            }
        });
        buttonDisconnect.setVisible(false);

        buttonSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Verhalten bei Knopfdruck implementieren!
            }
        });
        buttonSend.setVisible(false);
    }

    public JPanel getPanel(){
        return panel;
    }

    public void addToOutput(String text){
        if(output.getText().isEmpty()){
            output.setText(text);
        }else{
            output.setText(output.getText() + "\n" + text);
        }
    }
}
