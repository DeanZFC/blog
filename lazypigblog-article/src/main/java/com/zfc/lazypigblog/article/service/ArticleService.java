package com.zfc.lazypigblog.article.service;

import com.zfc.lazypigblog.article.model.Article;

import java.util.List;

/**
 * 文章服务类
 * @Author zfc
 * @Date 2020/10/17
 */
public interface ArticleService {
    /**
     * 文章全部列表
     * @return 文章列表
     */
    List<Article> list();

    /**
     *
     * @param pageNum 当前页
     * @param pageSize 每页大小
     * @return 文章实体集合
     */
    List<Article> listPage(int pageNum, int pageSize);

    /**
     * 根据ID查询文章
     * @param id 文章id
     * @return 文章实体
     */
    Article getById(String id);

    /**
     * 头条文章
     * @return 头条文章列表
     */
    List<Article> getTop();

    /**
     * 增加文章
     * @param article 文章实体
     * @return 操作成功的行数
     */
    int create(Article article);

    /**
     * 根据ID删除文章
     * @param id 文章id
     * @return 操作成功的行数
     */
    int deleteById(String id);

    /**
     * 根据ID更新文章
     * @param id 文章id
     * @return 操作成功的行数
     */
    int updateById(String id, Article article);

    /**
     * 点赞
     * @param id 文章id
     * @return 操作成功的行数
     */
    int thumbUp(String id);

    /**
     * 文章审核
     * @param id 文章id
     * @return 操作成功的行数
     */
    int examine(String id);

}
