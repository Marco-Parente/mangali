package mangali.domain.dao;

import java.util.List;
import mangali.domain.entities.Categoria;

public interface ICategoriaDAO {
    public void inserir(Categoria ent);
    
    public void atualizar(Categoria ent);
    
    public void remover(int id);
    
    public List<Categoria> consultar();
}
