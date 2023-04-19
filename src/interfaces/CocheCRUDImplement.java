package interfaces;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImplement implements CocheCRUD {
    public List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        coches.add(coche);
    }

    @Override
    public List<Coche> findAll() {
        return coches;
    }

    @Override
    public List<Coche> delete(Coche coche) {
        coches.remove(coche);
        return null;
    }

    @Override
    public void deleteAll(Coche coche) {
        coches.clear();
    }
}

