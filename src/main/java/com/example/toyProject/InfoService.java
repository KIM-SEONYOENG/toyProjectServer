package com.example.toyProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
    @Autowired
    InfoMapper infoDao;

    public int findRoom(String co) {
        if(infoDao.findRoom(co) != null)
            return 1;
        return 0;
    }
}
