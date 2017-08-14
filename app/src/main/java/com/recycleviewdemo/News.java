package com.recycleviewdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述：
 * 创建人：xuyaxi
 * 创建时间：2017/8/14 14:18
 */
public class News {
    private String name;
    private String path;

    public News(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public News() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static List<News> initData() {
        List<News> news = new ArrayList<>();
        news.add(new News("http://dingyue.nosdn.127.net/EoBst1ueQyqswwPtRpvjrIRgKiY6Uwaot=zohOEN3EpiM1502527685775compressflag.jpg", "第一条数据"));
        news.add(new News("http://dingyue.nosdn.127.net/CzKaH8yr=8g2i4xkXu6s7zwcyuHiFSJq0ccvxJ3a4BqUv1501572093185compressflag.jpg", "第二条数据"));
        news.add(new News("http://dmr.nosdn.127.net/XujxGrbiLuRbRlpEqGIwBw==/6896093023005502504.jpg", "第三条数据"));
        news.add(new News("http://dmr.nosdn.127.net/ZSRfU70BSkT_3iWMPqXfyg==/6896093023000007671.jpg", "第四条数据"));
        news.add(new News("http://dingyue.nosdn.127.net/BaYEuu2pZgNXHprWS2ndoF0=8D0r31QM9S2HTF69WL8391497331164173compressflag.jpg", "第五条数据"));
        news.add(new News("http://dmr.nosdn.127.net/_jKzMmz6LBJLZn-e9MqOJw==/6896093023032499904.jpg", "第六条数据"));
        news.add(new News("http://dmr.nosdn.127.net/9NVpXSxKiiLtRL6ZZapruQ==/6896093023054230512.jpg", "第七条数据"));
        news.add(new News("http://dingyue.nosdn.127.net/xjpYJBaWoWV70ShRcggcBdGk6S6CnDvIlifUHlxcRSNkf1496652534056compressflag.jpg", "第八条数据"));
        news.add(new News("http://dmr.nosdn.127.net/SQfiZIBF7o0_MH67GqqfzA==/6896093023045563364.jpg", "第九条数据"));
        news.add(new News("http://dingyue.nosdn.127.net/jiWRg=Q566BwmabQX7cWDOOL5t5XMUCe6U=B8ylPeaHKa1498224709078compressflag.jpg", "第十条数据"));
        news.add(new News("http://dmr.nosdn.127.net/phFKtWs6ZNEndSw7YaabQg==/6896093023034457966.jpg", "第十一条数据"));
        news.add(new News("http://dmr.nosdn.127.net/DVJoqXyuemfqGiy_mhNUSA==/6896093023030467952.jpg", "第十二条数据"));
        news.add(new News("http://dingyue.nosdn.127.net/=f4JMO0EzO56kq4PeWMdRki9ZVGrr3zzXyTZg6xF5afQ31501135364985compressflag.jpg", "第十三条数据"));
        news.add(new News("http://dingyue.nosdn.127.net/kcMXUUpM8NerGpHSwNLoUr9iWSFw5jISA3rD=zFsrT41e1501993205046compressflag.jpg", "第十四条数据"));
        news.add(new News("http://dmr.nosdn.127.net/KdLHGC89nRvOrrQao_bV_Q==/6896093022993297436.jpg", "第十五条数据"));
        news.add(new News("http://dmr.nosdn.127.net/qExMlnFdwmgS_zGYPUK7VQ==/6896093023045547705.jpg", "第十六条数据"));
        news.add(new News("http://dingyue.nosdn.127.net/YvCJzWBvC97LlQDa6IZKdiIIpGmK7BcjDj3QUsNPGbHJ81501732127605compressflag.jpg", "第十七条数据"));
        news.add(new News("http://dmr.nosdn.127.net/mPC9ZLs7lSpYNrkamUnQ5g==/6896093023006291498.jpg", "第十八条数据"));
        news.add(new News("http://dmr.nosdn.127.net/pykj_3Mex9yrmBQ2yx4Qdw==/6896093023035755014.jpg", "第十九条数据"));
        news.add(new News("http://dmr.nosdn.127.net/gpFmGBsN3K1m8lVLpG1uZg==/6896093023047740237.jpg", "第二十条数据"));
        return news;
    }

}
