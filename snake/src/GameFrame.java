 import javax.swing.JFrame;
public class GameFrame extends JFrame{
    GameFrame()
    {
        this.add(new GamePanel());  // create game panel class
        this.setTitle("Snake");   // title of the panel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);     // vivibilty to true , its false by default
        this.setLocationRelativeTo(null);   // make the position relative to null ie in centre
        

    }
}
