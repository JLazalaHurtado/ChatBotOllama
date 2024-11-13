package laboratorio1;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.net.MalformedURLException;


public class Laboratorio1 {

    public static void main(String[] args) throws MalformedURLException {
        FlatDarculaLaf.setup();
        ChatBot frame = new ChatBot();
        frame.setVisible(true);
        frame.setSize(881, 517);
        frame.setLocationRelativeTo(null);

    }
}

