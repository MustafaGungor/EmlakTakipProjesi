/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author speakingJoy
 */
public final class Veritabani {
    
    String username="root";
    String password="";
    String hostname="jdbc:mysql://localhost:3306/emlak?useUnicode=true&characterEncoding=UTF-8";
    Connection connect;
    Statement state;
    ResultSet result;
    public static String butonClick=null;
    
    public Veritabani(){
        try {
            connect = DriverManager.getConnection(hostname, username, password);
            EmlakTuruTablosu();
            EmlakciTablosu();//Tablo Oluşturma Burada Yapılıyor
            MusteriTablosu();
            EmlakCesitTablosu();
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EmlakciTablosu(){
        try {
            String emlakci="create table emlakci(id integer primary key auto_increment,"
                    + "isletme_ad text,yetkili_kisi varchar(155),"
                    + "kullanici_ad varchar(155),"
                    + "sifre varchar(155),"
                    + "telefon_no varchar(11),"
                    + "fax_no varchar(11),"
                    + "adres text)";
            
            state=connect.createStatement();
            state.execute(emlakci);
            
        } catch (SQLException ex) {
        }
    
    }
    public String[][] AramaYap(String metrekare,String odaSayisi,String cephe,String banyoSayisi,String tuvaletSayisi,String bulunduguKat){
        String dizi[][]=new String[100][12];
        try {
            int i=0;
            String emlakAra = "select * from emlak where metrekare='"
                    + metrekare
                    + "' and cephesi='"
                    + cephe
                    + "' and odaSayisi='"
                    + odaSayisi
                    + "' and banyosayisi='"
                    + banyoSayisi
                    + "' and tuvaletsayisi='"
                    + tuvaletSayisi
                    + "' and bulundugu_kat='"
                    + bulunduguKat
                    + "'";
            state=connect.createStatement();
            result=state.executeQuery(emlakAra);
            while(result.next()){
                dizi[i][0]=result.getString("emlak_id");
                dizi[i][1]=result.getString("emlak_turu");
                dizi[i][2]=result.getString("sahibi");
                dizi[i][3]=result.getString("adres");
                dizi[i][4]=result.getString("fiyat");
                
                i++;        
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    }
    public void MusteriTablosu(){
        try {
            String musteri="create table musteri(musteri_id integer primary key auto_increment,"
                    + "musteri_ad varchar(55),"
                    + "musteri_soyad varchar(55),"
                    + "ev_tel varchar(11),"
                    + "cep_tel varchar(11),"
                    + "email_adres varchar(100)"
                    + ")";
            state=connect.createStatement();
            state.execute(musteri);
        } catch (SQLException ex) {
        }
        
    }
    
    public void MusteriEkle(String ad,String soyad,String ceptel,String evtel,String email){
        try {
            String musteriEkle="insert into musteri(musteri_ad,musteri_soyad,ev_tel,cep_tel,email_adres) values('"
                    + ad
                    + "','"
                    + soyad
                    + "','"
                    + evtel
                    + "','"
                    + ceptel
                    + "','"
                    + email
                    + "')";
            state=connect.createStatement();
            state.execute(musteriEkle);
        } catch (SQLException ex) {
        }
        
       
    
    }
    
    public void EmlakTuruTablosu(){
        try {
            String emlaklar="create table emlak(emlak_id integer primary key auto_increment,"
                    + "emlak_turu varchar(20),"
                    + "sahibi varchar(50),"
                    + "adres text,"
                    + "fiyat varchar(20),"
                    + "metrekare varchar(20),"
                    + "cephesi varchar(20),"
                    + "odasayisi varchar(20),"
                    + "banyosayisi varchar(20),"
                    + "tuvaletsayisi varchar(20),"
                    + "bulundugu_kat varchar(20))";
            state=connect.createStatement();
            state.execute(emlaklar);
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EmlakEkle(String emlaktur,String fiyat,String adres,String sahibi,String metre,String cephe,String odaSayisi,String banyoSayisi,String tuvaletSayisi,String bulunduguKat){
        try {
            String emlakEkle="insert into emlak(emlak_turu,sahibi,adres,fiyat,metrekare,cephesi,odasayisi,banyosayisi,tuvaletsayisi,bulundugu_kat) values('"
                    + emlaktur
                    + "','"
                    + sahibi
                    + "','"
                    + adres
                    + "','"
                    + fiyat
                    + "','"
                    + metre
                    + "','"
                    + cephe
                    + "','"
                    + odaSayisi
                    + "','"
                    + banyoSayisi
                    + "','"
                    + tuvaletSayisi
                    + "','"
                    + bulunduguKat
                    + "')";
            state=connect.createStatement();
            state.execute(emlakEkle);
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EmlakCesitTablosu(){
        try {
            String emlak_turu="create table emlaktur(emlaktur_id integer primary key auto_increment,"
                    + "turad varchar(30))";
            state=connect.createStatement();
            state.execute(emlak_turu);
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String[][] MusteriCek(){
        String dizi[][]=new String [1000][2];
        try {
            int i=0;
            
            String musteriIsim="select * from musteri";
            state=connect.createStatement();
            result=state.executeQuery(musteriIsim);
            while(result.next()){
                dizi[i][0]=result.getString("musteri_ad");
                dizi[i][1]=result.getString("musteri_soyad");
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    }
    
    public String[][] MusterileriListele(){
        String dizi[][]=new String[1000][6];
        try {
            int i=0;
            String musteriCek="select * from musteri";
            state=connect.createStatement();
            result=state.executeQuery(musteriCek);
            while(result.next()){
                dizi[i][0]=result.getString("musteri_id");
                dizi[i][1]=result.getString("musteri_ad");
                dizi[i][2]=result.getString("musteri_soyad");
                dizi[i][3]=result.getString("ev_tel");
                dizi[i][4]=result.getString("cep_tel");
                dizi[i][5]=result.getString("email_adres");
                i++;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    }
    
    public void MusterileriSil(String tabloAd,Object no){
        try {
            state=connect.createStatement();
            String musteriSil="delete from "
                    + tabloAd
                    + " where musteri_id="
                    + no+" or musteri_ad='"
                    + no+"' or musteri_soyad='"
                    + no+"' or ev_tel='"
                    + no+"' or cep_tel='"
                    + no+"' or email_adres='"
                    + no+"'";
            state.execute(musteriSil);
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public String[][] EmlaklariListele(){
        String dizi[][]=new String[1000][12];
        try {
            int i=0;
            String emlakCek="select * from emlak";
            state=connect.createStatement();
            result=state.executeQuery(emlakCek);
            while(result.next()){
                dizi[i][0]=result.getString("emlak_id");
                dizi[i][1]=result.getString("emlak_turu");
                dizi[i][2]=result.getString("sahibi");
                dizi[i][3]=result.getString("adres");
                dizi[i][4]=result.getString("fiyat");
                dizi[i][5]=result.getString("metrekare");
                dizi[i][6]=result.getString("cephesi");
                dizi[i][7]=result.getString("odasayisi");
                dizi[i][8]=result.getString("banyosayisi");
                dizi[i][9]=result.getString("tuvaletsayisi");
                dizi[i][10]=result.getString("bulundugu_kat");
                i++;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dizi;
    
    }
    
    public int KullaniciDenetleme(String kullaniciAd,String sifre){
        int deger=0;
        String kullaniciSorgula="select * from emlakci where kullanici_ad='"
                + kullaniciAd
                + "' and sifre='"
                + sifre
                + "'";
                
        try {
            state=connect.createStatement();
            result=state.executeQuery(kullaniciSorgula);
            while(result.next()){
                deger=Integer.valueOf(result.getString("sifre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Veritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
    return deger;
    }

}
