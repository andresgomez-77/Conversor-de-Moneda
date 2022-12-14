import javax.swing.JOptionPane;
public class ConversonMoneda {
	public void colomDollar(double valor) {
		double conversorD = valor/4764.33;
		conversorD = (double) Math.round(conversorD*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorD + "Dolares.");
	}
	public void colomEuro(double valor) {
		double conversorE = valor/5066.15;
		conversorE = (double) Math.round(conversorE*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorE + "Euros.");
	}
	public void colomLibras(double valor) {
		double conversorL = valor/5937.26;
		conversorL = (double) Math.round(conversorL*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorL + "Libras.");
	}
	public void colomYen(double valor) {
		double conversorY = valor/35.14;
		conversorY = (double) Math.round(conversorY*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorY + "Yenes.");
	}
	public void colomMex(double valor) {
		double conversorMex = valor/4764.33;
		conversorMex = (double) Math.round(conversorMex*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorMex + "Pesos Mexicanos.");
	}
	public void colomWon(double valor) {
		double conversorWon = valor/3.69;
		conversorWon = (double) Math.round(conversorWon*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorWon + "Wones.");
	}
	public void colomRublo(double valor) {
		double conversorRu = valor/75.37;
		conversorRu = (double) Math.round(conversorRu*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ conversorRu + "Dolares.");
	}
}
