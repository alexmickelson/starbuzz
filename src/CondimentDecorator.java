import javax.swing.*;
import java.awt.*;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    Beverage beverage;

    public CondimentDecorator(Beverage beverage){
        super();
        this.beverage = beverage;
    }

    @Override
    public void frame() {
        super.frame();
        JPanel panel = new JPanel();
        TextField name = new TextField(this.getDescription());
        panel.add(name);
        frame.add(panel);

    }

}
