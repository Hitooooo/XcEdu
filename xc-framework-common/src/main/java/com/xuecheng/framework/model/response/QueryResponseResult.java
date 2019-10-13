package com.xuecheng.framework.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 扩展了ResponseResult，增加返回的额外数据，不仅仅是操作成功与否的结果返回
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
public class QueryResponseResult extends ResponseResult {

    QueryResult queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult){
        super(resultCode);
       this.queryResult = queryResult;
    }

}
