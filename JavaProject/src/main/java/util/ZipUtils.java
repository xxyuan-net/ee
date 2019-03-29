package util;




import org.apache.commons.codec.binary.Base64;

import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 * Created by Administrator on 2018/02/22.
 */

public class ZipUtils {

    /**
     * Gzip 压缩数据
     *
     * @param unGzipStr
     * @return
     */
    public static String  compressForGzip(String unGzipStr) {

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            GZIPOutputStream gzip = new GZIPOutputStream(baos);
            gzip.write(unGzipStr.getBytes());
            gzip.close();
            byte[] encode = baos.toByteArray();
            baos.flush();
            baos.close();
            Base64 base64 = new Base64();
            return  base64.encodeToString(encode);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
