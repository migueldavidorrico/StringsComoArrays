package es.programacion1k.arrays;

//Utilizando arrays de char a partir de cadenas con la función String.toCharArray() implementar los siguientes métodos:
//length
//indexOf
//charAt(index)
//lastIndexOf(ch);
//replace(oldChar, newChar)
//substring(beginIndex, endIndex)
//substring(beginIndex)
//equals(anObject)
//trim();
//concat(str)
//endsWith(suffix)
//contains(s)
//indexOf(str)
//split("-");

public class MisFuncionesString {

	public static void main(String[] args) {
		String vacia = "";
		String normal = "Prueba de cadena Normal";

		System.out.printf("Función String - Cadena: \"%s\" Longitud: %d%n", vacia, vacia.length());
		System.out.printf("Función String - Cadena: \"%s\" Longitud: %d%n", normal, normal.length());
		System.out.printf("miFunción      - Cadena: \"%s\" Longitud: %d%n", vacia, miLength(vacia));
		System.out.printf("miFunción      - Cadena: \"%s\" Longitud: %d%n", normal, miLength(normal));

		char caracterBuscado = 'N';
		String plantilla = "indexOf   - Cadena: \"%s\" caracter: %c posicion: %d%n";
		String miPlantilla = "miIndexOf - Cadena: \"%s\" caracter: %c posicion: %d%n";
		System.out.printf(plantilla, vacia, caracterBuscado, vacia.indexOf(caracterBuscado));
		System.out.printf(miPlantilla, vacia, caracterBuscado, miIndexOf(vacia, caracterBuscado));
		System.out.printf(plantilla, normal, caracterBuscado, normal.indexOf(caracterBuscado));
		System.out.printf(miPlantilla, normal, caracterBuscado, miIndexOf(normal, caracterBuscado));

		int posicion = 14;
		plantilla = "charAt - Cadena: \"%s\" posicion: %d caracter: %c%n";
		miPlantilla = "miCharAt - Cadena: \"%s\" posicion: %d caracter: %c%n";
		// System.out.printf(plantilla,cadenaVacia,posicion,cadenaVacia.charAt(posicion));
		// System.out.printf(miPlantilla,cadenaVacia,posicion,miCharAt(cadenaVacia,posicion));
		System.out.printf(plantilla, normal, posicion, normal.charAt(posicion));
		System.out.printf(miPlantilla, normal, posicion, miCharAt(normal, posicion));

		caracterBuscado = 'e';
		plantilla = "lastIndexOf   - Cadena: \"%s\" caracter: %c posicion: %d%n";
		miPlantilla = "miLastIndexOf - Cadena: \"%s\" caracter: %c posicion: %d%n";
		System.out.printf(plantilla, vacia, caracterBuscado, vacia.lastIndexOf(caracterBuscado));
		System.out.printf(miPlantilla, vacia, caracterBuscado, miLastIndexOf(vacia, caracterBuscado));
		System.out.printf(plantilla, normal, caracterBuscado, normal.lastIndexOf(caracterBuscado));
		System.out.printf(miPlantilla, normal, caracterBuscado, miLastIndexOf(normal, caracterBuscado));

		char caracterAntiguo = 'e';
		char caracterNuevo = 'E';
		plantilla = "replace   - Cadena: \"%s\" caracterAntiguo: %c caracterNuevo: %c CadenaNueva: \"%s\"%n";
		miPlantilla = "miReplace - Cadena: \"%s\" caracterAntiguo: %c caracterNuevo: %c CadenaNueva: \"%s\"%n";
		System.out.printf(plantilla, vacia, caracterAntiguo, caracterNuevo,
				vacia.replace(caracterAntiguo, caracterNuevo));
		System.out.printf(miPlantilla, vacia, caracterAntiguo, caracterNuevo,
				miReplace(vacia, caracterAntiguo, caracterNuevo));
		System.out.printf(plantilla, normal, caracterAntiguo, caracterNuevo,
				normal.replace(caracterAntiguo, caracterNuevo));
		System.out.printf(miPlantilla, normal, caracterAntiguo, caracterNuevo,
				miReplace(normal, caracterAntiguo, caracterNuevo));

		int posicionInicial = 4;
		int posicionFinal = 13;
		plantilla = "subString(inicio,fin) - Cadena: \"%s\" inicio: %d fin: %d Resultado: %s%n";
		miPlantilla = "miSubString(inicio,fin) - Cadena: \"%s\" inicio: %d fin: %d Resultado: %s%n";
		// System.out.printf(plantilla,vacia,posicionInicial,posicionFinal,vacia.substring(posicionInicial,
		// posicionFinal));
		// System.out.printf(miPlantilla,vacia,posicionInicial,posicionFinal,miSubstring(vacia,posicionInicial,
		// posicionFinal));
		System.out.printf(plantilla, normal, posicionInicial, posicionFinal,
				normal.substring(posicionInicial, posicionFinal));
		System.out.printf(miPlantilla, normal, posicionInicial, posicionFinal,
				miSubstring(normal, posicionInicial, posicionFinal));

		posicionInicial = 4;
		plantilla = "subString(inicio) - Cadena: \"%s\" inicio: %d Resultado: %s%n";
		miPlantilla = "miSubString(inicio) - Cadena: \"%s\" inicio: %d Resultado: %s%n";
		// System.out.printf(plantilla,vacia,posicionInicial,vacia.substring(posicionInicial));
		// System.out.printf(miPlantilla,vacia,posicionInicial,miSubstring(vacia,posicionInicial));
		System.out.printf(plantilla, normal, posicionInicial, normal.substring(posicionInicial));
		System.out.printf(miPlantilla, normal, posicionInicial, miSubstring(normal, posicionInicial));

		String segunda = "Prueba de cadena Normal";
		plantilla = "equals(str) - Cadena: \"%s\" Segunda Cadena: \"%s\" Resultado: %b%n";
		miPlantilla = "miEquals(str) - Cadena: \"%s\" Segunda Cadena: \"%s\" Resultado: %b%n";
		System.out.printf(plantilla, vacia, segunda, vacia.equals(segunda));
		System.out.printf(miPlantilla, vacia, segunda, miEquals(vacia, segunda));
		System.out.printf(plantilla, normal, segunda, normal.equals(segunda));
		System.out.printf(miPlantilla, normal, segunda, miEquals(normal, segunda));

		String conEspacios = "Prueba     ";
		plantilla = "trim() - Cadena: \"%s\" Resultado: \"%s\"%n";
		miPlantilla = "miTrim() - Cadena: \"%s\" Resultado: \"%s\"%n";
		System.out.printf(plantilla, vacia, vacia.trim());
		System.out.printf(miPlantilla, vacia, miTrim(vacia));
		System.out.printf(plantilla, conEspacios, conEspacios.trim());
		System.out.printf(miPlantilla, conEspacios, miTrim(conEspacios));

		String anyadida = " con más caracteres";
		plantilla = "concat(str) - Cadena: \"%s\" Añadida: \"%s\" Resultado: \"%s\"%n";
		miPlantilla = "miConcat(str) - Cadena: \"%s\" Añadida: \"%s\" Resultado: \"%s\"%n";
		System.out.printf(plantilla, vacia, anyadida, vacia.concat(anyadida));
		System.out.printf(miPlantilla, vacia, anyadida, miConcat(vacia, anyadida));
		System.out.printf(plantilla, normal, anyadida, normal.concat(anyadida));
		System.out.printf(miPlantilla, normal, anyadida, miConcat(normal, anyadida));
		
		String terminacion = "Normal";
		plantilla = "endsWith(str) - Cadena: \"%s\" terminacion: \"%s\" Resultado: \"%b\"%n";
		miPlantilla = "miEndsWith(str) - Cadena: \"%s\" terminacion: \"%s\" Resultado: \"%b\"%n";
		System.out.printf(plantilla, vacia, terminacion, vacia.endsWith(terminacion));
		System.out.printf(miPlantilla, vacia, terminacion, miEndsWith(vacia, terminacion));
		System.out.printf(plantilla, normal, terminacion, normal.endsWith(terminacion));
		System.out.printf(miPlantilla, normal, terminacion, miEndsWith(normal, terminacion));

	}

