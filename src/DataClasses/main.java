package DataClasses;

import DataManagers.UserManager;
import Screens.LoginUI;
import Screens.ShowExpedientesUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class main {
    private static Timer alertaTimer;
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserManager administrador = new UserManager();
                
                ShowExpedientesUI ventana = new ShowExpedientesUI(administrador);
                ventana.setVisible(false);
                
                new LoginUI().setVisible(true);
                
                alertaTimer = new Timer(10000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (ShowExpedientesUI.instancia != null) {
                            javax.swing.JTable tabla = ShowExpedientesUI.instancia.getUserTable();
                            System.out.println("Cantidad de filas en la tabla: " + tabla.getRowCount());
                            if (tabla.getRowCount() > 0) {
                                JOptionPane.showMessageDialog(
                                    null,
                                    "Tienes " + tabla.getRowCount() + " expedientes pendientes.",
                                    "Alerta",
                                    JOptionPane.INFORMATION_MESSAGE
                                );
                            }
                        }
                    }
                });
                alertaTimer.start();
            }
        });
    }
}
