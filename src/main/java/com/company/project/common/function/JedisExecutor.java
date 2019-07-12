package com.company.project.common.function;

import com.company.project.common.exception.RedisConnectException;

/**
 * @author ADMIN
 */
@FunctionalInterface
public interface JedisExecutor<T, R> {
    R excute(T t) throws RedisConnectException;
}
