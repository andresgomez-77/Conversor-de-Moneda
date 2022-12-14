import javax.swing.JOptionPane;
public class FuncionesMasa {
	ConversorUnidadesMasa gramos = new ConversorUnidadesMasa();
	ConversorUnidadesMasaGramos unidadesMasa= new ConversorUnidadesMasaGramos();
	public void ConversorUnidadesMasa(double pesoIngreso) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero ",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Gramos a Decagramos",
						"De Gramos a Hectogramos", "De Gramos a Kilogramos", "De Gramos a Decigramos",
						"De Gramos a Centigramos", "De Gramos a Miligramos", "De Decagramos a Gramos", "De Hectogramos a Gramos",
						"De Kilogramos a Gramos", "De Decigramos a Gramos", "De Centigramos a Gramos", "De Miligramos a Gramos" },
				"Seleccion")).toString();
		switch (opcion) {
		case "De Gramos a Decagramos":{
			gramos.gramosDecagramos(pesoIngreso);
			break;
		}
		case "De Gramos a Hectogramos":{
			gramos.gramosHectogramos(pesoIngreso);
			break;
		}
		case "De Gramos a Kilogramos":{
			gramos.gramosKilogramos(pesoIngreso);
			break;
		}
		case "De Gramos a Decigramos":{
			gramos.gramosDecigramos(pesoIngreso);
			break;
		}
		case "De Gramos a Centigramos":{
			gramos.gramosCentigramos(pesoIngreso);
			break;
		}
		case "De Gramos a Miligramos":{
			gramos.gramosMiligramos(pesoIngreso);
			break;
		}
		case "De Decagramos a Gramos":{
			unidadesMasa.decagramosGramos(pesoIngreso);
			break;
		}
		case "De Hectogramos a Gramos":{
			unidadesMasa.hectogramosGRmos(pesoIngreso);
			break;
		}
		case "De Kilogramos a Gramos":{
			unidadesMasa.KilogramosGramos(pesoIngreso);
			break;
		}
		case "De Centigramos a Gramos":{
			unidadesMasa.centigramosGramos(pesoIngreso);
			break;
		}
		case  "De Decigramos a Gramos":{
			unidadesMasa.decigramosGramos(pesoIngreso);
			break;
		}
		case "De Miligramos a Gramos":{
			unidadesMasa.miligramosGramos(pesoIngreso);
			break;
		}

		}
	}
}
