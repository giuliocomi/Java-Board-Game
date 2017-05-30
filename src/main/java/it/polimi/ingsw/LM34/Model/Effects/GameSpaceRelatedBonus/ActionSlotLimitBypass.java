package it.polimi.ingsw.LM34.Model.Effects.GameSpaceRelatedBonus;

import it.polimi.ingsw.LM34.Controller.AbstractGameContext;
import it.polimi.ingsw.LM34.Model.Effects.AbstractEffect;
import it.polimi.ingsw.LM34.Model.Player;

import java.util.Observable;
import java.util.Observer;

import static it.polimi.ingsw.LM34.Enums.Controller.ContextType.ACTION_SLOT_CONTEXT;

/**
 * Created by GiulioComi on 16/05/2017.
 */

/*"ludovico ariosto"*/
public class ActionSlotLimitBypass extends AbstractEffect implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        
    }

//action slot
    @Override
    public void applyEffect(AbstractGameContext callerContext, Player player) {
        callerContext.getContextByType(ACTION_SLOT_CONTEXT).addObserver(this);
    }


}
