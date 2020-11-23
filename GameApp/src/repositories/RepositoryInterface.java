package repositories;

import java.util.ArrayList;
import model.Player;

public interface RepositoryInterface {

    /**
     *
     * @return 
     */
   
    ArrayList<Player> getItems();

    void setItems(ArrayList<Player> items);

    void add(Player item);

    void remove(int id);

    Player getItem(int id);

    @Override
    String toString();

    void store(String filename);

}
