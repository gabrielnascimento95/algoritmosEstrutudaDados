package hashing;

public class HashEnderecamentoAbertoHashDuplo {


	public class TermoDicionario{
		public int valor;
		public String significado;
		public TermoDicionario(int n, String sig){
			valor = n;
			significado = sig;
		}
	}
	
	private final int tamanhoDaTabela;
	public TermoDicionario[] dicionario;
	private final TermoDicionario eliminado = new TermoDicionario(-1, "TERMO INVALIDO");
	private int colisoes = 0;
	
	public void imprimirTabelaHash(){
		System.out.println("-----------------------------------------------");
		for (int i=0;i<dicionario.length;i++){
			if (dicionario[i] == null) System.out.println("[" + i + "]");
			else System.out.println("[" + i + "] " + dicionario[i].valor);
		}
		System.out.println("Contador de colisoes: " + colisoes);
	}
		
	public HashEnderecamentoAbertoHashDuplo(int numEsperado){
		tamanhoDaTabela = numEsperado;
		dicionario = new TermoDicionario[numEsperado];
	}

	int hash (int valor, int tentativa) {
		return (h1(valor)+tentativa*h2(valor)) % tamanhoDaTabela;
	}
	
	private int h1(int valor) {
		return valor%tamanhoDaTabela;
	}

	private int h2(int valor) {
		return (2*valor+5);
	}

	boolean insere(int valor, String significado){
		int indice;
		for (int j=0;j<tamanhoDaTabela;j++){
			indice = hash(valor,j);
			if (dicionario[indice] == null || dicionario[indice]==eliminado){
				dicionario[indice] = new TermoDicionario(valor, significado);
				return true;
			}else colisoes++;
		}
		return false;
	}
	
	TermoDicionario busca(int chave){
		int indice;
		for (int j=0;j<tamanhoDaTabela;j++){
			indice = hash(chave,j);
			if (dicionario[indice] == null) return null;
			else if (dicionario[indice] != eliminado && dicionario[indice].valor==chave) return dicionario[indice]; 
		}
		return null;
	}

	boolean remove(int chave){
		int indice;
		for (int j=0;j<tamanhoDaTabela;j++){
			indice = hash(chave,j);
			if (dicionario[indice] == null) return false;
			else if (dicionario[indice] != eliminado && dicionario[indice].valor==chave) {
				dicionario[indice] = eliminado;
				return true; 
			}
		}
		return false;
	}
	
}
