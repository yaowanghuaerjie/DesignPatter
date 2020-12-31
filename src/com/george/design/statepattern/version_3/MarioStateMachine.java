package com.george.design.statepattern.version_3;

public class MarioStateMachine{
    private int score;
    private IMario currentState;

    public MarioStateMachine(int score, IMario currentState) {
        this.score = 0;
        this.currentState = currentState;
    }

    public void obtainMushRoom(){
        this.currentState.obtainMushRoom();;
    }

    public void obtainCape(){
        this.currentState.obtainCape();
    }

    public void obtainFireFlower(){
        this.currentState.obtainFireFlower();
    }

    public void meetMonster(){
        this.currentState.meetMonster();
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
