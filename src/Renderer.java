package com.en.RatsNest;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
public class Renderer extends JPanel{
    public float cameraX = 0.0f;
    public float cameraY = 0.0f;
    public float cameraZ = 0.0f;
    @Override
    public void paintComponent(Graphics g){
        BufferedImage backBuffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB); 
        Graphics2D bufferG = (Graphics2D)backBuffer.getGraphics();
        bufferG.setColor(Color.DARK_GRAY);
        bufferG.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(backBuffer,0,0,null);
    }
}