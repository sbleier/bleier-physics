package bleier.physics;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicsFrame extends JFrame {

    JLabel angleName = new JLabel("Angle:");
    JSlider angleSlider = new JSlider(JSlider.HORIZONTAL, 0, 90, 45);
    JTextField magnitudeField = new JTextField("Magnitude");
    JTextField timeField = new JTextField("Time");
    JLabel resultLabel = new JLabel(("x, y"));

    public PhysicsFrame() {

        setTitle("Moving Projectile");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 2));

        add(angleName);
        add(angleSlider);
        add(magnitudeField);
        //add(new Label());
        add(timeField);
        //add(new Label());
        add(resultLabel);

        angleSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                calculateProctileLocation();
            }
        });

        magnitudeField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                calculateProctileLocation();

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                calculateProctileLocation();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                calculateProctileLocation();

            }
        });

        timeField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                calculateProctileLocation();

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                calculateProctileLocation();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                calculateProctileLocation();
            }
        });
    }

    private void calculateProctileLocation(){
        double angle = (angleSlider.getValue());
        String magnitudeText = magnitudeField.getText();
        if(magnitudeText.isEmpty() || ! magnitudeText.matches("\\d+")) {
            return;
        }
        double magnitude = Double.parseDouble(magnitudeField.getText());

        String timeText = timeField.getText();
        if(timeText.isEmpty() || ! timeText.matches("\\d+")) {
            return;
        }
        double time = Double.parseDouble(timeField.getText());

        Projectile p = new Projectile(
                new Location(0, 0),
                new Force(new Angle(angle), magnitude));
        for (int i = 0; i < time; i++) {
            p.move(1);
        }

        Location location = p.getLocation();
        String formatX = String.format("%.2f", location.getX());
        String formatY = String.format("%.2f", location.getY());
        resultLabel.setText("(" + formatX + "," + formatY + ")");
    }


    public static void main(String[] args) {
        PhysicsFrame frame = new PhysicsFrame();
         frame.setVisible(true);
    }
}
