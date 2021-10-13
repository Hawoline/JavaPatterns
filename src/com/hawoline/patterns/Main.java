package com.hawoline.patterns;


import com.hawoline.patterns.behavioural.state.Player;
import com.hawoline.patterns.behavioural.state.UI;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
