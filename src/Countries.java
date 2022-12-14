public class Countries {
   private String name;
   private double square;
   private int population;
   private boolean exitToSea;

    public Countries (String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public void setSquare(double square) {
        this.square = square;
    }
    public void setExitToSea(boolean exitToSea) {
        this.exitToSea = exitToSea;
    }
    public String getCountriesName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    public double getSquare() {
        return square;
    }
    public boolean getIsExitToSea() {
        return exitToSea;
    }
}
