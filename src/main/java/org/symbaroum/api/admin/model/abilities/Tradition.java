package org.symbaroum.api.admin.model.abilities;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
public class Tradition {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
