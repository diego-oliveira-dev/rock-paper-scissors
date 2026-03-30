package components;

public class Game {
    public static Result play(Move playerMove, Move computerMove) {
        if (playerMove == computerMove) {
            return Result.DRAW;
        } 
        else if (
            (playerMove == Move.ROCK && computerMove == Move.SCISSORS) ||
            (playerMove == Move.PAPER && computerMove == Move.ROCK) ||
            (playerMove == Move.SCISSORS && computerMove == Move.PAPER)
        ) {
            return Result.WIN;
        } 
        else {
            return Result.LOSS;
        }
    }
}
