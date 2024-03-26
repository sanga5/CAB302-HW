package obstacles;

public interface Obstacle {
    char getSymbol();
    /**
     * Returns true if the given location is obstructed by the obstacle, and false otherwise
     * @param x The x coordinate of the location
     * @param y The y coordinate of the location
     * @return True if the given location is obstructed by the obstacle, and false otherwise
     */
    boolean isLocationObstructed(int x, int y);
}
