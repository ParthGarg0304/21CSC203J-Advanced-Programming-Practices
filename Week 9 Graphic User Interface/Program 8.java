import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class MouseEventApplet extends Applet {
    private String eventName;
    public void init() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                eventName = "Mouse Clicked";
                repaint();
            }

            public void mousePressed(MouseEvent e) {
                eventName = "Mouse Pressed";
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                eventName = "Mouse Released";
                repaint();
            }

            public void mouseEntered(MouseEvent e) {
                eventName = "Mouse Entered";
                repaint();
            }

            public void mouseExited(MouseEvent e) {
                eventName = "Mouse Exited";
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        // Clear the applet
        g.clearRect(0, 0, getWidth(), getHeight());

        // Set font and color for displaying event name
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.setColor(Color.BLUE);

        // Center the text
        FontMetrics fm = g.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(eventName)) / 2;
        int y = (getHeight() + fm.getAscent()) / 2;

        // Draw the event name
        g.drawString(eventName, x, y);
    }
}
