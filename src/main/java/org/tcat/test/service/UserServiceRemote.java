package org.tcat.test.service;


import org.springframework.web.bind.annotation.PostMapping;

/**
 * 用户服务接口
 *
 * @author Lin
 */
public interface UserServiceRemote {
    @PostMapping("deleteById")
    Integer deleteById(Integer id);

}
