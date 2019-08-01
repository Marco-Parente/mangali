package mangali.domain.dao;

import java.util.List;
import mangali.domain.entities.AutorManga;

public interface IAutorMangaDAO {
    
    public void inserir(AutorManga ent);
    
    public void atualizar(AutorManga ent);
    
    public void remover(int id);
    
    public List<AutorManga> consultar();
}
