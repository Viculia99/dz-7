public class Main {
    public static void main(String[] args) {

        for (SolarSystem planet : SolarSystem.values()) {
            System.out.println("Planet: " + planet);
            System.out.println("Order from Sun: " + planet.getOrderFromSun());
            System.out.println("Distance from previous planet: " + planet.getDistanceFromPreviousPlanet());
            System.out.println("Distance from Sun: " + planet.getDistanceFromSun());
            System.out.println("Radius: " + planet.getRadius());
            System.out.println("Previous planet: " + planet.getPreviousPlanet());
            System.out.println("Next planet: " + planet.getNextPlanet());
            System.out.println("____________________________");

        }
    }
}