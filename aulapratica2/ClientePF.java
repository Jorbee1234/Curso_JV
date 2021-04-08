package aulapratica2;
	
	public class ClientePF extends Cliente{
	
	    private String cpf;
	    
	    public ClientePF(String nome, String endereco,String cpf){
	        super(nome,endereco);
	        this.cpf=cpf;
	        
	    }
	    
	    public String getcpf()
	    {
	        return cpf;
	    }
	    
	    public void setCnpj(String cpf){
	        this.cpf=cpf;
	    }
		
		
}

