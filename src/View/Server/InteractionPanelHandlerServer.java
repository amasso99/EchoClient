package View.Server;

import Control.MainControllerServer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jean-Pierre on 18.09.2017.
 */
public class InteractionPanelHandlerServer {

    private MainControllerServer mainController;

    private JTextField port;
    private JButton butonOpen;
    private JButton buttonClose;
    private JTextField message;
    private JTextArea syslog;
    private JTextArea textAreaClients;
    private JPanel panel;

    public InteractionPanelHandlerServer(MainControllerServer mainController) {
        this.mainController = mainController;

        port.setText("1025");
        message.setText("Ok!");

        createButtons();
    }

    private void createButtons(){
        butonOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Verhalten bei Knopfdruck implementieren!
            }
        });
        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Verhalten bei Knopfdruck implementieren!
            }
        });
    }

    public JPanel getPanel(){
        return panel;
    }

    public void addToSyslog(String text){
        if(syslog.getText().isEmpty()){
            syslog.setText(text);
        }else{
            syslog.setText(syslog.getText() + "\n" + text);
        }
    }
}
