package com.senai.efluentes.controller.dto.equipment_dto;

import java.sql.Date;

import com.senai.efluentes.entity.Equipment;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateEquipmentFormDTO {

    private String name;
    private String type;
    private Date registrationDate;
    private Double capacity;

    public Equipment updateEntity(Equipment equipment) {
        equipment.setName(name);
        equipment.setType(type);
        equipment.setRegistrationDate(registrationDate);
        equipment.setCapacity(capacity);
        return equipment;
    }
}
