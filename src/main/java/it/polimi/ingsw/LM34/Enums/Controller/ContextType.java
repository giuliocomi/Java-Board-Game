package it.polimi.ingsw.LM34.Enums.Controller;

/**
 * Created by GiulioComi on 17/05/2017.
 */
public enum ContextType {
    ACTION_SLOT_CONTEXT,
    CURCH_REPORT_CONTEXT,
    END_GAME_CONTEXT,
    HARVEST_AREA_CONTEXT,
    PRODUCTION_AREA_CONTEXT,
    RESOURCE_INCOME_CONTEXT,
    TOWERS_CONTEXT,
    INCREASE_PAWNS_VALUE_BY_SERVANTS_CONTEXT,
    RESOURCE_EXCHANGE_CONTEXT,
    USE_COUNCIL_PRIVILEGE_CONTEXT,
    MARKET_AREA_CONTEXT,
    LEADER_ACTIVATE_OR_DISCARD_CONTEXT,
    COUNCIL_PALACE_CONTEXT,
    TURN_CONTEXT;


    /*Method used to allow a corrispondence between ContexType and PlayerSelectionableContexts*/
    public final Boolean equals(PlayerSelectionableContexts context) {
        return this.toString() == context.toString();
    }
}
