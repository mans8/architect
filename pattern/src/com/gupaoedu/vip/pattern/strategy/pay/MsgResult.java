package com.gupaoedu.vip.pattern.strategy.pay;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 * 支付完成以后的状态
 **/
public class MsgResult {

    private int code;
    private String msg;
    private Object data;

    public MsgResult(int code,String msg,Object data){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public String toString(){
        return ("支付状态：[" + "]，" + "，交易详情：" + data);
    }


}
