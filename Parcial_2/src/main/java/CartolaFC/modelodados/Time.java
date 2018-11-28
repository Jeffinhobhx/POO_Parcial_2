
package CartolaFC.modelodados;

public class Time {
        private String jogador;
	private String posicao;
        private String preco;
        private String probabilidade;
	
	public void informacoesJogador() {
		System.out.println("Jogador: " + this.getJogador());
		System.out.println("Posição: " + this.getPosicao());
                System.out.println("Cartoletas: " + this.getPreco());
		System.out.println("Probabilidade: " + this.getProbabilidade());
	}
	
	public String getJogador() {
		return jogador;
	}
	public void setJogador(String jogador) {
		this.jogador = jogador;
	}
        public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
        public String getPreco() {
		return preco;        
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
        public String getProbabilidade() {
		return probabilidade;
	}
	public void setProbabilidade(String probabilidade) {
		this.probabilidade = probabilidade;
	}
}
