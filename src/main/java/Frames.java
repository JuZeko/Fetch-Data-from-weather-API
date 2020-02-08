import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Frames {

    Parser parser = new Parser();
    JFrame frame = new JFrame();
    String textas;
    String text1;
     JLabel labe = new JLabel();

    Fetch fetch =  new Fetch();

    final JComboBox<String> CityStrings = new JComboBox<>(new String[] {"Vilnius", "Kaunas", "Panevezys", "Klaipeda"});

    JButton a = new JButton("Spauskite");



    JTextField textField = new JTextField(200);



    public Frames() throws ParseException {
    }


    public void menu() {

    addButoons();

    addTextField();


    addJcomboBox();

    ButtonListener();



    frameDisplay();

}



    private void ButtonListener() {

        final String[] text = {""};


        a.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                text[0] = (String) CityStrings.getSelectedItem();

                try {
                    fetch.action(text[0],textField);
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }










            }
        });

    }

    private void frameDisplay() {







        frame.setSize(1200, 400);

        frame.setTitle("Weather in Lithuania");

        frame.setBackground(Color.cyan);

        frame.setVisible(true);
    }

    private void addJcomboBox() {



        CityStrings.setSelectedIndex(1);



       frame.add(CityStrings,BorderLayout.NORTH);

    }

    private void addTextField() {
        Font font1 = new Font("SansSerif", Font.BOLD, 20);




        textField.setSize(100,100);
        textField.setFont(font1);
        frame.add(textField,BorderLayout.WEST);

    }





    private void addButoons() {



        frame.add(a,BorderLayout.SOUTH);
    }







}
