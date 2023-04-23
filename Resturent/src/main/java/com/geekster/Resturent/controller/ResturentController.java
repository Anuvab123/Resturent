package com.geekster.Resturent.controller;

import com.geekster.Resturent.model.Resturent;
import com.geekster.Resturent.service.ResturentService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResturentController {
    @Autowired
    ResturentService resturentService;

    @PostMapping(value="/add")
    public String addResturent(@RequestBody Resturent resturent){
        return resturentService.addResturent(resturent);
    }

    @GetMapping(value="/getAll")
    public List<Resturent> getAll(){
        return resturentService.getAllResturent();
    }

    @GetMapping(value="/getById/{id}")
    public Resturent getById(@PathVariable String id){
        return resturentService.getResturentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteResturent(@PathVariable String id){
        return resturentService.delete(id);
    }

    @PostMapping("/update")
    public String updateResturent(@RequestParam String id,@RequestParam String specialty){
        return resturentService.postResturent(id,specialty);
    }


}
