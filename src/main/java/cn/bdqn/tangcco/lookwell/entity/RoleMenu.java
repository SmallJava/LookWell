package cn.bdqn.tangcco.lookwell.entity;

import java.util.Date;

public class RoleMenu {
    private Integer rolmenId;

    private Integer roleId;

    private Role role;

    private Integer menuId;

    private Menu menu;

    private String rolmenDesc;

    private Date createTime;

    private Date updateTime;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Integer getRolmenId() {
        return rolmenId;
    }

    public void setRolmenId(Integer rolmenId) {
        this.rolmenId = rolmenId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getRolmenDesc() {
        return rolmenDesc;
    }

    public void setRolmenDesc(String rolmenDesc) {
        this.rolmenDesc = rolmenDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
                "rolmenId=" + rolmenId +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                ", rolmenDesc='" + rolmenDesc + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}