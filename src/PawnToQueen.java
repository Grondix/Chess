import javax.swing.*;
import java.awt.*;
public class PawnToQueen {  //not finished method for yoir pawn to become queen after reaching the end of the board
    JFrame frame = new JFrame("Choose your piece");
    Tile[] grid = new Tile[4];
    PawnToQueen(){
        setTiles();
        frame.setSize(400, 150);
        frame.setLayout(new GridLayout(1, 4));
        frame.setVisible(true);
        for (int i =0; i<4; i++){
            frame.add(grid[i].getButton());
        }
    }
    private void setTiles()
    {
        grid[0] = new Tile(new ImageIcon(getClass().getResource("pieces\\bRook.png")),null,null,null);
        grid[1] = new Tile(new ImageIcon(getClass().getResource("pieces\\bKnight.png")),null,null,null);
        grid[2] = new Tile(new ImageIcon(getClass().getResource("pieces\\bBishop.png")),null,null,null);
        grid[3] = new Tile(new ImageIcon(getClass().getResource("pieces\\bQueen.png")),null,null,null);
    }
}
