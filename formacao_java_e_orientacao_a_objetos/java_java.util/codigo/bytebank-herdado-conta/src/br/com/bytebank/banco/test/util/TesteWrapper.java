package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {
	public static void main(String[] args) {
	
		// Declarando primitivos
		
		byte valorBytePrimitivo = 2;
		short valorShortPrimitivo = 2;
		int valorIntPrimitivo = 2;
		long valorLongPrimitivo = 2L;
		float valorFloatPrimitivo = 2f;
		double valorDoublePrimitivo = 2;
		char valorCharPrimitivo = '2';
		boolean valorBooleanPrimitivo = true;
		
		// Declarando uma wrapper class
		
		Byte valorByteWrapper = Byte.valueOf(valorBytePrimitivo);
		Short valorShortWrapper = Short.valueOf(valorShortPrimitivo);
		Integer valorIntegerWrapper = Integer.valueOf(valorIntPrimitivo);
		Long valorLongWrapper = Long.valueOf(valorLongPrimitivo);
		Float valorFloatWrapper = Float.valueOf(valorFloatPrimitivo);
		Double valorDoubleWrapper = Double.valueOf(valorDoublePrimitivo);
		Character valorCharacterWrapper = Character.valueOf(valorCharPrimitivo);
		Boolean valorBooleanWrapper = Boolean.valueOf(valorBooleanPrimitivo);
		
		// Propriedades
		
		System.out.println(valorIntegerWrapper.MIN_VALUE);
		System.out.println(valorIntegerWrapper.MAX_VALUE);
		System.out.println(valorIntegerWrapper.BYTES);
		
		Integer.min(valorCharPrimitivo, valorBytePrimitivo);
		Integer.max(valorCharPrimitivo, valorBytePrimitivo);
		
		// Listas
		
		List<Integer> lista = new ArrayList<Integer>();
		
		// Métodos estaticos
		
		Integer.compare(1, 2);
		Integer.max(1, 2);
		Integer.min(1, 2);
		Integer.parseInt("2");
		Integer.valueOf(2);
		Integer.valueOf("2");
		
		// Métodos de instancia
		
		valorIntegerWrapper.byteValue();
		valorIntegerWrapper.compareTo(5);
		valorIntegerWrapper.doubleValue();
		valorIntegerWrapper.equals(valorBooleanWrapper);
		valorIntegerWrapper.floatValue();
		valorIntegerWrapper.hashCode();
		valorIntegerWrapper.intValue();
		valorIntegerWrapper.longValue();
		valorIntegerWrapper.shortValue();
		valorIntegerWrapper.toString();		
		
	}
}
