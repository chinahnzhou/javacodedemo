package cn.java.demo.data_common.repository;

import org.springframework.data.repository.Repository;

import cn.java.demo.data_common.entity.FooOneEntity;

public interface FooTwoRepository extends Repository<FooOneEntity, Integer> {

}
