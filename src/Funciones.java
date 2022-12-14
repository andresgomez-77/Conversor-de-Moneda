import javax.swing.JOptionPane;

public class Funciones {
	ConversonMoneda moneda = new ConversonMoneda();
	ConversorMonedaPesos pesos = new ConversorMonedaPesos();

	public void ConversorMonedas(double numeroIngresado) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero ",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
						"De Pesos a Pesos Mexicanos", "De Pesos a Won Coreano", "De Pesos a Rublos", "De Dólar a Pesos",
						"De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Pesos Mexicanos a Pesos",
						"De Won Coreano a Pesos", "De Rublos a Pesos" },
				"Seleccion")).toString();
		switch (opcion) {
		case "De Pesos a Dólar": {
			moneda.colomDollar(numeroIngresado);
			break;
		}
		case "De Pesos a Euro": {
			moneda.colomEuro(numeroIngresado);
			break;
		}
		case "De Pesos a Libras": {
			moneda.colomLibras(numeroIngresado);
			break;
		}
		case "De Pesos a Yen": {
			moneda.colomYen(numeroIngresado);
			break;
		}
		case "De Pesos a Pesos Mexicanos": {
			moneda.colomMex(numeroIngresado);
			break;
		}
		case "De Pesos a Won Coreano": {
			moneda.colomWon(numeroIngresado);
			break;
		}
		case "De Dólar a Pesos": {
			moneda.colomRublo(numeroIngresado);
			break;
		}
		case "De Euro a Pesos": {
			pesos.dollarColom(numeroIngresado);
			break;
		}
		case "De Libras a Pesos": {
			pesos.euroColom(numeroIngresado);
			break;
		}
		case "De Yen a Pesos": {
			pesos.yenColom(numeroIngresado);
			break;
		}
		case "De Pesos Mexicanos a Pesos": {
			pesos.mexColom(numeroIngresado);
			break;
		}
		case "De Won Coreano a Pesos": {
			pesos.wonColom(numeroIngresado);
			break;
		}
		case "De Rublos a Pesos": {
			pesos.rubloColom(numeroIngresado);
			break;
		}

		}
	}
}
