import java.awt.*;
        import java.awt.event.*;
        import java.net.MalformedURLException;
        import java.net.URL;
        import javax.swing.*;
        import static sun.applet.AppletResourceLoader.getImage;

public class Kursova  extends JApplet implements MouseListener {
    int x, y;
    int i = 0;

    /*Создаём прослушиватель мыши*/
    public void init() {
        addMouseListener(this);
    }

    /*При нажатии мышки расчитываются координаты нажатия*/
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    /* Класс для вставки картинок */
    Image img, img1, img2, img3, img4, img5;
    MediaTracker tr;

    public void paint(Graphics g) {
        tr = new MediaTracker(this);
		/* Выводим рисунок 1 */
        try {
            img = getImage(new URL("https://i.imgur.com/uupQTAM.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        g.drawImage(img, 10, 10, this);

        if (x > 30 && x < 90 && y > 60 && y < 120 || x > 200 && x < 260 && y > 60 && y < 120) {
            try {
                img = getImage(new URL("https://i.imgur.com/iKrtuuN.png"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
            try {
                img = getImage(new URL("https://i.imgur.com/kl4AD7x.png"));
                Thread.sleep(1000);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
            try {
                img = getImage(new URL("https://i.imgur.com/ebisIZp.png"));
                Thread.sleep(2000);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
        }
        if (x > 45 && x < 82 && y > 171 && y < 206 || x > 94 && x < 131 && y > 171 && y < 206 || x > 155 && x < 192 && y > 171 && y < 206 || x > 205 && x < 242 && y > 171 && y < 206) {
            try {
                img = getImage(new URL("https://i.imgur.com/GKJ0xdT.png"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
            try {
                img = getImage(new URL("https://i.imgur.com/OxrDzgG.png"));
                Thread.sleep(1000);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
            try {
                img = getImage(new URL("https://i.imgur.com/ylRtX0x.png"));
                Thread.sleep(1000);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
            try {
                img = getImage(new URL("https://i.imgur.com/1PnzPZM.png"));
                Thread.sleep(1000);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
        }


    }
}

