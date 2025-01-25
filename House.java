public class House extends Building {
    private int numberOfRooms;

    public House(int height, String color, int numberOfRooms) {
        super(height, color);
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public static void main(String[] args) {
        Building building = new Building(10, "Blue");
        House house = new House(12, "Red", 5);
        System.out.println(building.getColor());
        System.out.println(house.getColor());
    }
}
