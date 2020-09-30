package constants;

public class Constants {
        // Arena config for both real event and simulation
        public static final int ARENA_WIDTH = 20; // 20 by default, for 20*10cm arena
        public static final int ARENA_HEIGHT = 15; // 15 by default, for 15*10cm arena
        public static final int STARTPOINT_HEIGHT = 3;
        public static final int STARTPOINT_WIDTH = 3;
        public static final int GOALPOINT_HEIGHT = 3;
        public static final int GOALPOINT_WIDTH = 3;

        // Constraints in actual moving
        public static final int TIME = -1;
        public static final int SPEED = 1;
        public static final int PERCENTAGE = 100;
        public static final boolean IMAGE_RECOG = false;

        /*
         * // To be clarified // Sensor config to define own range for sensors
         */
        public static final double[][] SENSOR_RANGES = { { 10.0, 80.0 }, { 10.0, 80.0 }, { 10.0, 80.0 }, { 10.0, 80.0 },
                        { 10.0, 80.0 }, { 20.0, 24.8, 32.15, 43, 51.75, 150.0 } };

        // Sensor constants used only in simulation
        public static final int SHORT_SENSOR_MAXRANGE = 3; // This is in number of grid.
        public static final int SHORT_SENSOR_OFFSET = 3; // This is in cm.
        public static final int LONG_SENSOR_MAXRANGE = 7; // This is in number of grid.
        public static final int LONG_SENSOR_OFFSET = 13; // This is in cm.

        public static final int[][] SENSOR_DIRECTION = new int[][] { { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, 0 } };

        // To direct motion of robot
        public static final int LEFT = 0;
        public static final int FORWARD = 1;
        public static final int RIGHT = 2;
        public static final int BACKWARD = 3;

        // Generate Random Map for Simulation. Note: Not guarantee a maneuverable map.
        public static final boolean RANDOM_MAP = false;
        public static final int MAX_OBSTACLES = 16;

        // Used in Map and (possibly used) in both real run and simulation
        public static final String[] POSSIBLE_GRID_LABELS = new String[] { "Unexplored", "Explored", "Obstacle",
                        "Waypoint", "Startpoint", "Endpoint" };
        public static final String UNEXPLORED = POSSIBLE_GRID_LABELS[0];
        public static final String EXPLORED = POSSIBLE_GRID_LABELS[1];
        public static final String OBSTACLE = POSSIBLE_GRID_LABELS[2];
        public static final String WAYPOINT = POSSIBLE_GRID_LABELS[3];
        public static final String STARTPOINT = POSSIBLE_GRID_LABELS[4];
        public static final String ENDPOINT = POSSIBLE_GRID_LABELS[5];

        // Map directions
        public static final int NORTH = 0;
        public static final int EAST = 1;
        public static final int SOUTH = 2;
        public static final int WEST = 3;
        public static final int[] START = { 1, 1 };
        public static final int[] END = { 18, 13 };

        // Connection Constants
        public static final String IP_ADDRESS = "192.168.14.14";
        // public static final String IP_ADDRESS = "192.168.15.15";
        public static final int PORT = 8080;
        public static final int BUFFER_SIZE = 512;

        public static final String START_EXPLORATION = "ES|";
        public static final String FASTEST_PATH = "FS|";
        public static final String IMAGE_STOP = "I";
        public static final String SEND_ARENA = "SendArena";
        public static final String INITIALISING = "starting";
        public static final String SETWAYPOINT = "waypoint";
        public static final String SENSE_ALL = "S";
        public static final String TURN_LEFT = "L";
        public static final String TURN_RIGHT = "R";
        public static final String CALIBRATE = "L|";
        public static final String RIGHTALIGN = "B|";
        public static final String END_TOUR = "N";

        // Connection Acknowledge
        public static final String IMAGE_ACK = "D";

        // To be decided later
        // For Timertask in UI simulator
        public static final int DELAY = 15;

        // For display in UI simulator
        public static final int GRID_HEIGHT = 40;
        public static final int GRID_WIDTH = 40;
        public static final int MARGIN_LEFT = 100;
        public static final int MARGIN_TOP = 100;
        public static final String SIMULATOR_ICON_IMAGE_PATH = ".\\images\\simulator_icon.ico";

        // Image path for UI Simulator
        public static final String UNEXPLORED_IMAGE_PATH = ".\\images\\unexplored_grid.png";
        public static final String EXPLORED_IMAGE_PATH = ".\\images\\explored_grid.png";
        public static final String OBSTACLE_IMAGE_PATH = ".\\images\\obstacle_grid.png";
        public static final String WAYPOINT_IMAGE_PATH = ".\\images\\waypoint_grid.png";
        public static final String STARTPOINT_IMAGE_PATH = ".\\images\\start_grid.png";
        public static final String ENDPOINT_IMAGE_PATH = ".\\images\\end_grid.png";
        public static final String ROBOT_IMAGE_PATH = ".\\images\\robot.png";
        public static final String ROBOT_N_IMAGE_PATH = ".\\images\\pikachuN.gif";
        public static final String ROBOT_E_IMAGE_PATH = ".\\images\\pikachuE.gif";
        public static final String ROBOT_S_IMAGE_PATH = ".\\images\\pikachuS.gif";
        public static final String ROBOT_W_IMAGE_PATH = ".\\images\\pikachuW.gif";
        public static final String DIALOG_ICON_IMAGE_PATH = ".\\images\\letter-r.png";

        public static final String[] GRID_IMAGE_PATH = new String[] { UNEXPLORED_IMAGE_PATH, EXPLORED_IMAGE_PATH,
                        OBSTACLE_IMAGE_PATH, WAYPOINT_IMAGE_PATH, STARTPOINT_IMAGE_PATH, ENDPOINT_IMAGE_PATH };

        public static final String[] ROBOT_IMAGE_PATHS = new String[] { ROBOT_N_IMAGE_PATH, ROBOT_E_IMAGE_PATH,
                        ROBOT_S_IMAGE_PATH, ROBOT_W_IMAGE_PATH };

        // Avoid changing these values below
        public static final int ROBOT_HEIGHT = 100; // By default, this should be twice of the grid height. GRIDHEIGHT *
                                                    // 2
        public static final int ROBOT_WIDTH = 100; // By default, this should be twice of the grid width. GRIDWIDTH * 2
        public static final int HEIGHT = ARENA_HEIGHT * GRID_HEIGHT + MARGIN_TOP;
        public static final int WIDTH = ARENA_WIDTH * GRID_WIDTH + MARGIN_LEFT;
}