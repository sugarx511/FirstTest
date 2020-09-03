package cn.tangz.service;

import cn.tangz.entity.TypeEntity;

/**
 * 属性
 *
 * @author: tz
 * @create: 2020-09-03
 **/
public interface TypeService {

    /**
     * 创建新属性
     *
     * @param typeEntity 属性
     */
    void createType(TypeEntity typeEntity);
}
