package aulapratica1;

public class PessoaApps {

	public static void main (String[] args) {
        Pessoas pessoa1 = new Pessoas(1,"Elder");
        
        Pessoas pessoa2 = new Pessoas(2,"Ana");
        
        System.out.println("o nome do objeto pessoa1 eh: "+pessoa1.getNome());
        
        pessoa1.setNome("Helder");
        
        System.out.println("o nome do objeto pessoa1 eh: "+pessoa2.getNome());
	}
	
}
