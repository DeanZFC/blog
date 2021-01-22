package com.zfc.lazypigblog.article.dao;

/**
 * mybatis自定义mapper
 * @Author zfc
 * @Date 2020/10/17
 */
public interface ArticleDao {

    /**
     * 点赞加一
     * @param id String
     * @return int
     */
    int thumbUp(String id);
}
