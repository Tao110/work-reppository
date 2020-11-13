package cn.taolf.work.buttonsystem.service.impl;

import cn.taolf.work.buttonsystem.mapper.ButtonMapper;
import cn.taolf.work.buttonsystem.pojo.Button;
import cn.taolf.work.buttonsystem.service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 陶利飞
 * @Date: 2020/10/26
 */
@Service
public class ButtonServiceImpl implements ButtonService {

    @Autowired
    private ButtonMapper buttonMapper;

    @Override
    public List<Button> queryButton() {
        List<Button> list = buttonMapper.queryButton();
        return list;
    }
}
