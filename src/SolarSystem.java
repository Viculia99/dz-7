public enum SolarSystem {
    MERCURY (1, 0, 58000000, 2440),
    VENUS (2, 108000000, 108000000 - MERCURY.distanceFromPreviousPlanet, 6052),
    EARTH (3, 150000000, 150000000 - VENUS.distanceFromPreviousPlanet, 6371),
    MARS (4, 228000000, 228000000 - EARTH.distanceFromPreviousPlanet, 3389),
    JUPITER (5, 778000000, 778000000 - MARS.distanceFromPreviousPlanet, 69911),
    SATURN (6, 1430000000, 1430000000 - JUPITER.distanceFromPreviousPlanet, 58232),
    URANUS (7, 2870000000L, 2870000000L - SATURN.distanceFromPreviousPlanet, 25362),
    NEPTUNE (8, 4500000000L, 4500000000L - URANUS.distanceFromPreviousPlanet, 24622);

    private final int orderFromSun;
    private final long distanceFromSun;
    private final long distanceFromPreviousPlanet;
    private final int radius;
    private SolarSystem previousPlanet;
    private SolarSystem nextPlanet;
    SolarSystem(int orderFromSun, long distanceFromSun, long distanceFromPreviousPlanet, int radius){
        this.orderFromSun = orderFromSun;
        this.distanceFromSun = distanceFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.radius = radius;
    }
    static {
        SolarSystem[] planets = SolarSystem.values();
        for (int i = 0; i < planets.length; i++) {
            int previousPlanetIndex = i - 1;
            int nextPlanetIndex = i + 1;

            if (previousPlanetIndex < 0) {
                previousPlanetIndex = planets.length - 1;
            }
            if (nextPlanetIndex >= planets.length) {
                nextPlanetIndex = 0;
            }
            planets[i].previousPlanet = planets[previousPlanetIndex];
            planets[i].nextPlanet = planets[nextPlanetIndex];
        }
    }
    public int getOrderFromSun(){
        return orderFromSun;
    }
    public long getDistanceFromSun(){
        return distanceFromSun;
    }
    public long getDistanceFromPreviousPlanet(){
        return distanceFromPreviousPlanet;
    }
    public int getRadius(){
        return radius;
    }
    public SolarSystem getPreviousPlanet(){
        return previousPlanet;
    }
    public SolarSystem getNextPlanet(){
        return nextPlanet;
    }

}
