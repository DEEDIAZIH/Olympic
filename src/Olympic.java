import javax.swing.JApplet;
import java.awt.Graphics;



public class Olympic extends JApplet {

    public void paint(Graphics canvas)
            
    {   

canvas.drawOval(100, 50, 100, 100);
canvas.drawOval(240, 50, 100, 100);
canvas.drawOval(380, 50, 100, 100);
canvas.drawOval(170, 100, 100, 100);
canvas.drawOval(310, 100, 100, 100);

    }
}