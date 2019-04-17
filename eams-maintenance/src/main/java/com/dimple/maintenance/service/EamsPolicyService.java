package com.dimple.maintenance.service;

import com.dimple.maintenance.domain.Policy;

import java.util.List;

/**
 * 策略表(Policy)表服务接口
 *
 * @author makejava
 * @since 2019-04-17 11:35:26
 */
public interface EamsPolicyService {

    /**
     * 通过ID查询单条数据
     *
     * @param polId 主键
     * @return 实例对象
     */
    Policy selectPolicyById(Long polId);

    /**
     * 查询多条数据
     *
     * @param policy 查询条件
     * @return 对象列表
     */
    List<Policy> selectPolicyList(Policy policy);

    /**
     * 新增数据
     *
     * @param policy 实例对象
     * @return 受影响的行数
     */
    int insertPolicy(Policy policy);

    /**
     * 修改数据
     *
     * @param policy 实例对象
     * @return 受影响的行数
     */
    int updatePolicy(Policy policy);

    /**
     * 通过主键删除数据
     *
     * @param polId 主键
     * @return 是否成功
     */
    int deletePolicyById(Long polId);

}