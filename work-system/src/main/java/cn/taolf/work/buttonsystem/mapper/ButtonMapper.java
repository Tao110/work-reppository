package cn.taolf.work.buttonsystem.mapper;

import cn.taolf.work.buttonsystem.pojo.Button;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface ButtonMapper {

    @Select("SELECT * FROM t_button")
    List<Button> queryButton();
}
