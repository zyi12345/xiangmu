package com.bwf.shop.admin.bean.po;
/**
 *
 * 菜单实体对象
 *
 * */
public class Menu {
    private Integer menu_id;//菜单编号
    private String menu_name;//菜单名称
    private String menu_url;//菜单跳转的url路径
    private Integer pid;//父级菜单编号

    public Integer getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Integer menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
