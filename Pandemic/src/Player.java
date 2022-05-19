import java.awt.*;

public class Player {

    private String playerNum;
    private int xPostmp, yPostmp, sizeHead;
    private Color color;

    public Player(String playerNum, Color color, int xPostmp, int yPostmp, int sizeHead) {
        this.playerNum = playerNum;
        this.color = color;
        this.xPostmp = xPostmp;
        this.yPostmp = yPostmp;
        this.sizeHead = sizeHead;
    }
    public String getPlayerNum() {
        return playerNum;
    }
    public Color getColor() {
        return color;
    }
    public int getxPos() {
        return xPostmp;
    }
    public int getyPos() {
        return yPostmp;
    }
    public int sizeHead() {
        return sizeHead;
    }
}
