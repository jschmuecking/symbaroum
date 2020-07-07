# symbaroum
API for symbaroum charakter, monster creation and other helpful tools

# Dataimport
After the neo4j is up and running, run the following command to import the data into it:
```
docker exec -ti symbaroum-backend_neo4j_1 sh -c "cat /var/lib/neo4j/import/all.cypher | cypher-shell -u neo4j -p admin --format plain"
```
