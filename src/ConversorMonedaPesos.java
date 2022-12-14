import javax.swing.JOptionPane;

public class ConversorMonedaPesos {
	public void dollarColom(double valor) {
		double conversorD = valor*4764.33;
		conversorD = (double) Math.round(conversorD*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorD + "Pesos Colombianos.");
	}
	public void euroColom(double valor) {
		double conversorE = valor*5066.15;
		conversorE = (double) Math.round(conversorE*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorE + "Pesos Colombianos.");
	}
	public void librasColom(double valor) {
		double conversorL = valor*5937.26;
		conversorL = (double) Math.round(conversorL*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorL + "Pesos Colombianos.");
	}
	public void yenColom(double valor) {
		double conversorY = valor*35.14;
		conversorY = (double) Math.round(conversorY*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorY + "Pesos Colombianos.");
	}
	public void mexColom(double valor) {
		double conversorMex = valor*4764.33;
		conversorMex = (double) Math.round(conversorMex*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorMex + "Pesos Colombianos.");
	}
	public void wonColom(double valor) {
		double conversorWon = valor*3.69;
		conversorWon = (double) Math.round(conversorWon*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorWon + "Pesos Colombianos.");
	}
	public void rubloColom(double valor) {
		double conversorRu = valor*75.37;
		conversorRu = (double) Math.round(conversorRu*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorRu + "Pesos Colombianos.");
	}
}
