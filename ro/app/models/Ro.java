package models;

import helper.datasources.MorphiaObject;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

/**
 * Created by Lycantropus on 12-06-2016.
 */
@Entity
public class Ro  {

    @Id
    private ObjectId id;

    @Reference
    private User owner;

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
