import javax.swing.*;
import java.awt.*;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    Beverage beverage;

    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public JFrame frame() {
        JFrame old = beverage.frame();
        JPanel panel = new JPanel();
        //TEdditalbe text:
        //TextField, TextComponent
        TextField name = new TextField(this.getDescription());
        name.setEditable(false);
        panel.add(name);
        old.add(panel);
        return old;

    }

}
