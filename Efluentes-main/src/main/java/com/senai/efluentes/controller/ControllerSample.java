package com.senai.efluentes.controller;

import com.senai.efluentes.controller.dto.sample_dto.SampleDTO;
import com.senai.efluentes.controller.dto.sample_dto.SampleFormDTO;
import com.senai.efluentes.controller.dto.sample_dto.UpdateSampleFormDTO;
import com.senai.efluentes.entity.Sample;
import com.senai.efluentes.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/samples")
public class ControllerSample {

    @Autowired
    private SampleRepository sampleRepository;

    @Transactional
    @PostMapping
    public SampleDTO saveSample(@RequestBody SampleFormDTO form) {
        Sample sample = form.convertToEntity();
        sampleRepository.save(sample);
        return new SampleDTO(sample);
    }

    @GetMapping
    public List<SampleDTO> listSamples() {
        List<Sample> samples = sampleRepository.findAll();
        return SampleDTO.convertToListDTO(samples);
    }

    @Transactional
    @PutMapping("/{id}")
    public UpdateSampleFormDTO updateSample(@PathVariable Long id, @RequestBody UpdateSampleFormDTO form) {
        Optional<Sample> optSample = sampleRepository.findById(id);
        if (optSample.isPresent()) {
            Sample sample = form.updateEntity(optSample.get());
            sampleRepository.save(sample);
            return new UpdateSampleFormDTO(sample);
        }
        throw new RuntimeException("Sample not found!");
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deleteSample(@PathVariable Long id) {
        if (sampleRepository.existsById(id)) {
            sampleRepository.deleteById(id);
        } else {
            throw new RuntimeException("Sample not found!");
        }
    }
}
