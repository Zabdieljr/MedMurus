package com.bezahive.symplifica.service;

import com.bezahive.symplifica.model.Group;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupService {

    // Add the methods that will be used in the controller
    // The controller will call these methods to perform CRUD operations
    // on the database

    // Add a group
    public Group addGroup(Group group);

    // Get a group by id
    public Group getGroupById(long id);

    // Get all groups
    public List<Group> getGroups();

    // Delete a group
    public void deleteGroup(long id);

    // Update a group
    public Group updateGroup(Group group);








}
