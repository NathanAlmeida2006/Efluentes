package com.senai.efluentes.controller;

import com.senai.efluentes.controller.dto.equipment_dto.EquipmentDTO;
import com.senai.efluentes.controller.dto.equipment_dto.EquipmentFormDTO;
import com.senai.efluentes.controller.dto.equipment_dto.UpdateEquipmentFormDTO;
import com.senai.efluentes.entity.Equipment;
import com.senai.efluentes.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/equipment")
public class ControllerEquipment {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Transactional
    @PostMapping
    public EquipmentDTO createEquipment(@RequestBody EquipmentFormDTO form) {
        Equipment equipment = form.convertToEntity();
        equipmentRepository.save(equipment);
        return new EquipmentDTO(equipment);
    }

    @GetMapping
    public List<EquipmentDTO> getAllEquipment() {
        List<Equipment> equipmentList = equipmentRepository.findAll();
        return equipmentList.stream().map(EquipmentDTO::new).toList();
    }

    @Transactional
    @PutMapping("/{id}")
    public EquipmentDTO updateEquipment(@PathVariable Long id, @RequestBody UpdateEquipmentFormDTO form) {
        Optional<Equipment> optEquipment = equipmentRepository.findById(id);
        if (optEquipment.isPresent()) {
            Equipment equipment = form.updateEntity(optEquipment.get());
            equipmentRepository.save(equipment);
            return new EquipmentDTO(equipment);
        } else {
            throw new RuntimeException("Equipment not found!");
        }
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteEquipment(@PathVariable Long id) {
        if (equipmentRepository.existsById(id)) {
            equipmentRepository.deleteById(id);
        } else {
            throw new RuntimeException("Equipment not found!");
        }
    }
}