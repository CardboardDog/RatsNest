import com.en.RatsNest.*;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
class Main{
    public static JFrame window;
    public static Renderer renderer;
    public static InputManager inputManager;
    public static void main(String[] args){
        window = new JFrame();
        renderer = new Renderer();
        inputManager = new InputManager();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.add(renderer);
        window.setSize(640,480);
        window.setVisible(true);
        window.addKeyListener(inputManager);
        window.addMouseListener(inputManager);
        while(true){
            renderer.repaint();
        }
    }
}