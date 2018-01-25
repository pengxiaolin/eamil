package com.lxy.email;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengXiaoLin
 * @date 2018-01-25 9:17
 **/
public class EmailTest {
    public static void main(String[] args) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("userName", "彭小林");
        model.put("emailAddress", "pengxiaolin@tospur.com");
        MailSenderUtil.sendEmail(model, "欢迎加入", "welcome.vm", new String[]{"pengxiaolin@tospur.com"}, new String[]{});
    }
}
