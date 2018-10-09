package com.boot.pojo;

import com.boot.utils.GsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package:com.boot.pojo
 * @ClassName:test2
 * @Description:2
 * @Author Shuyu.Wang
 * @Date 2017-12-27 13:43
 **/

public class Test2 {

    public static void main(String[] args){
        List<Che> cheList=new ArrayList<>();

        Che che1=new Che(87.5192474782999,43.8566466077179,"1","坤泰园");
        cheList.add(che1);
        Che che2=new Che(87.5231444535676,43.8561381847487,"8","红蜻蜓秦郡幼儿园");
        cheList.add(che2);
        Che che3=new Che(87.5240678418822,43.8559951316506,"0",null);
        cheList.add(che3);
        Che che4=new Che(87.5217709291215,43.8469103274477,"0",null);
        cheList.add(che4);
        Che che5=new Che(87.5215260556928,43.8338340863578,"0",null);
        cheList.add(che5);
        Che che6=new Che(87.5180978276918,43.8337606243293,"0",null);
        cheList.add(che6);
        Che che7=new Che(87.5178955844314,43.831203124918,"8","博香苑幼儿园");
        cheList.add(che7);
        Che che8=new Che(87.5178203593141,43.830789386773,"8","妇联幼儿园");
        cheList.add(che8);
        Che che9=new Che(87.5091508604462,43.8307936965453,"0",null);
        cheList.add(che9);
        Che che10=new Che(87.5079754679887,43.8300590762594,"0",null);
        cheList.add(che10);
        Che che11=new Che(87.5071673856741,87.5071673856741,"0",null);
        cheList.add(che11);
        Che che12=new Che(87.5050369868449,43.8307936965453,"0",null);
        cheList.add(che12);
        Che che13=new Che(87.5062264040311,43.8308238009883,"6","乌市智能交通指挥中心");
        cheList.add(che13);
        Che che14=new Che(87.5037146703302,43.8388010576622,"0",null);
        cheList.add(che14);

        Che che15=new Che(87.4955259685141,43.8388178774793,"0",null);
        cheList.add(che15);
        Che che16=new Che(87.4932471489613,43.8387665237992,"0",null);
        cheList.add(che16);
        Che che17=new Che(87.4921623024699,43.8404932912914,"0",null);
        cheList.add(che17);
        Che che18=new Che(87.4927464505806,43.8405318065514,"0",null);
        cheList.add(che18);

        Che che19=new Che(87.4931957952812,43.8398770471306,"0",null);
        cheList.add(che19);
        Che che20=new Che(87.4934461444715,43.8398834663406,"0",null);
        cheList.add(che20);
        Che che21=new Che(87.4940762829465,43.8402033877941,"9","坤怡园小区");
        cheList.add(che21);
        System.out.println(GsonUtil.GsonString(cheList));
    }
}
