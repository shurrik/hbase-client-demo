package com.example.demo.service;

import com.example.demo.entity.HBaseTable1;
import lgh.springboot.starter.hbase.config.HBaseClientConfiguration;
import lgh.springboot.starter.hbase.template.HBaseTemplate;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;

/**
 * Created by lip on 2021/6/10.
 */
@SpringBootTest
public class HbaseTemplateTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(HbaseTemplateTest.class);

//    @Autowired
//    private HBaseTemplate hbaseTempl;
    @Autowired
    private HBaseTemplate hbaseTemplate;

    @Test
    public void testSave()
    {
//        HBaseClientConfiguration clientConfiguration = new HBaseClientConfiguration();
//        HBaseTemplate hBaseTemplate = new HBaseTemplate(clientConfiguration);
        HBaseTable1 table1 = new HBaseTable1();
        String rowKey = String.valueOf(System.currentTimeMillis());
        table1.setRowKey(rowKey);
        table1.setField1("接着奏乐接着舞");
        table1.setColor(2233);
        //hbaseTemplate.createTable(HBaseTable1.class);
        hbaseTemplate.save(table1);
        HBaseTable1 ht = hbaseTemplate.getByRowKey(HBaseTable1.class,rowKey);
        LOGGER.info(ht.getField1());
        LOGGER.info(String.valueOf(ht.getColor()));

    }

}
