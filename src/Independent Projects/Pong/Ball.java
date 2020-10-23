package Pong;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle
{

    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;

    Color ballColor = Color.white;
    Color randomColor;
 
    Ball(int x, int y, int width, int height)
    {
        super(x, y, width, height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection*initialSpeed);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomXDirection*initialSpeed);

    }

    public void setXDirection(int randomXDirection)
    {
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection)
    {
        yVelocity = randomYDirection;     
    }

    public void move()
    {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g)
    {
        g.setColor(ballColor);
        g.fillOval(x, y, height, width);
    }

    public void changeBallColor()
    {
        Color[] colors = new Color[] {Color.red, Color.green, Color.blue, Color.yellow, Color.magenta, Color.cyan, Color.pink, Color.orange};
        
        int index = random.nextInt(colors.length);
        randomColor = colors[index];

        ballColor = randomColor;
    }

}

