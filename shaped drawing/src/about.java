import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class about extends JFrame {
    private JTextPane thePurposeOfThisTextPane;
    private JPanel f13;

    public about() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(f13);
        this.pack();
        thePurposeOfThisTextPane.setEditable(false);
    thePurposeOfThisTextPane.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
            super.componentResized(e);
        }
    });
}

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
