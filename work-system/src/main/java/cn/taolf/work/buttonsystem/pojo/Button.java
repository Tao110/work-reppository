package cn.taolf.work.buttonsystem.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: 陶利飞
 * @Date: 2020/10/26
 */
@Table(name = "t_button")
public class Button {

    @Id
    @Column(name = "btn_id")
    private String btnId;
    @Column(name = "btn_name")
    private String btnName;
    @Column(name = "btn_style")
    private String btnStyle;
    @Column(name = "btn_img")
    private String btnImg;
    @Column(name = "btn_info")
    private String btnInfo;
    @Column(name = "btn_createtime")
    private String btnCreateTime;
    @Column(name = "btn_createname")
    private String btnCreateName;

    public String getBtnId() {
        return btnId;
    }

    public void setBtnId(String btnId) {
        this.btnId = btnId;
    }

    public String getBtnName() {
        return btnName;
    }

    public void setBtnName(String btnName) {
        this.btnName = btnName;
    }

    public String getBtnStyle() {
        return btnStyle;
    }

    public void setBtnStyle(String btnStyle) {
        this.btnStyle = btnStyle;
    }

    public String getBtnImg() {
        return btnImg;
    }

    public void setBtnImg(String btnImg) {
        this.btnImg = btnImg;
    }

    public String getBtnInfo() {
        return btnInfo;
    }

    public void setBtnInfo(String btnInfo) {
        this.btnInfo = btnInfo;
    }

    public String getBtnCreateTime() {
        return btnCreateTime;
    }

    public void setBtnCreateTime(String btnCreateTime) {
        this.btnCreateTime = btnCreateTime;
    }

    public String getBtnCreateName() {
        return btnCreateName;
    }

    public void setBtnCreateName(String btnCreateName) {
        this.btnCreateName = btnCreateName;
    }
}
