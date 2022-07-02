import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                /*Console version of generator*/
//              Shuffle s = new Shuffle();
//              s.shuffle("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890`!@#$%^&*()-_+/,<>");
                /*GUI version of generator*/
                GUI gen = new GUI();
                gen.setVisible(true);
                gen.pack();
            }
        });
    }
}