package com.geekster.Resturent.service;

import com.geekster.Resturent.model.Resturent;
import com.geekster.Resturent.reposetory.ResturentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResturentService {
    @Autowired
    ResturentDao resturentDao;
    public String addResturent(Resturent resturent) {
        return resturentDao.saveResturent(resturent);
    }

    public List<Resturent> getAllResturent() {
        return resturentDao.getAllRes();
    }

    public Resturent getResturentById(String id) {
        List<Resturent> resturents=resturentDao.getAllRes();
        for(Resturent res:resturents){
            if(res.getId()==Integer.parseInt(id)){
                return res;
            }
        }
        return null;
    }

    public String delete(String id) {
        List<Resturent> resturents=resturentDao.getAllRes();
        for(Resturent res:resturents){
            if(res.getId()==Integer.parseInt(id)){
                resturents.remove(res);
                return "deleted";
            }
        }
        return "id does not found";
    }

    public String postResturent(String id, String specialty) {
        List<Resturent> resturents=resturentDao.getAllRes();
        for(Resturent res:resturents){
            if(res.getId()==Integer.parseInt(id)){
                resturents.remove(res);
                res.setSpecialty(specialty);
                return "updated successfully";
            }
        }
        return "id not found";
    }
}
