package com.xom.study;

import java.util.HashMap;
import java.util.Map;

public class TieScore extends Score {

  public TieScore(Player player1, Player player2) {
    super(player1, player2);
  }

  private static Map<Integer, String> scoreNames() {
    return new HashMap<Integer, String>() {
      private static final long serialVersionUID = 1L;

      {
        put(0, "Love");
        put(1, "Fifteen");
        put(2, "Thirty");
      }
    };
  }

  public Boolean isAppliable() {
    return player1.isInATieWith(player2);
  }

  @Override
  public String toString() {
    return player1.getScore() > 2 ? "Deuce" : nameFor(player1.getScore()) + "-All";
  }

  private String nameFor(Integer score) {
    return scoreNames().get(score);
  }
}
