package br.com.payment.management.security.user.service.impl;

import br.com.payment.management.security.role.repository.RoleRepository;
import br.com.payment.management.security.user.model.User;
import br.com.payment.management.security.user.repository.UserRepository;
import br.com.payment.management.security.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(final User user) {
        return null;
    }

    @Override
    public User update(final User user) {
        return null;
    }

    @Override
    public void deleteById(final Long id) {
        this.userRepository.delete(id);
    }

    @Override
    public User findById(final Long id) {
        return this.userRepository.findOne(id);
    }

    @Override
    public User findByUsername(final String username) {
        return null;
    }
}
