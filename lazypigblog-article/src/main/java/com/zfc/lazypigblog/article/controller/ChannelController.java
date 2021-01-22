package com.zfc.lazypigblog.article.controller;

import com.zfc.lazypigblog.article.model.Channel;
import com.zfc.lazypigblog.article.service.ChannelService;
import com.zfc.lazypigblog.common.api.CommonPage;
import com.zfc.lazypigblog.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 频道请求controller
 * @Author zfc
 * @Date 2020/10/18
 */
@RestController
@RequestMapping("/channel")
@Api(tags = "ChannelController", value = "频道Controller")
public class ChannelController {

    @Resource
    private ChannelService channelService;

    @ApiOperation(value = "查询频道全部列表")
    @GetMapping()
    public CommonResult<List<Channel>> list(){
        List<Channel> list = channelService.list();
        return CommonResult.success(list);
    }

    @ApiOperation(value = "分页查询全部频道")
    @GetMapping("/{pageNum}/{pageSize}")
    public CommonResult<CommonPage<Channel>> listPage(@PathVariable("pageNum") int pageNum,
                                                      @PathVariable("pageSize") int pageSize){
        List<Channel> list = channelService.listPage(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation(value = "根据ID查询频道")
    @GetMapping("/{id}")
    public CommonResult<Channel> getById(@PathVariable("id") String id){
        Channel channel = channelService.getById(id);
        return CommonResult.success(channel);
    }

    @ApiOperation(value = "增加频道")
    @PostMapping()
    public CommonResult<Integer> create(@RequestBody Channel channel){
        int count = channelService.create(channel);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "根据ID删除频道")
    @DeleteMapping("/{id}")
    public CommonResult<Integer> deleteById(@PathVariable("id") String id){
        int count = channelService.deleteById(id);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "根据ID更新频道")
    @PutMapping("/{id}")
    public CommonResult<Integer> updateById(@PathVariable("id") String id,
                                            @RequestBody Channel channel){
        int count = channelService.updateById(id, channel);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }
}
