package site.dunhanson.aliyun.tablestore.entity.bidi;
import lombok.Data;

/**
 * document_extract 表的实体
 */
@Data
public class DocumentExtract {

    // 2+5
    /**
     * 页面时间
     */
    private String pageTime;

    /**
     * docid
     */
    private Long docid;

    /**
     * 状态
     */
    private Long status;

    /**
     * 要素提取返回的json字符串
     */
    private String extractJson;

    /**
     * 行业分类返回的json字符串
     */
    private String industryJson;

    /**
     * 其他要素提取返回的json字符串（公告内容样式清理、关键字、资质、地区信息）
     */
    private String otherJson;

    /**
     * 文档html内容
     */
    private String dochtmlcon;

}
