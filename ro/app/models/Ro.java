package models;

import helper.datasources.MorphiaObject;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Lycantropus on 12-06-2016.
 */
@Entity
public class Ro  {

    @Id
    private ObjectId id;

    private UUID uniqueId;

    @Reference
    private User owner;


    private List<Artifact> artifacts;

    public UUID getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(UUID uniqueId) {
        this.uniqueId = uniqueId;
    }

    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void addArtifact( Artifact art)
    {   if(artifacts==null)
        {
         artifacts= new ArrayList<Artifact>();
        }
        artifacts.add(art);
    }

    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    private String name;



    public static Ro create(Ro newone){
        MorphiaObject.datastore.save(newone);
        return newone;
    }


}
