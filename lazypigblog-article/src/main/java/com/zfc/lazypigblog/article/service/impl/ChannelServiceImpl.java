package com.zfc.lazypigblog.article.service.impl;

import com.github.pagehelper.PageHelper;
import com.zfc.lazypigblog.article.mapper.ChannelMapper;
import com.zfc.lazypigblog.article.model.Channel;
import com.zfc.lazypigblog.article.model.ChannelExample;
import com.zfc.lazypigblog.article.service.ChannelService;
import com.zfc.lazypigblog.common.utils.IdWorker;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 频道服务实现类
 * @Author zfc
 * @Date 2020/10/18
 */
@Service
public class ChannelServiceImpl implements ChannelService {

    @Resource
    private ChannelMapper channelMapper;
    @Resource
    private IdWorker idWorker;

    @Override
    public List<Channel> list() {
        return channelMapper.selectByExample(new ChannelExample());
    }

    @Override
    public List<Channel> listPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return channelMapper.selectByExample(new ChannelExample());
    }

    @Override
    public Channel getById(String id) {
        return channelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(Channel channel) {
        channel.setId(idWorker.nextId()+"");
        return channelMapper.insertSelective(channel);
    }

    @Override
    public int deleteById(String id) {
        return channelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateById(String id, Channel channel) {
        channel.setId(id);
        return channelMapper.updateByPrimaryKeySelective(channel);
    }
}
