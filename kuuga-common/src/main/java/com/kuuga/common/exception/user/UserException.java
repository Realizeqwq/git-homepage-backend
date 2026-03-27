package com.kuuga.common.exception.user;

import com.kuuga.common.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author kuuga
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
