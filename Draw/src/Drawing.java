import java.awt.*;

public class Drawing {
    public void paint(Graphics g){
        int[] x = {4,6,8};
        int[] y = {10,5,10};
        g.drawPolygon(x,y,3);
        g.fillPolygon(x,y,3);

    }
}
