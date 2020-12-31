package com.george.design.statepattern.version_1;

import com.george.design.statepattern.State;

/**
 * 方式一：分支逻辑法
 */
public class MarioStateMachine {
    private int score;
    private State currentState;

    public MarioStateMachine(int score, State currentState) {
        this.score = score;
        this.currentState = currentState;
    }

    public void obtainMushRoom() {
        if (currentState.equals(State.SMALL)) {
            this.currentState = State.SMALL;
            this.score += 100;
        }
    }

    public void obtainCape() {
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)) {
            this.currentState = State.CAPE;
            this.score += 200;
        }
    }

    public void obtainFireFlower() {
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)) {
            this.currentState = State.FIRE;
            this.score += 300;
        }
    }

    public void meetMonster() {
        if (currentState.equals(State.SUPER)) {
            this.currentState = State.SMALL;
            this.score -= 100;
            return;
        }
        if (currentState.equals(State.CAPE)) {
            this.currentState = State.SMALL;
            this.score-=200;
            return;
        }
        if(currentState.equals(State.FIRE)){
            this.currentState =State.SMALL;
            this.score-=300;
        }
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }

}
