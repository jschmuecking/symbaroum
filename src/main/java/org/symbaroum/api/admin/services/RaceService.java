package org.symbaroum.api.admin.services;

import org.springframework.stereotype.Service;
import org.symbaroum.api.admin.model.Race;
import org.symbaroum.api.admin.repository.RaceRepository;
import org.symbaroum.api.exceptions.SymbaroumApiException;
import org.symbaroum.api.exceptions.SymbaroumApiExceptionType;

import java.util.ArrayList;
import java.util.List;

@Service
public class RaceService {

    private final RaceRepository raceRepository;

    public RaceService(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    public Race getRaceById(Long raceId) {
        return raceRepository
                .findById(raceId)
                .orElseThrow(() -> new SymbaroumApiException(SymbaroumApiExceptionType.NOT_FOUND));
    }

    public List<Race> getAllRaces() {
        List<Race> races = new ArrayList<>();
        raceRepository.findAll().forEach(races::add);
        return races;
    }

    public Race saveRace(Race race) {
        return raceRepository.save(race);
    }

    public void deleteRaceById(Long raceId) {
        Race race = getRaceById(raceId);
        raceRepository.delete(race);
    }
}
