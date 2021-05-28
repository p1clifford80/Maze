
/**
 * Write a description of class Maze here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maze
{
    private String[][] maze;

    /**
     * Constructor for objects of class Maze
     */
    public Maze()
    {
        String[][] temp = 
                  {  {"x","s","x","x","x","x","x","x","x","x"},
                     {"x","o","x","o","o","o","x","x","x","x"},
                     {"x","o","o","o","x","o","x","o","o","o"},
                     {"x","x","x","x","x","o","x","o","x","o"}, 
                     {"x","x","x","o","o","o","x","o","x","o"},
                     {"o","o","o","o","x","x","x","o","x","o"},
                     {"o","x","x","x","x","x","x","o","x","o"},
                     {"o","o","o","o","o","o","o","o","x","f"}             
                  };
         maze = temp; 
    }

    public void makeMaze(int rNum, int cNum)
    {
        String[][] randomMaze = new String[rNum][cNum];
        for(int r = 0; r<randomMaze.length; r++)
        {
            for (int c = 0; c<randomMaze[0].length; c++)
                randomMaze[r][c] ="x";
        }
        boolean isOnTop = false;
        if(Math.random()>0.5) // s is on top
        {   isOnTop = true;
            int c = (int)(Math.random()*randomMaze[0].length);
            randomMaze[0][c] = "S";
        }
        else // S is on the side
        {
            int r = (int)(Math.random()*randomMaze.length);
            randomMaze[r][0] = "S";
        }
        randomMaze = this.makePath(randomMaze, isOnTop);
        this.maze = randomMaze;
    }
    
    public String[][] makePath(String[][] m, boolean top)
    {
        int xPos = 0, yPos = 0, direction = 2;// dir: 0=u, 1=r, 2=d, 3=l
        if(top)
            for(int c = 0; c<m[0].length; c++)
                if (m[0][c].equals("S"))
                    yPos = c;
        else 
        {
            direction = 1;
            for(int r = 0; r<m.length; r++)
                if (m[r][0].equals("S"))
                    xPos = r;
        }
        return m;   
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String[][] getMaze()
    {
        return maze;
    }
    
}
