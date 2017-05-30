package it.polimi.ingsw.LM34.Model.Effects;

import it.polimi.ingsw.LM34.Controller.AbstractGameContext;
import it.polimi.ingsw.LM34.Controller.NonInteractableContexts.ResourceIncomeContext;
import it.polimi.ingsw.LM34.Model.Player;
import it.polimi.ingsw.LM34.Model.Resources;

import java.util.Observable;
import java.util.Observer;

import static it.polimi.ingsw.LM34.Enums.Controller.ContextType.CURCH_REPORT_CONTEXT;
import static it.polimi.ingsw.LM34.Enums.Controller.ContextType.RESOURCE_INCOME_CONTEXT;

/**
 * Created by GiulioComi on 16/05/2017.
 *
 * This class represents Sisto IV peculiar effect and registers itself to CurchReportContext
 */
public class CurchSupportBonus extends AbstractEffect implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        AbstractGameContext callerContext = (AbstractGameContext) o;
        Resources reward = new Resources(0,0,5);
        Player player = (Player) arg;
        ((ResourceIncomeContext)callerContext.getContextByType(RESOURCE_INCOME_CONTEXT)).handleResources(player, reward);
    }

//curch report

    @Override
    public void applyEffect(AbstractGameContext callerContext, Player player) {
        callerContext.getContextByType(CURCH_REPORT_CONTEXT).addObserver(this);
    }

    @Override
    public boolean isOncePerRound() {
        return true;
    }

}
