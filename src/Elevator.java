public class Elevator {
    public boolean dorOpen = false;
    public int currentFlor = 1;
    public final int MAX_FLOORS = 10;
    public final int MIN_FLOORS = 1;

     public void openDor() {
        System.out.println("Closing Dor");
        dorOpen = true;
        System.out.println("Door is open");
    }

    public void closeDor() {
        System.out.println("Closing door");
        dorOpen = false;
        System.out.println("Door is closed");
    }

    public void goUp() {
        System.out.println("Going up one floor.");
        currentFlor++;
        System.out.println("Floor: " + currentFlor);
    }

    public void goDown() {
        System.out.println("Going down one floor");
        currentFlor--;
        System.out.println("Floor: " + currentFlor);
    }

    public int getFloor() {
         return currentFlor;
    }
}

