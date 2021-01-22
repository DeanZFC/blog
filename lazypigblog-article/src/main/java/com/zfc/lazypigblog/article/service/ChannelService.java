package com.zfc.lazypigblog.article.service;

import com.zfc.lazypigblog.article.model.Channel;

import java.util.List;

/**
 * 频道服务类
 * @Author zfc
 * @Date 2020/10/18
 */
public interface ChannelService {

    /**
     * 查询频道全部列表
     * @return 频道实体列表
     */
    List<Channel> list();

    /**
     * 分页查询频道全部列表
     * @param pageNum 当前页
     * @param pageSize 每页大小
     * @return 频道实体列表
     */
    List<Channel> listPage(int pageNum, int pageSize);

    /**
     * 根据ID查询频道
     * @return 频道实体
     */
    Channel getById(String id);

    /**
     *
     * @param channel 频道实体
     * @return 操作成功的行数
     */
    int create(Channel channel);

    /**
     * 根据ID删除频道
     * @param id 频道id
     * @return 操作成功的行数
     */
    int deleteById(String id);

    /**
     * 根据ID更新频道
     * @param id 频道id
     * @return 操作成功的行数
     */
    int updateById(String id, Channel channel);
}
