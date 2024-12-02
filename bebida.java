package entidades;

public class Bebida extends Produto{
    private string tipo; 

    public Bebida(int codigo, String nome, String tipo){
        super(codigo, nome);
        this.tipo = tipo;

    } }

    public String getTipo() {
        return tipo;
    }    

    public void setTipo(String tipo){
        this.tipo = tipo;
    }