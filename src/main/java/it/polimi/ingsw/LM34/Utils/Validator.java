package it.polimi.ingsw.LM34.Utils;


import it.polimi.ingsw.LM34.Exceptions.Validation.IncorrectInputException;
import it.polimi.ingsw.LM34.Model.Cards.LeaderCard;

import java.util.List;
import java.util.logging.Level;

import static it.polimi.ingsw.LM34.Utils.Utilities.LOGGER;

/**
 * This static class is unbelievable useful for validate data inserted by player both client and server side
 * Client side is used as a preliminary approach to avoid malicious input
 *Server side is adopted broadly by all contexts that calls the overloaded methods they need
 * Server side is needed to enforce and grant consistency of the games tate
 */

/*Proudly designed and implemented by 0 :-)*/
public final class Validator {

    private Validator() {}

    /*Validate input based on expected data types and ranges*/
    public static final Integer checkValidity(String input, List<?> data) throws IncorrectInputException {
        try {
            /*Try to extract an Integer from input*/
            Integer inputValue = Integer.parseInt(input);
            checkValidity(inputValue, data);
            return inputValue;
        } catch (Exception e) {
            LOGGER.log(Level.INFO, "Invalid input");
            throw new IncorrectInputException();
        }
    }

    /*Validate input based on expected data types and ranges*/
    public static final void checkValidity(Integer input, List<?> data) throws IncorrectInputException {
        try {
            /*Calculates range*/
            Integer min = 0;
            Integer max = data.size();

            /*Check if input meets the requirements*/
            if(input < min || input > max)
                throw new IncorrectInputException();
        } catch (Exception e) {
            LOGGER.log(Level.INFO, "Incorrect input from client");
            throw new IncorrectInputException();
        }
    }

    /*Validate Number type inputs*/
    public static final void checkValidity(String input) throws IncorrectInputException {
        try {
            Integer.parseInt(input);
        } catch(Exception e) {
            LOGGER.log(Level.INFO, "Invalid input from client");
            throw new IncorrectInputException();
        }
    }

    /*Validate Number type inputs*/
    public static final void checkValidity(Integer input, Integer max) throws IncorrectInputException {
        if(input < 0 || input > max)
            throw new IncorrectInputException();
    }

    public static void checkLeaderValidity(List<LeaderCard> leaderCards, String choice) throws IncorrectInputException {
        for(LeaderCard l : leaderCards)
            if(l.getName().equalsIgnoreCase(choice))
                return;

        throw new IncorrectInputException();
    }
}
