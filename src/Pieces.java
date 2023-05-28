import java.awt.*;
public class Pieces {
    private Tile[][] grid;
    public Pieces(Tile[][] grid) {
        this.grid=grid;
    }
    public static final Color PATH = new Color(123, 199, 75);
    public static final Color RED = new Color(211, 46, 46);
    public void pawnMove(Tile newTile, int pieceColor){
        int x = newTile.getpX();
        int y = newTile.getpY();
        if(x==1&&pieceColor==1){
            for(int i =1; i<3; i++){
                if(grid[x+i][y].getPieceColor()==0){
                    grid[x+i][y].getButton().setBackground(PATH);
                }
                if (x+1<8&&y+1<8&&grid[x+1][y+1].getPieceColor()==2) {
                    grid[x+1][y+1].getButton().setBackground(RED);
                    break;
                }
                if (x+1<8&&y-1>-1&&grid[x+1][y-1].getPieceColor()==2) {
                    grid[x+1][y-1].getButton().setBackground(RED);
                    break;
                }
            }
        }
        else if (x==6&&pieceColor==2) {
            for(int i =1; i<3; i++){
                if(grid[x-i][y].getPieceColor()==0){
                    grid[x-i][y].getButton().setBackground(PATH);
                }
                if (x-1>-1&&y+1<8&&grid[x-1][y+1].getPieceColor()==1) {
                    grid[x-1][y+1].getButton().setBackground(RED);
                    break;
                }
                if (x-1>-1&&y-1>-1&&grid[x-1][y-1].getPieceColor()==1) {
                    grid[x-1][y-1].getButton().setBackground(RED);
                    break;
                }
            }
        }
        else{
            if(pieceColor == 1){
                if(grid[x+1][y].getPieceColor()==0){
                    grid[x+1][y].getButton().setBackground(PATH);
                }
                if (x+1<8&&y+1<8&&grid[x+1][y+1].getPieceColor()==2) {
                    grid[x+1][y+1].getButton().setBackground(RED);
                }
                if (x+1<8&&y-1>-1&&grid[x+1][y-1].getPieceColor()==2) {
                    grid[x+1][y-1].getButton().setBackground(RED);
                }
            }
            else{
                if(grid[x-1][y].getPieceColor()==0){
                    grid[x-1][y].getButton().setBackground(PATH);
                }
                if (x-1>-1&&y+1<8&&grid[x-1][y+1].getPieceColor()==1) {
                    grid[x-1][y+1].getButton().setBackground(RED);
                }
                if (x-1>-1&&y-1>-1&&grid[x-1][y-1].getPieceColor()==1) {
                    grid[x-1][y-1].getButton().setBackground(RED);
                }
            }
        }
    }
    public void rookMove(Tile newTile, int pieceColor){
        int x = newTile.getpX();
        int y = newTile.getpY();
        for(int i = 1;i<8;i++){
            if (x+i<8){
                if(grid[x+i][y].getPieceColor()==0){
                    grid[x+i][y].getButton().setBackground(PATH);
                }
                else if (grid[x+i][y].getPieceColor()!=pieceColor) {
                    grid[x+i][y].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (y+i<8){
                if(grid[x][y+i].getPieceColor()==0){
                    grid[x][y+i].getButton().setBackground(PATH);
                }
                else if (grid[x][y+i].getPieceColor()!=pieceColor) {
                    grid[x][y+i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (x-i>-1){
                if(grid[x-i][y].getPieceColor()==0){
                    grid[x-i][y].getButton().setBackground(PATH);
                }
                else if (grid[x-i][y].getPieceColor()!=pieceColor) {
                    grid[x-i][y].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (y-i>-1){
                if(grid[x][y-i].getPieceColor()==0){
                    grid[x][y-i].getButton().setBackground(PATH);
                }
                else if (grid[x][y-i].getPieceColor()!=pieceColor) {
                    grid[x][y-i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
    }
    public void knightMove(Tile newTile, int pieceColor){
        int x = newTile.getpX();
        int y = newTile.getpY();
        if(x+1<8&&y+2<8){
            if(grid[x+1][y+2].getPieceColor()==0){
                grid[x+1][y+2].getButton().setBackground(PATH);
            }
            else if (grid[x+1][y+2].getPieceColor()!=pieceColor) {
                grid[x+1][y+2].getButton().setBackground(RED);
            }
        }
        if(x-1>-1&&y+2<8){
            if(grid[x-1][y+2].getPieceColor()==0){
                grid[x-1][y+2].getButton().setBackground(PATH);
            }
            else if (grid[x-1][y+2].getPieceColor()!=pieceColor) {
                grid[x-1][y+2].getButton().setBackground(RED);
            }
        }
        if(x+1<8&&y-2>-1){
            if(grid[x+1][y-2].getPieceColor()==0){
                grid[x+1][y-2].getButton().setBackground(PATH);
            }
            else if (grid[x+1][y-2].getPieceColor()!=pieceColor) {
                grid[x+1][y-2].getButton().setBackground(RED);
            }
        }
        if(x-1>-1&&y-2>-1){
            if(grid[x-1][y-2].getPieceColor()==0){
                grid[x-1][y-2].getButton().setBackground(PATH);
            }
            else if (grid[x-1][y-2].getPieceColor()!=pieceColor) {
                grid[x-1][y-2].getButton().setBackground(RED);
            }
        }
        if(x+2<8&&y+1<8){
            if(grid[x+2][y+1].getPieceColor()==0){
                grid[x+2][y+1].getButton().setBackground(PATH);
            }
            else if (grid[x+2][y+1].getPieceColor()!=pieceColor) {
                grid[x+2][y+1].getButton().setBackground(RED);
            }
        }
        if(x-2>-1&&y+1<8){
            if(grid[x-2][y+1].getPieceColor()==0){
                grid[x-2][y+1].getButton().setBackground(PATH);
            }
            else if (grid[x-2][y+1].getPieceColor()!=pieceColor) {
                grid[x-2][y+1].getButton().setBackground(RED);
            }
        }
        if(x+2<8&&y-1>-1){
            if(grid[x+2][y-1].getPieceColor()==0){
                grid[x+2][y-1].getButton().setBackground(PATH);
            }
            else if (grid[x+2][y-1].getPieceColor()!=pieceColor) {
                grid[x+2][y-1].getButton().setBackground(RED);
            }
        }
        if(x-2>-1&&y-1>-1){
            if(grid[x-2][y-1].getPieceColor()==0){
                grid[x-2][y-1].getButton().setBackground(PATH);
            }
            else if (grid[x-2][y-1].getPieceColor()!=pieceColor) {
                grid[x-2][y-1].getButton().setBackground(RED);
            }
        }
    }
    public void bishopMove(Tile newTile, int pieceColor){
        int x = newTile.getpX();
        int y = newTile.getpY();
        for(int i = 1;i<8;i++){
            if (x+i<8&&y+i<8){
                if(grid[x+i][y+i].getPieceColor()==0){
                    grid[x+i][y+i].getButton().setBackground(PATH);
                }
                else if (grid[x+i][y+i].getPieceColor()!=pieceColor) {
                    grid[x+i][y+i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (y+i<8&&x-i>-1){
                if(grid[x-i][y+i].getPieceColor()==0){
                    grid[x-i][y+i].getButton().setBackground(PATH);
                }
                else if (grid[x-i][y+i].getPieceColor()!=pieceColor) {
                    grid[x-i][y+i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (x-i>-1&&y-i>-1){
                if(grid[x-i][y-i].getPieceColor()==0){
                    grid[x-i][y-i].getButton().setBackground(PATH);
                }
                else if (grid[x-i][y-i].getPieceColor()!=pieceColor) {
                    grid[x-i][y-i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (y-i>-1&&x+i<8){
                if(grid[x+i][y-i].getPieceColor()==0){
                    grid[x+i][y-i].getButton().setBackground(PATH);
                }
                else if (grid[x+i][y-i].getPieceColor()!=pieceColor) {
                    grid[x+i][y-i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
    }
    public void queenMove(Tile newTile, int pieceColor){
        int x = newTile.getpX();
        int y = newTile.getpY();
        for(int i = 1;i<8;i++){
            if (x+i<8){
                if(grid[x+i][y].getPieceColor()==0){
                    grid[x+i][y].getButton().setBackground(PATH);
                }
                else if (grid[x+i][y].getPieceColor()!=pieceColor) {
                    grid[x+i][y].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (y+i<8){
                if(grid[x][y+i].getPieceColor()==0){
                    grid[x][y+i].getButton().setBackground(PATH);
                }
                else if (grid[x][y+i].getPieceColor()!=pieceColor) {
                    grid[x][y+i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (x-i>-1){
                if(grid[x-i][y].getPieceColor()==0){
                    grid[x-i][y].getButton().setBackground(PATH);
                }
                else if (grid[x-i][y].getPieceColor()!=pieceColor) {
                    grid[x-i][y].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (y-i>-1){
                if(grid[x][y-i].getPieceColor()==0){
                    grid[x][y-i].getButton().setBackground(PATH);
                }
                else if (grid[x][y-i].getPieceColor()!=pieceColor) {
                    grid[x][y-i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (x+i<8&&y+i<8){
                if(grid[x+i][y+i].getPieceColor()==0){
                    grid[x+i][y+i].getButton().setBackground(PATH);
                }
                else if (grid[x+i][y+i].getPieceColor()!=pieceColor) {
                    grid[x+i][y+i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (y+i<8&&x-i>-1){
                if(grid[x-i][y+i].getPieceColor()==0){
                    grid[x-i][y+i].getButton().setBackground(PATH);
                }
                else if (grid[x-i][y+i].getPieceColor()!=pieceColor) {
                    grid[x-i][y+i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (x-i>-1&&y-i>-1){
                if(grid[x-i][y-i].getPieceColor()==0){
                    grid[x-i][y-i].getButton().setBackground(PATH);
                }
                else if (grid[x-i][y-i].getPieceColor()!=pieceColor) {
                    grid[x-i][y-i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
        for(int i = 1;i<8;i++){
            if (y-i>-1&&x+i<8){
                if(grid[x+i][y-i].getPieceColor()==0){
                    grid[x+i][y-i].getButton().setBackground(PATH);
                }
                else if (grid[x+i][y-i].getPieceColor()!=pieceColor) {
                    grid[x+i][y-i].getButton().setBackground(RED);
                    break;
                }
                else {
                    break;
                }
            }
        }
    }
    public void kingMove(Tile newTile, int pieceColor){
        int x = newTile.getpX();
        int y = newTile.getpY();
        if(x+1<8){
            if(grid[x+1][y].getPieceColor()==0){
                grid[x+1][y].getButton().setBackground(PATH);
            }
            else if (grid[x+1][y].getPieceColor()!=pieceColor) {
                grid[x+1][y].getButton().setBackground(RED);
            }
        }
        if(x-1>-1){
            if(grid[x-1][y].getPieceColor()==0){
                grid[x-1][y].getButton().setBackground(PATH);
            }
            else if (grid[x-1][y].getPieceColor()!=pieceColor) {
                grid[x-1][y].getButton().setBackground(RED);
            }
        }
        if(y-1>-1){
            if(grid[x][y-1].getPieceColor()==0){
                grid[x][y-1].getButton().setBackground(PATH);
            }
            else if (grid[x][y-1].getPieceColor()!=pieceColor) {
                grid[x][y-1].getButton().setBackground(RED);
            }
        }
        if(y+1<8){
            if(grid[x][y+1].getPieceColor()==0){
                grid[x][y+1].getButton().setBackground(PATH);
            }
            else if (grid[x][y+1].getPieceColor()!=pieceColor) {
                grid[x][y+1].getButton().setBackground(RED);
            }
        }
        if(x+1<8&&y+1<8){
            if(grid[x+1][y+1].getPieceColor()==0){
                grid[x+1][y+1].getButton().setBackground(PATH);
            }
            else if (grid[x+1][y+1].getPieceColor()!=pieceColor) {
                grid[x+1][y+1].getButton().setBackground(RED);
            }
        }
        if(x-1>-1&&y+1<8){
            if(grid[x-1][y+1].getPieceColor()==0){
                grid[x-1][y+1].getButton().setBackground(PATH);
            }
            else if (grid[x-1][y+1].getPieceColor()!=pieceColor) {
                grid[x-1][y+1].getButton().setBackground(RED);
            }
        }
        if(x+1<8&&y-1>-1){
            if(grid[x+1][y-1].getPieceColor()==0){
                grid[x+1][y-1].getButton().setBackground(PATH);
            }
            else if (grid[x+1][y-1].getPieceColor()!=pieceColor) {
                grid[x+1][y-1].getButton().setBackground(RED);
            }
        }
        if(x-1>-1&&y-1>-1){
            if(grid[x-1][y-1].getPieceColor()==0){
                grid[x-1][y-1].getButton().setBackground(PATH);
            }
            else if (grid[x-1][y-1].getPieceColor()!=pieceColor) {
                grid[x-1][y-1].getButton().setBackground(RED);
            }
        }
    }
}