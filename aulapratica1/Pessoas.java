package aulapratica1;

public class Pessoas {
	    
	    private int codigo; //Quando colocar private para acessar é fechado porque só a classe pode entrar e se for public qualquer um pode acessar
	    private String nome;
	    
	    public Pessoas(int codigo, String nome){ //Meotodo construtor
	        this.codigo=codigo;
	        this.nome=nome;
	    }
	    public int getCodigo(){
	        return codigo;
	    }
	    
	    public void setCodigo(int codigo){
	        this.codigo=codigo;
	    }
	    
	    public String getNome() { // RETORNA
	    	return nome; // Encapsulamento é esconder os atribudos e acessa-los por meio de metodos, caso seja private
	    }
	    // Metodo modificador: permite modificar um atribudo por outro jeito
	    
	    public void setNome(String nome) { // Modifica //Metodo sempre public
	    	this.nome=nome;
	    }
}
