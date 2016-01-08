package com.br.mvsistemas.agenda.bean;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Teste {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		Calendar c = Calendar.getInstance();
//		c.set(Calendar.YEAR, 2016); 
//		c.set(Calendar.MONTH, 01);
//		c.set(2016, 01, 07);
		c.set(2016, 01, 07, 14, 30);
//		c.set(Calendar.DAY_OF_MONTH, 20);
//		System.out.println("1: "+c.getTime());
		
		DateFormat f = DateFormat.getDateInstance();
		
		Date data2 = new Date();
//		System.out.println("2: "+data2);
		
		Date data = new Date();
		
		DateFormat dtHora = DateFormat.getInstance();
		//System.out.println(dtHora.format(data));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");
		Date nascimento = sdf.parse("08/01/16 10:15");
		System.out.println(nascimento);
	}

}
