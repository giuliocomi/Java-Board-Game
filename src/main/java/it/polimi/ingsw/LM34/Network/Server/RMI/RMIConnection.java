package it.polimi.ingsw.LM34.Network.Server.RMI;

import it.polimi.ingsw.LM34.Enums.Controller.PlayerSelectableContexts;
import it.polimi.ingsw.LM34.Model.Boards.GameBoard.Market;
import it.polimi.ingsw.LM34.Network.Client.RMI.RMIClientInterface;
import it.polimi.ingsw.LM34.Network.Server.AbstractConnection;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by vladc on 5/29/2017.
 */
public class RMIConnection extends AbstractConnection {
    private RMIClientInterface clientRMI;

    public RMIConnection(RMIClientInterface rmiClient) {
        this.clientRMI = rmiClient;
    }

    @Override
    public Integer contextSelection(List<PlayerSelectableContexts> contexts) {
        try {
            return clientRMI.contextSelection(contexts);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public Integer marketSlotSelection(Market market) {
        try {
            return clientRMI.marketSlotSelection(market);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /*public void loginResult(Boolean result) {
        clientRMI.loginResult(result);
    }*/
}
