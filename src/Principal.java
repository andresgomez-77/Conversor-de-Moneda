import javax.swing.*;

public class Principal {
	public static void main(String[] args) {
		Funciones funciones = new Funciones();
		FuncionesMasa unidadesMasa = new FuncionesMasa();
		while (true) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Conversor de Moneda", "Conversor de Unidades de Masa" }, "Seleccion")).toString();
			switch (opciones) {
			case "Conversor de Moneda": {
				String input = JOptionPane.showInputDialog("Ingrese un valor para la conversion");
				if (verificarNum(input)) {
					double numeroIngresado = Double.parseDouble(input);
					funciones.ConversorMonedas(numeroIngresado);
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						break;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			}
			case "Conversor de Unidades de Masa":{
				String input = JOptionPane.showInputDialog("Ingrese un valor de masa para la conversion");
				if (verificarNum(input)) {
					double pesoIngresado = Double.parseDouble(input);
					unidadesMasa.ConversorUnidadesMasa(pesoIngresado);
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			}
			}
		}
	}
	public static boolean verificarNum(String input) {
		try {
			Double.parseDouble(input);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}
}
