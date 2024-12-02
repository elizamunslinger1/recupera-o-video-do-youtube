package entidades;

public class Doce extends produto {

    private String marca;

   public Doce( int codigo, String nome, String marca){
    super( codigo, nome);
    this.marca = marca;
   
    }

    public getMarca(){
        return marca;
    }

    public vois setMarca(String marca){
        this.marca = marca;
    }
}