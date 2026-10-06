import becker.robots.*;
public class FetchPaper { 


public static void main(String[] args) {
City FetchPaper = new City();
 
Wall one = new Wall(FetchPaper, 1, 1, Direction.NORTH);
Wall two = new Wall(FetchPaper, 1, 1, Direction.WEST);
Wall three = new Wall(FetchPaper, 2, 1, Direction.WEST);
Wall four = new Wall(FetchPaper, 2, 1, Direction.SOUTH);
Wall five = new Wall(FetchPaper, 1, 2,Direction.NORTH);
Wall six = new Wall(FetchPaper, 1, 2, Direction.EAST);
Wall seven = new Wall(FetchPaper, 1,2, Direction.SOUTH);

Robot news = new Robot(FetchPaper, 1, 2, Direction.SOUTH);
Thing newsPaper = new Thing(FetchPaper,2,2);

news.turnLeft();
news.turnLeft();
news.turnLeft();
news.move();
news.turnLeft();
news.move();
news.turnLeft();
news.move();
news.pickThing();
news.turnLeft();
news.turnLeft();
news.move();
news.turnLeft();
news.turnLeft();
news.turnLeft();
news.move();
news.turnLeft();
news.turnLeft();
news.turnLeft();
news.move();
news.turnLeft();
news.turnLeft();
news.turnLeft();




}
}