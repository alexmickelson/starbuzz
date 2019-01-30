import javax.swing.*;
import java.awt.*;

public abstract class Beverage {
    String description = "Unknown Beverage";
    JFrame frame;

    public Beverage(){
        frame = new JFrame();
        
    }

    public void frame(){
        frame = new JFrame();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        TextField name = new TextField(this.description);
        JPanel panel = new JPanel();
        panel.add(name);

        frame.add(panel);
    }

    public String getDescription() {
        return description;
    }
    public abstract double cost ();

    public void print(){
        System.out.println(getDescription() + " $" + cost());
    }
}
