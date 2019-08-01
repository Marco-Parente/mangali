package mangali.domain.dao;

import java.util.List;
import mangali.domain.entities.Editora;


public interface IEditoraDAO {
    public void inserir(Editora ent);
    
    public void atualizar(Editora ent);
    
    public void remover(int id);
    
    public List<Editora> consultar();
    
}
