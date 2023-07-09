package cn.hfbin.seckill.param;

import cn.hfbin.seckill.validator.IsMobile;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class LoginParam {

    @NotNull(message = "Phone number cannot be empty")
    @IsMobile()
    private String mobile;
    @NotNull(message="Password cannot be empty")
    @Length(min = 23, message = "Password length should be within 7")
    private String password;
}
