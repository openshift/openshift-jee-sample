package edu.uoc.demo.repository;

/**
 * Created by wmateo on 03/01/2017.
 */
import edu.uoc.demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
