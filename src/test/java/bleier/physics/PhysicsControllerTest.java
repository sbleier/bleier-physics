package bleier.physics;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PhysicsControllerTest {

    @Test
    public void calculate() {
        JSlider slider = mock();
        doReturn(45).when(slider).getValue();
        JTextField magnitudeField = mock();
        doReturn("80").when(magnitudeField).getText();
        JTextField timeField = mock();
        doReturn("10").when(timeField).getText();
        JLabel resultLabel = mock();

        PhysicsController controller = new PhysicsController(slider, magnitudeField, timeField, resultLabel);

        controller.calculate();

        verify(resultLabel).setText("(565.69, 565.69)");
    }
}