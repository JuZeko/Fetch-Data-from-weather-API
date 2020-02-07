import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Frames {

    JFrame frame = new JFrame();

    JPanel panelis = new JPanel();

    String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };

    String[] Cyties = { "Vilnius", "Kaunas" };

    JComboBox city = new JComboBox(Cyties);

    public Frames(){


        addButoons();

        addTextField();

        addJcomboBox();

        frameDisplay();

    }

    private void frameDisplay() {

        frame.setSize(600, 400);

        frame.setTitle("Weather in Lithuania");

        frame.setVisible(true);
    }

    private void addJcomboBox() {

        JComboBox petList = new JComboBox(petStrings);

        petList.setSelectedIndex(4);

        frame.add(petList,BorderLayout.NORTH);

    }

    private void addTextField() {

        JTextField textField = new JTextField(20);

        frame.add(textField,BorderLayout.WEST);

    }

    private void addButoons() {

        JButton a = new JButton("Spauskite");

        frame.add(a,BorderLayout.SOUTH);
    }


}
