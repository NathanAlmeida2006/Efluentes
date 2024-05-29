package com.senai.efluentes.controller.dto.sample_dto;

import com.senai.efluentes.entity.Sample;
import lombok.Getter;

@Getter
public class SampleFormDTO {

    private String name;
    private String type;
    private java.sql.Date collectionDate;
    private String local;
    private String chemicalParameters;
    private Boolean status;

    public Sample convertToEntity() {
        Sample sample = new Sample();
        sample.setName(name);
        sample.setType(type);
        sample.setCollectionDate(collectionDate);
        sample.setLocal(local);
        sample.setChemicalParameters(chemicalParameters);
        sample.setStatus(status);
        return sample;
    }
}
