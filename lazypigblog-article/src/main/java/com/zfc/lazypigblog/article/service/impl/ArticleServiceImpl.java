package com.zfc.lazypigblog.article.service.impl;

import com.github.pagehelper.PageHelper;
import com.zfc.lazypigblog.article.dao.ArticleDao;
import com.zfc.lazypigblog.article.mapper.ArticleMapper;
import com.zfc.lazypigblog.article.model.Article;
import com.zfc.lazypigblog.article.model.ArticleExample;
import com.zfc.lazypigblog.article.service.ArticleService;
import com.zfc.lazypigblog.common.utils.IdWorker;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文章服务实现类
 * @Author zfc
 * @Date 2020/10/17
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private ArticleDao articleDao;
    @Resource
    private IdWorker idWorker;

    @Override
    public List<Article> list() {
        return articleMapper.selectByExample(new ArticleExample());
    }

    @Override
    public List<Article> listPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return articleMapper.selectByExample(new ArticleExample());
    }

    @Override
    public Article getById(String id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Article> getTop() {
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andIstopEqualTo("1");
        return articleMapper.selectByExample(articleExample);
    }

    @Override
    public int create(Article article) {
        article.setId(idWorker.nextId()+"");
        return articleMapper.insertSelective(article);
    }

    @Override
    public int deleteById(String id) {
        return articleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateById(String id, Article article) {
        article.setId(id);
        return articleMapper.updateByPrimaryKeySelective(article);
    }

    @Override
    public int thumbUp(String id) {
        return articleDao.thumbUp(id);
    }

    @Override
    public int examine(String id) {
        Article article = new Article();
        article.setId(id);
        article.setState("1");
        return articleMapper.updateByPrimaryKeySelective(article);
    }
}
