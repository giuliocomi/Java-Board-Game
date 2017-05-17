package it.polimi.ingsw.LM34.Controller.GameContexts;

import it.polimi.ingsw.LM34.Model.Player;
import javafx.beans.InvalidationListener;

import java.util.Observable;

/**
 * Created by GiulioComi on 15/05/2017.
 */
public class EndGameContext  extends AbstractGameContext implements ContextInterface {
    public void initContext(Player player) {
        setChanged();
        notifyObservers(player);
    }

    public void endContext() {
        setChanged();
        notifyObservers("siamo alla fine del game");
    }

    }

