/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangali.domain.entities;

/**
 *
 * @author marcoparente
 */
public class Categoria {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean equals(Object o){
        Categoria aux = (Categoria)o;
        return this.nome.equals(aux.nome);
    }
}
