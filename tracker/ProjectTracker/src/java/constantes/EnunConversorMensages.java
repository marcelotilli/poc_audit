/**
 * 
 */
package constantes;

/**
 * @author marcelo
 *
 */
public enum EnunConversorMensages {
	LOGIN("/grails/user/login.dispatch","Usuario logou no sistema"),
	INDEX("/index.gsp","Usuario entrou na pagina inicial"),
	TEST("/grails/user/test.dispatch","Usuario entrou na pagina de testes"),
	BOTAO1("/grails/user/botao.dispatch","Usuario cliquou no botao 1"),
	BOTAO2("/grails/user/botao2.dispatch","Usuario cliquou no botao 1");
	private String request;
	private String mensagem;
	private EnunConversorMensages(String request, String mensagem) {
		this.request = request;
		this.mensagem = mensagem;
	}
	public static String getMensagem(String request){
	
		EnunConversorMensages vetor[]=EnunConversorMensages.values();
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].request.equals(request.trim())) {
				return vetor[i].mensagem;
			}
		}
		return "Mensagem nao encontrada";
	}
	

}
