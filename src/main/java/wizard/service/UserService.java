package wizard.service;


import javax.inject.Named;
import javax.inject.Inject;
import wizard.dao.UserRepository;
import wizard.entity.User;

@Named
public class UserService{

    @Inject
    private UserRepository userRepository;

    public addUser(String name){
        User user = new User();
        user.setName(name);
        userRepository.save(user);
    }

}