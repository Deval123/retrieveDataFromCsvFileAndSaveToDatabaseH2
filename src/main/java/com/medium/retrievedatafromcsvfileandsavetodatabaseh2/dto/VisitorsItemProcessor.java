package com.medium.retrievedatafromcsvfileandsavetodatabaseh2.dto;

import org.springframework.batch.item.ItemProcessor;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;



@Component
public class VisitorsItemProcessor implements ItemProcessor<Visitors, Visitors> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm");

    @Override
    public Visitors process(Visitors item) throws Exception {
        item.setVisitDate(dateFormat.parse(item.getStrVisitDate()));
        return item;
    }
}
