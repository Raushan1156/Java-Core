package Project_Flag;
import java.awt.Frame;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
public class IndianFlag extends Frame {
    IndianFlag(){
    setVisible(true);
    setSize(500,700);
    setLocation(500,90);
    addWindowListener(new WindowAdapter()
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    });
    }
    public void paint(Graphics g)
    {
        try{
            Thread.sleep(20);
        }
        catch(Exception e){}
        g.setColor(Color.black);
        g.fillRect(150,100,5,500); // Standing Line i.e. Bamboo of flag

        /*   Recangular base of the Flag     */
        try{
            Thread.sleep(100);
        }
        catch(Exception e){}
        g.fillRect(120,600,60,20);

        try{
            Thread.sleep(200);
        }
        catch(Exception e){}
        g.fillRect(100,620,100,20);

        try{
            Thread.sleep(300);
        }
        catch(Exception e){}
        g.fillRect(80,640,140,20);


        /*  Flag  Rectangles*/
        Color c1=new Color(255,153,51);
        g.setColor(c1);
        g.fillRect(155,100,150,50);
        Color c2=new Color(10,84,22);
        g.setColor(c2);
        g.fillRect(155,200,150,50);

        /* Ashoka Chakra */
        int x1=215;
        int y1=160;
        int sa=0;
        int ma=7;
        for(int i=0;i<24;i++)
        {
            try{
                Thread.sleep(90);
            }
            catch(Exception e){}
            g.setColor(Color.blue);
            g.fillArc(x1,y1,30,30,sa,ma);
            sa+=15;
        }
    }
    public static void main(String[] args)
    {
        IndianFlag inflg=new IndianFlag();
    }
}
