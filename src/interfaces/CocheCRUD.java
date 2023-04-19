package interfaces;

import java.util.List;

public interface CocheCRUD {

    //Actua como un contrato que hay que hacer pero no lo hace

    void save(Coche coche);

    List<Coche> findAll();

    void deleteAll(Coche coche);

    List<Coche> delete(Coche coche);

}
