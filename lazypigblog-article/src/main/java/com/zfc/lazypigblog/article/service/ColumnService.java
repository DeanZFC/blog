package com.zfc.lazypigblog.article.service;

import com.zfc.lazypigblog.article.model.Column;

import java.util.List;

/**
 * 专栏服务类
 * @Author zfc
 * @Date 2020/10/18
 */
public interface ColumnService {

    /**
     * 查询专栏全部列表
     * @return 专栏实体列表
     */
    List<Column> list();

    /**
     * 分页查询专栏全部列表
     * @param pageNum 当前页
     * @param pageSize 每页大小
     * @return 专栏实体列表
     */
    List<Column> listPage(int pageNum, int pageSize);

    /**
     * 根据ID查询专栏
     * @return 专栏实体
     */
    Column getById(String id);

    /**
     *
     * @param column 专栏实体
     * @return 操作成功的行数
     */
    int create(Column column);

    /**
     * 根据ID删除专栏
     * @param id 专栏id
     * @return 操作成功的行数
     */
    int deleteById(String id);

    /**
     * 根据ID更新专栏
     * @param id 专栏id
     * @return 操作成功的行数
     */
    int updateById(String id, Column column);
}
