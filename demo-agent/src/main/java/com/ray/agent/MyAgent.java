package com.ray.agent;

import java.lang.instrument.Instrumentation;

/**
 * 自定义代理类
 * @author Ray
 * @createTime 2018-03-19 14:07
 */
public class MyAgent {
    public static void  premain(String agentOps, Instrumentation inst){
        System.out.println("=========premain方法执行========");
        System.out.println(agentOps);
        inst.addTransformer(new PerfMonXformer());
    }

    public static void premain(String agentOps) {
        System.out.println("=========premain方法执行2========");
        System.out.println(agentOps);
    }
}
