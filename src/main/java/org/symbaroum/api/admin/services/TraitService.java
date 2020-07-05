package org.symbaroum.api.admin.services;

import org.springframework.stereotype.Service;
import org.symbaroum.api.admin.model.abilities.Trait;
import org.symbaroum.api.admin.repository.TraitRepository;
import org.symbaroum.api.exceptions.SymbaroumApiException;
import org.symbaroum.api.exceptions.SymbaroumApiExceptionType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class TraitService {
    private final TraitRepository repository;

    public TraitService(TraitRepository repository) {
        this.repository = repository;
    }

    public List<Trait> getAllTraits() {
        List<Trait> result = new ArrayList<>();
        Iterable<Trait> iterable = repository.findAllDescriptors();
        iterable.forEach(result::add);
        result.sort(Comparator.comparing(Trait::getName));
        return result;
    }

    public Trait getTraitById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new SymbaroumApiException(SymbaroumApiExceptionType.NOT_FOUND));
    }
}
