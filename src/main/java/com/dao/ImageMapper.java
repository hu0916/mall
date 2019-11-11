package com.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.entity.Image;

@Mapper
public interface ImageMapper {
    int insert(@Param("image") Image image);

    int insertSelective(@Param("image") Image image);

    int insertList(@Param("images") List<Image> images);

    int updateByPrimaryKeySelective(@Param("image") Image image);

    List<Image> getImages();
}
