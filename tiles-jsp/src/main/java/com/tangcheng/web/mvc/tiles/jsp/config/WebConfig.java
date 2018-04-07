package com.tangcheng.web.mvc.tiles.jsp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * @author tangcheng
 * 2018/04/04
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }

    /**
     * TilesConfigure会加载Tile定义并与Apache Tiles协作
     * 负责定位和加载Tile定义并协调生成Tiles
     *
     * @return
     */
    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions("WEB-INF/layout/tiles.xml");//指定Tiles定义的位置
        tilesConfigurer.setCheckRefresh(true);//启用刷新功能
        return tilesConfigurer;
    }


    /**
     * 将逻辑视图名解析为Tile定义
     * TileViewResolver会将逻辑视图名称解析为引用Tile定义的视图
     * 它是通过查找与逻辑视图名称相匹配的Tile定义来实现的
     *
     * @return
     */
    @Bean
    public TilesViewResolver tilesViewResolver() {
        TilesViewResolver viewResolver = new TilesViewResolver();
        viewResolver.setViewClass(TilesView.class);
        return viewResolver;
    }

}
