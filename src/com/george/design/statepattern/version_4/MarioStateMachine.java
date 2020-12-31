package com.george.design.statepattern.version_4;

public class MarioStateMachine {
    private int score;
    private IMario currentState;

    public MarioStateMachine() {
        this.score = score;
        this.currentState = SmallMario.getInstance();
    }

    public void obtainMushRoom(){
        this.currentState.obtainMushRoom(this);
    }

    public void obtainCape(){
        this.currentState.obtainCape(this);
    }

    public void obtainFireFlower(){
        this.currentState.obtainFireFlower(this);
    }

    public void meetMonster(){
        this.currentState.meetMonster(this);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public IMario getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }
}
