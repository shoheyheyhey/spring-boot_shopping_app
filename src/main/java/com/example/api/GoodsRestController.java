package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.common.GoogleDriveApiCallService;
import com.example.entity.TblGoods;
import com.example.service.GoodsService;

@CrossOrigin
@RestController
@RequestMapping("api/goods")
public class GoodsRestController {

    @Autowired
    GoodsService goodsService;
    @Autowired
    GoogleDriveApiCallService googleDriveApiCallService;
    
    /**
     * 商品一覧取得API
     * @return List<TblGoods>
     */
    @GetMapping
    List<TblGoods> getGoodes(@RequestParam("sortField") String sortField
    		,@RequestParam("sortOrder") String sortOrder
    		,@RequestParam("conditionField") String conditionField
    		,@RequestParam("conditionValue") String conditionValue) {
        return goodsService.findAll(sortField, sortOrder, conditionField, conditionValue); 
    }
    
    /**
     * 商品取得API(キー：PK)
     * @param String
     * @return
     */
    @GetMapping(path="{id}")
    TblGoods getUser(@PathVariable String id) {
    	return goodsService.findByPk(id);
    }
    
    /**
     * 商品登録API
     * @param TblGoods
     * @return int
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    int postUser(@RequestBody TblGoods goods) {
    	return goodsService.create(goods);
    }
    
    /**
     * 商品削除API
     * @param String
     */
    @DeleteMapping(path = "{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteUser(@PathVariable String id) {
    	goodsService.deleteLogical(id);
    }
    
    /**
     * 商品更新API
     * @param String
     * @param TblGoods
     * @return int
     */
    @PutMapping(path = "{id}")
    int putUser(@PathVariable String id, @RequestBody TblGoods goods) {
    	goods.setGoodsId(id);
    	return goodsService.update(goods);
    }
    
    /**
     * GoogleDrive画像アップロードAPI
     * @param MultipartFile
     * @return String
     */
    @RequestMapping(value = "/upload" , method=RequestMethod.POST)
    String googleUpload(@RequestParam("file") MultipartFile uploadfile) {
    	return googleDriveApiCallService.uploadImg(uploadfile);
    }

}
