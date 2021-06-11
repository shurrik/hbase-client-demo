package com.example.demo.entity;

import lgh.springboot.starter.hbase.annotation.HBaseField;
import lgh.springboot.starter.hbase.annotation.HBaseTable;
import lgh.springboot.starter.hbase.entity.HBaseEntity;
import lombok.Data;
import org.apache.hadoop.hbase.io.compress.Compression;

/**
 * Created by lip on 2021/6/10.
 */
@Data
@HBaseTable(name = "TABLE1", columnFamily = "c0", compression = Compression.Algorithm.NONE)
public class HBaseTable1 extends HBaseEntity {

    @HBaseField(name = "field1", required = true)
    private String field1;

    private int color;

}
