/**
 * Write a description of class MazePlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazePlayer2
{
    // instance variables - replace the example below with your own
    private int moves;
    private int turnCounter;
    private int row;
    private int col;
    private String[][] myMaze;
    private int direction;
    private boolean backTrack;

    /**
     * Constructor for objects of class MazePlayer
     */
    public MazePlayer2(String[][] m)
    {
        moves = 0;
        turnCounter = 0;
        myMaze = m;
        backTrack = false;
        boolean top = false;
        for(int i=0; i<myMaze[0].length; i++)
        {
            if ( myMaze[0][i].equals("s") )
            {
                top = true;
                row = 0;
                col=i;
                direction = 180;
                i = myMaze[0].length;
            }
        }
        if( !top )
        {
            for(int i=0; i<myMaze.length; i++)
            {
                if ( myMaze[i][0].equals("s") )
                {
                    row = i;
                    col=0;
                    direction = 90;
                    i = myMaze.length;
                }
            }
        }
    }
    
    public void turn90()
    {
        turnCounter++;
        if(turnCounter != 2 )
            direction += 90;
        else
        {
            turnCounter++;
            direction += 180;
        }
        direction = direction%360;
        if ( turnCounter == 4 )// at a deadend. Must go back
        {
            this.direction += 180;
            
            goBack();
            backTrack = true;
        }
    }
    
    public void goBack()
    {
        
    }
    
    public void myTurn()
    {
        if(this.backTrack == false ) // moving in uncharted territory
        {
            if( canMoveAhead() )
                moveForward();
            else 
                turn90();
        }
        else // moving back the way I came. Looking for a different path.
        {
            
        }
    }
    
    public void moveForward()
    {
        turnCounter = 0;
        if(direction == 0) 
            row--;
        else if( direction == 90 )
            col++;
        else if (direction ==180)
            row++;
        else
            col--;
        
        if(! myMaze[row][col].equals("f"))
            myMaze[row][col] = "M";
    }

    public boolean canMoveAhead()
    {
        boolean answer = true;
        
        if( direction == 0 )
        {
            if( row == 0 || myMaze[row-1][col].equals("x") )
                answer = false;
        }
        else if( direction == 180 )
        {
            if( row == myMaze.length-1 || myMaze[row+1][col].equals("x"))
                answer = false;
        }
        else if( direction == 270 )
        {
            if( col == 0 || myMaze[row][col-1].equals("x"))
                answer = false;
        }
        else // direction is 90
        {
            if( col == myMaze[0].length-1 || myMaze[row][col+1].equals("x"))
                answer = false;
        }
        return answer;
    }
    
    public boolean finishedMaze()
    {
        return myMaze[row][col].equals("f");
            
    }
    
    public void printMaze()
    {
        for(int r = 0; r<myMaze.length; r++)
        {
            for(int c = 0; c<myMaze[0].length; c++)
            {
                System.out.print(myMaze[r][c]+" ");
            }
            System.out.println();
        }
    }
}