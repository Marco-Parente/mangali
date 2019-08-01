package mangali.domain.dao;

import java.util.List;
import mangali.domain.entities.EditoraManga;

public interface IEditoraMangaDAO {
    
    public void inserir(EditoraManga ent);
    
    public void atualizar(EditoraManga ent);
    
    public void remover(int id);
    
    public List<EditoraManga> consultar();
}
