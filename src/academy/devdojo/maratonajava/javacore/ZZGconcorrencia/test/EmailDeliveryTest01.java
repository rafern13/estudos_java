package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;



import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Members;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraiya = new Thread(new EmailDeliveryService(members), "Jiraiya");
        Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
        jiraiya.start();
        kakashi.start();
        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }

    }
}
