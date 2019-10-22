package appendice_n.esempi;
import java.awt.*;
import java.awt.event.*;

public class AnomymousDelegationModel {
    private Frame f;
    private Button b;
    private Label l;

    public AnomymousDelegationModel() {
        f = new Frame("Delegation Model");
        b = new Button("Press Me");
        l = new Label();
        System.out.println("costruttore");
    }

    public void setup() {
        b.addActionListener(    new ActionListener() {
            private int counter;
            public void actionPerformed(ActionEvent e) {
                l.setText(e.getActionCommand() + " - " +
                (++counter));
            }
        } );
        f.add(b,BorderLayout.CENTER);
        f.add(l,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String args[]) {
        AnomymousDelegationModel delegationModel = new
        AnomymousDelegationModel();
        delegationModel.setup();
    }
}