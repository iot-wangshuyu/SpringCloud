package com.boot.pojo;

import com.boot.utils.GsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package:com.boot.pojo
 * @ClassName:4
 * @Description:4
 * @Author Shuyu.Wang
 * @Date 2017-12-27 15:18
 **/

public class Terst4 {

    public static void main(String[] args){
        List<Che> cheList=new ArrayList<>();

        Che che1=new Che(87.4934373321215,43.8397368633118,"1","坤泰园");
        cheList.add(che1);
        Che che2=new Che(87.4931765517149,43.8399174035933,"0",null);
        cheList.add(che2);
        Che che3=new Che(87.4927954111207,43.8405192045316,"0",null);
        cheList.add(che3);
        Che che4=new Che(87.4934674221684,43.8405994446567,"0",null);
        cheList.add(che4);
        Che che5=new Che(87.4932049787249,43.8410658590512,"1","坤怡园");
        cheList.add(che5);
        Che che6=new Che(87.4929358313396,43.841612476236,"2","艾丝发艺");
        cheList.add(che6);
        Che che7=new Che(87.4928054411363,43.8422443672212,"2","妇联幼儿园第一分园");
        cheList.add(che7);
        Che che8=new Che(87.4922537902763,43.8435582992697,"2","乌鲁木齐市第126中学");
        cheList.add(che8);
        Che che9=new Che(87.4915723510139,43.8451537537971,"0",null);
        cheList.add(che9);
        Che che10=new Che(87.4942898834507,43.8451937534995,"0",null);
        cheList.add(che10);
        Che che11=new Che(87.4960952862654,43.8452232818655,"0",null);
        cheList.add(che11);
        Che che12=new Che(87.4962357064844,43.844852171287,"2","蓝天打字复印照相");
        cheList.add(che12);
        Che che13=new Che(87.4944002136227,43.8447719311619,"0",null);
        cheList.add(che13);
        Che che14=new Che(87.4952627949675,43.8420237068772,"2","和兴融创大厦");
        cheList.add(che14);


        System.out.println(GsonUtil.GsonString(cheList));
    }
}
