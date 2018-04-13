package com.kgisl.StreamOp;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class App {

    public static void main(String[] args) throws IOException {

        String fileName = "src/main/resources/giveup.csv";
        Path myPath = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(myPath, StandardCharsets.UTF_8)) {

            HeaderColumnNameMappingStrategy<Giveup> strategy = new HeaderColumnNameMappingStrategy<>();
            strategy.setType(Giveup.class);

            CsvToBean csvToBean = new CsvToBeanBuilder(br).withType(Giveup.class).withMappingStrategy(strategy)
                    .withIgnoreLeadingWhiteSpace(true).build();

            List<Giveup> give = csvToBean.parse();
            // System.out.println("List contains:"+give.stream());

            
            // give.forEach(System.out::println);
        //    List<Giveup> l= give.stream().distinct().collect(Collectors.toList());
        //    System.out.println(l.stream().count());
// Groupby
            Map<String,Long> map=give.stream().collect(Collectors.groupingBy(Giveup::getTRD_QTY,Collectors.counting()));
            System.out.println(map);
            HashSet<Giveup> hs=new HashSet<Giveup>();
            hs.addAll(give);
            System.out.println(hs.stream().count());

                     
        }
}
}
