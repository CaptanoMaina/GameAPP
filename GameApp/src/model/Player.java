package model;

/**
 *
 * @author mga
 */
public class Player {

    /**
     *
     */
    protected final int id;

    /**
     *
     */
    protected String playerName;

    /**
     *
     */
    protected int currentLevel;

    /**
     *
     */
    protected int pointsEarned;

    protected static int lastIdAllocated = 0;
    protected static final char EOLN='\n';
    protected static final String QUOTE="\"";

    /**
     *
     */
    public Player() {
        this.id = ++lastIdAllocated;
        this.playerName = "Unknown";
        this.currentLevel = 1;
        this.pointsEarned = 0;
    }

    /**
     *
     * @param playerName
     */
    public Player(String playerName) {
        this.id = ++lastIdAllocated;
        this.playerName = playerName;
        this.currentLevel = 1;
        this.pointsEarned = 0;
    }

    /**
     *
     * @param id
     * @param playerName
     * @param currentLevel
     * @param pointsEarned
     */
    public Player(int id, String playerName, int currentLevel, int pointsEarned) {
        this.id = id;
        this.playerName = playerName;
        this.currentLevel = currentLevel;
        this.pointsEarned = pointsEarned;
        if (id > Player.lastIdAllocated)
            Player.lastIdAllocated = id;
    }

     /**
     * @return the id
     */
    public int getId() {
        return this.id;
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public static int getLastIdAllocated() {
        return lastIdAllocated;
    }

   
    public static void setLastIdAllocated(int lastIdAllocated) {    
        Player.lastIdAllocated = lastIdAllocated;
    }

    // Methods required: getters, setters, hashCode, equals, compareTo, comparator
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nPlayer Id: " + this.id + " - Player Name: " + this.playerName +
                " - Current Level: " + this.currentLevel +
                " - Points: " + this.pointsEarned;
    }
    
    public String toString(Character delimiter) {
        return "\nQuestion Id: " + getId() + delimiter
                + "Player Name: " + getPlayerName() + delimiter
                + "Current Level: " + getCurrentLevel() + delimiter
                + "Points: " + getPointsEarned() + "\n";
    }

     @Override
    public int hashCode()
    {
        
        return  getId()*31 +
                getPlayerName().hashCode()*31 +
                getCurrentLevel()*31 +
                getPointsEarned()*31;
    }
    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Player)
        {
          Player p = (Player)o;
            
            return p.getId()==this.getId()&&
                   p.getPlayerName()==this.getPlayerName()&&
                   p.getCurrentLevel()==this.getCurrentLevel()&&
                   p.getPointsEarned()==this.getPointsEarned();
        }
        
        else
        {
            return false;
        }
    }
    
    public int compareTo(Player comparePlayer){
        int pointsEarned = ((Player) comparePlayer).getPointsEarned();
        
        //descending order
        return  pointsEarned - this.pointsEarned;
    }
}

