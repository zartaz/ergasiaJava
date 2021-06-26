import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI(){
        JFrame frame = new JFrame();

        JLabel onoma = new JLabel("Όνομα ");
        JLabel epitheto = new JLabel("Επίθετο ");
        JLabel dieythinsi = new JLabel("Διεύθυνση ");
        JLabel tilefwno = new JLabel("Τηλέφωνο ");

        TextField onomas = new TextField("                                   ");
        onomas.setBounds(50,100,200,30);
        TextField epithetos = new TextField("                                   ");
        epithetos.setBounds(50,100,200,30);
        TextField diefthinsi = new TextField("                                ");
        diefthinsi.setBounds(50,100,200,30);
        TextField telefunken = new TextField("                         ");
        telefunken.setBounds(50,100,200,30);

        JPanel prwto = new JPanel();
        JPanel deytero = new JPanel();
        JPanel trito = new JPanel();
        JPanel mainPanel = new JPanel();

        JButton ypovoli = new JButton("Υποβολή");
        ypovoli.setBounds(50,100,200,30);

        prwto.add(onoma);
        prwto.add(onomas);
        prwto.add(epitheto);
        prwto.add(epithetos);

        deytero.add(dieythinsi);
        deytero.add(diefthinsi);
        deytero.add(tilefwno);
        deytero.add(telefunken);

        trito.add(ypovoli);

        mainPanel.add(prwto);
        mainPanel.add(deytero);
        mainPanel.add(trito);

        frame.setContentPane(mainPanel);


        frame.setSize(700,400);
        frame.setTitle("Κύρια Οθόνη συστήματος");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
