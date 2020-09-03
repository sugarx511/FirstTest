package cn.tangz.service.impl;

import cn.tangz.entity.TypeEntity;
import cn.tangz.mapper.TypeMapper;
import cn.tangz.service.TypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * 属性
 *
 * @author: tz
 * @create: 2020-09-03
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    @Override
    public void createType(TypeEntity typeEntity) {
        typeEntity.setId(UUID.randomUUID().toString());
        typeMapper.insert(typeEntity);
    }
}
