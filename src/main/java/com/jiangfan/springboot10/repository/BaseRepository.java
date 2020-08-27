package com.jiangfan.springboot10.repository;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Auther: 江帆
 * @Date: 2020/7/6
 * @Description: com.jiangfan.springboot10.repository
 * @version: 1.0
 */
@NoRepositoryBean
public interface BaseRepository<T, Id extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {
}
