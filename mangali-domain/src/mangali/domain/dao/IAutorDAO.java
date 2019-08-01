package mangali.domain.dao;

import java.util.List;
import mangali.domain.entities.Autor;

public interface IAutorDAO {
    public void inserir(Autor ent);
    
    public void atualizar(Autor ent);
    
    public void remover(int id);
    
    public List<Autor> consultar();
}
