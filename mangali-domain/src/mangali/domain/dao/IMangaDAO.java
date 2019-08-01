package mangali.domain.dao;

import java.util.List;
import mangali.domain.entities.Manga;

public interface IMangaDAO {
    
    public void inserir(Manga ent);
    
    public void atualizar(Manga ent);
    
    public void remover(int id);
    
    public List<Manga> consultar();
}
