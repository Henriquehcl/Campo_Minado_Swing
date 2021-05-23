package cm.campo.minado.vision;

import javax.swing.JFrame;

import cm.campo.minado.model.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
		
	public TelaPrincipal() {
		
		Tabuleiro tabuleiro = new Tabuleiro(16, 32, 5);//quantia de linhas, colunas e minas
		
		PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		
		add(painelTabuleiro);
		
		setTitle("Campo Minado");
		setSize(690,438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}

}
