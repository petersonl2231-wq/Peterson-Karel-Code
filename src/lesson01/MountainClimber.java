import javax.swing.DropMode;

import becker.robots.*;
public class MountainClimber{
  public static void main(String[] args) {

City Mountain = new City();

Robot climber = new Robot(Mountain, 3, 0, Direction.EAST);
Thing flag = new Thing(Mountain,3,1);

Wall one = new Wall(Mountain, 3, 2, Direction.WEST);
Wall two = new Wall(Mountain, 3, 2, Direction.NORTH);
Wall three = new Wall(Mountain, 2, 3, Direction.WEST);
Wall four = new Wall(Mountain, 1, 3, Direction.WEST);
Wall five = new Wall(Mountain, 1, 3, Direction.NORTH);
Wall six = new Wall(Mountain, 1, 3, Direction.EAST);
Wall seven = new Wall(Mountain, 2, 4, Direction.NORTH);
Wall eight = new Wall(Mountain, 2, 4, Direction.EAST);
Wall nine = new Wall(Mountain, 3, 4, Direction.EAST);

climber.move();
climber.pickThing();
climber.turnLeft();
climber.move();
climber.turnLeft();
climber.turnLeft();
climber.turnLeft();
climber.move();
climber.turnLeft();
climber.move();
climber.move();
climber.turnLeft();
climber.turnLeft();
climber.turnLeft();
climber.move();
climber.putThing();
climber.move();
climber.turnLeft();
climber.turnLeft();
climber.turnLeft();
climber.move();
climber.turnLeft();
climber.move();
climber.turnLeft();
climber.turnLeft();
climber.turnLeft();
climber.move();
climber.move();












}
}