package com.winwin.picreport.Futils;

public class Msg {
    private String Msg="";
    private String notExsitThisPrdtNoInPrdtTab="";
    private String weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao="";

    public String getWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao() {
        return weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao;
    }

    public void setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(String weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao) {
        this.weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao = weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao;
    }

    public String getNotExsitThisPrdtNoInPrdtTab() {
        return notExsitThisPrdtNoInPrdtTab;
    }

    public void setNotExsitThisPrdtNoInPrdtTab(String notExsitThisPrdtNoInPrdtTab) {
        this.notExsitThisPrdtNoInPrdtTab = notExsitThisPrdtNoInPrdtTab;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getMsg() {
        return Msg;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Futils.Msg{");
        sb.append("Msg='").append(Msg).append('\'');
        sb.append(", notExsitThisPrdtNoInPrdtTab='").append(notExsitThisPrdtNoInPrdtTab).append('\'');
        sb.append(", weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao='").append(weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
