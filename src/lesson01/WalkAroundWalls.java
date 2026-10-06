import becker.robots.*;
public class WalkAroundWalls 
{

public static void main(String[] args) {
City WalkAroundWalls = new City();

Wall side = new Wall(WalkAroundWalls,1,1,Direction.WEST);
Wall sideSecond = new Wall(WalkAroundWalls,2,1,Direction.WEST);
Wall boton = new Wall(WalkAroundWalls,2,2,Direction.SOUTH);
Wall botonSecond = new Wall(WalkAroundWalls,2,1,Direction.SOUTH);
Wall top = new Wall(WalkAroundWalls,1,1,Direction.NORTH);
Wall topsecond = new Wall(WalkAroundWalls,1,2,Direction.NORTH);
Wall eastSide = new Wall(WalkAroundWalls,1,2,Direction.EAST);
Wall eastSideSecond = new Wall(WalkAroundWalls,2,2,Direction.EAST);

Robot go = new Robot(WalkAroundWalls,0,2,Direction.WEST);

go.move();
go.move();
go.turnLeft();
go.move();
go.move();
go.move();
go.turnLeft();
go.move();
go.move();
go.move();
go.turnLeft();
go.move();
go.move();
go.move();
go.turnLeft();
go.move();




    
}
}
