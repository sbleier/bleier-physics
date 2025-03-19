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

    private final JLabel angleName = new JLabel("Angle:");
    private final JSlider angleSlider = new JSlider(JSlider.HORIZONTAL, 0, 90, 45);
    private final JTextField magnitudeField = new JTextField("Magnitude");
    private final JTextField timeField = new JTextField("Time");
    private final JLabel resultLabel = new JLabel(("x, y"));
    private final PhysicsController controller;

    public PhysicsFrame() {

        setTitle("Moving Projectile");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 2));

        controller = new PhysicsController(angleSlider, magnitudeField, timeField, resultLabel);

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
                controller.calculate();
            }
        });

        magnitudeField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                controller.calculate();

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                controller.calculate();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                controller.calculate();

            }
        });

        timeField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                controller.calculate();

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                controller.calculate();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                controller.calculate();
            }
        });
    }



    public static void main(String[] args) {
        PhysicsFrame frame = new PhysicsFrame();
         frame.setVisible(true);
    }
}
