package cm.campo.minado.vision;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import cm.campo.minado.model.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		tabuleiro.registrarObservador(e ->{
			
			SwingUtilities.invokeLater(() -> {
			
			if(e.isGanhou()) {
				JOptionPane.showMessageDialog(this, "Ganhou :)");
			} else {
				JOptionPane.showMessageDialog(this, "Perdeu :(");
			}
			
			tabuleiro.reiniciar();
		});
	
	});
		
		/*int total = tabuleiro.getLinhas() * tabuleiro.getColunas();
		
		for(int i = 0; i < total; i++) {
			add(new BotaoCampo(null));
		}*/
	}

}
