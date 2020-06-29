package org.symbaroum.api.admin.controller;

import org.springframework.web.bind.annotation.*;
import org.symbaroum.api.admin.model.abilities.Trait;
import org.symbaroum.api.admin.services.TraitService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/admin/trait")
@CrossOrigin
public class TraitController {
    private final TraitService service;

    public TraitController(TraitService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Optional<Trait> getTrait(@PathVariable Long id) {
        return service.getTraitById(id);
    }

    @GetMapping("")
    public List<Trait> getAllTraits() {
        return service.getAllTraits();
    }
}
