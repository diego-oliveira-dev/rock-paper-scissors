package components;

import java.util.concurrent.ThreadLocalRandom;

public enum Move {
    ROCK,
    PAPER,
    SCISSORS;

    public static Move randomMove() {
        Move[] moves = values();
        return moves[ThreadLocalRandom.current().nextInt(moves.length)];
    }
}
