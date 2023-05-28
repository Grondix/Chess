import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class Board implements ColorChangeListener, MoveListener, GetActiveTile {
    private final Color WHITE = new Color(255, 255, 255);
    private final Color GREEN = new Color(0, 255, 0);           //used colors
    private int x = 8; // amount of tiles
    private int y = 8; // -||-
    private Tile[][] grid = new Tile[x][y]; // array that stores tiles in the board
    private Boolean readyToMove = Boolean.FALSE;
    Pieces p = new Pieces(grid);
    // For changing colors of active tiles
    private Tile currentActive;
    private JFrame frame = new JFrame("Chess");
    private boolean turn = true;
    Board() //game frame
    {
        setTiles();
        frame.setSize(1000, 1000); // setting parameters for board and window
        frame.setLayout(new GridLayout(8, 8));
        frame.setVisible(true);
        boardPreset();
    }
    private void setTiles()
    {
        for (int i = 0; i < x; i++)
        { // creating and adding tiles to board
            for (int j = 0; j < y; j++)
            {
                // Create a new tile in the grid
                grid[i][j] = new Tile(new ImageIcon(), this, this,this);
                grid[i][j].setpX(i);
                grid[i][j].setpY(j);
                if(i>1&&i<6){
                    grid[i][j].setPieceColor(0);
                }
                else if (i<2){
                    grid[i][j].setPieceColor(1);
                }
                else {
                    grid[i][j].setPieceColor(2);
                }
                // Add the tile's button to the frame for display
                frame.add(grid[i][j].getButton());
            }
        }
    }
    /**
     * When a button is clicked, this method is called, which changes the color of {@link #currentActive} to white and newTile to green
     * @param newTile tile whose buttons color is to be set to green
     */
    @Override
    public void changeColors(Tile newTile) { //method for showing paths the pieces can take
        clearBoard();
        switch (grid[newTile.pX][newTile.pY].getPieceType()){
            case 1:
                if (turn&&newTile.getPieceColor()==2){
                    p.pawnMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }else if (!turn&&newTile.getPieceColor()==1){
                    p.pawnMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }
                ReadyToMove.isReadyToMove=true;
                break;
            case 2:
                if (turn&&newTile.getPieceColor()==2){
                    p.rookMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }else if (!turn&&newTile.getPieceColor()==1){
                    p.rookMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }
                ReadyToMove.isReadyToMove=true;
                break;
            case 3:
                if (turn&&newTile.getPieceColor()==2){
                    p.knightMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }else if (!turn&&newTile.getPieceColor()==1){
                    p.knightMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }
                ReadyToMove.isReadyToMove=true;
                break;
            case 4:
                if (turn&&newTile.getPieceColor()==2){
                    p.bishopMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }else if (!turn&&newTile.getPieceColor()==1){
                    p.bishopMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }
                ReadyToMove.isReadyToMove=true;
                break;
            case 5:
                if (turn&&newTile.getPieceColor()==2){
                    p.queenMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }else if (!turn&&newTile.getPieceColor()==1){
                    p.queenMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }
                ReadyToMove.isReadyToMove=true;
                break;
            case 6:
                if (turn&&newTile.getPieceColor()==2){
                    p.kingMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }else if (!turn&&newTile.getPieceColor()==1){
                    p.kingMove(grid[newTile.pX][newTile.pY],grid[newTile.pX][newTile.pY].getPieceColor());
                }
                ReadyToMove.isReadyToMove=true;
                break;
        }
        currentActive = newTile;
        currentActive.getButton().setBackground(GREEN);
    }
    public void boardPreset(){ //method for placing pieces at the start of the game
        grid[3][2].setImage(new ImageIcon(getClass().getResource("pieces\\bBishop.png")));
        grid[3][2].setPieceType(4);
        grid[3][2].setPieceColor(1);

        grid[0][0].setImage(new ImageIcon(getClass().getResource("pieces\\bRook.png")));
        grid[0][0].setPieceType(2);
        grid[0][1].setImage(new ImageIcon(getClass().getResource("pieces\\bKnight.png")));
        grid[0][1].setPieceType(3);
        grid[0][2].setImage(new ImageIcon(getClass().getResource("pieces\\bBishop.png")));
        grid[0][2].setPieceType(4);
        grid[0][3].setImage(new ImageIcon(getClass().getResource("pieces\\bQueen.png")));
        grid[0][3].setPieceType(5);
        grid[0][4].setImage(new ImageIcon(getClass().getResource("pieces\\bKing.png")));
        grid[0][4].setPieceType(6);
        grid[0][5].setImage(new ImageIcon(getClass().getResource("pieces\\bBishop.png")));
        grid[0][5].setPieceType(4);
        grid[0][6].setImage(new ImageIcon(getClass().getResource("pieces\\bKnight.png")));
        grid[0][6].setPieceType(3);
        grid[0][7].setImage(new ImageIcon(getClass().getResource("pieces\\bRook.png")));
        grid[0][7].setPieceType(2);
        for (int i = 0;i<8;i++){
            grid[1][i].setImage(new ImageIcon(getClass().getResource("pieces\\bPawn.png")));
            grid[1][i].setPieceType(1);
        }
        grid[7][0].setImage(new ImageIcon(getClass().getResource("pieces\\wRook.png")));
        grid[7][0].setPieceType(2);
        grid[7][1].setImage(new ImageIcon(getClass().getResource("pieces\\wKnight.png")));
        grid[7][1].setPieceType(3);
        grid[7][2].setImage(new ImageIcon(getClass().getResource("pieces\\wBishop.png")));
        grid[7][2].setPieceType(4);
        grid[7][3].setImage(new ImageIcon(getClass().getResource("pieces\\wQueen.png")));
        grid[7][3].setPieceType(5);
        grid[7][4].setImage(new ImageIcon(getClass().getResource("pieces\\wKing.png")));
        grid[7][4].setPieceType(6);
        grid[7][5].setImage(new ImageIcon(getClass().getResource("pieces\\wBishop.png")));
        grid[7][5].setPieceType(4);
        grid[7][6].setImage(new ImageIcon(getClass().getResource("pieces\\wKnight.png")));
        grid[7][6].setPieceType(3);
        grid[7][7].setImage(new ImageIcon(getClass().getResource("pieces\\wRook.png")));
        grid[7][7].setPieceType(2);
        for (int i = 0;i<8;i++){
            grid[6][i].setImage(new ImageIcon(getClass().getResource("pieces\\wPawn.png")));
            grid[6][i].setPieceType(1);
        }
    }
    @Override
    public void move(Tile newTile, Tile lastTile) {
        if(newTile.getButton().getBackground().equals(Pieces.RED)||newTile.getButton().getBackground().equals(Pieces.PATH)){
            Tile tmpTile = new Tile(lastTile.getIcon(), null, null, null);
            tmpTile.setPieceColor(lastTile.getPieceColor());
            tmpTile.setPieceType(lastTile.getPieceType());
            if(newTile.getPieceType()==6){
                switch (lastTile.getPieceColor()){
                    case 1:
                        System.out.println("Black wins!");
                        frame.dispose();
                        break;
                    case 2:
                        System.out.println("White wins!");
                        frame.dispose();
                        break;
                }
            }
            lastTile.setPieceColor(0);
            lastTile.setPieceType(0);
            lastTile.setImage(null);

            newTile.setPieceType(tmpTile.getPieceType());
            newTile.setPieceColor(tmpTile.getPieceColor());
            newTile.setImage(tmpTile.getIcon());
            turn = !turn;

        }
        ReadyToMove.isReadyToMove=false;
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                grid[i][j].getButton().setBackground(WHITE);
            }
        }
    }
    @Override
    public Tile GetActive() {
        return currentActive;
    }

    public void clearBoard() {
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                grid[i][j].getButton().setBackground(WHITE);
            }
        }
    }
}