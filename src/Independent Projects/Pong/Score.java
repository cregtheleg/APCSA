package Pong;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Score extends Rectangle
{

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int gameScore;
    int highScore;
    
    Score(int GAME_WIDTH, int GAME_HEIGHT)
    {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);

        g.drawString("Score: " + String.valueOf(gameScore/10)+String.valueOf(gameScore%10), (GAME_WIDTH/2)-330, 50);
        g.drawString("Highscore: " + String.valueOf(highScore/10)+String.valueOf(highScore%10), (GAME_WIDTH/2)+40, 50);
    }

}
