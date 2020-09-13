package Bai1;

public abstract class Hinh {
    protected float cDai, cRong;

    public Hinh(float cDai, float cRong) {
        this.cDai = cDai;
        this.cRong = cRong;
    }

    public Hinh() {
    }

    public float getcDai() {
        return cDai;
    }

    public float getcRong() {
        return cRong;
    }

    public abstract void Nhap();
    public abstract void Out();
}
