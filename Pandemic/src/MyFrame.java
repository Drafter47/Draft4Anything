import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyFrame extends JPanel {
        //color for fields
        Color lightRed = new Color(255, 100, 100);
        Color lightYellow = new Color(255, 255, 150);
        Color LightBlue = new Color(170, 220, 255);
        //attribute for fields (location, size, rotation)
        private int xc = 332, yc = 253, r = 13, diam = 13, fieldDiam = 25;
        private double inc = Math.PI / 360, theta = 10, theta2 = 0;
        private Field f = new Field();


        public MyFrame() {
                Timer timer = new Timer(0, event -> { //set a delay for printing
                        theta = theta + inc;
                        repaint();
                }); //Anonymoous class
                timer.start();
        }

        @Override
        public void paintComponent(Graphics g) {
                Image img = new ImageIcon("src\\images\\pandemicmap.jpg").getImage();
                Graphics2D g2d = (Graphics2D) g;

                g2d.drawImage(img, 0, 0, null);
                lineBetweenFields(g);
                fields(g);
                player(g);

                // Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //make borderline smoother
                g2d.rotate(theta, xc, yc);
                Ellipse2D.Double e = new Ellipse2D.Double(xc + r - diam / 2, yc + r - diam / 2, diam, diam);
                g2d.setColor(Color.black);
                g2d.fill(e);
                // g2d.rotate(theta2, xc, yc);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(2));
                g2d.drawOval(xc + r - diam / 2, yc + r - diam / 2, diam, diam);


        }

        public void fields(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //make borderline smoother
                
                Ellipse2D.Double atlanta = new Ellipse2D.Double(320, 240, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(atlanta);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(320, 240, fieldDiam, fieldDiam);

                Ellipse2D.Double sanFrancisco = new Ellipse2D.Double(175, 220, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(sanFrancisco);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(175, 220, fieldDiam, fieldDiam);

                Ellipse2D.Double chicago = new Ellipse2D.Double(285, 185, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(chicago);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(285, 185, fieldDiam, fieldDiam);

                Ellipse2D.Double montreal = new Ellipse2D.Double(380, 180, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(montreal);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(380, 180, fieldDiam, fieldDiam);

                Ellipse2D.Double newyork = new Ellipse2D.Double(450, 185, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(newyork);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(450, 185, 25, 25);

                Ellipse2D.Double washington = new Ellipse2D.Double(410, 250, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(washington);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(410, 250, 25, 25);

                Ellipse2D.Double london = new Ellipse2D.Double(515, 140, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(london);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(515, 140, 25, 25);

                Ellipse2D.Double madrid = new Ellipse2D.Double(510, 200, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(madrid);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(510, 200, 25, 25);

                Ellipse2D.Double paris = new Ellipse2D.Double(570, 170, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(paris);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(570, 170, 25, 25);

                Ellipse2D.Double essen = new Ellipse2D.Double(590, 95, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(essen);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(590, 95, 25, 25);

                Ellipse2D.Double milan = new Ellipse2D.Double(640, 150, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(milan);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(640, 150, 25, 25);

                Ellipse2D.Double stpetersburg = new Ellipse2D.Double(720, 80, 25, 25);
                g2d.setColor(Color.blue);
                g2d.fill(stpetersburg);
                g2d.setColor(LightBlue);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(720, 80, 25, 25);

                Ellipse2D.Double istanbul = new Ellipse2D.Double(690, 190, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(istanbul);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(690, 190, 25, 25);

                Ellipse2D.Double moscow = new Ellipse2D.Double(760, 130, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(moscow);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(760, 130, 25, 25);

                Ellipse2D.Double algiers = new Ellipse2D.Double(585, 240, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(algiers);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(585, 240, 25, 25);

                Ellipse2D.Double cairo = new Ellipse2D.Double(670, 270, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(cairo);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(670, 270, 25, 25);

                Ellipse2D.Double baghdad = new Ellipse2D.Double(750, 230, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(baghdad);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(750, 230, 25, 25);

                Ellipse2D.Double tehran = new Ellipse2D.Double(835, 175, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(tehran);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(835, 175, 25, 25);

                Ellipse2D.Double karachi = new Ellipse2D.Double(835, 260, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(karachi);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(835, 260, 25, 25);

                Ellipse2D.Double riyadh = new Ellipse2D.Double(770, 310, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(riyadh);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(770, 310, 25, 25);

                Ellipse2D.Double delhi = new Ellipse2D.Double(900, 220, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(delhi);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(900, 220, 25, 25);

                Ellipse2D.Double kolkata = new Ellipse2D.Double(950, 270, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(kolkata);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(950, 270, 25, 25);

                Ellipse2D.Double mumbai = new Ellipse2D.Double(840, 330, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(mumbai);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(840, 330, 25, 25);

                Ellipse2D.Double chennai = new Ellipse2D.Double(900, 365, 25, 25);
                g2d.setColor(Color.black);
                g2d.fill(chennai);
                g2d.setColor(Color.lightGray);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(900, 365, 25, 25);

                Ellipse2D.Double beijing = new Ellipse2D.Double(1010, 170, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(beijing);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(1010, 170, 25, 25);

                Ellipse2D.Double shanghai = new Ellipse2D.Double(f.xPosShanghai, f.yPosShanghai, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(shanghai);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(f.xPosShanghai, f.yPosShanghai, 25, 25);

                Ellipse2D.Double hongkong = new Ellipse2D.Double(1030, 290, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(hongkong);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(1030, 290, 25, 25);

                Ellipse2D.Double seoul = new Ellipse2D.Double(1080, 160, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(seoul);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(1080, 160, 25, 25);

                Ellipse2D.Double tokyo = new Ellipse2D.Double(1160, 200, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(tokyo);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(1160, 200, 25, 25);

                Ellipse2D.Double taipei = new Ellipse2D.Double(1100, 310, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(taipei);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(1100, 310, 25, 25);

                Ellipse2D.Double bangkok = new Ellipse2D.Double(960, 330, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(bangkok);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(960, 330, 25, 25);

                Ellipse2D.Double jakarta = new Ellipse2D.Double(960, 430, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(jakarta);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(960, 430, 25, 25);

                Ellipse2D.Double hochiminhcity = new Ellipse2D.Double(1020, 380, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(hochiminhcity);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(1020, 380, 25, 25);

                Ellipse2D.Double manila = new Ellipse2D.Double(1120, 390, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(manila);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(1120, 390, 25, 25);

                Ellipse2D.Double osaka = new Ellipse2D.Double(1160, 270, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(osaka);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(1160, 270, 25, 25);

                Ellipse2D.Double sydney = new Ellipse2D.Double(1170, 510, 25, 25);
                g2d.setColor(Color.red);
                g2d.fill(sydney);
                g2d.setColor(lightRed);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(1170, 510, 25, 25);

                Ellipse2D.Double khartoum = new Ellipse2D.Double(680, 350, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(khartoum);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(680, 350, 25, 25);

                Ellipse2D.Double johannesburg = new Ellipse2D.Double(690, 530, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(johannesburg);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(690, 530, 25, 25);

                Ellipse2D.Double kinshasa = new Ellipse2D.Double(625, 420, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(kinshasa);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(625, 420, 25, 25);

                Ellipse2D.Double lagos = new Ellipse2D.Double(550, 360, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(lagos);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(550, 360, 25, 25);

                Ellipse2D.Double buenosaires = new Ellipse2D.Double(450, 500, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(buenosaires);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(450, 500, 25, 25);

                Ellipse2D.Double bogota = new Ellipse2D.Double(375, 380, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(bogota);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(375, 380, 25, 25);

                Ellipse2D.Double saopaulo = new Ellipse2D.Double(510, 450, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(saopaulo);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(510, 450, 25, 25);

                Ellipse2D.Double santiago = new Ellipse2D.Double(340, 500, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(santiago);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(340, 500, 25, 25);

                Ellipse2D.Double lima = new Ellipse2D.Double(320, 430, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(lima);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(320, 430, 25, 25);

                Ellipse2D.Double miami = new Ellipse2D.Double(375, 310, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(miami);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(375, 310, 25, 25);

                Ellipse2D.Double mexicocity = new Ellipse2D.Double(280, 320, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(mexicocity);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(280, 320, 25, 25);

                Ellipse2D.Double losangeles = new Ellipse2D.Double(220, 280, 25, 25);
                g2d.setColor(Color.yellow);
                g2d.fill(losangeles);
                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(4));
                g2d.drawOval(220, 280, 25, 25);

        }

        public void player(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //make borderline smoother

                Player one = new Player("playerOneOrange", Color.orange, 222, 265, 20);  //TODO kig på om player kan tegnes omkring denne
                Ellipse2D.Double playerOneOrange = new Ellipse2D.Double(222, 265, 20, 20);
                g2d.setColor(one.getColor());
                g2d.fill(playerOneOrange);
                int[] xPoints = {222, 232, 242};
                int[] yPoints = {300, 275, 300};
                g2d.fillPolygon(xPoints, yPoints, 3);

/*
                        Ellipse2D.Double playTwoGreen = new Ellipse2D.Double(222, 265, 20, 20);
                        g2d.setColor(Color.green);
                        g2d.fill(playTwoGreen);
                        int[] xPoints = {222, 232, 242};
                        int[] yPoints = {300, 275, 300};
                        g2d.fillPolygon(xPoints, yPoints, 3);

                        Ellipse2D.Double playerThreePink = new Ellipse2D.Double(222, 265, 20, 20);
                        g2d.setColor(Color.pink);
                        g2d.fill(playerThreePink);
                        int[] xPoints = {222, 232, 242};
                        int[] yPoints = {300, 275, 300};
                        g2d.fillPolygon(xPoints, yPoints, 3);

                        Ellipse2D.Double playerFourWhite = new Ellipse2D.Double(222, 265, 20, 20);
                        g2d.setColor(Color.white);
                        g2d.fill(playerFourWhite);
                        int[] xPoints = {222, 232, 242};
                        int[] yPoints = {300, 275, 300};
                        g2d.fillPolygon(xPoints, yPoints, 3);

                        Ellipse2D.Double playerOrange = new Ellipse2D.Double(222, 265, 20, 20);
                        g2d.setColor(Color.orange);
                        g2d.fill(playerOrange);
                        int[] xPoints = {222, 232, 242};
                        int[] yPoints = {300, 275, 300};
                        g2d.fillPolygon(xPoints, yPoints, 3);

*/
        }

        public void lineBetweenFields(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //make borderline smoother

                g2d.setColor(lightYellow);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawLine(f.xPosMexicocity + (fieldDiam / 2), f.yPosMexicocity + (fieldDiam / 2), f.xPosLosangeles + (fieldDiam / 2), f.yPosLosangeles + (fieldDiam / 2)); //mexicocity>losangeles
                g2d.drawLine(f.xPosMexicocity + (fieldDiam / 2), f.yPosMexicocity, f.xPosLima + (fieldDiam / 2), f.yPosLima); //mexicocity>lima
                g2d.drawLine(f.xPosMexicocity + (fieldDiam / 2), f.yPosMexicocity + (fieldDiam / 2), f.xPosBogota + (fieldDiam / 2), f.yPosBogota + (fieldDiam / 2)); //mexicocity>bogota
                g2d.drawLine(f.xPosMexicocity + (fieldDiam / 2), f.yPosMexicocity + (fieldDiam / 2), f.xPosMiami + (fieldDiam / 2), f.yPosMiami + (fieldDiam / 2)); //mexicotycity>miami
                g2d.drawLine(f.xPosMexicocity + (fieldDiam / 2), f.yPosMexicocity + (fieldDiam / 2), f.xPosChicago + (fieldDiam / 2), f.yPosChicago + (fieldDiam / 2)); //mexicotycity>chicago
                g2d.drawLine(f.xPosChicago + (fieldDiam / 2), f.yPosChicago + (fieldDiam / 2), f.xPosSanfrancisco + (fieldDiam / 2), f.yPosSanfrancisco + (fieldDiam / 2)); //chicago>sanfrancisco
                g2d.drawLine(f.xPosChicago + (fieldDiam / 2), f.yPosChicago + (fieldDiam / 2), f.xPosLosangeles + (fieldDiam / 2), f.yPosLosangeles + (fieldDiam / 2)); //chicago>losangelas
                g2d.drawLine(f.xPosChicago + (fieldDiam / 2), f.yPosChicago + (fieldDiam / 2), f.xPosAtlanta + (fieldDiam / 2), f.yPosAtlanta + (fieldDiam / 2)); //chicago>atlanta
                g2d.drawLine(f.xPosChicago + (fieldDiam / 2), f.yPosChicago + (fieldDiam / 2), f.xPosMontreal + (fieldDiam / 2), f.yPosMontreal + (fieldDiam / 2)); //chicago>montreal
                g2d.drawLine(f.xPosMontreal + (fieldDiam / 2), f.yPosMontreal + (fieldDiam / 2), f.xPosNewyork + (fieldDiam / 2), f.yPosNewyork + (fieldDiam / 2)); //montreal>newyork
                g2d.drawLine(f.xPosMontreal + (fieldDiam / 2), f.yPosMontreal + (fieldDiam / 2), f.xPosWashington + (fieldDiam / 2), f.yPosWashington + (fieldDiam / 2)); //montreal>washington
                g2d.drawLine(f.xPosWashington + (fieldDiam / 2), f.yPosWashington + (fieldDiam / 2), f.xPosAtlanta + (fieldDiam / 2), f.yPosAtlanta + (fieldDiam / 2)); //washington>atlanta
                g2d.drawLine(f.xPosAtlanta + (fieldDiam / 2), f.yPosAtlanta + (fieldDiam / 2), f.xPosMiami + (fieldDiam / 2), f.yPosMiami + (fieldDiam / 2)); //atlanta>miami
                g2d.drawLine(f.xPosMiami + (fieldDiam / 2), f.yPosMiami + (fieldDiam / 2), f.xPosBogota + (fieldDiam / 2), f.yPosBogota + (fieldDiam / 2)); //miami>bogota
                g2d.drawLine(f.xPosMiami + (fieldDiam / 2), f.yPosMiami + (fieldDiam / 2), f.xPosWashington + (fieldDiam / 2), f.yPosWashington + (fieldDiam / 2)); //miami>washington
                g2d.drawLine(f.xPosLima + (fieldDiam / 2), f.yPosLima + (fieldDiam / 2), f.xPosSantiago + (fieldDiam / 2), f.yPosSantiago + (fieldDiam / 2)); //lima>santiago
                g2d.drawLine(f.xPosBogota + (fieldDiam / 2), f.yPosBogota + (fieldDiam / 2), f.xPosBuenosaires + (fieldDiam / 2), f.yPosBuenosaires + (fieldDiam / 2)); //bogota>buenosaires
                g2d.drawLine(f.xPosBuenosaires + (fieldDiam / 2), f.yPosBuenosaires + (fieldDiam / 2), f.xPosSaopaulo + (fieldDiam / 2), f.yPosSaopaulo + (fieldDiam / 2)); //buenosaires>saopaulo
                g2d.drawLine(f.xPosSaopaulo + (fieldDiam / 2), f.yPosSaopaulo + (fieldDiam / 2), f.xPosBogota + (fieldDiam / 2), f.yPosBogota + (fieldDiam / 2)); //saopaulo>bogota
                g2d.drawLine(f.xPosSaopaulo + (fieldDiam / 2), f.yPosSaopaulo + (fieldDiam / 2), f.xPosLagos + (fieldDiam / 2), f.yPosLagos + (fieldDiam / 2)); //saopaulo>lagos
                g2d.drawLine(f.xPosLagos + (fieldDiam / 2), f.yPosLagos + (fieldDiam / 2), f.xPosKinshasa + (fieldDiam / 2), f.yPosKinshasa + (fieldDiam / 2)); //lagos>kinshasa
                g2d.drawLine(f.xPosLagos + (fieldDiam / 2), f.yPosLagos + (fieldDiam / 2), f.xPosKhartoum + (fieldDiam / 2), f.yPosKhartoum + (fieldDiam / 2)); //lagos>khartoum
                g2d.drawLine(f.xPosKhartoum + (fieldDiam / 2), f.yPosKhartoum + (fieldDiam / 2), f.xPosJohannesburg + (fieldDiam / 2), f.yPosJohannesburg + (fieldDiam / 2)); //khartoum>johannesburg
                g2d.drawLine(f.xPosJohannesburg + (fieldDiam / 2), f.yPosJohannesburg + (fieldDiam / 2), f.xPosKinshasa + (fieldDiam / 2), f.yPosKinshasa + (fieldDiam / 2)); //johannesburg>kinshasa
                g2d.drawLine(f.xPosKinshasa + (fieldDiam / 2), f.yPosKinshasa + (fieldDiam / 2), f.xPosKhartoum + (fieldDiam / 2), f.yPosKhartoum + (fieldDiam / 2)); //kinshasa>khartoum
                g2d.drawLine(f.xPosKhartoum + (fieldDiam / 2), f.yPosKhartoum + (fieldDiam / 2), f.xPosCairo + (fieldDiam / 2), f.yPosCairo + (fieldDiam / 2)); //khartoum>cairo
                g2d.drawLine(f.xPosCairo + (fieldDiam / 2), f.yPosCairo + (fieldDiam / 2), f.xPosAlgiers + (fieldDiam / 2), f.yPosAlgiers + (fieldDiam / 2)); //cairo>algiers
                g2d.drawLine(f.xPosCairo + (fieldDiam / 2), f.yPosCairo + (fieldDiam / 2), f.xPosIstanbul + (fieldDiam / 2), f.yPosIstanbul + (fieldDiam / 2)); //cairo>istanbul
                g2d.drawLine(f.xPosCairo + (fieldDiam / 2), f.yPosCairo + (fieldDiam / 2), f.xPosBaghdad + (fieldDiam / 2), f.yPosBaghdad + (fieldDiam / 2)); //cairo>baghdad
                g2d.drawLine(f.xPosCairo + (fieldDiam / 2), f.yPosCairo + (fieldDiam / 2), f.xPosRiyadh + (fieldDiam / 2), f.yPosRiyadh + (fieldDiam / 2)); //cairo>riyadh
                g2d.drawLine(f.xPosRiyadh + (fieldDiam / 2), f.yPosRiyadh + (fieldDiam / 2), f.xPosBaghdad + (fieldDiam / 2), f.yPosBaghdad + (fieldDiam / 2)); //riyadh>baghdad
                g2d.drawLine(f.xPosRiyadh + (fieldDiam / 2), f.yPosRiyadh + (fieldDiam / 2), f.xPosKarachi + (fieldDiam / 2), f.yPosKarachi + (fieldDiam / 2)); //riyadh>karachi
                g2d.drawLine(f.xPosKarachi + (fieldDiam / 2), f.yPosKarachi + (fieldDiam / 2), f.xPosBaghdad + (fieldDiam / 2), f.yPosBaghdad + (fieldDiam / 2)); //karachi>baghdad
                g2d.drawLine(f.xPosKarachi + (fieldDiam / 2), f.yPosKarachi + (fieldDiam / 2), f.xPosTehran + (fieldDiam / 2), f.yPosTehran + (fieldDiam / 2)); //karachi>tehran
                g2d.drawLine(f.xPosKarachi + (fieldDiam / 2), f.yPosKarachi + (fieldDiam / 2), f.xPosDelhi + (fieldDiam / 2), f.yPosDelhi + (fieldDiam / 2)); //karachi>delhi
                g2d.drawLine(f.xPosKarachi + (fieldDiam / 2), f.yPosKarachi + (fieldDiam / 2), f.xPosMumbai + (fieldDiam / 2), f.yPosMumbai + (fieldDiam / 2)); //karachi>mumbai

                g2d.drawLine(f.xPosMumbai + (fieldDiam / 2), f.yPosMumbai + (fieldDiam / 2), f.xPosChennai + (fieldDiam / 2), f.yPosChennai + (fieldDiam / 2)); //mumbai>chennai
                g2d.drawLine(f.xPosMumbai + (fieldDiam / 2), f.yPosMumbai + (fieldDiam / 2), f.xPosDelhi + (fieldDiam / 2), f.yPosDelhi); //mumbai>delhi

                g2d.drawLine(f.xPosIstanbul + (fieldDiam / 2), f.yPosIstanbul + (fieldDiam / 2), f.xPosBaghdad + (fieldDiam / 2), f.yPosBaghdad + (fieldDiam / 2)); //instanbul>baghdad
                g2d.drawLine(f.xPosIstanbul + (fieldDiam / 2), f.yPosIstanbul + (fieldDiam / 2), f.xPosMoscow + (fieldDiam / 2), f.yPosMoscow + (fieldDiam / 2)); //instanbul>moscow
                g2d.drawLine(f.xPosIstanbul + (fieldDiam / 2), f.yPosIstanbul + (fieldDiam / 2), f.xPosStpetersburg + (fieldDiam / 2), f.yPosStpetersburg + (fieldDiam / 2)); //instanbul>stpetersburg
                g2d.drawLine(f.xPosIstanbul + (fieldDiam / 2), f.yPosIstanbul + (fieldDiam / 2), f.xPosMilan + (fieldDiam / 2), f.yPosMilan + (fieldDiam / 2)); //instanbul>milan
                g2d.drawLine(f.xPosIstanbul + (fieldDiam / 2), f.yPosIstanbul + (fieldDiam / 2), f.xPosAlgiers + (fieldDiam / 2), f.yPosAlgiers + (fieldDiam / 2)); //instanbul>algiers
                g2d.drawLine(f.xPosMilan + (fieldDiam / 2), f.yPosMilan + (fieldDiam / 2), f.xPosParis + (fieldDiam / 2), f.yPosParis + (fieldDiam / 2)); //milan>paris
                g2d.drawLine(f.xPosMilan + (fieldDiam / 2), f.yPosMilan + (fieldDiam / 2), f.xPosEssen + (fieldDiam / 2), f.yPosEssen + (fieldDiam / 2)); //milan>essen
                g2d.drawLine(f.xPosEssen + (fieldDiam / 2), f.yPosEssen + (fieldDiam / 2), f.xPosStpetersburg + (fieldDiam / 2), f.yPosStpetersburg + (fieldDiam / 2)); //essen>stpetersburg
                g2d.drawLine(f.xPosStpetersburg + (fieldDiam / 2), f.yPosStpetersburg + (fieldDiam / 2), f.xPosMoscow + (fieldDiam / 2), f.yPosMoscow + (fieldDiam / 2)); //stpetersburg>moscow
                g2d.drawLine(f.xPosMoscow + (fieldDiam / 2), f.yPosMoscow + (fieldDiam / 2), f.xPosTehran + (fieldDiam / 2), f.yPosTehran + (fieldDiam / 2)); //moscow>tehran
                g2d.drawLine(f.xPosEssen + (fieldDiam / 2), f.yPosEssen + (fieldDiam / 2), f.xPosParis + (fieldDiam / 2), f.yPosParis + (fieldDiam / 2));//essen>paris
                g2d.drawLine(f.xPosEssen + (fieldDiam / 2), f.yPosEssen + (fieldDiam / 2), f.xPosLondon + (fieldDiam / 2), f.yPosLondon + (fieldDiam / 2));//essen>london
                g2d.drawLine(f.xPosLondon + (fieldDiam / 2), f.yPosLondon + (fieldDiam / 2), f.xPosMadrid + (fieldDiam / 2), f.yPosMadrid + (fieldDiam / 2));//london>madrid
                g2d.drawLine(f.xPosLondon + (fieldDiam / 2), f.yPosLondon + (fieldDiam / 2), f.xPosNewyork + (fieldDiam / 2), f.yPosNewyork + (fieldDiam / 2));//london>newyork
                g2d.drawLine(f.xPosParis + (fieldDiam / 2), f.yPosParis + (fieldDiam / 2), f.xPosMadrid + (fieldDiam / 2), f.yPosMadrid + (fieldDiam / 2));//paris>madrid
                g2d.drawLine(f.xPosMadrid + (fieldDiam / 2), f.yPosMadrid, f.xPosSaopaulo + (fieldDiam / 2), f.yPosSaopaulo + (fieldDiam / 2));//madrid>saopaulo
                g2d.drawLine(f.xPosMadrid + (fieldDiam / 2), f.yPosMadrid + (fieldDiam / 2), f.xPosNewyork + (fieldDiam / 2), f.yPosNewyork + (fieldDiam / 2));//madrid>newyork
                g2d.drawLine(f.xPosNewyork + (fieldDiam / 2), f.yPosNewyork + (fieldDiam / 2), f.xPosWashington + (fieldDiam / 2), f.yPosWashington + (fieldDiam / 2));//newyork>washington
                g2d.drawLine(f.xPosSanfrancisco + (fieldDiam / 2), f.yPosSanfrancisco + (fieldDiam / 2), f.xPosLosangeles + (fieldDiam / 2), f.yPosLosangeles + (fieldDiam / 2));//sanfrancisco>losangeles
                g2d.drawLine(f.xPosTehran + (fieldDiam / 2), f.yPosTehran + (fieldDiam / 2), f.xPosKarachi + (fieldDiam / 2), f.yPosKarachi + (fieldDiam / 2));//tehran>karachi
                g2d.drawLine(f.xPosDelhi + (fieldDiam / 2), f.yPosDelhi + (fieldDiam / 2), f.xPosKolkata + (fieldDiam / 2), f.yPosKolkata + (fieldDiam / 2));//delhi>kolkata
                g2d.drawLine(f.xPosKolkata + (fieldDiam / 2), f.yPosKolkata + (fieldDiam / 2), f.xPosBangkok + (fieldDiam / 2), f.yPosBangkok + (fieldDiam / 2));//kolkata>bangkok
                g2d.drawLine(f.xPosKolkata + (fieldDiam / 2), f.yPosKolkata + (fieldDiam / 2), f.xPosHongkong + (fieldDiam / 2), f.yPosHongkong + (fieldDiam / 2));//kolkata>hongkong
                g2d.drawLine(f.xPosTehran + (fieldDiam / 2), f.yPosTehran + (fieldDiam / 2), f.xPosDelhi + (fieldDiam / 2), f.yPosDelhi + (fieldDiam / 2));//tehran>delhi
                g2d.drawLine(f.xPosTehran + (fieldDiam / 2), f.yPosTehran + (fieldDiam / 2), f.xPosBaghdad + (fieldDiam / 2), f.yPosBaghdad + (fieldDiam / 2));//tehran>baghdad
                g2d.drawLine(f.xPosAlgiers + (fieldDiam / 2), f.yPosAlgiers + (fieldDiam / 2), f.xPosParis + (fieldDiam / 2), f.yPosParis + (fieldDiam / 2));//algiers>paris
                g2d.drawLine(f.xPosAlgiers + (fieldDiam / 2), f.yPosAlgiers + (fieldDiam / 2), f.xPosMadrid + (fieldDiam / 2), f.yPosMadrid + (fieldDiam / 2));//algiers>madrid
                g2d.drawLine(f.xPosChennai + (fieldDiam / 2), f.yPosChennai + (fieldDiam / 2), f.xPosBangkok + (fieldDiam / 2), f.yPosBangkok + (fieldDiam / 2));//chennai>bangkok
                g2d.drawLine(f.xPosChennai + (fieldDiam / 2), f.yPosChennai + (fieldDiam / 2), f.xPosJakarta + (fieldDiam / 2), f.yPosJakarta + (fieldDiam / 2));//chennai>jakarta
                g2d.drawLine(f.xPosJakarta + (fieldDiam / 2), f.yPosJakarta + (fieldDiam / 2), f.xPosBangkok + (fieldDiam / 2), f.yPosBangkok + (fieldDiam / 2));//jakarta>bangkok
                g2d.drawLine(f.xPosJakarta + (fieldDiam / 2), f.yPosJakarta + (fieldDiam / 2), f.xPosHochiminhcity + (fieldDiam / 2), f.yPosHochiminhcity + (fieldDiam / 2));//jakarta>hochiminhcity
                g2d.drawLine(f.xPosJakarta + (fieldDiam / 2), f.yPosJakarta + (fieldDiam / 2), f.xPosSydney + (fieldDiam / 2), f.yPosSydney + (fieldDiam / 2));//jakarta>sydney
                g2d.drawLine(f.xPosSydney + (fieldDiam / 2), f.yPosSydney + (fieldDiam / 2), f.xPosManila + (fieldDiam / 2), f.yPosManila + (fieldDiam / 2));//sydney>manila
                g2d.drawLine(f.xPosManila + (fieldDiam / 2), f.yPosManila + (fieldDiam / 2), f.xPosHochiminhcity + (fieldDiam / 2), f.yPosHochiminhcity + (fieldDiam / 2));//manila>hochiminhcity
                g2d.drawLine(f.xPosManila + (fieldDiam / 2), f.yPosManila + (fieldDiam / 2), f.xPosHongkong + (fieldDiam / 2), f.yPosHongkong + (fieldDiam / 2));//manila>hongkong
                g2d.drawLine(f.xPosManila + (fieldDiam / 2), f.yPosManila + (fieldDiam / 2), f.xPosTripei + (fieldDiam / 2), f.yPosTripei + (fieldDiam / 2));//manila>taipei
                g2d.drawLine(f.xPosHochiminhcity + (fieldDiam / 2), f.yPosHochiminhcity + (fieldDiam / 2), f.xPosBangkok + (fieldDiam / 2), f.yPosBangkok + (fieldDiam / 2));//hochiminhcity>bangkok
                g2d.drawLine(f.xPosBangkok + (fieldDiam / 2), f.yPosBangkok + (fieldDiam / 2), f.xPosHongkong + (fieldDiam / 2), f.yPosHongkong + (fieldDiam / 2));//bangkok>hongkong
                g2d.drawLine(f.xPosHongkong + (fieldDiam / 2), f.yPosHongkong + (fieldDiam / 2), f.xPosTripei + (fieldDiam / 2), f.yPosTripei + (fieldDiam / 2));//hongkong>tripei
                g2d.drawLine(f.xPosTripei + (fieldDiam / 2), f.yPosTripei + (fieldDiam / 2), f.xPosOsaka + (fieldDiam / 2), f.yPosOsaka + (fieldDiam / 2));//tripei>osaka
                g2d.drawLine(f.xPosOsaka + (fieldDiam / 2), f.yPosOsaka + (fieldDiam / 2), f.xPosTokyo + (fieldDiam / 2), f.yPosTokyo + (fieldDiam / 2));//osaka>tokyo
                g2d.drawLine(f.xPosTokyo + (fieldDiam / 2), f.yPosTokyo + (fieldDiam / 2), f.xPosSeoul + (fieldDiam / 2), f.yPosSeoul + (fieldDiam / 2));//tokyo>seoul
                g2d.drawLine(f.xPosSeoul + (fieldDiam / 2), f.yPosSeoul + (fieldDiam / 2), f.xPosBeijing + (fieldDiam / 2), f.yPosBeijing + (fieldDiam / 2));//seoul>beijing
                g2d.drawLine(f.xPosBeijing + (fieldDiam / 2), f.yPosBeijing + (fieldDiam / 2), f.xPosShanghai + (fieldDiam / 2), f.yPosShanghai + (fieldDiam / 2));//beijing>shanghai
                g2d.drawLine(f.xPosShanghai + (fieldDiam / 2), f.yPosShanghai + (fieldDiam / 2), f.xPosHongkong + (fieldDiam / 2), f.yPosHongkong + (fieldDiam / 2));//shanghai>bongkong
                g2d.drawLine(f.xPosShanghai + (fieldDiam / 2), f.yPosShanghai + (fieldDiam / 2), f.xPosSeoul + (fieldDiam / 2), f.yPosSeoul + (fieldDiam / 2));//shanghai>seoul
                g2d.drawLine(f.xPosShanghai + (fieldDiam / 2), f.yPosShanghai + (fieldDiam / 2), f.xPosTokyo + (fieldDiam / 2), f.yPosTokyo + (fieldDiam / 2));//shanghai>tokyo
                g2d.drawLine(f.xPosShanghai + (fieldDiam / 2), f.yPosShanghai + (fieldDiam / 2), f.xPosTripei + (fieldDiam / 2), f.yPosTripei + (fieldDiam / 2));//shanghai>tripei
        }
}
