package wizard.service;


import javax.inject.Named;
import javax.inject.Inject;
import wizard.dao.UserRepository;
import wizard.entity.User;

@Named
public class UserService{

    @Inject
    private UserRepository userRepository;

    public User addUser(String name){
        User user = new User();
        user.setName(name);
        return userRepository.save(user);
    }
    public User findUserById(Long userId){
        return userRepository.findOne(userId);
    }

}