package com.design.mediator;

public class Champions extends WulinAlliance {
    private Wudang wudang;
    private Shaolin shaolin;
    private Eme emei;
    public void setWudang(Wudang wudang) {
        this.wudang = wudang;
    }
    public void setEmei(Eme emei) {
        this.emei = emei;
    }
    public void setShaolin(Shaolin shaolin) {
        this.shaolin = shaolin;
    }
    @Override
    public void notice(String message, United united) {
        if (united == wudang) {
            shaolin.getNotice(message);
        } else if (united == emei) {
            shaolin.getNotice(message);
        } else if (united == shaolin) {
            wudang.getNotice(message);
            emei.getNotice(message);
        }
    }
}
