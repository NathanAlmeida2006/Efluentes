package com.senai.efluentes.controller.dto.equipment_dto;

import java.sql.Date;

import com.senai.efluentes.entity.Equipment;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EquipmentDTO {

    private long id;
    private String name;
    private String type;
    private Date registrationDate;
    private Double capacity;

    public EquipmentDTO(Equipment equipment) {
        this.id = equipment.getId();
        this.name = equipment.getName();
        this.type = equipment.getType();
        this.registrationDate = equipment.getRegistrationDate();
        this.capacity = equipment.getCapacity();
    }
}