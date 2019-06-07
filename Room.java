import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class Room 
{
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;
    private Room southEastExit;
    private Room northWestExit;
    
    private HashMap<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west, Room southEast, Room northWest) 
    {
        if(north != null)
            exits.put("north", north);
        if(east != null)
            exits.put("east", east);
        if(south != null)
            exits.put("south", south);
        if(west != null)
            exits.put("west", west);
        if(southEast != null)
            exits.put("southEast", southEast);
        if(northWest != null)
            exits.put("northWest", northWest);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    public Room getExit(String direction){
        Room salaADevolver = null;
        if(direction.equals("north")){
            salaADevolver = exits.get("north");
        }
        if(direction.equals("south")){
            salaADevolver = exits.get("south");
        }
        if(direction.equals("east")){
            salaADevolver = exits.get("east");
        }
        if(direction.equals("west")){
            salaADevolver = exits.get("west");
        }
        if(direction.equals("southEast")){
            salaADevolver = exits.get("southEast");
        }
        if(direction.equals("northWest")){
            salaADevolver = exits.get("northWest");
        }
        return salaADevolver;
    }

    /**
     * Devuelve la información de las salidas existentes
     * Por ejemplo: "Exits: north east west"
     *
     * @return Una descripción de las salidas existentes.
     */
    public String getExitString(){
        String descripcion = "";
        if(exits.get("north") != null){
            descripcion += "north ";
        }
        if(exits.get("south") != null){
            descripcion += "south ";
        }
        if(exits.get("east") != null){
            descripcion += "east ";
        }
        if(exits.get("west") != null){
            descripcion += "west ";
        }
        if(exits.get("southEast") != null){
            descripcion += "southEast ";
        }
        if(exits.get("northWest") != null){
            descripcion += "northWest ";
        }
        return descripcion;
    }
}
