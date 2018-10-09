package com.boot.pojo;

import com.boot.utils.GsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package:com.boot.pojo
 * @ClassName:test
 * @Description:测试类
 * @Author Shuyu.Wang
 * @Date 2017-12-27 10:59
 **/

public class Test {

    public static void main(String[] args){
        List<Alarm> alarmList=new ArrayList<>();
        Alarm alarm=new Alarm();
        alarm.setId(1);
        alarm.setAlramName("人员报警");
        alarm.setUserName("陈实");
        alarm.setNation("回族");
        alarm.setIdNumber("65412120040813276X");
        alarm.setLon(87.48918750);
        alarm.setLat(43.83587893);
        alarm.setType("1");
        alarm.setAlramTime("2017-12-27 11:58:13");
        alarmList.add(alarm);

        Alarm alarm2=new Alarm();
        alarm2.setId(2);
        alarm2.setAlramName("车辆报警");
        alarm2.setUserName("海尤尔.于赛江");
        alarm2.setCarNumber("新A130J5");
        alarm2.setIdNumber("650102200908064035");
        alarm2.setLon(87.51071223);
        alarm2.setLat(43.90230827);
        alarm2.setType("2");
        alarm2.setAlramTime("2017-12-27 11:55:26");
        alarmList.add(alarm2);

        Alarm alarm3=new Alarm();
        alarm3.setId(3);
        alarm3.setAlramName("人员报警");
        alarm3.setUserName("石兰云");
        alarm3.setNation("汉族");
        alarm3.setIdNumber("622126195702021228");
        alarm3.setLon(87.40187560);
        alarm3.setLat(43.80223190);
        alarm3.setType("1");
        alarm3.setAlramTime("2017-12-27 11:53:13");
        alarmList.add(alarm3);

        Alarm alarm4=new Alarm();
        alarm4.setId(4);
        alarm4.setAlramName("车辆报警");
        alarm4.setUserName("郝红青");
        alarm4.setCarNumber("新A629KK");
        alarm4.setIdNumber("650104197105041639");
        alarm4.setLon(87.39741240);
        alarm4.setLat(43.82898700);
        alarm4.setType("2");
        alarm4.setAlramTime("2017-12-27 11:50:45");
        alarmList.add(alarm4);

        Alarm alarm5=new Alarm();
        alarm5.setId(5);
        alarm5.setAlramName("人员报警");
        alarm5.setUserName("何文芳");
        alarm5.setNation("汉族");
        alarm5.setIdNumber("510823198505092583");
        alarm5.setLon(87.39741240);
        alarm5.setLat(43.82898700);
        alarm5.setType("1");
        alarm5.setAlramTime("2017-12-27 11:19:13");
        alarmList.add(alarm5);

        Alarm alarm6=new Alarm();
        alarm6.setId(6);
        alarm6.setAlramName("车辆报警");
        alarm6.setUserName("薛东文");
        alarm6.setCarNumber("新AM6109");
        alarm6.setIdNumber("650102195504160019");
        alarm6.setLon(87.39741240);
        alarm6.setLat(43.82898700);
        alarm6.setType("2");
        alarm6.setAlramTime("2017-12-27 11:44:26");
        alarmList.add(alarm6);

        Alarm alarm7=new Alarm();
        alarm7.setId(7);
        alarm7.setAlramName("人员报警");
        alarm7.setUserName("史平");
        alarm7.setNation("汉族");
        alarm7.setIdNumber("652901197103174813");
        alarm7.setLon(87.39741240);
        alarm7.setLat(43.82898700);
        alarm7.setType("1");
        alarm7.setAlramTime("2017-12-27 11:36:56");
        alarmList.add(alarm7);

        Alarm alarm8=new Alarm();
        alarm8.setId(8);
        alarm8.setAlramName("车辆报警");
        alarm8.setUserName("王欢");
        alarm8.setCarNumber("新AE582T");
        alarm8.setIdNumber("650106198206263043");
        alarm8.setLon(87.41732510);
        alarm8.setLat(43.81784050);
        alarm8.setType("2");
        alarm8.setAlramTime("2017-12-27 11:30:26");
        alarmList.add(alarm8);

        Alarm alarm9=new Alarm();
        alarm9.setId(9);
        alarm9.setAlramName("人员报警");
        alarm9.setUserName("黄晓钰");
        alarm9.setNation("汉族");
        alarm9.setIdNumber("65010120060228002x");
        alarm9.setLon(87.39741240);
        alarm9.setLat(85.05112000);
        alarm9.setType("1");
        alarm9.setAlramTime("2017-12-27 11:28:35");
        alarmList.add(alarm9);

        Alarm alarm10=new Alarm();
        alarm10.setId(10);
        alarm10.setAlramName("车辆报警");
        alarm10.setUserName("高秋生");
        alarm10.setCarNumber("新A567E3");
        alarm10.setIdNumber("650106195806151332");
        alarm10.setLon(87.35312380);
        alarm10.setLat(43.82750090);
        alarm10.setType("2");
        alarm10.setAlramTime("2017-12-27 11:22:26");
        alarmList.add(alarm10);

        GsonUtil.GsonString(alarmList);

        System.out.println(GsonUtil.GsonString(alarmList));


        List<Rute> ruteList=new ArrayList<>();
        Rute rute=new Rute();
        rute.setId(1);
        rute.setName("贾锦");
        rute.setIdNumber("510725199410257711");
        rute.setAddress("一品九点阳光4号楼201");
        rute.setPic("/pic/1.pgn");
        rute.setStartTime("2017-12-27 11:00:18");
        rute.setType("1");
        ruteList.add(rute);

        Rute rute1=new Rute();
        rute1.setId(2);
        rute1.setName("新A601AX");
        rute1.setIdNumber("周景国");
        rute1.setAddress("652401194106211412");
        rute1.setPic("/pic/2.pgn");
        rute1.setStartTime("2017-12-27 11:01:12");
        rute1.setType("2");
        ruteList.add(rute1);

        Rute rute2=new Rute();
        rute2.setId(3);
        rute2.setName("朱藴虎");
        rute2.setIdNumber("650104197303144217");
        rute2.setAddress("坤怡园小区7号楼601");
        rute2.setPic("/pic/3.pgn");
        rute2.setStartTime("2017-12-27 11:06:15");
        rute2.setType("1");
        ruteList.add(rute2);

        Rute rute3=new Rute();
        rute3.setId(4);
        rute3.setName("新A6012F");
        rute3.setIdNumber("王文霞");
        rute3.setAddress("650300195103123848");
        rute3.setPic("/pic/4.pgn");
        rute3.setStartTime("2017-12-27 11:11:12");
        rute3.setType("2");
        ruteList.add(rute3);

        Rute rute4=new Rute();
        rute4.setId(5);
        rute4.setName("张生魁");
        rute4.setIdNumber("650121195508061316");
        rute4.setAddress("科技园路建科小区（安置小区）9号楼602");
        rute4.setPic("/pic/5.pgn");
        rute4.setStartTime("2017-12-27 11:13:52");
        rute4.setType("1");
        ruteList.add(rute4);

        Rute rute5=new Rute();
        rute5.setId(6);
        rute5.setName("新A7X647");
        rute5.setIdNumber("高怀山");
        rute5.setAddress("650300193801071214");
        rute5.setPic("/pic/6.pgn");
        rute5.setStartTime("2017-12-27 11:16:17");
        rute5.setType("2");
        ruteList.add(rute5);

        Rute rute6=new Rute();
        rute6.setId(7);
        rute6.setName("马宇飞");
        rute6.setIdNumber("650106199001310816");
        rute6.setAddress("万达华府5号楼1004");
        rute6.setPic("/pic/1.pgn");
        rute6.setStartTime("2017-12-27 11:19:19");
        rute6.setType("1");
        ruteList.add(rute6);

        Rute rute7=new Rute();
        rute7.setId(8);
        rute7.setName("新B50040");
        rute7.setIdNumber("史起良");
        rute7.setAddress("65012119521125132X");
        rute7.setPic("/pic/8.pgn");
        rute7.setStartTime("2017-12-27 11:23:14");
        rute7.setType("2");
        ruteList.add(rute7);

        Rute rute8=new Rute();
        rute8.setId(9);
        rute8.setName("周德育");
        rute8.setIdNumber("650104197406020735");
        rute8.setAddress("兰亭仙湾里2号楼1501");
        rute8.setPic("/pic/9.pgn");
        rute8.setStartTime("2017-12-27 11:25:15");
        rute8.setType("1");
        ruteList.add(rute8);

        Rute rute9=new Rute();
        rute9.setId(10);
        rute9.setName("新A63A66");
        rute9.setIdNumber("师玉运");
        rute9.setAddress("412726196902227915");
        rute9.setPic("/pic/10.pgn");
        rute9.setStartTime("2017-12-27 11:36:12");
        rute9.setType("2");
        ruteList.add(rute9);



        System.out.println(GsonUtil.GsonString(ruteList));


        List<Che> cheList=new ArrayList<>();

       Che che1=new Che(87.4932049787249,43.8410658590512,"7","坤怡园");
       cheList.add(che1);
        Che che2=new Che(87.4934606182676,43.8405581716724,"0",null);
        cheList.add(che2);
        Che che3=new Che(87.4926432144979,43.8405446997464,"0",null);
        cheList.add(che3);
        Che che4=new Che(87.4920783240172,43.8405190229063,"0",null);
        cheList.add(che4);
        Che che5=new Che(87.4932787162887,43.8387729977842,"0",null);
        cheList.add(che5);
        Che che6=new Che(87.4961095879022,43.8388243514642,"0",null);
        cheList.add(che6);
        Che che7=new Che(87.501559497199,43.8387665785742,"3","小绿谷");
        cheList.add(che7);
        Che che8=new Che(87.503635239428,43.8388488361074,"0",null);
        cheList.add(che8);
        Che che9=new Che(87.5093868265201,43.8388331642079,"0",null);
        cheList.add(che9);
        Che che10=new Che(87.5104525156816,43.8466534420253,"0",null);
        cheList.add(che10);
        Che che11=new Che(87.5110512312147,43.8525690073355,"4","华山街加油加气站");
        cheList.add(che11);
        Che che12=new Che(87.511445260379,43.8587540478222,"5","泰山街加气站");
        cheList.add(che12);
        Che che13=new Che(87.5183213062555,43.8584993794564,"0",null);
        cheList.add(che13);
        Che che14=new Che(87.5196437188828,43.858323893701,"1","一品九点阳光");
        cheList.add(che14);

        System.out.println(GsonUtil.GsonString(cheList));







    }
}
