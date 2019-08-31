package com.gupaoedu.vip.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws Exception;

}
