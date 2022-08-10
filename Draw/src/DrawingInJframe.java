import javax.swing.*;
import java.awt.*;


public class DrawingInJframe extends JFrame
{

    public DrawingInJframe()
    {
        super("Drawing in Jframe");
        setSize(400,300);
        setLocation(200,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0xabcdef));
        setVisible(true);
    }
    private int x;
    private int y;

    public int getX(){
        return x;
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        int[] xs = {x+20,x+40,x+60};
        int[] ys = {115,56,115};

        g.setColor(Color.YELLOW);
        g.fillPolygon(xs,ys,3);

    }


}
