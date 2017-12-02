package org.tcat.test.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理服务
 *
 * @author Lin
 */
@RestController
@RequestMapping
@Transactional(rollbackFor = Exception.class)
public class UserService implements UserServiceRemote {

    @PostMapping("create")
    public Integer create() {
        return 1;
    }

    @Override
    public Integer deleteById(Integer id) {
        return null;
    }

}
