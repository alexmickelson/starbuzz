import javax.swing.JFrame;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }

    @Override
    public void frame(){
        super.frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, description.length()*10);
        frame.setVisible(true);
    }

}
