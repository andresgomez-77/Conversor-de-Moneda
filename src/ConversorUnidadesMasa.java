import javax.swing.JOptionPane;
public class ConversorUnidadesMasa {
	public void gramosDecagramos(double valor) {
		double masaD = valor/10;
		masaD = (double) Math.round(masaD*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ masaD + "Decagramos.");
	}
	public void gramosHectogramos(double valor) {
		double masaH = valor/100;
		masaH = (double) Math.round(masaH*1000d)/1000;
		JOptionPane.showMessageDialog(null,"Son :"+ masaH + "Hectogramos.");
	}
	public void gramosKilogramos(double valor) {
		double masaH = valor/1000;
		masaH = (double) Math.round(masaH*1000d)/1000;
		JOptionPane.showMessageDialog(null,"Son :"+ masaH + "Kiloogramos.");
	}
	public void gramosDecigramos(double valor) {
		double masaDeci = valor*10;
		masaDeci = (double) Math.round(masaDeci*100d)/100;
		JOptionPane.showMessageDialog(null,"Son :"+ masaDeci + "Decigramos.");
	}
	public void gramosCentigramos(double valor) {
		double masaC = valor*100;
		masaC = (double) Math.round(masaC*1000d)/1000;
		JOptionPane.showMessageDialog(null,"Son :"+ masaC + "Centigramos.");
	}
	public void gramosMiligramos(double valor) {
		double masaM = valor*1000;
		masaM = (double) Math.round(masaM*1000d)/1000;
		JOptionPane.showMessageDialog(null,"Son :"+ masaM + "Miligramos.");
	}
}
