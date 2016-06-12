package models;

import org.mongodb.morphia.annotations.Entity;



import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lycantropus on 12-06-2016.
 */
@Entity("Photo")
public class Photo {

    public String albumId;
    public String desc;

    public Blob blob;
    public Set<String> tags;

    public Photo(String albumId) {
        if (null == tags) {
            tags = new HashSet<String>();
        }
        this.albumId = albumId;
    }



    public String getUrl() {
        //return null == blob ? null: blob.getUrl();
        return null;
    }
}

