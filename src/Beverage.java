import javax.swing.*;
import java.awt.*;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public Beverage(){
        
    }

    public JFrame frame(){
        JFrame frame = new JFrame();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        TextField name = new TextField(getDescription());
        JPanel panel = new JPanel();
        panel.add(name);

        frame.add(panel);
        
        return frame;
    }

    public void printFrame(){
        JFrame frame = this.frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, description.length()*10);
        frame.setVisible(true);
    }

    public String getDescription() {
        return description;
    }
    public abstract double cost ();

    public void print(){
        System.out.println(getDescription() + " $" + cost());
    }
}
