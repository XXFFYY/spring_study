package com.Xie;

import com.Xie.service.AccountService;
import com.Xie.service.TypeService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: XXX
 * @author: XieFeiYu
 * @eamil: 32096231@qq.com
 * @date:2022/7/22 10:57
 */
public class Starter03 {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring03.xml");

        TypeService typeService = (TypeService) factory.getBean("typeService");
        typeService.test();
    }
}
