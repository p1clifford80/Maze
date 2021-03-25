
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
