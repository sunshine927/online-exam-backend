package edu.sandau.service;

import edu.sandau.entity.EmailMessage;

import java.util.Map;

public interface EmailService {

    /***
     * 发送邮件 只能发文字
     * @param emailMessage 邮箱发送对象
     * @throws Exception
     */
    void sendSimpleMail(EmailMessage emailMessage);

    /***
     * 带附件的HTML格式的Email
     */
    void sendHTMLMail(EmailMessage emailMessage, Map<String, Object> model, String templateFileName);
}
