package com.chenxi.empty;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chenxi
 * 菜单实体
 */
public class Menu {

    private int id;//数据库Id
    private String text;//菜单名称
    private String href;//菜单跳转url
    private String createTime;//创建时间
    private String createName;//创建者
    private String level;//菜单等级
    private String parentId;//父菜单id
    private String icon;//图标
    private String state;//菜单状态
    private List<Menu> nodes;//子菜单

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Menu> getNodes() {
        return nodes;
    }

    public void setNodes(List<Menu> nodes) {
        this.nodes = nodes;
    }
}
