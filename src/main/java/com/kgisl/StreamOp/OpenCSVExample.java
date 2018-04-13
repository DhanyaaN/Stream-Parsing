package com.kgisl.StreamOp;

import java.io.FileReader;
import java.io.IOException;

import java.util.List;

import com.opencsv.CSVReader;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy; 



/**
 * OpenCSV CSVReader Example, Read line by line
 * 
 * @author pankaj
 *
 */
public class OpenCSVExample {

	public static void main(String[] args) throws IOException {

		CSVReader reader = new CSVReader(new FileReader("src\\main\\resources\\Giveup.csv"),',');

		HeaderColumnNameMappingStrategy<Giveup> beanStrategy = new HeaderColumnNameMappingStrategy<Giveup>();
		beanStrategy.setType(Giveup.class);
		CsvToBean<Giveup> csvToBean = new CsvToBean<Giveup>();
		List<Giveup> g = csvToBean.parse(beanStrategy, reader);
		System.out.println(g);
		//  System.out.println(emps.stream()
		//  //.map(employee->employee.getReg_no())
		//  //.distinct()
		//  .collect(Collectors.toSet()));

		// .forEach( employee->System.out.println(employee.getName()));
		//System.out.println(emps.stSetream().distinct().collect(Collectors.toList()));
		reader.close();	
	}
}