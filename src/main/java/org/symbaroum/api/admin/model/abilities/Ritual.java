package org.symbaroum.api.admin.model.abilities;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
@Data
public class Ritual {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    @Relationship(type = "BELONGS_TO")
    private Tradition tradition;
}
