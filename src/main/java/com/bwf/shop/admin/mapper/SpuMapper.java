package com.bwf.shop.admin.mapper;

import com.bwf.shop.admin.bean.bo.SpuAddBo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
//添加商品控制层
@Repository
public interface SpuMapper {
    /**
     * 添加商品
     *
     *
     * */
    int addSpu(@Param("bo") SpuAddBo bo);

}
