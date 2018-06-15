package com.jince.model;

import com.aventstack.extentreports.reporter.configuration.Theme;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/*
 * Created by Qj on 2017/3/31.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateResultList {

    /*******************************/
    //执行压缩后的最终文件名(绝对路径)
    private String zipFilePathAndName;
    //执行将被压缩的文件夹
    private String zipSourceDoc;

    /*******************************/
    //测试邮件发送地址
    private String[] testMailAddress;
    //测试邮件标题
    private String testMailTitle;
    //测试邮件内容
    private String testMailContent;

    /*******************************/
    //手机通知列表
    private String mobiles;
    //手机短信内容
    private String smsContent;
}
