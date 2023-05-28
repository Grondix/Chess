import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TileActionListener implements ActionListener {

    private ColorChangeListener listener;
    private Tile parentTile;
    private Boolean isReadyToMove;
    MoveListener moveListener;
    GetActiveTile getActive;

    public TileActionListener(ColorChangeListener listener, Tile parentTile, MoveListener moveListener, GetActiveTile getActive) {
        this.listener = listener;
        this.parentTile = parentTile;
        this.isReadyToMove = ReadyToMove.isReadyToMove;
        this.moveListener = moveListener;
        this.getActive = getActive;
    }

    @Override
    public void actionPerformed(ActionEvent arg0)
    {
        if(ReadyToMove.isReadyToMove)
        {
            moveListener.move(parentTile, getActive.GetActive());
        }else{
            listener.changeColors(parentTile);
        }
    }
}
