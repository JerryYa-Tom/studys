package com.fzp.edu.controller;

import com.fzp.edu.base.BaseApiController;
import com.fzp.edu.base.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 测试使用
 */
@RestController //返回 JSON 类型数据格式
@Api(tags = "测试API接口")
public class TestController extends BaseApiController {

    @GetMapping("/test")

    public BaseResponse<String> test() {
        return setResultSuccessData("fzp");
        /** 前端收到的JSON:
         *
         * {
         *     "code": 200,
         *     "msg": "ok",
         *     "data": "fzp"
         * }
         */
    }

    @GetMapping("/test2")
    @ApiOperation(value = "测试add接口",
            notes = "根据名称和密码")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",
                    name = "name", value = "名字", required = true),
            @ApiImplicitParam(paramType = "query",
                    name = "age", value = "年龄", required = true)

    })
    public BaseResponse<String> test2(String name, Integer age) {
        if (StringUtils.isEmpty(name)) {
            return setResultError("name 不能为空！");
        }
        Integer a = 1 / age;
        return setResultSuccess();

    }
}
