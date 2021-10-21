package com.example.toyProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {
    @Autowired
    InfoMapper infoDao;

    public int findRoom(String co) {
        if(infoDao.findRoom(co) != null)
            return 1;
        return 0;
    }

    public List<InfoVO> findUser(String co) {
        return infoDao.findUser(co);
    }

    public void enterRoom(InfoVO enter) {
        infoDao.enterRoom(enter);
    }

    public void exitRoom(String id) {
        infoDao.exitRoom(id);
    }
}
