import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Tile extends JPanel {
    int pX;
    int pY; //coordinates of current piece
    int pieceType; //pawn=1, rook=2, knight=3, bishop=4, queen=5, king=6
    int pieceColor; //black=1, white=2
    private JButton button = new JButton();
    private Boolean readyToMove; //says if the piece can move
    ImageIcon icon;
    public Tile(ImageIcon icon, ColorChangeListener listener, MoveListener move, GetActiveTile getActive) {
        button.setSize(50, 50);
        button.setIcon(icon);
        button.setBackground(new Color(255, 255, 255));
        button.addActionListener(new TileActionListener(listener, this, move, getActive));
        this.pieceColor = pieceColor;
        this.pieceType = pieceType;
        this.readyToMove = readyToMove;
        this.icon = icon;
    }
    //region Get/Set
    public int getpX() {
        return pX;
    }
    public void setpX(int pX) {
        this.pX = pX;
    }
    public int getpY() {
        return pY;
    }
    public void setpY(int pY) {
        this.pY = pY;
    }
    public int getPieceType() {
        return pieceType;
    }
    public void setPieceType(int pieceType) {
        this.pieceType = pieceType;
    }
    public int getPieceColor() {
        return pieceColor;
    }
    public void setPieceColor(int pieceColor) {
        this.pieceColor = pieceColor;
    }
    public void setImage(ImageIcon icon){
        button.setIcon(icon);
        this.icon = icon;
    }
    public JButton getButton() {
        return button;
    }
    public ImageIcon getIcon() {
        return icon;
    }
    //endregion
}