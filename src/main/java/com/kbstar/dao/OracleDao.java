package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyDao;

import java.util.List;

public class OracleDao implements MyDao<String, UserDTO> {


    @Override
    public void insert(UserDTO userDTO) {

    }

    @Override
    public void delete(String s) {

    }

    @Override
    public UserDTO get(String s) {
        return null;
    }

    @Override
    public List<UserDTO> get() {
        return null;
    }
}
