public class Memberidol {
    
    private String nama,team;
    private double penampilan,suara,attitude, nilai;
    private int umur;
    
    public void setnama(String x){
        this.nama = x;
    }
    public void setteam(String x){
        this.team = x;
    }
    public void setumur(int y){
        this.umur = y;
    }
    public void setnilaiPenampilan(double y){
        this.penampilan = y;
    }
    public void setnilaiSuara(double y){
        this.suara = y;
    }
    public void setnilaiAttitude(double y){
        this.attitude = y;
    }
    public String getnama(){
        return nama;
    }
    public String getteam(){
        return team;
    }
    public int getumur(){
        return umur;
    }
    public double getnilai(){
        return nilai;
    }
    public void nilai(){
        nilai = ((penampilan + suara + attitude)/3);
    }
    
    
}
