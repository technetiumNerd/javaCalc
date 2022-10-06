package temperatur;

public class Temperatur {
  // temp in C
  double temperature;
  public Temperatur(double temperature, char type) {
    if (type == 'f') this.setFTemp(temperature);
    else if (type == 'c') this.temperature = temperature;
  }
  public Temperatur(Temperatur temp) {
    this.temperature = temp.temperature;
  }
  public void setFTemp(double temperature) {
    this.temperature = (5d / 9d) * temperature - (17d + (7d/9d));
  }
  public double getFTemp() {
    double returnVal = ((9d / 5d) * temperature) + 32d;
    return returnVal;
  }
  public void setCTemp(double temperature) {
    this.temperature = temperature;
  }
  public double getCTemp() {
    return temperature;
  }
  public boolean equals(Temperatur temp) {
    return this.temperature == temp.temperature ? true : false;
  }
  @Override
  public String toString() {
    return String.format("[C:%.2f, F:%.2f]", getCTemp(), getFTemp());
  }
  public int compareTo(Temperatur temp) {
    if (this.temperature > temp.temperature) return 1;
    else if (this.temperature == temp.temperature) return 0;
    else return -1;
  }
}
