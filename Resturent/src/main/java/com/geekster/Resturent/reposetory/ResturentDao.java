package com.geekster.Resturent.reposetory;

import com.geekster.Resturent.model.Resturent;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ResturentDao {

    List<Resturent> resturents=new ArrayList<>();
    public String saveResturent(Resturent resturent) {
        resturents.add(resturent);
        return "saved successfully";
    }

    public List<Resturent> getAllRes() {
        return resturents;
    }
}