	static int miLength(String cadena) {
		char[] caracteres = cadena.toCharArray();
		return caracteres.length;
	}

	static int miIndexOf(String cadena, char c) {
		char[] caracteres = cadena.toCharArray();
		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] == c) {
				return i;
			}
		}
		return -1;
	}

	static int miCharAt(String cadena, int pos) {
		char[] caracteres = cadena.toCharArray();
		return caracteres[pos];

	}

	static int miLastIndexOf(String cadena, char c) {
		char[] caracteres = cadena.toCharArray();
		for (int i = caracteres.length - 1; i >= 0; i--) {
			if (caracteres[i] == c) {
				return i;
			}
		}
		return -1;
	}

	static String miReplace(String cadena, char antiguo, char nuevo) {
		char[] caracteres = cadena.toCharArray();
		for (int i = 0; i < cadena.length(); i++) {
			if (caracteres[i] == antiguo) {
				caracteres[i] = nuevo;
			}
		}

		return new String(caracteres);
	}

	private static String miSubstring(String cadena, int posicionInicial, int posicionFinal) {
		char[] caracteres = cadena.toCharArray();
		int longitudSubString = posicionFinal - posicionInicial;
		char[] resultado = new char[longitudSubString];
		for (int i = 0; i < longitudSubString; i++) {
			resultado[i] = caracteres[i + posicionInicial];
		}

		return new String(resultado);
	}

	private static String miSubstring(String cadena, int posicionInicial) {
		return miSubstring(cadena, posicionInicial, cadena.length());
	}

	static boolean miEquals(String primera, String segunda) {
		char[] caracteresPrimera = primera.toCharArray();
		char[] caracteresSegunda = segunda.toCharArray();
		if (caracteresPrimera.length != caracteresSegunda.length) {
			return false;
		}
		for (int i = 0; i < caracteresPrimera.length; i++) {
			if (caracteresPrimera[i] != caracteresSegunda[i]) {
				return false;
			}
		}
		return true;
	}

	static String miTrim(String cadena) {
		char[] caracteres = cadena.toCharArray();
		if (caracteres.length == 0) {
			return "";
		}
		int espaciosIniciales = 0;
		while (Character.isWhitespace(caracteres[espaciosIniciales])) {
			espaciosIniciales++;
		}
		int espaciosFinales = caracteres.length - 1;
		while (Character.isWhitespace(caracteres[espaciosFinales])) {
			espaciosFinales--;
		}

		return miSubstring(cadena, espaciosIniciales, espaciosFinales + 1);
	}

	static String miConcat(String cadena, String anyadida) {
		char[] caracteres = cadena.toCharArray();
		char[] nuevos = anyadida.toCharArray();

		char[] resultado = new char[caracteres.length + nuevos.length];
		int i;
		for (i = 0; i < caracteres.length; i++) {
			resultado[i] = caracteres[i];
		}
		for (int j = 0; j < nuevos.length; j++) {
			resultado[i + j] = nuevos[j];
		}
		return new String(resultado);
	}
	
	static boolean miEndsWith(String cadena,String terminacion){
		char[] caracteres = cadena.toCharArray();
		char[] nuevos = terminacion.toCharArray();
		if(caracteres.length<nuevos.length){
			return false;
		}
;
		for(int i=caracteres.length-1,j=nuevos.length-1;j>=0;j--,i--){
			if(caracteres[i]!=nuevos[j]){
				return false;
			}
		}
		return true;
	}

}
