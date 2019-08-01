package mangali.domain.dao;

import java.util.List;
import mangali.domain.entities.Capitulo;

public interface ICapituloDAO {
    
    public void inserir(Capitulo ent);
    
    public void atualizar(Capitulo ent);
    
    public void remover(int id);
    
    public List<Capitulo> consultar();
}
