package com.zfc.lazypigblog.article.service.impl;

import com.github.pagehelper.PageHelper;
import com.zfc.lazypigblog.article.mapper.ColumnMapper;
import com.zfc.lazypigblog.article.model.Column;
import com.zfc.lazypigblog.article.model.ColumnExample;
import com.zfc.lazypigblog.article.service.ColumnService;
import com.zfc.lazypigblog.common.utils.IdWorker;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 专栏服务实现类
 * @Author zfc
 * @Date 2020/10/18
 */
@Service
public class ColumnServiceImpl implements ColumnService {
    @Resource
    private ColumnMapper columnMapper;
    @Resource
    private IdWorker idWorker;

    @Override
    public List<Column> list() {
        return columnMapper.selectByExample(new ColumnExample());
    }

    @Override
    public List<Column> listPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return columnMapper.selectByExample(new ColumnExample());
    }

    @Override
    public Column getById(String id) {
        return columnMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(Column column) {
        column.setId(idWorker.nextId()+"");
        return columnMapper.insertSelective(column);
    }

    @Override
    public int deleteById(String id) {
        return columnMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateById(String id, Column column) {
        column.setId(id);
        return columnMapper.updateByPrimaryKeySelective(column);
    }
}
