package mangali.domain.dao;

import java.util.List;
import mangali.domain.entities.Volume;

public interface IVolumeDAO {
    
    public void inserir(Volume ent);
    
    public void atualizar(Volume ent);
    
    public void remover(int id);
    
    public List<Volume> consultar();
}
