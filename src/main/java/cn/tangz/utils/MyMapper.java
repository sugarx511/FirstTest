package cn.tangz.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author: tz
 * @create: 2020-09-03
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
