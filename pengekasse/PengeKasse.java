package pengekasse;

import java.util.InputMismatchException;

public class PengeKasse {
  int ettere;
  int toere;
  int femmere;
  int tiere;
  int tyvere;
  public PengeKasse() {
    this.ettere = 0;
    this.toere = 0;
    this.femmere = 0;
    this.tiere = 0;
    this.tyvere = 0;
  }
  public PengeKasse(int ettere, int toere, int femmere, int tiere, int tyvere) {
    this.ettere = ettere;
    this.toere = toere;
    this.femmere = femmere;
    this.tiere = tiere;
    this.tyvere = tyvere;
  }
  public PengeKasse(PengeKasse p) {
    this.ettere = p.ettere;
    this.toere = p.toere;
    this.femmere = p.femmere;
    this.tiere = p.tiere;
    this.tyvere = p.tyvere;
  }
  public String toString() {
    return String.format("[1:%d, 2:%d, 5:%d, 10:%d, 20:%d]", ettere, toere, femmere, tiere, tyvere);
  }
  public void set(int type, int amount) {
    switch (type) {
      case 1:
        this.ettere += amount;
        break;
      case 2:
        this.toere += amount;
        break;
      case 5:
        this.femmere += amount;
        break;
      case 10:
        this.tiere += amount;
        break;
      case 20:
        this.tyvere += amount;
        break;
      default:
      //lul
        throw new InputMismatchException();
    }
  }
  public int sum() {
    return ettere + toere*2 + femmere*5 + tiere*10 + tyvere*20;
  }
  public boolean equals(PengeKasse p) {
    if (this.ettere == p.ettere && this.toere == p.toere && this.femmere == p.femmere && this.tiere == p.tiere && this.tyvere == p.tyvere) return true;
    return false;
  }
  public int get (int type) {
    switch (type) {
      case 1:
        return ettere;
      case 2:
        return toere;
      case 5:
        return femmere;
      case 10: 
        return tiere;
      case 20:
        return tyvere;
      default:
        return 0;
    }
  }
  public int add (PengeKasse p) {
    this.ettere += p.ettere;
    this.toere += p.toere;
    this.femmere += p.femmere;
    this.tiere += p.tiere;
    this.tyvere += p.tyvere;
    return sum();
  }
  public PengeKasse givTilbage(int amount) {
    PengeKasse pengeKasse = new PengeKasse();
    boolean bool = true;
    while (amount > 0 && bool) {
      if (tyvere > 0 && amount >= 20) {
        amount -= 20;
        this.tyvere -= 1;
        pengeKasse.tyvere += 1;
        continue;
      }
      else if (tiere > 0 && amount >= 10) {
        amount -= 10;
        this.tiere -= 1;
        pengeKasse.tiere += 1;
        continue;
      }
      else if (femmere > 0 && amount >= 5) {
        amount -= 5;
        this.femmere -= 1;
        pengeKasse.femmere += 1;
        continue;
      }
      else if (toere > 0 && amount >= 2) {
        amount -= 2;
        this.toere -= 1;
        pengeKasse.toere += 1;
        continue;
      }
      else if (ettere > 0 && amount >= 1) {
        amount -= 1;
        this.ettere -= 1;
        pengeKasse.ettere += 1;
        continue;
      }
      else bool = false;
    }
    return pengeKasse;
  }
}