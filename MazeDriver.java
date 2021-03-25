
/**
 * Write a description of class MazeDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeDriver
{
   public static void main(String[] args)
   {
       Maze m = new Maze();
       MazePlayer mp = new MazePlayer(m.getMaze());
       
       while(!mp.finishedMaze())
       {
           mp.myTurn();
       }
       mp.printMaze();
   }
}
