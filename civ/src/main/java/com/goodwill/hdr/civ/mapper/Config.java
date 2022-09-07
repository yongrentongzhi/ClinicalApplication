package com.goodwill.hdr.civ.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author 余涛
 * @since 2022-03-03
 */
@TableName("civ_config")
public class Config implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String configCode;

    private String configName;

    private String configValue;

    private String configDesc;

    private String configType;

    private String configLevel;

    private Integer configIndex;

    private String configScopePage;

    private String groupId;

    private String groupName;

    private Integer groupIndex;

    private LocalDateTime createTime;

    private LocalDateTime lastUpdateTime;

    private String isInuse;

    private String mustBeConfiged;

    private String oid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public String getConfigDesc() {
        return configDesc;
    }

    public void setConfigDesc(String configDesc) {
        this.configDesc = configDesc;
    }

    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public String getConfigLevel() {
        return configLevel;
    }

    public void setConfigLevel(String configLevel) {
        this.configLevel = configLevel;
    }

    public Integer getConfigIndex() {
        return configIndex;
    }

    public void setConfigIndex(Integer configIndex) {
        this.configIndex = configIndex;
    }

    public String getConfigScopePage() {
        return configScopePage;
    }

    public void setConfigScopePage(String configScopePage) {
        this.configScopePage = configScopePage;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getGroupIndex() {
        return groupIndex;
    }

    public void setGroupIndex(Integer groupIndex) {
        this.groupIndex = groupIndex;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getIsInuse() {
        return isInuse;
    }

    public void setIsInuse(String isInuse) {
        this.isInuse = isInuse;
    }

    public String getMustBeConfiged() {
        return mustBeConfiged;
    }

    public void setMustBeConfiged(String mustBeConfiged) {
        this.mustBeConfiged = mustBeConfiged;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "Config{" +
                "id=" + id +
                ", configCode=" + configCode +
                ", configName=" + configName +
                ", configValue=" + configValue +
                ", configDesc=" + configDesc +
                ", configType=" + configType +
                ", configLevel=" + configLevel +
                ", configIndex=" + configIndex +
                ", configScopePage=" + configScopePage +
                ", groupId=" + groupId +
                ", groupName=" + groupName +
                ", groupIndex=" + groupIndex +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                ", isInuse=" + isInuse +
                ", mustBeConfiged=" + mustBeConfiged +
                ", oid=" + oid +
                "}";
    }
}
