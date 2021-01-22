package com.zfc.lazypigblog.article.controller;

import com.zfc.lazypigblog.article.model.Column;
import com.zfc.lazypigblog.article.service.ColumnService;
import com.zfc.lazypigblog.common.api.CommonPage;
import com.zfc.lazypigblog.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 专栏请求controller
 * @Author zfc
 * @Date 2020/10/18
 */
@RestController
@RequestMapping("/column")
@Api(tags = "ColumnController", value = "专栏Controller")
public class ColumnController {

    @Resource
    private ColumnService columnService;

    @ApiOperation(value = "查询全部专栏")
    @GetMapping()
    public CommonResult<List<Column>> list(){
        List<Column> list = columnService.list();
        return CommonResult.success(list);
    }

    @ApiOperation(value = "分页查询全部专栏")
    @GetMapping("/{pageNum}/{pageSize}")
    public CommonResult<CommonPage<Column>> listPage(@PathVariable("pageNum") int pageNum,
                                                      @PathVariable("pageSize") int pageSize){
        List<Column> list = columnService.listPage(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "根据ID查询专栏")
    @GetMapping("/{id}")
    public CommonResult<Column> getById(@PathVariable("id") String id){
        Column Column = columnService.getById(id);
        return CommonResult.success(Column);
    }

    @ApiOperation(value = "增加专栏")
    @PostMapping()
    public CommonResult<Integer> create(@RequestBody Column column){
        int count = columnService.create(column);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "根据ID删除专栏")
    @DeleteMapping("/{id}")
    public CommonResult<Integer> deleteById(@PathVariable("id") String id){
        int count = columnService.deleteById(id);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "根据ID更新专栏")
    @PutMapping("/{id}")
    public CommonResult<Integer> updateById(@PathVariable("id") String id,
                                            @RequestBody Column column){
        int count = columnService.updateById(id, column);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }
}
