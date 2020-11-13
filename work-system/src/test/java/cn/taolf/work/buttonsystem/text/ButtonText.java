package cn.taolf.work.buttonsystem.text;

import cn.taolf.work.buttonsystem.pojo.Button;
import cn.taolf.work.buttonsystem.service.ButtonService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: 陶利飞
 * @Date: 2020/11/12
 */
public class ButtonText {

    @Autowired
    private ButtonService buttonService;

    @Test
    public void queryButton(){
        String keyWord = "";
        List<Button> list = buttonService.queryButton();
        list.forEach(b->{
            System.out.println(b);
        });

    }
}
