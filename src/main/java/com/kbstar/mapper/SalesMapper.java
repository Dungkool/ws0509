package com.kbstar.mapper;

import com.kbstar.dto.Sales;
import com.kbstar.frame.KBMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Date;

@Repository
@Mapper
public interface SalesMapper extends KBMapper<Date, Sales> {
    public List<Sales> getmonth(int m);
}
