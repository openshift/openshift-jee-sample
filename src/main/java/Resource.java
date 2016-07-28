import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by maciek on 28.07.2016.
 */
@Path("resource")
public class Resource {
    public String hello(@PathParam("/{name}" )String name){
        return name;
    }
}
