package com.fzp.edu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author mayikt
 * @since 2023-06-06
 */
@ApiModel(value = "Xt对象", description = "")
public class Xt implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String pwassword;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwassword() {
        return pwassword;
    }

    public void setPwassword(String pwassword) {
        this.pwassword = pwassword;
    }

    @Override
    public String toString() {
        return "Xt{" +
        "id=" + id +
        ", username=" + username +
        ", pwassword=" + pwassword +
        "}";
    }
}
