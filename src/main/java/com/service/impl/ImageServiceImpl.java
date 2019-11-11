package com.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.entity.Image;
import com.dao.ImageMapper;
import com.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService{

    @Resource
    private ImageMapper imageMapper;

    @Override
    public int insert(Image image){
        return imageMapper.insert(image);
    }

    @Override
    public int insertSelective(Image image){
        return imageMapper.insertSelective(image);
    }

    @Override
    public int insertList(List<Image> images){
        return imageMapper.insertList(images);
    }

    @Override
    public int updateByPrimaryKeySelective(Image image){
        return imageMapper.updateByPrimaryKeySelective(image);
    }

    @Override
    public List<Image> getImages() {
        return imageMapper.getImages();
    }
}
