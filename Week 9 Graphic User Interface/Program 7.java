import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ChessboardApplet extends Applet {
    public void paint(Graphics g) {
        int squareSize = 50; // Size of each square
        int numRows = 8;    // Number of rows on the chessboard
        int numCols = 8;    // Number of columns on the chessboard

        // Loop through rows
        for (int row = 0; row < numRows; row++) {
            // Loop through columns
            for (int col = 0; col < numCols; col++) {
                int x = col * squareSize;
                int y = row * squareSize;

                // Alternate between white and black squares
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }

                // Fill the square with the selected color
                g.fillRect(x, y, squareSize, squareSize);
            }
        }
    }
}
