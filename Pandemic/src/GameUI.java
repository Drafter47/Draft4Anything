import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameUI extends JPanel implements MouseListener {

    private JFrame mainFrame;
    private MyFrame bg;
    int btntext = 1;

    public void gameStart() {
        CardInfection cardInfection = new CardInfection();
        gameGUI();
        cardInfection.startNewGame();
    }

    //Userinterface
    private void gameGUI() {

        //Set graphics for background and fields
        bg = new MyFrame();

        //Game window
        ImageIcon logo = new ImageIcon("src\\images\\logo.png");
        mainFrame = new JFrame("Pandemic - by KMJ"); //make main frame (window)
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close application when window is closed
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); //full screen mode
        mainFrame.setVisible(true); //show the window
        mainFrame.setIconImage(logo.getImage());
        mainFrame.add(bg);
        JButton but1 = new JButton("SAN FRANCISCO");
        but1.setBounds(500, 200, 200, 200); //set parameters for the button's size
        JButton but2 = new JButton("SAN ");
        but2.setBounds(500, 500, 100, 100); //set parameters for the button's size

        //mainFrame.add(but1);

        //TOP BAR for cards, score etc.
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.black);
        topPanel.setPreferredSize(new Dimension(100, 100));
        mainFrame.add(topPanel, BorderLayout.NORTH);
       // topPanel.add(but2);


        //BOTTOM BAR for actions
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.black);
        bottomPanel.setPreferredSize(new Dimension(100, 100));
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);

        //RIGHT BAR for player's cards
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.blue);
        rightPanel.setPreferredSize(new Dimension(130, 130));
        mainFrame.add(rightPanel, BorderLayout.EAST);

        //LEFT BAR for rules
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.blue);
        leftPanel.setPreferredSize(new Dimension(130, 130));
        mainFrame.add(leftPanel, BorderLayout.WEST);

        //ADD BUTTONS

        //MouseListener
        mainFrame.addMouseListener(new GameUI());

    }

    //Buttons for actions
    public void gameUIButton(){
        JButton sanfrancisco = new JButton("SAN FRANCISCO");
        sanfrancisco.setBounds(500, 200, 200, 200); //set parameters for the button's size
        sanfrancisco.setBorder(new RoundBtn(30)); //make the button border round
        sanfrancisco.setText(String.valueOf(btntext));
        sanfrancisco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btntext++;
                sanfrancisco.setBounds(100,300,100,100);
                sanfrancisco.setText(String.valueOf(btntext));
            }
        });
        sanfrancisco.setFont(new Font("Comis Sans", Font.BOLD,25)); //set parameters for the button's text
        sanfrancisco.setFocusable(true); //removes the box around the text
        sanfrancisco.setOpaque(true); //make the button transparent
        sanfrancisco.setContentAreaFilled(true); //remove content area
        sanfrancisco.setBorderPainted(true); //remove the borderline

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(+e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    //Implementing new class to make round button - can't return int in void gameGUI()
    class RoundBtn implements Border {
        private int r;

        public RoundBtn(int r) {
            this.r = r;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.r + 1, this.r + 1, this.r + 2, this.r);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, r, r);
        }
    }
}


