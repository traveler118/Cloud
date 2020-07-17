package com.ljl.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-05-31 16:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private long id;
    private String serial;
}
