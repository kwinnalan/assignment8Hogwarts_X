import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class Item - an object contained in a room in our Hogwarts adventure game.
 *
 * This class is part of the Hogwarts School of wizardry adventure application.
 * Hogwarts School of wizardry adventure is a simple, text based adventure game.
 *
 * An "Item" represents one object in a specified room of the game.  Some items have special abilities and uses.
 * each room may or may not contain an item.
 *
 * @author  Kwinn Danforth
 * @version 1.0.01
 */

public class Item
{
    private String description;
    private HashMap<String, Room> abilities;

    /**
     * Create an item described as "description". "description" tells us what the item is.
     *
     * @param description The items's description.
     */
    public Item(String description)
    {
        this.description = description;
        abilities = new HashMap<>();
    }

    /**
     * Define the abilities for the item.
     *
     * @param a discription of the abilities.
     */
    public void setAbilities(String abilities)
    {
        abilities.put(abilities);
    }

    /**
     * Gets and returns a discription of the item
     *
     * @return The description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     The item is...
     *     its abilities are...
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        return "This item is " + description + ".\n" + "its abilities are " + abilities;
    }

    /**
     * Return the abilities that the item has.
     *
     * @return The abilities of the item.
     */
    public Room getAbilities()
    {
        return abilities;
    }
}

