package com.chenxi.empty;

import java.util.List;

/**
 * @author chenxi
 * 菜单实体
 */
public class Menu {

    private int mId;//数据库Id
    private String mName;//菜单名称
    private String mUrl;//菜单跳转url
    private String mCreateTime;//创建时间
    private String mCreateName;//创建者
    private String mLevel;//菜单等级
    private String mParentId;//父菜单id
    private List<Menu> mChilds;//子菜单

    public String getmParentId() {
        return mParentId;
    }

    public void setmParentId(String mParentId) {
        this.mParentId = mParentId;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getmCreateTime() {
        return mCreateTime;
    }

    public void setmCreateTime(String mCreateTime) {
        this.mCreateTime = mCreateTime;
    }

    public String getmCreateName() {
        return mCreateName;
    }

    public void setmCreateName(String mCreateName) {
        this.mCreateName = mCreateName;
    }

    public String getmLevel() {
        return mLevel;
    }

    public void setmLevel(String mLevel) {
        this.mLevel = mLevel;
    }

    public List<Menu> getmChilds() {
        return mChilds;
    }

    public void setmChilds(List<Menu> mChilds) {
        this.mChilds = mChilds;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mUrl='" + mUrl + '\'' +
                ", mCreateTime='" + mCreateTime + '\'' +
                ", mCreateName='" + mCreateName + '\'' +
                ", mLevel='" + mLevel + '\'' +
                ", mParentId='" + mParentId + '\'' +
                ", mChilds=" + mChilds +
                '}';
    }
}
