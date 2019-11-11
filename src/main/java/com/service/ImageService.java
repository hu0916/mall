package com.service;

import java.util.List;
import com.entity.Image;
public interface ImageService{

    int insert(Image image);

    int insertSelective(Image image);

    int insertList(List<Image> images);

    int updateByPrimaryKeySelective(Image image);

    List<Image> getImages();

}
