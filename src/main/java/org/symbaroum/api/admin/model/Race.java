package org.symbaroum.api.admin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.symbaroum.api.admin.model.abilities.Trait;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
@Data
public class Race {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @JsonIgnoreProperties({"alwaysInRaces", "sometimesInRaces"})
    @Relationship(type = "MUST_HAVE")
    private List<Trait> mustHave = new ArrayList<>();

    @JsonIgnoreProperties({"alwaysInRaces", "sometimesInRaces"})
    @Relationship(type = "CAN_HAVE")
    private List<Trait> canHave = new ArrayList<>();
}
