package com.senai.efluentes.controller.dto.sample_dto;

import com.senai.efluentes.entity.Sample;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateSampleFormDTO {

    private String name;
    private String type;
    private java.sql.Date collectionDate;
    private String local;
    private String chemicalParameters;
    private Boolean status;

    // Construtor que aceita um objeto Sample
    public UpdateSampleFormDTO(Sample sample) {
        this.name = sample.getName();
        this.type = sample.getType();
        this.collectionDate = sample.getCollectionDate();
        this.local = sample.getLocal();
        this.chemicalParameters = sample.getChemicalParameters();
        this.status = sample.getStatus();
    }

    // Método para atualizar a entidade Sample com os dados do DTO
    public Sample updateEntity(Sample sample) {
        sample.setName(this.name);
        sample.setType(this.type);
        sample.setCollectionDate(this.collectionDate);
        sample.setLocal(this.local);
        sample.setChemicalParameters(this.chemicalParameters);
        sample.setStatus(this.status);
        return sample;
    }
}
