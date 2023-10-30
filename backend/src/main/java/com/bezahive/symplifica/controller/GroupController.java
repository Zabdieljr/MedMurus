package com.bezahive.symplifica.controller;

import com.bezahive.symplifica.model.Group;
import com.bezahive.symplifica.repository.GroupRepository;
import com.bezahive.symplifica.service.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//add rest RestController
@RestController
//add cross-origin
@CrossOrigin(origins = "http://localhost:5173")

public class GroupController {
    // add repository
    private  GroupRepository groupRepository;

    // add service
    private  GroupService groupService;

    // add constructor
    public GroupController(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }
    //add welcome message
    @RequestMapping("/group")
    public String welcome(){
        return "MedMurus Group REST API";
    }


    // add group
    @PostMapping("/group/add")
    public String addGroup(@RequestBody Group group){
        groupService.addGroup(group);
        return "Group added Successfully..";
    }

    // update group
    @PutMapping("/group")
    public Group updateGroup(@RequestBody Group group){
        return groupService.updateGroup(group);
    }

    // delete group
    @DeleteMapping("/group/{id}")
    public String deleteGroup(@PathVariable("id") long id){
        groupService.deleteGroup(id);
        return "Group Deleted";
    }
    // get all groups
    @RequestMapping("/groups")
    public List<Group> getGroups(){
        return groupService.getGroups();
    }
    // get group by id
    @RequestMapping("/group/{id}")
    public Group getGroupById(@PathVariable("id") long id){
        return groupService.getGroupById(id);
    }









}
