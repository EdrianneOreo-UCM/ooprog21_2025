import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            
            String name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);

            
            if (name == null) {
                JOptionPane.showMessageDialog(null, "No name entered. Exiting program.");
                break;
            }

            
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you wish to proceed?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
                break; 
            }
            
        }
    }
}
