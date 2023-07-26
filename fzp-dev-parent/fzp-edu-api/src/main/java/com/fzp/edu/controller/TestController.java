package com.fzp.edu.controller;

import com.fzp.edu.base.BaseApiController;
import com.fzp.edu.base.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 测试使用
 *
 * @author momo
 */
@RestController //返回 JSON 类型数据格式
@Api(tags = "测试API接口")
public class TestController extends BaseApiController {

    @PostMapping("login")
    @ApiOperation(value = "测试add接口",
            notes = "根据用户名和密码")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",
                    name = "userName", value = "用户名", required = true),
            @ApiImplicitParam(paramType = "query",
                    name = "password", value = "密码", required = true)
    })
    public BaseResponse<String> login(String userName, String password) {
        if (StringUtils.isEmpty(userName) && StringUtils.isEmpty(password)) {
            return setResultError(" userName 不能为空！");
        }
        return setResultSuccessData("账号：" + userName + "   密码：" + password);

    }
}
