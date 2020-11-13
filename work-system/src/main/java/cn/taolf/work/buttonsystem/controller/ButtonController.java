package cn.taolf.work.buttonsystem.controller;

import cn.taolf.work.buttonsystem.pojo.Button;
import cn.taolf.work.buttonsystem.service.ButtonService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Author: 陶利飞
 * @Date: 2020/11/12
 */
@Controller
public class ButtonController {

    @Autowired
    private ButtonService buttonService;

    //测试查询
    @Test
    public void queryButton(String keyWord){
        List<Button> list = buttonService.queryButton();
        list.forEach(b->{
            System.out.println(b);
        });

    }
}
