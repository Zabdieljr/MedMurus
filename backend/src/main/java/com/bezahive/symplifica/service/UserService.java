package com.bezahive.symplifica.service;

import com.bezahive.symplifica.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    //Crud methods



    // add entity ex.  public Patient addPatient (User user);
    public User addUser (User user);
    // get entity ex.  public Patient getPatientById(long id);
    public User getUserById(long id);
    // List<Entity> get Entity ex. public List<Patient> getPatients();
    List<User> getUsers();
    // delete entity (void) ex.  public void deletePatient(long id);
    public void deleteUser (long id);
    // update entity      ex. public Patient updatePatient(Patient patient);
    public User updateUser(User user);
    // custom non repo class methods ex. public Patient getPatientByEmail (String email);

    // find by email
    public User getUserByEmail (String email);
    // find by username
    public User getUserByUserName (String username);
}
