import becker.robots.*;

public class RelayRace 
{ 

  public static void main(String[] args)
    {
        City stl = new City();
        Robot bob = new Robot(stl, 2,2,Direction.EAST);

        Robot stark = new Robot(stl, 2,5,Direction.EAST);
        Thing baton = new Thing(stl,3,2);
        Robot pete = new Robot(stl,2,12,Direction.WEST);

        bob.setLabel("B");
        stark.setLabel("S");
        pete.setLabel("P");

        bob.turnLeft(); 
        bob.turnLeft(); 
        bob.turnLeft(); 
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.putThing();
        stark.move();
        stark.pickThing();
        stark.move();
        stark.move();
        stark.move();
        stark.move();
        stark.move();
        stark.putThing();
        pete.move();
        pete.pickThing();
        pete.move();
        pete.move();
        pete.move();
        pete.move();
        pete.move();
        pete.move();
        pete.move();
        pete.move();
        pete.move();
        pete.turnLeft();
        pete.move();
        pete.putThing();


    }
}
