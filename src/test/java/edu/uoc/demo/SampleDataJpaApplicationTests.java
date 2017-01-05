package edu.uoc.demo;

import java.lang.management.ManagementFactory;

import javax.management.ObjectName;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Integration test to run the application.
 *
 * @author Oliver Gierke
 * @author Dave Syer
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//// Enable JMX so we can test the MBeans (you can't do this in a properties file)
////@TestPropertySource(properties = { "spring.jmx.enabled:true",
////        "spring.datasource.jmx-enabled:true" })
//@ActiveProfiles("test")
//// Separate profile for web tests to avoid clashing databases
public class SampleDataJpaApplicationTests {

//    @Autowired
//    private WebApplicationContext context;
//
//    private MockMvc mvc;
//
//    @Before
//    public void setUp() {
//        this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
//    }
//
//    @Test
//    public void testHome() throws Exception {
//
//        this.mvc.perform(get("/")).andExpect(status().isOk())
////                .andExpect(content().string("Bath"))
//        ;
//    }
//
////    @Test
////    public void testJmx() throws Exception {
////        assertThat(ManagementFactory.getPlatformMBeanServer()
////                .queryMBeans(new ObjectName("jpa.sample:type=ConnectionPool,*"), null))
////                .hasSize(1);
////    }

}
