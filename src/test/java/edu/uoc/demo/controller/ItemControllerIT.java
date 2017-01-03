package edu.uoc.demo.controller;

import edu.uoc.demo.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by wmateo on 03/01/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemControllerIT {

    @Autowired
    ItemController itemController;

    @Test
    public void addItem() {

        Item item = new Item();
        item.setId(1);
        item.setDescription("item 1");
        Item itemOut = itemController.addItem(item);
        assertThat(itemOut).isEqualTo(item);

    }

}
