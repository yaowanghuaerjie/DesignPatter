package com.george.design.statepattern.version_3;

import com.george.design.statepattern.State;

public interface IMario {
    State getName();

    void obtainMushRoom();

    void obtainCape();

    void obtainFireFlower();

    void meetMonster();
}
