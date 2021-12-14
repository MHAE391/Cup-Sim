package Teams;

import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import javax.swing.JOptionPane;
import javax.swing.*;

public class ACMilan extends BaseAgent {

    @Override
    protected void setup() {
        System.out.println(this.getClass().getSimpleName() + " Started.");
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage message = receive();
                if (message != null) {
                    JOptionPane.showMessageDialog(new JFrame(), "Legend says: ".concat(message.getContent()));
                }
            }
        });
    }

    @Override
    protected void takeDown() {
        System.err.println(this.getClass().getSimpleName().concat(" Down."));
    }
}
