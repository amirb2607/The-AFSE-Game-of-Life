import java.util.ArrayList;
import java.util.List;

/**
 * Implementaiton of text adventure game involving a first year teacher
 * starting at a new school teaching CS.
 * @author Sean Stern
 * @version 1.0
 */
public class AdventureForSoftwareEngineering implements Game{

    @Override
    public List<Location> getLocations(){
        List<Location> levels = new ArrayList<Location>();
        levels.add(new HouseWakeUp());
        levels.add(new Starbucks());
        levels.add(new AXSE());
        //levels.add(new StonyBrook());
        //levels.add(new HouseWakeUp());
        //levels.add(new StonyBrookFight());
        //levels.add(new BMCC());
        //levels.add(new Harvard());
        return levels;
    }

    @Override
    public Player getPlayer(){
        return new HighSchoolStudent();
    }
}