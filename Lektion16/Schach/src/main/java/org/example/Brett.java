package org.example;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }

  public Brett kombiniere(Brett b) {
    Brett res = new Brett();
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        res.brett[i][j] = this.brett[i][j] || b.brett[i][j];
      }
    }
    return res;
  }
}
