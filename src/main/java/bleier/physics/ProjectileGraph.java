package bleier.physics;

import javax.swing.*;
import java.awt.*;

public class ProjectileGraph extends JComponent {

    private double angle;
    private double magnitude;
    private double time;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.translate(0, getHeight());

        Projectile p = new Projectile(
                new Location(0, 0),
                new Force(new Angle(angle),
                        magnitude));

        for (int i = 0; i < time; i++) {
            Location location1 = p.getLocation();

            p.add(Force.GRAVITY);
            p.move(1);

            Location location2 = p.getLocation();
            g.drawLine((int) location1.getX(), (int) -location1.getY(), (int) location2.getX(), (int) -location2.getY());
        }
    }

    public void setValues(double angle, double magnitude, double time) {
        this.angle = angle;
        this.magnitude = magnitude;
        this.time = time;
        repaint();
    }
}
