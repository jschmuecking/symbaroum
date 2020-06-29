package org.symbaroum.api.admin.model.abilities;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
public class AbilityLevel {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private AbilityLevelType level;
    private ActionType type;
}
