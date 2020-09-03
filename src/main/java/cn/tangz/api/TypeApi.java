package cn.tangz.api;

import cn.tangz.entity.TypeEntity;
import cn.tangz.service.TypeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 属性
 *
 * @author: tz
 * @create: 2020-09-03
 **/
@RestController
@RequestMapping("/api/type")
public class TypeApi {

    @Resource
    private TypeService typeService;

    /**
     * 创建新属性
     *
     * @param typeEntity 属性
     */
    @RequestMapping(value = "/createType", method = RequestMethod.POST)
    public void test(@RequestBody TypeEntity typeEntity) {
        typeService.createType(typeEntity);

    }
}
