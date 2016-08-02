import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by maciek on 28.07.2016.
 */
@Path("/resource")
public class Resource {

    private Logger log = LoggerFactory.getLogger(Resource.class);

    @GET
    public String hello(){
        log.info("hello world");
        final String mongodb_user = System.getenv("MONGODB_USER");
        final String mongodb_password = System.getenv("MONGODB_PASSWORD");
        final String mongodb_database = System.getenv("MONGODB_DATABASE");

        log.info(String.format("MONGODB_USER %s MONGODB_PASSWORD %s MONGODB_DATABASE %s",mongodb_user,mongodb_password,mongodb_database));
        MongoCredential credential = MongoCredential.createCredential(mongodb_user, mongodb_database, mongodb_password.toCharArray());
        MongoClient mongoClient = new MongoClient(new ServerAddress(), Arrays.asList(credential));
        MongoDatabase db = mongoClient.getDatabase(mongodb_database);

        db.getCollection("items").insertOne(
                new Document("name",new Date().toString()));


        FindIterable<Document> iterable = db.getCollection("items").find();
        StringBuilder names = new StringBuilder();
        for (Document document : iterable) {
            names.append(document.get("name"));
        }
        return names.toString();
    }
}
