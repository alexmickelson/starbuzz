import javax.swing.*;
import java.awt.*;

public abstract class Beverage {
    String description = "Unknown Beverage";
    JFrame frame;

    public void frame(){
        frame = new JFrame();
        TextField name = new TextField();
        JPanel panel = new JPanel();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        panel.add(name);
        frame.add(panel);
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
