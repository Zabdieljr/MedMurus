package com.bezahive.symplifica.service;

import com.bezahive.symplifica.model.Group;
import com.bezahive.symplifica.repository.GroupRepository;

import java.util.List;

public class GroupServiceImpl implements GroupService {

    //Add GroupRepository
    private GroupRepository groupRepository;

    @Override
    public Group addGroup(Group group) {
        //add Group to database
        return groupRepository.save(group);
    }

    @Override
    public Group getGroupById(long id) {
        //get group from database
        return groupRepository.findById(id).get();
    }

    @Override
    public List<Group> getGroups() {
        //get all groups from database
        return (List<Group>) groupRepository.findAll();
    }
    @Override
    public void deleteGroup(long id) {
        //delete group from database
        groupRepository.deleteById(id);
    }

    @Override
    public Group updateGroup(Group group) {
        //update group in database
        return groupRepository.save(group);
    }
}
