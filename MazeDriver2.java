
/**
 * Write a description of class MazeDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeDriver2
{
    public static void main(String[] args)
    {
        Maze m = new Maze();
        m.makeMaze(6,8);
        MazePlayer2 mp2 = new MazePlayer2(m.getMaze());
        
        mp2.printMaze();
        
    }
}
