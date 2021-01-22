package com.zfc.lazypigblog.article.controller;

import com.zfc.lazypigblog.article.model.Article;
import com.zfc.lazypigblog.article.service.ArticleService;
import com.zfc.lazypigblog.common.api.CommonPage;
import com.zfc.lazypigblog.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文章请求controller
 * @Author zfc
 * @Date 2020/10/17
 */
@RestController
@RequestMapping("/article")
@Api(tags = "ArticleController", value = "文章Controller")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @ApiOperation(value = "查询全部文章")
    @GetMapping()
    public CommonResult<List<Article>> list(){
        List<Article> list = articleService.list();
        return CommonResult.success(list);
    }

    @ApiOperation(value = "分页查询全部文章")
    @GetMapping("/{pageNum}/{pageSize}")
    public CommonResult<CommonPage<Article>> listPage(@PathVariable("pageNum") int pageNum,
                                               @PathVariable("pageSize") int pageSize){
        List<Article> list = articleService.listPage(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "根据ID查询文章")
    @GetMapping("/{id}")
    public CommonResult<Article> getById(@PathVariable("id") String id){
        Article article = articleService.getById(id);
        return CommonResult.success(article);
    }

    @ApiOperation(value = "查询头条文章")
    @GetMapping("/top")
    public CommonResult<List<Article>> getTop(){
        List<Article> topList = articleService.getTop();
        return CommonResult.success(topList);
    }

    @ApiOperation(value = "增加文章")
    @PostMapping()
    public CommonResult<Integer> create(@RequestBody Article article){
        int count = articleService.create(article);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "根据ID删除文章")
    @DeleteMapping("/{id}")
    public CommonResult<Integer> deleteById(@PathVariable("id") String id){
        int count = articleService.deleteById(id);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "根据ID更新文章")
    @PutMapping("/{id}")
    public CommonResult<Integer> updateById(@PathVariable("id") String id,
                                            @RequestBody Article article){
        int count = articleService.updateById(id, article);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "点赞文章")
    @PutMapping("/thumbup/{id}")
    public CommonResult<Integer> thumbUp(@PathVariable("id") String id){
        int count = articleService.thumbUp(id);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "文章审核")
    @PutMapping("/examine/{id}")
    public CommonResult<Integer> examine(@PathVariable("id") String id){
        int count = articleService.examine(id);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }

}
