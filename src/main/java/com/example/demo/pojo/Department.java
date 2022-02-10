package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * </p>
 *
 * @author wpc
 * @since 2021/8/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private int id;
    private String departmentName;
}
