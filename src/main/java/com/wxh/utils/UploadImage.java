package com.wxh.utils;

import com.wxh.Exception.CustomException;
import com.wxh.Exception.CustomExceptionType;
import org.apache.tomcat.util.codec.binary.Base64;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: AwesomeHu
 * @Date: 2020/1/10 21:21
 * @Description:
 */
public class UploadImage {
    public static List convertStringtoImage(String encodedImageStr, String fileName) throws CustomException {
        System.out.println("filename:【 "+ fileName+"】");
        if (encodedImageStr.equals("")||fileName.equals("")){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "请上传文件或者输入正确的文件名");
        }else {
            // Base64
            byte[] imageByteArray = Base64.decodeBase64(encodedImageStr);
            FileOutputStream imageOutFile;
            try {
                imageOutFile = new FileOutputStream("c:/uploadImage/" + fileName+".jpg");
                imageOutFile.write(imageByteArray);
                imageOutFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("图片存放成功！");
            return new ArrayList();
        }
    }
}
