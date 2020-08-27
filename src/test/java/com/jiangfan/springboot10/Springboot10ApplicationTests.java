package com.jiangfan.springboot10;

import com.jiangfan.springboot10.entity.User;
import com.jiangfan.springboot10.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot10ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserRepository userRepository;

    @Test
    public void test01() {
        System.out.println("--------------------" + dataSource.getClass());
        System.out.println("--------------------" + userRepository);

    }

    @Test
    public void test02() {
        Page<User> all = userRepository.findAll(PageRequest.of(0, 10));
        List<User> content = all.getContent();
        for (User user : content) {
            System.out.println(user);
        }

    }

    @Test
    public void test03() {
        User user = new User();
        user.setEmail("JJJ");
        user.setDate(new Date());
        user.setLastName("第三次");
        User save = userRepository.save(user);
        System.out.println(save);
    }
}
