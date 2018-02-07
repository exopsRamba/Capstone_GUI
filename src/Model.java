import java.io.IOException;
import java.util.ArrayList;

public class Model {
    private static final int FLEET_BOAT_COUNT = 1;

    private Controller controller;
    private Fleet fleet;
    private ArrayList<Obstacle> obstacles;
    private Grid mapOfLake;

    public void broadcastCoordinates(Coordinate c) {
        // TODO: figure out broadcasting
    }

    public Grid getGrid() {
        return mapOfLake;
    }

    public Fleet getFleet() {
        return fleet;
    }

    Model(Controller c) throws IOException {
        controller = c;
        mapOfLake = new Grid();

        // TODO: ITERATION 2: Add an 'add boat' function somewhere on gui
        // maybe add a scroll to zoom in feature too
        ArrayList<Boat> boats = new ArrayList<>();
        boats.add(new Boat(100, 100, (mapOfLake.calculateCoordinate(100, 100, View.width, View.height))));
        fleet = new Fleet(boats);
    }

    public void initialize()  {

    }

    void update() {

    }
}
