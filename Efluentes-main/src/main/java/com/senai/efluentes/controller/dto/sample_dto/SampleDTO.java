package com.senai.efluentes.controller.dto.sample_dto;

import com.senai.efluentes.entity.Sample;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class SampleDTO {

    private long id;
    private String name;
    private String type;
    private java.sql.Date collectionDate;
    private String local;
    private String chemicalParameters;
    private Boolean status;

    public SampleDTO(Sample sample) {
        this.id = sample.getId();
        this.name = sample.getName();
        this.type = sample.getType();
        this.collectionDate = sample.getCollectionDate();
        this.local = sample.getLocal();
        this.chemicalParameters = sample.getChemicalParameters();
        this.status = sample.getStatus();
    }

    public static List<SampleDTO> convertToListDTO(List<Sample> samples) {
        return samples.stream().map(SampleDTO::new).collect(Collectors.toList());
    }
}

