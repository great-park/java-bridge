package bridge.domain.vo;

import static bridge.domain.enumeration.ErrorMessage.*;
import static bridge.domain.enumeration.GameCommandType.*;

public class GameCommand {

    private final String gameCommand;
    private final int GAME_COMMAND_MAX_LENGTH = 1;

    public static GameCommand createGameCommand(String gameCommand) {
        return new GameCommand(gameCommand);
    }

    public GameCommand(String gameCommand){
        validateGameCommand(gameCommand);
        this.gameCommand = gameCommand;
    }

    public String getGameCommand() {
        return this.gameCommand;
    }

    public void validateGameCommand(String gameCommand) {
        if (gameCommand.length() != GAME_COMMAND_MAX_LENGTH) {
            throw new IllegalArgumentException(GAME_COMMAND_LENGTH_IS_NOT_ONE.getErrorMessage());
        }
        if (!gameCommand.equals(RETRY.getGameCommandType()) && !gameCommand.equals(QUIT.getGameCommandType())) {
            throw new IllegalArgumentException(GAME_COMMAND_IS_NOT_R_AND_Q.getErrorMessage());
        }
    }
}
