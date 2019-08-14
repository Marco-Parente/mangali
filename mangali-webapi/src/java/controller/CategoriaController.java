package controller;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import mangali.domain.dao.ICategoriaDAO;
import mangali.domain.dao.list.CategoriaDAOImpl;
import mangali.domain.entities.Categoria;

@Path("/categoria")
public class CategoriaController {
    
    private ICategoriaDAO banco = new CategoriaDAOImpl();
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Categoria> index() {
        return banco.consultar();
    }
    
    @GET
    @Path("/create/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Categoria create(@PathParam("id") int pk){
        System.out.println("Parametro: "+pk);
        for(Categoria cat : banco.consultar()){
            if(cat.getId() == pk){
                return cat;
            }
        }
        return null;
    }
    
    @GET
    @Path("/read/{nome}")
    @Produces(MediaType.APPLICATION_JSON)
    public String read(@PathParam("nome") String nome){
        
        try{
            System.out.println("Cadastrando " + nome);
            Categoria nova = new Categoria();
        nova.setNome(nome);
        banco.inserir(nova);
        } catch (Exception erro) {
            return "{\"status\": 0}";
        }
        
        String ret = "{\"status\" : 1}";
        return ret;
    }
}
