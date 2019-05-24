import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class AwtWindow extends Frame {
    private String key_msg = "AWT GUI";
    private String mouse_msg = "";
    private static char[] z = {1059, 1076, 1086, 1074, 1077, 1085, 1082, 1086, 32, 1055, 1069, 45, 49, 55, 49};
    private int mouseX = 30, mouseY = 30;

    public AwtWindow() {
        addKeyListener(new MyKeyAdapter(this));
        addWindowListener(new AwtWindowAdapter());
        addMouseListener(new MyMouseAdapter(this));
    }

    public static void main(String[] args) {
        for (char c : z) {
            System.out.print(c);
        }
        System.out.print("\n");
        AwtWindow aw_win = new AwtWindow();
        aw_win.setSize(300, 200);
        aw_win.setTitle("AWT GUI");

        Button OK = new Button("Выйти");
        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dialog();
            }
        });
        Panel panel = new Panel();
        panel.add(OK);
        aw_win.add(panel);
        aw_win.setVisible(true);
    }

    public static void Dialog() {
        for (char c : z) {
            System.out.print(c);
        }
        System.out.print("\n");
        AwtWindow aw_win1 = new AwtWindow();
        aw_win1.setSize(200, 100);
        aw_win1.setTitle("Window");
        Label l = new Label("Вы точно хотите выйти?");
        Button OK1 = new Button("OK");
        OK1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Button OK2 = new Button("Close");
        OK2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aw_win1.setVisible(false);
            }
        });
        Panel pane2 = new Panel();
        pane2.add(l);
        pane2.add(OK1);
        pane2.add(OK2);
        aw_win1.add(pane2);
        aw_win1.setVisible(true);
    }

    class MyKeyAdapter extends KeyAdapter {
        AwtWindow awtWindow;

        public MyKeyAdapter(AwtWindow awtWindow) {
            this.awtWindow = awtWindow;
        }

        public void keyTyped(KeyEvent ke) {
            awtWindow.key_msg += ke.getKeyChar();
            awtWindow.repaint();
        }
    }

    class MyMouseAdapter extends MouseAdapter {
        AwtWindow awtWindow;

        public MyMouseAdapter(AwtWindow awtWindow) {
            this.awtWindow = awtWindow;
        }

        public void mousePressed(MouseEvent me) {
            awtWindow.mouseX = me.getX();
            awtWindow.mouseY = me.getY();
            awtWindow.mouse_msg = "Mouse Down at " + awtWindow.mouseX + ", " + awtWindow.mouseY;
            awtWindow.repaint();
        }
    }
}
class AwtWindowAdapter extends WindowAdapter {
    private static char[] z = {1059, 1076, 1086, 1074, 1077, 1085, 1082, 1086, 32, 1055, 1069, 45, 49, 55, 49};

    public void windowClosing(WindowEvent we) {
        for (char c : z) {
            System.out.print(c);
        }
        System.out.print("\n");
        AwtWindow.Dialog();
    }
}


