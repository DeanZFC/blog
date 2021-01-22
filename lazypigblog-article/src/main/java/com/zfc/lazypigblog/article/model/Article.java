package com.zfc.lazypigblog.article.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "专栏ID")
    private String columnid;

    @ApiModelProperty(value = "用户ID")
    private String userid;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "文章封面")
    private String image;

    @ApiModelProperty(value = "发表日期")
    private Date createtime;

    @ApiModelProperty(value = "修改日期")
    private Date updatetime;

    @ApiModelProperty(value = "是否公开")
    private String ispublic;

    @ApiModelProperty(value = "是否置顶")
    private String istop;

    @ApiModelProperty(value = "浏览量")
    private Integer visits;

    @ApiModelProperty(value = "点赞数")
    private Integer thumbup;

    @ApiModelProperty(value = "评论数")
    private Integer comment;

    @ApiModelProperty(value = "审核状态")
    private String state;

    @ApiModelProperty(value = "所属频道")
    private String channelid;

    @ApiModelProperty(value = "URL")
    private String url;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "文章正文")
    private String content;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColumnid() {
        return columnid;
    }

    public void setColumnid(String columnid) {
        this.columnid = columnid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getIspublic() {
        return ispublic;
    }

    public void setIspublic(String ispublic) {
        this.ispublic = ispublic;
    }

    public String getIstop() {
        return istop;
    }

    public void setIstop(String istop) {
        this.istop = istop;
    }

    public Integer getVisits() {
        return visits;
    }

    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    public Integer getThumbup() {
        return thumbup;
    }

    public void setThumbup(Integer thumbup) {
        this.thumbup = thumbup;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", columnid=").append(columnid);
        sb.append(", userid=").append(userid);
        sb.append(", title=").append(title);
        sb.append(", image=").append(image);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", ispublic=").append(ispublic);
        sb.append(", istop=").append(istop);
        sb.append(", visits=").append(visits);
        sb.append(", thumbup=").append(thumbup);
        sb.append(", comment=").append(comment);
        sb.append(", state=").append(state);
        sb.append(", channelid=").append(channelid);
        sb.append(", url=").append(url);
        sb.append(", type=").append(type);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}