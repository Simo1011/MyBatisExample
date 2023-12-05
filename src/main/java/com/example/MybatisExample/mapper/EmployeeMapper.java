package com.example.MybatisExample.mapper;

import com.example.MybatisExample.entity.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM Employee")
    List<Employee> getAllEmployees();

    @Select("SELECT * FROM Employee WHERE ID= #{id}")
    Employee getEmployeeById(int id);

    @Insert("INSERT INTO EMPLOYEE (ID,FIRST_NAME,LAST_NAME) VALUES (#{ID,jdbcType=NUMERIC},#{FIRST_NAME},#{LAST_NAME})")
    void insertEmployee(Employee employee);

    @Update("UPDATE Employee SET FIRST_NAME=#{FIRST_NAME},LAST_NAME=#{LAST_NAME} WHERE ID=#{ID,jdbcType=NUMERIC}")
    void updateEmployee(Employee employee);

    @Delete("DELETE FROM Employee WHERE ID = #{id}")
    void deleteEmployee(int id);
}
