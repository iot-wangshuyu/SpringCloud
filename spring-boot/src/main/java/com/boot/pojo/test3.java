package com.boot.pojo;

import com.boot.utils.GsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package:com.boot.pojo
 * @ClassName:3
 * @Description:3
 * @Author Shuyu.Wang
 * @Date 2017-12-27 14:30
 **/

public class test3 {

    public static void main(String[] args){
        List<Che> cheList=new ArrayList<>();

        Che che1=new Che(87.5192474782999,43.8566466077179,"1","一品九点阳光");
        cheList.add(che1);
        Che che2=new Che(87.5198031296169,43.8564608178912,"0",null);
        cheList.add(che2);
        Che che3=new Che(87.5200598980172,43.8561719534408,"0",null);
        cheList.add(che3);
        Che che4=new Che(87.5205541771878,43.8556840934802,"0",null);
        cheList.add(che4);
        Che che5=new Che(87.5209650066283,43.8554594211299,"0",null);
        cheList.add(che5);
        Che che6=new Che(87.5212217750286,43.8550742685295,"0",null);
        cheList.add(che6);
        Che che7=new Che(87.521523477899,43.8550614301094,"0",null);
        cheList.add(che7);
        Che che8=new Che(87.5217802462993,43.8552219103596,"1","秦郡二期");
        cheList.add(che8);
        Che che9=new Che(87.5219599841796,43.8558702505704,"0",null);
        cheList.add(che9);
        Che che10=new Che(87.5220883683797,43.856293918431,"0",null);
        cheList.add(che10);
        Che che11=new Che(87.5238664895519,43.8560371500307,"0",null);
        cheList.add(che11);
        Che che12=new Che(87.5242452229424,43.8571990270421,"2","秦基大厦");
        cheList.add(che12);
        Che che13=new Che(87.5242002884723,43.8579885898731,"2","新疆大厦");
        cheList.add(che13);
        Che che14=new Che(87.5246432139629,43.8594650081749,"1","泰山街社区");
        cheList.add(che14);

        Che che15=new Che(87.5248422094731,43.8602481517959,"2","卫星大厦");
        cheList.add(che15);
        Che che16=new Che(87.525019604194824,43.861098329078359,"2","石油新村派出所");
        cheList.add(che16);

        System.out.println(GsonUtil.GsonString(cheList));
    }
}
