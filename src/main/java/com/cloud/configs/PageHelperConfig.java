package com.cloud.configs;

import com.github.pagehelper.dialect.helper.MySqlDialect;
import com.github.pagehelper.page.PageAutoDialect;
import org.springframework.context.annotation.Configuration;

@Configuration // 标记当前类为一个配置类（配置文件---xml）
public class PageHelperConfig extends PageAutoDialect {

	static {
		System.out.println("加载了。。。");
		registerDialectAlias("zenith", MySqlDialect.class);
	}

}
