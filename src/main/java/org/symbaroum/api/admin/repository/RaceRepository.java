package org.symbaroum.api.admin.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.symbaroum.api.admin.model.Race;

public interface RaceRepository extends Neo4jRepository<Race, Long> {

    Race findRaceByName(String name);
}
