package wizard.service;


import conf.ServiceConfiguration;
import conf.TestContextLoader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import wizard.entity.User;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional()
@ContextConfiguration(classes = ServiceConfiguration.class, initializers = TestContextLoader.class)
public class UserServiceTest {

    @Inject
    UserService userService;

    @PersistenceContext
    EntityManager entityManager;

    @Test
    public void testUserAdd(){
        User user = userService.addUser("Tanmoy Majumdar");
        assertNotNull(user);

        User dbUser = userService.findUserById(user.getUserId());

        assertEquals(user.getUserId(), dbUser.getUserId());

    }






}
