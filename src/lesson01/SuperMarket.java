import becker.robots.*;

public class SuperMarket {

public static void main(String[] args) {
    City SuperMarket = new City();
    

    Wall one = new Wall(SuperMarket,2,3,Direction.EAST);
    Wall two = new Wall(SuperMarket,3,3,Direction.EAST); 
    Wall three = new Wall(SuperMarket,2,3,Direction.WEST); 
    Wall four = new Wall(SuperMarket,3,3,Direction.SOUTH); 
    Wall five = new Wall(SuperMarket,2,3,Direction.NORTH); 
    Robot Maria = new Robot(SuperMarket, 0, 1,Direction.WEST);
    Robot Karel = new Robot(SuperMarket, 3, 3,Direction.EAST);

Maria.setLabel("M");
Karel.setLabel("K");

Thing beeber = new Thing(SuperMarket,0,0);
Thing beeber4 = new Thing(SuperMarket,2,2);
Thing beeber3 = new Thing(SuperMarket,1,0);
Thing beeber2 = new Thing(SuperMarket,1,1);
Thing beeber1 = new Thing(SuperMarket,1,2);


Maria.move();
Maria.pickThing();
Maria.turnLeft();
Maria.move();
Maria.pickThing();
Maria.turnLeft();
Maria.move();
Maria.pickThing();
Karel.turnLeft();
Karel.turnLeft();
Karel.move();  
Karel.turnLeft();
Karel.turnLeft();
Karel.turnLeft();
Karel.move();
Karel.pickThing();
Karel.move();
Karel.pickThing();
Karel.turnLeft();


}



}
