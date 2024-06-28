package com.en.RatsNest;
import java.awt.event.*;
public class InputManager implements KeyListener, MouseListener{
    public boolean[] keyValues = {false,false,false,false,false,false};
    public boolean mouseDown = false;
    @Override
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case 87: // w
                keyValues[0] = true;
                break;
            case 83: // s
                keyValues[1] = true;
                break;
            case 65: // a
                keyValues[2] = true;
                break;
            case 68: // d
                keyValues[3] = true;
                break;
            case 45: // -
                keyValues[4] = true;
            break;
            case 61: // +/=
                keyValues[5] = true;
                break;
            default: // ignore
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        switch(e.getKeyCode()){
            case 87: // w
                keyValues[0] = false;
                break;
            case 83: // s
                keyValues[1] = false;
                break;
            case 65: // a
                keyValues[2] = false;
                break;
            case 68: // d
                keyValues[3] = false;
                break;
            case 45: // -
                keyValues[4] = false;
            break;
            case 61: // +/=
                keyValues[5] = false;
                break;
            default: // ignore
                break;
        }
    }
    @Override
    public void mousePressed(MouseEvent e){
        mouseDown = true;
    }
    @Override
    public void mouseReleased(MouseEvent e){
        mouseDown = false;
    }
    @Override
    public void keyTyped(KeyEvent e){}
    @Override
    public void mouseExited(MouseEvent e){}
    @Override
    public void mouseEntered(MouseEvent e){}
    @Override
    public void mouseClicked(MouseEvent e){}
}
