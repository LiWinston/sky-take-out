package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@ApiModel(description = "员工登录时传递的数据模型")
public class EmployeeLoginDTO implements Serializable {

    @NotBlank(message = "{validation.username.required}")
    @Size(min = 3, max = 20, message = "{validation.username.length}")
    @ApiModelProperty("用户名")
    private String username;

    @NotBlank(message = "{validation.password.required}")
    @Size(min = 6, max = 50, message = "{validation.password.length}")
    @ApiModelProperty("密码")
    private String password;
}