package bleier.physics;

import javax.swing.*;

public class PhysicsController {
    private final JSlider slider;
    private final JTextField magnitudeField;
    private final JTextField timeField;
    //private final JLabel resultLabel;
    private final ProjectileGraph graph;

    public PhysicsController(JSlider slider, JTextField magnitudeField, JTextField timeField, ProjectileGraph graph) {
        this.slider = slider;
        this.magnitudeField = magnitudeField;
        this.timeField = timeField;
        //this.resultLabel = resultLabel;
        this.graph = graph;
    }

    public void calculate() {
        double angle = slider.getValue();
        String magnitudeText = magnitudeField.getText();
        if(magnitudeText.isEmpty() || ! magnitudeText.matches("\\d+")) {
            return;
        }
        double magnitude = Double.parseDouble(magnitudeField.getText());

        Projectile p = new Projectile(
                new Location(0, 0),
                new Force(new Angle(angle), magnitude));

        String timeText = timeField.getText();

        if(timeText.isEmpty() || ! timeText.matches("\\d+")) {
            return;
        }
        double time = Double.parseDouble(timeText);
        graph.setValues(angle, magnitude, time);


        for (int i = 0; i < time; i++) {
            p.move(1);
        }

        Location location = p.getLocation();
        String formatX = String.format("%.2f", location.getX());
        String formatY = String.format("%.2f", location.getY());
        //resultLabel.setText("(" + formatX + ", " + formatY + ")");
    }
}
