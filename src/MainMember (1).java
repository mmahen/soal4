import java.util.ArrayList;

public class MainMember {
    
     static ArrayList<Memberidol> member = new ArrayList<>();
    
    public static void main(String[] args) {
        Memberidol x1 = new Memberidol();
        Memberidol x2 = new Memberidol();
        Memberidol x3 = new Memberidol();
        x1.setnama("Isatis");
        x1.setteam("La Junta");
        x1.setumur(17);
        x1.setnilaiPenampilan(95);
        x1.setnilaiSuara(70);
        x1.setnilaiAttitude(60);
        x1.nilai();
        member.add(x1); 
        member.get(0);
        x2.setnama("Sukareto");
        x2.setteam("Nightmare");
        x2.setumur(38);
        x2.setnilaiPenampilan(60);
        x2.setnilaiSuara(40);
        x2.setnilaiAttitude(100);
        x2.nilai();
        member.add(x2); 
        member.get(1);
        x3.setnama("Sabrina");
        x3.setteam("Uppers");
        x3.setumur(21);
        x3.setnilaiPenampilan(100);
        x3.setnilaiSuara(80);
        x3.setnilaiAttitude(50);
        x3.nilai();
        member.add(x3);
        member.get(2);
        DisplayMessage();        
    }
        public static void DisplayMessage(){
            for (int i = 0 ; i < member.size(); i++){
                System.out.println("Nama Member : " + member.get(i).getnama());
                System.out.println("Team Member : " +member.get(i).getteam());
                System.out.println("Umur Member : " +member.get(i).getumur());
                System.out.println("Rata - rata nilai : " +member.get(i).getnilai());
                System.out.println("");
        }
        
        
   
        
}
    
}
