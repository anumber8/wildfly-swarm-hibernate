package org.carlosthe19916;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;

@RunWith(Arquillian.class)
@DefaultDeployment
public class HelloResourceTest extends AbstractIntegrationTest {

    @Test
    public void should_start_service() {
        String response = getUrlContents("http://localhost:8080/hello");
        Assert.assertEquals(response, "Hello world");
    }
}