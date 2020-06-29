package org.symbaroum.api.admin.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.symbaroum.api.admin.model.abilities.Trait;

public interface TraitRepository extends Neo4jRepository<Trait, Long> {

    @Query("MATCH (t:Trait) WHERE NOT t:Adept AND NOT t:Novice and NOT t:Master RETURN t")
    public Iterable<Trait> findAllDescriptors();
}
