package com.zfc.lazypigmall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    @ApiModelProperty(value = "商品表主键id")
    private Long id;

    @ApiModelProperty(value = "商品名")
    private String name;

    @ApiModelProperty(value = "商品简介")
    private String intro;

    @ApiModelProperty(value = "关联分类id")
    private Long categoryId;

    @ApiModelProperty(value = "商品主图")
    private String coverImg;

    @ApiModelProperty(value = "商品轮播图")
    private String carousel;

    @ApiModelProperty(value = "商品价格")
    private Integer originalPrice;

    @ApiModelProperty(value = "商品实际售价")
    private Integer sellingPrice;

    @ApiModelProperty(value = "商品库存数量")
    private Integer stockNum;

    @ApiModelProperty(value = "商品标签")
    private String tag;

    @ApiModelProperty(value = "商品上架状态 0-下架 1-上架")
    private Byte sellStatus;

    @ApiModelProperty(value = "添加者主键id")
    private Integer createUser;

    @ApiModelProperty(value = "商品添加时间")
    private Date createTime;

    @ApiModelProperty(value = "修改者主键id")
    private Integer updateUser;

    @ApiModelProperty(value = "商品修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "商品详情")
    private String detailContent;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getCarousel() {
        return carousel;
    }

    public void setCarousel(String carousel) {
        this.carousel = carousel;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Byte getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(Byte sellStatus) {
        this.sellStatus = sellStatus;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDetailContent() {
        return detailContent;
    }

    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", intro=").append(intro);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", coverImg=").append(coverImg);
        sb.append(", carousel=").append(carousel);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", sellingPrice=").append(sellingPrice);
        sb.append(", stockNum=").append(stockNum);
        sb.append(", tag=").append(tag);
        sb.append(", sellStatus=").append(sellStatus);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", detailContent=").append(detailContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}