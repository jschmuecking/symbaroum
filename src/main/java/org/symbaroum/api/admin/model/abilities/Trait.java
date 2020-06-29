package org.symbaroum.api.admin.model.abilities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.symbaroum.api.admin.model.Race;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
@Data
public class Trait extends Ability {
    @JsonIgnoreProperties({"mustHave", "canHave"})
    @Relationship(type = "MUST_HAVE", direction = "INCOMING")
    private List<Race> alwaysInRaces = new ArrayList<>();

    @JsonIgnoreProperties({"mustHave", "canHave"})
    @Relationship(type = "CAN_HAVE", direction = "INCOMING")
    private List<Race> sometimesInRaces = new ArrayList<>();
}
