package springboot.demo.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class User {

    @NotEmpty(message = "姓名不能为空")
    private String name;
    @Min(value = 18, message = "需年满18岁")
    @Max(value = 30, message = "年龄不能超过30岁")
    private Integer age;
    @NotEmpty(message = "密码不可为空")
    @Length(min = 6, max = 10, message = "密码应在6~10位")
    private String password;
    @AssertTrue(message = "性别应为男性")
    private Boolean sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

}
