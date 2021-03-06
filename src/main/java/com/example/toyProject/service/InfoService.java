package com.example.toyProject.service;

import com.example.toyProject.domain.InfoVO;
import com.example.toyProject.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {
    @Autowired
    InfoMapper infoDao;

    public List<InfoVO> findAll() {
        return infoDao.findAll();
    }

    public int findRoom(String co) {
        if(infoDao.findRoom(co) > 0)
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
