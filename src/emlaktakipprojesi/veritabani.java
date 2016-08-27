package dugunsalonu1;

import static dugunsalonu1.PersonelListesi.d;
import static dugunsalonu1.PersonelListesi.index;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class veritabani {

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    static int count = 0;
    int ad=0,sifre=0;
 public static String butonClick=null;

    public veritabani() 
    {
        if (baglantıKur()) 
        {
            System.out.println("Veritabanina Baglandi");
            perTable();
            musTable();
            urunTable();
            kiraTable();
            kasaTable();
            muzisyenTable();
            fotografciTable();
            kullaniciTable();
             
        } 
        else
        {
            System.out.println("Bağlanti Hatasi!!");
        }
    }
    

    public boolean baglantıKur() {
        boolean sonuc = false;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dugunler", "postgres", "12345");
            st = (Statement) con.createStatement();
            sonuc = true;
        } catch (SQLException ex) {

        } catch (ClassNotFoundException ex) {
        }

        return sonuc;
    }
    

    public void perTable() {

        try {
            st = con.createStatement();
            String sqlP = "CREATE TABLE PerTablo("
                    + "   p_ID SERIAL PRIMARY KEY  ,"
                    + "   ad           TEXT    NOT NULL,"
                    + "   soyad        TEXT     NOT NULL,"
                    + "   telno       TEXT     NOT NULL,"
                    + "   adres       TEXT     NOT NULL,"
                    + "   mevki       TEXT     NOT NULL"
                    + ");";
            st.executeUpdate(sqlP);

        } catch (SQLException ex) {
            System.out.println("Tablo Var..");
        }

    }

    public void musTable() {
        try {
            st = con.createStatement();
            String sqlm = "CREATE TABLE musTablo("
                    + "   m_ID SERIAL PRIMARY KEY ,"
                    + "   ad           TEXT    NOT NULL,"
                    + "   soyad        TEXT     NOT NULL,"
                    + "   telno       TEXT     NOT NULL,"
                    + "   adres       TEXT     NOT NULL,"
                    + "   salonturu       TEXT     NOT NULL,"
                    + "   nitelik      TEXT     NOT NULL,"
                    + "   tarih      TEXT     NOT NULL"
                    + ");";
            st.executeUpdate(sqlm);
        } catch (SQLException ex) {

        }

    }

    public void urunTable() {
        try {
            st = con.createStatement();
            String sqlur = "CREATE TABLE urunTablo("
                    + "   ur_ID SERIAL PRIMARY KEY ,"
                    + "   ad          TEXT    NOT NULL,"
                    + "   turu     TEXT     NOT NULL"
                    + ");";
            st.executeUpdate(sqlur);
        } catch (SQLException ex) {

        }

    }

    public void kiraTable() {
        try {
            st = con.createStatement();
            String sqlkira = "CREATE TABLE kiraTablo("
                    + "   ki_ID SERIAL PRIMARY KEY ,"
                    + "   musBilgiler          TEXT    NOT NULL,"
                    + "   fotografci       TEXT     NOT NULL,"
                    + "   muzisyen      TEXT     NOT NULL,"
                    + "   nitelik     TEXT     NOT NULL,"
                    + "   tarih     TEXT     NOT NULL,"
                    + "   salonTuru      TEXT     NOT NULL"
                    + ");";
            st.executeUpdate(sqlkira);
        } catch (SQLException ex) {

        }

    }

    public void kasaTable() {
        try {
            st = con.createStatement();
            String sqlka = "CREATE TABLE kasaTablo("
                    + "   ka_ID SERIAL PRIMARY KEY ,"
                    + "   musteri           TEXT    NOT NULL,"
                    + "   odeme        TEXT     NOT NULL,"
                    + "   odebilgi       TEXT     NOT NULL,"
                    + "   aciklama      TEXT     NOT NULL"
                    + ");";
            st.executeUpdate(sqlka);
        } catch (SQLException ex) {

        }

    }

    public void muzisyenTable() {
        try {
            st = con.createStatement();
            String sqlmuz = "CREATE TABLE muzisyenTablo("
                    + "   muz_ID SERIAL PRIMARY KEY  ,"
                    + "   muzad       TEXT     NOT NULL,"
                    + "   muzsoyad       TEXT     NOT NULL,"
                    + "  muztelno      TEXT     NOT NULL"
                    + ");";
            st.executeUpdate(sqlmuz);
        } catch (SQLException ex) {
            System.out.println("Tablo var..");
        }

    }

    public void fotografciTable() {
        try {
            st = con.createStatement();
            String sqlf = "CREATE TABLE fotografciTablo("
                    + "   f_ID SERIAL PRIMARY KEY ,"
                    + "   fotoad       TEXT     NOT NULL,"
                    + "   fotosoyad       TEXT     NOT NULL,"
                    + "   fototelno      TEXT     NOT NULL"
                    + ");";
            st.executeUpdate(sqlf);
        } catch (SQLException ex) {
            System.out.println("Tablo var");

        }

    }
    public void kullaniciTable() {

        try {
            String sqlkul = "CREATE TABLE  kullanici ("
                    + "   ku_ID SERIAL PRIMARY KEY ,"
                    + "   ad           TEXT    NOT NULL,"
                    + "   sifre        TEXT     NOT NULL,"
                    + "   yetki        TEXT     NOT NULL"
                    + ");";
            st.execute(sqlkul);
        } catch (SQLException ex) {
            System.out.println("Tablo Var..");
        }

    }

    public void perEkle(String TabloAdi, String[] values) {

        try {
            String sqlP = "INSERT INTO " + TabloAdi + "(ad,soyad,telno,adres,mevki) VALUES('"
                    + values[0] + "','"
                    + values[1] + "','"
                    + values[2] + "','"
                    + values[3] + "','"
                    + values[4] + "');";
            st.executeUpdate(sqlP);
        } catch (SQLException ex) {

        }

    }

    public void UrunEkleme(String TabloAdi, String[] values) {

        try {
            String sqlur = "INSERT INTO " + TabloAdi + "(ad,turu) VALUES('"
                    + values[0] + "','"
                    + values[1] + "');";
            st.executeUpdate(sqlur);
        } catch (SQLException ex) {
            System.out.println("Tablo var");

        }

    }

    public void MusEkleme(String TabloAdi, String[] values) {

        try {
            String sqlm = "INSERT INTO " + TabloAdi + "(ad,soyad,telno,adres,salonturu,nitelik,tarih) VALUES('"
                    + values[0] + "','"
                    + values[1] + "','"
                    + values[2] + "','"
                    + values[3] + "','"
                    + values[4] + "','"
                    + values[5] + "','"
                    + values[6] + "');";

            st.executeUpdate(sqlm);
        } catch (SQLException ex) {
            System.out.println("Tablo var");
        }

    }

    public void kiraEkleme(String TabloAdi, String[] values) {

        try {
            String sqlkira = "INSERT INTO " + TabloAdi + "(musBilgiler,fotografci,muzisyen,nitelik,tarih,salonTuru) VALUES('"
                    + values[0] + "','"
                    + values[1] + "','"
                    + values[2] + "','"
                    + values[3] + "','"
                    + values[4] + "','"
                    + values[5] + "');";

            st.executeUpdate(sqlkira);
        } catch (SQLException ex) {
            System.out.println("Tablo var");
        }

    }

    public void kasaEkleme(String TabloAdi, String[] values) {

        try {
            String sqlka = "INSERT INTO " + TabloAdi + "(musteri,odeme,odebilgi,aciklama) VALUES('"
                    + values[0] + "','"
                    + values[1] + "','"
                    + values[2] + "','"
                    + values[3] + "');";

            st.executeUpdate(sqlka);
        } catch (SQLException ex) {
            System.out.println("Tablo var");
        }

    }

    public void muzisyenEkleme(String TabloAdi, String[] values) {

        try {
            String sqlmuz = "INSERT INTO " + TabloAdi + "(muzad,muzsoyad,muztelno) VALUES('"
                    + values[0] + "','"
                    + values[1] + "','"
                    + values[2] + "');";

            st.executeUpdate(sqlmuz);
        } catch (SQLException ex) {
        }

    }

    public void fotografciEkleme(String TabloAdi, String[] values) {

        try {
            String sqlf = "INSERT INTO " + TabloAdi + "(fotoad,fotosoyad,fototelno) VALUES('"
                    + values[0] + "','"
                    + values[1] + "','"
                    + values[2] + "');";

            st.executeUpdate(sqlf);
        } catch (SQLException ex) {
        }

    }
    public void kullaniciEkleme(String TabloAdi, String[] values) {

       
            
        try {
            rs = st.executeQuery("select * from kullanici where ad='" + values[0] + "';");
            while (rs.next()) {
                ad = 1;
            }
            
            if(ad==0)
            {
                String sqlkul = "INSERT INTO " + TabloAdi + "(ad,sifre,yetki) VALUES('"
                        + values[0] + "','"
                        + values[1] + "','"
                        + values[2] + "');";
                st.execute(sqlkul);
                JOptionPane.showMessageDialog(null, "Başarıyla Eklendi.");
            }
            else
            {
                if (ad == 1) {
                    JOptionPane.showMessageDialog(null, "Ad Uygun Değil!!");
                    ad = 0;
                }
         
            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

                     }

                
    
    public void kasaSilme(String TabloAdi, String no) {
        try {
            st = con.createStatement();
            String sqlka = "DELETE FROM  "
                    + TabloAdi
                    + " WHERE ka_id='"
                    + no
                    + "';";
            st.executeQuery(sqlka);
        } catch (SQLException ex) {

        }
    }

    public void musSilme(String TabloAdi, String no) {
        try {
            st = con.createStatement();
            String sqlm = "DELETE FROM  "
                    + TabloAdi
                    + " WHERE m_id='"
                    + no
                    + "';";
            st.executeQuery(sqlm);
        } catch (SQLException ex) {

        }

    }

    public void perSilme(String TabloAdi, String no) {
        try {
            st = con.createStatement();
            String sqlP = "DELETE FROM  "
                    + TabloAdi
                    + " WHERE P_id='"
                    + no
                    + "';";
            st.executeQuery(sqlP);
        } catch (SQLException ex) {

        }

    }

    public void urunSilme(String TabloAdi, String no) {
        try {
            st = con.createStatement();
            String sqlur = "DELETE FROM  "
                    + TabloAdi
                    + " WHERE ur_id='"
                    + no
                    + "';";
            st.executeQuery(sqlur);
        } catch (SQLException ex) {

        }
    }

    public void muzisyenSilme(String TabloAdi, String no) {
        try {
            st = con.createStatement();
            String sqlmuz = "DELETE FROM  "
                    + TabloAdi
                    + " WHERE muz_id='"
                    + no
                    + "';";
            st.executeQuery(sqlmuz);
        } catch (SQLException ex) {

        }
    }

    public void kiralamaSilme(String TabloAdi, String no) {
        try {
            st = con.createStatement();
            String sqlkira = "DELETE FROM  "
                    + TabloAdi
                    + " WHERE ki_id='"
                    + no
                    + "';";
            st.executeQuery(sqlkira);
        } catch (SQLException ex) {

        }
    }

    public void fotografciSilme(String TabloAdi, String no) {
        try {
            st = con.createStatement();
            String sqlf = "DELETE FROM  "
                    + TabloAdi
                    + " WHERE  f_id='"
                    + no
                    + "';";
            st.executeQuery(sqlf);
        } catch (SQLException ex) {

        }
    }
    public void kullaniciSilme(String TabloAdi, String no) {
        try {
            st = con.createStatement();
            String sqlkul = "DELETE FROM  "
                    + TabloAdi
                    + " WHERE  ku_id='"
                    + no
                    + "';";
            st.executeQuery(sqlkul);
        } catch (SQLException ex) {

        }
    }

    
    
    public String[][] PersonelKayitListele() {
      
                count = SatirSayisi("pertablo");
                String[][] dizi = new String[count][7];
               if(count==0)
               { 
                     
                   if(butonClick.equals("perLis"))
                   {
                       butonClick=null;
                       JOptionPane.showMessageDialog(null, "Listelenecek  Veri Bulunamadı!!!.");
                   }
               }
             
                    try {
                        int i = 0;
                        st = con.createStatement();
                        String sqlp = "SELECT * FROM PERTABLO order by p_id;";
                        ResultSet rs = st.executeQuery(sqlp);
                        while (rs.next()) {
                            dizi[i][0] = String.valueOf(i + 1);
                            dizi[i][1] = rs.getString("p_id");
                            dizi[i][2] = rs.getString("ad");
                            dizi[i][3] = rs.getString("soyad");
                            dizi[i][4] = rs.getString("telno");
                            dizi[i][5] = rs.getString("adres");
                            dizi[i][6] = rs.getString("mevki");
                            
                            i++;
                            // ad,soyad,telno,adres,mevki

                        }  
                    } catch (SQLException ex) {
                        Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
                    
                
    }return dizi;
    }

    public String[][] musteriKayitListele() {
        count = SatirSayisi("mustablo");
        String[][] dizi = new String[count][9];
         if(count==0)
               { 
                     
                   if(butonClick.equals("musLis"))
                   {
                       butonClick=null;
                       JOptionPane.showMessageDialog(null, "Listelenecek  Veri Bulunamadı!!!.");
                   }
               }
        try {
            int i = 0;
            st = con.createStatement();
            String sqlm = "SELECT * FROM musTABLO order by m_id;";
            ResultSet rs = st.executeQuery(sqlm);
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i + 1);
                dizi[i][1] = rs.getString("m_id");
                dizi[i][2] = rs.getString("ad");
                dizi[i][3] = rs.getString("soyad");
                dizi[i][4] = rs.getString("telno");
                dizi[i][5] = rs.getString("adres");
                dizi[i][6] = rs.getString("salonturu");
                dizi[i][7] = rs.getString("nitelik");
                dizi[i][8] = rs.getString("tarih");

                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dizi;
    }

    public String[][] urunKayitListele() {
         count = SatirSayisi("uruntablo");
        String[][] dizi = new String[count][4];
         if(count==0)
               { 
                     
                   if(butonClick.equals("urunLis"))
                   {
                       butonClick=null;
                       JOptionPane.showMessageDialog(null, "Listelenecek  Veri Bulunamadı!!!.");
                   }
               }
        try {
            int i = 0;
            st = con.createStatement();
            String sqlur = "SELECT * FROM uruntablo order by ur_id;";
            ResultSet rs = st.executeQuery(sqlur);
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i + 1);
                dizi[i][1] = rs.getString("ur_id");
                dizi[i][2] = rs.getString("ad");
                dizi[i][3] = rs.getString("turu");

                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dizi;
    }

    public String[][] kiralamaKayitListele() {
         count = SatirSayisi("kiratablo");
        String[][] dizi = new String[count][10];
         if(count==0)
               { 
                     
                   if(butonClick.equals("kiralamaLis"))
                   {
                       butonClick=null;
                       JOptionPane.showMessageDialog(null, "Listelenecek  Veri Bulunamadı!!!.");
                   }
               }
        try {
            int i = 0;
            st = con.createStatement();
            String sqlkira = "SELECT * FROM kiraTABLO order by ki_id;";
            ResultSet rs = st.executeQuery(sqlkira);
            while (rs.next()) {
               
                dizi[i][0] = rs.getString("ki_id");
                dizi[i][1] = rs.getString("musBilgiler");
                dizi[i][2] = rs.getString("fotografci");
                dizi[i][3] = rs.getString("muzisyen");
                dizi[i][4] = rs.getString("nitelik");
                dizi[i][5] = rs.getString("tarih");
                dizi[i][6] = rs.getString("salonTuru");

                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dizi;
    }

    public String[][] kasaKayitListele() {
         count = SatirSayisi("kasatablo");
        String[][] dizi = new String[count][6];
         if(count==0)
               { 
                     
                   if(butonClick.equals("kasaLis"))
                   {
                       butonClick=null;
                       JOptionPane.showMessageDialog(null, "Listelenecek  Veri Bulunamadı!!!.");
                   }
               }
        try {
            int i = 0;
            st = con.createStatement();
            String sqlka = "SELECT * FROM kasatablo  order by ka_id;";
            ResultSet rs = st.executeQuery(sqlka);
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i + 1);
                dizi[i][1] = rs.getString("ka_id");
                dizi[i][2] = rs.getString("musteri");
                dizi[i][3] = rs.getString("odeme");
                dizi[i][4] = rs.getString("odebilgi");
                dizi[i][5] = rs.getString("aciklama");

                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dizi;
    }

    public String[][] muzisyenKayitListele() {
         count = SatirSayisi("muzisyentablo");
          if(count==0)
               { 
                  
                   if(butonClick.equals("muzLis"))
                   {
                       butonClick=null;
                       JOptionPane.showMessageDialog(null, "Listelenecek  Veri Bulunamadı!!!.");
                   }
               }
        String[][] dizi = new String[count][5];
        try {
            int i = 0;
            st = con.createStatement();
            String sqlmuz = "SELECT * FROM muzisyentablo order by muz_id;";
            ResultSet rs = st.executeQuery(sqlmuz);
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i + 1);
                dizi[i][1] = rs.getString("muz_id");
                dizi[i][2] = rs.getString("muzad");
                dizi[i][3] = rs.getString("muzsoyad");
                dizi[i][4] = rs.getString("muztelno");

                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dizi;
    }

    public String[][] fotografciKayitListele() {
          count = SatirSayisi("fotografcitablo");
        String[][] dizi = new String[count][5];
         if(count==0)
               { 
                     
                   if(butonClick.equals("fotoLis"))
                   {
                       butonClick=null;
                       JOptionPane.showMessageDialog(null, "Listelenecek  Veri Bulunamadı!!!.");
                   }
               }
        try {
            int i = 0;
            st = con.createStatement();
            String sqlf = "SELECT * FROM fotografciTablo order by f_id;";
            ResultSet rs = st.executeQuery(sqlf);
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i + 1);
                dizi[i][1] = rs.getString("f_id");
                dizi[i][2] = rs.getString("fotoad");
                dizi[i][3] = rs.getString("fotosoyad");
                dizi[i][4] = rs.getString("fototelno");

                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dizi;
    }
    public String[][] kullaniciKayitListele() {
         count=SatirSayisi("kullanici");
        String[][] dizi = new String[count][5];
         if(count==0)
               { 
                     
                   if(butonClick.equals("kullaniciLis"))
                   {
                       butonClick=null;
                       JOptionPane.showMessageDialog(null, "Listelenecek  Veri Bulunamadı!!!.");
                   }
               }
        try {
            int i = 0;
            st = con.createStatement();
            String sqlkul= "SELECT * FROM kullanici order by ku_id;";
            ResultSet rs = st.executeQuery(sqlkul);
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i+1);
                dizi[i][1] = rs.getString("ku_id");
                dizi[i][2] = rs.getString("ad");
                dizi[i][3] = rs.getString("sifre");
                dizi[i][4] = rs.getString("yetki");
               

                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dizi;
    }

    
    
    public void personelGuncele(String adi, String d,int index) {
        try {
            
           
              String sqlp="";
              if(index==0)
              sqlp = "update perTablo set telno='"  +adi+ "' where p_id='" +d+ "'";
              else if(index==1)
              sqlp = "update perTablo set adres='" +adi+ "' where  p_id='" +d+ "'";
              else if(index==2)
              sqlp = "update perTablo set mevki='" +adi+ "' where p_id='" +d+ "'";
            st.executeUpdate(sqlp);
           
            JOptionPane.showMessageDialog(null, "Başarıyla güncellendi..");
           
        } catch (SQLException ex) {

        }

    }
    
    public void musteriGuncele(String adi, String d,int index) {
        try {
            
              String sqlm="";
              if(index==0)
              sqlm = "update musTablo set telno='"  +adi+ "' where m_id='" +d+ "'";
              else if(index==1)
              sqlm = "update musTablo set adres='" +adi+ "' where  m_id='" +d+ "'";
              else if(index==2)
              sqlm = "update musTablo set tarih='" +adi+ "' where m_id='" +d+ "'";
            st.executeUpdate(sqlm);
           
            JOptionPane.showMessageDialog(null, "Başarıyla güncellendi..");
           
        } catch (SQLException ex) {

        }

    }
    
    public void urunGuncele(String degis, String d,int index) {
        try {
           
              String sqlur="";
             sqlur = "update urunTablo set ad='" +degis+ "' where ur_id='" + d + "'";
             
            st.executeUpdate(sqlur);
            JOptionPane.showMessageDialog(null, "Başarıyla güncellendiC..");
           
        } catch (SQLException ex) {

        }

    }
    
    public void muzisyenGuncele(String degis, String d,int index) {
        try {
           
            String sqlmuz="";
            if(index==0)
             sqlmuz = "update muzisyentablo set mustelno='" + degis + "' where muz_id='" +d+ "'";
            else if(index==1)
             sqlmuz = "update muzisyentablo set muztelno='" + degis + "' where muz_id='" +d+ "'";
            st.executeUpdate(sqlmuz);
            JOptionPane.showMessageDialog(null, "Başarıyla güncellendiC..");
          
        } catch (SQLException ex) {

        }

    }
    
    public void fotografciGuncele(String degis, String d,int index) {
        try {
           
            String sqlf="";
            if(index==0)
             sqlf = "update fotografcitablo set mustelno='" + degis + "' where f_id='" +d+ "'";
            else if(index==1)
             sqlf = "update fotografcitablo set fototelno='" + degis + "' where f_id='" +d+ "'";
            st.executeUpdate(sqlf);
            JOptionPane.showMessageDialog(null, "Başarıyla güncellendiC..");
           
        } catch (SQLException ex) {

        }  
    
    }
    
    public void kiralamaGuncele(String degis, String d,int index) {
        try {
            
            String sqlkira="";
            if(index==0)
             sqlkira = "update kiratablo set nitelik='" + degis + "' where ki_id='" +d+ "'";
            else if(index==1)
             sqlkira = "update kiratablo set tarih='" + degis + "' where ki_id='" +d+ "'";
             else if(index==2)
             sqlkira = "update kiratablo set salonturu='" + degis + "' where ki_id='" +d+ "'";
            st.executeUpdate(sqlkira);
            JOptionPane.showMessageDialog(null, "Başarıyla güncellendi..");
          
        } catch (SQLException ex) {

        }  
    
    } 
    
    public void kasaGuncele(String degis, String d,int index) {
        try {
          
            String sqlka = "";
            if (index == 0) {
                sqlka = "update kasaTablo set odebilgi='" + degis + "' where ka_id='" + d + "'";
            } else if (index == 1) {
                sqlka = "update kasaTablo set aciklama='" + degis + "' where ka_id='" + d + "'";
            }
            st.executeUpdate(sqlka);
            JOptionPane.showMessageDialog(null, "Başarıyla güncellendi..");
          
        } catch (SQLException ex) {

        }

    }
    public void kullaniciGuncele(String degis, String d,int index) {
        try {
          
            String sqlkul = "";
            if (index == 0) {
                sqlkul = "update kullanici set sifre='" + degis + "' where ku_id='" + d + "'";
            } else if (index == 1) {
                sqlkul = "update kullanici set yetki='" + degis + "' where ku_id='" + d + "'";
            }
            st.executeUpdate(sqlkul);
            JOptionPane.showMessageDialog(null, "Başarıyla güncellendi..");
          
        } catch (SQLException ex) {

        }

    }
    
    
    public String[][] perfiltreListele(String aranan, String filtre) {
        int j = 0;

        try {
            rs = st.executeQuery("Select * from pertablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                j++;
            }
            count = j;
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        String dizi[][] = new String[count][7];
        try {
            int i = 0;
            rs = st.executeQuery("Select * from pertablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i + 1);
                dizi[i][1] = rs.getString("p_id");
                dizi[i][2] = rs.getString("ad");
                dizi[i][3] = rs.getString("soyad");
                dizi[i][4] = rs.getString("telno");
                dizi[i][5] = rs.getString("adres");
                dizi[i][6] = rs.getString("mevki");

                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    }
    
    public String[][] musfiltreListele(String aranan, String filtre) {
        int j = 0;

        try {
            rs = st.executeQuery("Select * from mustablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                j++;
            }
            count = j;
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        String dizi[][] = new String[count][9];
        try {
            int i = 0;
            rs = st.executeQuery("Select * from mustablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i + 1);
                dizi[i][1] = rs.getString("m_id");
                dizi[i][2] = rs.getString("ad");
                dizi[i][3] = rs.getString("soyad");
                dizi[i][4] = rs.getString("telno");
                dizi[i][5] = rs.getString("adres");
                dizi[i][6] = rs.getString("salonturu");
                dizi[i][7] = rs.getString("nitelik");
                dizi[i][8] = rs.getString("tarih");

                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    }
    
    public String[][] muzfiltreListele(String aranan, String filtre) {
        int j = 0;

        try {
            rs = st.executeQuery("Select * from muzisyentablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                j++;
            }
            count = j;
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        String dizi[][] = new String[count][5];
        try {
            int i = 0;
            rs = st.executeQuery("Select * from muzisyentablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i + 1);
                dizi[i][1] = rs.getString("muz_id");
                dizi[i][2] = rs.getString("muzad");
                dizi[i][3] = rs.getString("muzsoyad");
                dizi[i][4] = rs.getString("muztelno");
                

                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    }
    
    public String[][] fotofiltreListele(String aranan, String filtre) {
        int j = 0;

        try {
            rs = st.executeQuery("Select * from fotografcitablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                j++;
            }
            count = j;
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        String dizi[][] = new String[count][5];
        try {
            int i = 0;
            rs = st.executeQuery("Select * from fotografcitablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i + 1);
                dizi[i][1] = rs.getString("f_id");
                dizi[i][2] = rs.getString("fotoad");
                dizi[i][3] = rs.getString("fotosoyad");
                dizi[i][4] = rs.getString("fototelno");
                

                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    }
    
    public String[][] kirafiltreListele(String aranan, String filtre) {
        int j = 0;

        try {
            rs = st.executeQuery("Select * from kiratablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                j++;
            }
            count = j;
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        String dizi[][] = new String[count][10];
        try {
            int i = 0;
            rs = st.executeQuery("Select * from kiratablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
               
                dizi[i][0] = rs.getString("ki_id");
                dizi[i][1] = rs.getString("musBilgiler");
                dizi[i][2] = rs.getString("fotografci");
                dizi[i][3] = rs.getString("muzisyen");
                dizi[i][4] = rs.getString("nitelik");
                dizi[i][5] = rs.getString("tarih");
                dizi[i][6] = rs.getString("salonturu");
                

                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    }
    
    public String[][] urunfiltreListele(String aranan, String filtre) {
        int j = 0;

        try {
            rs = st.executeQuery("Select * from uruntablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                j++;
            }
            count = j;
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        String dizi[][] = new String[count][4];
        try {
            int i = 0;
            rs = st.executeQuery("Select * from uruntablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i + 1);
                dizi[i][1] = rs.getString("ur_id");
                dizi[i][2] = rs.getString("ad");
                dizi[i][3] = rs.getString("turu");
               
                

                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    }
    
    public String[][] kasafiltreListele(String aranan, String filtre) {
        int j = 0;

        try {
            rs = st.executeQuery("Select * from kasatablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                j++;
            }
            count = j;
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        String dizi[][] = new String[count][6];
        try {
            int i = 0;
            rs = st.executeQuery("Select * from kasatablo where " + filtre + "='" + aranan + "';");
            while (rs.next()) {
                dizi[i][0] = String.valueOf(i + 1);
                dizi[i][1] = rs.getString("ka_id");
                dizi[i][2] = rs.getString("musteri");
                dizi[i][3] = rs.getString("odeme");
                dizi[i][4] = rs.getString("odebilgi");
                dizi[i][5] = rs.getString("aciklama");
               
                

                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    }
    public String[][]  kullanicifiltListele(String aranan,String filtre) {
   int j=0;
        try {
            rs = st.executeQuery("Select * from kullanici where "+filtre+"='"+aranan+"';");
            while (rs.next()) {
                j++;
            }count=j;
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        String dizi[][] = new String[count][5];
        try {             
            int i = 0;
            rs = st.executeQuery("Select * from kullanici where "+filtre+"='"+aranan+"';");
            while (rs.next()) {
                dizi[i][0]= String.valueOf(i+1);             
                dizi[i][1] = rs.getString("ku_id");
                dizi[i][2] = rs.getString("ad");
                dizi[i][3] = rs.getString("sifre");   
                dizi[i][4] = rs.getString("yetki");  
                i++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    }

    public String  kullanıcıDenetleme(String ad,String sifre)  {
     String deger=null;
        try {
            rs = st.executeQuery("select * from kullanici where ad='"+ad+ "' AND sifre='" + sifre + "';");
            
            
            while(rs.next())
                deger=rs.getString("yetki");
            
           } 
        catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return deger;
       
    }

       
    public int SatirSayisi(String TabloAdi) {
        int say = 0;
        try {
            rs = st.executeQuery("select *from " + TabloAdi + ";");
            while (rs.next()) {
                say++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return say;
    }

    

}
