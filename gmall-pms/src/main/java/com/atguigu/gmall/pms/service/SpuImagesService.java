package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SpuImagesEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu图片
 *
 * @author ZhengFei
 * @email zf@atguigu.com
 * @date 2019-12-02 19:04:19
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

