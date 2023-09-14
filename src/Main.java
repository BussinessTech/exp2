public class Main {

    private int x;
    private int y;
    private int z;
    private char direction;  // N, S, E, W, U, D
    private char secondry_direction;

    public Main() {
//        this.x = 0;
//        this.y = 0;
//        this.z = 0;
//        this.direction = 'N';

    }

    public String getPositionAndDirection() {
        return "(" + x + ", " + y + ", " + z + ") - " + direction;
    }
    public static void main(String[] args) {
        Main spacecraft = new Main();
        System.out.println("Initial Position: " + spacecraft.getPositionAndDirection());

        // Execute a sequence of commands
       // char[] commands = {'f','f','f','f','f','f','f','f','f','f','f'};
        //spacecraft.executeCommands(commands);

        // Print the final position and direction
        System.out.println("Final Position: " + spacecraft.getPositionAndDirection());
    }
}