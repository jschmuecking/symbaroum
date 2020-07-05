package org.symbaroum.api.admin.controller;

import org.springframework.web.bind.annotation.*;
import org.symbaroum.api.admin.model.Race;
import org.symbaroum.api.admin.services.RaceService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/admin/races")
@CrossOrigin
public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping
    public List<Race> getAllRaces() {
        return raceService.getAllRaces();
    }

    @GetMapping("/{id}")
    public Race getRaceById(@PathVariable("id") Long raceId) {
        return raceService.getRaceById(raceId);
    }

    @PostMapping
    public Race saveRace(@RequestBody Race race) {
        return raceService.saveRace(race);
    }

    @DeleteMapping("/{id}")
    public void deleteRace(@PathVariable("id") Long raceId) {
        raceService.deleteRaceById(raceId);
    }
}
