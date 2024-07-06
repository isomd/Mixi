package com.mixi.webroom.common.annotation;

import com.mixi.common.constant.enums.UserStateEnum;
import org.springframework.core.annotation.Order;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author：XiaoChun
 * @Date：2024/7/4 上午11:57
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserState {
    UserStateEnum value();
}