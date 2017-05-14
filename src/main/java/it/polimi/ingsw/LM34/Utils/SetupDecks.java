package it.polimi.ingsw.LM34.Utils;

import it.polimi.ingsw.LM34.Model.Cards.AbstractDevelopmentCard;

import java.util.ArrayList;

/**
 * Created by GiulioComi on 07/05/2017.
 */

public final class SetupDecks {
    private static final Integer TOTAL_PERIODS=3;

    public static ArrayList<AbstractDevelopmentCard> orderCardByPeriod(ArrayList<AbstractDevelopmentCard> dci) {
        ArrayList<AbstractDevelopmentCard> temp = new ArrayList();

        for (Integer period = 1; period <= TOTAL_PERIODS; period++)
            for (AbstractDevelopmentCard d : dci)
                if (d.getPeriod() == period)
                    temp.add(d);
        return temp;

    }
}
