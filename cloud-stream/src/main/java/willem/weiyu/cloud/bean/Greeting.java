package willem.weiyu.cloud.bean;

import lombok.Builder;
import lombok.Data;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/17 12:28
 */
@Data
@Builder
public class Greeting {
    private String message;
    private long timestamp;
}
