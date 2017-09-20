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
    private JButton buttonOpen;
    private JButton buttonClose;
    private JTextField message;
    private JTextArea syslog;
    private JTextArea textAreaClients;
    private JPanel panel;

    public InteractionPanelHandlerServer(MainControllerServer mainController) {
        this.mainController = mainController;
        mainController.setPanel(this);

        port.setText("1025");
        message.setText("Ok!");

        createButtons();
    }

    private void createButtons(){
        buttonOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Verhalten bei Knopfdruck implementieren!
                mainController.createServer(Integer.parseInt(port.getText()));
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
        addToTextArea(text,syslog);
    }

    public void addToTextArea(String text,JTextArea area){
        if(area.getText().isEmpty()){
            area.setText(text);
        }else{
            area.setText(area.getText() + "\n" + text);
        }
    }
}
