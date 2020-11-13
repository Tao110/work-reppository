package cn.taolf.work.buttonsystem.service;

import cn.taolf.work.buttonsystem.pojo.Button;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 陶利飞
 * @Date: 2020/10/26
 */

public interface ButtonService {

  /**
   * @param  
   * @return
   * @author taolf
   * @info 查询
   */
    List<Button> queryButton();
}
