/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        run();
        
    }
    
public static void tampilanError(){
  System.out.println("  ___                 _ _ \n" +
" | __|_ _ _ _ ___ _ _| | |\n" +
" | _|| '_| '_/ _ \\ '_|_|_|\n" +
" |___|_| |_| \\___/_| (_|_)\n" +
"                          ");
  System.out.println("Maaf Inputan anda salah, silahkan restart programnya");
System.exit(0);
}

public static void tampilanWelcome(){
  System.out.println(" _________      .__                         __    ________          __                         \n" +
" /   _____/ ____ |  | _____    _____ _____ _/  |_  \\______ \\ _____ _/  |______    ____    ____  \n" +
" \\_____  \\_/ __ \\|  | \\__  \\  /     \\\\__  \\\\   __\\  |    |  \\\\__  \\\\   __\\__  \\  /    \\  / ___\\ \n" +
" /        \\  ___/|  |__/ __ \\|  Y Y  \\/ __ \\|  |    |    `   \\/ __ \\|  |  / __ \\|   |  \\/ /_/  >\n" +
"/_______  /\\___  >____(____  /__|_|  (____  /__|   /_______  (____  /__| (____  /___|  /\\___  / \n" +
"        \\/     \\/          \\/      \\/     \\/               \\/     \\/          \\/     \\//_____/  ");  
}
    
 public static void run(){
     Scanner in = new Scanner (System.in);
     tampilanWelcome();
     String nama="";
     int bulanLahir=0;
     int tanggaLahir=0;
     int tahunLahir=0;
       
        System.out.print("Masukk nama anda :");
        if(!in.hasNextInt()){  
        nama = in.next();    
        }
        else{
            tampilanError();
        }
        
        System.out.print("Silahkan masukkan bulan lahir anda (1-12):");
        if(in.hasNextInt()){  
        bulanLahir = in.nextInt();
            if(bulanLahir<0||bulanLahir>12){
                tampilanError();
            }
        }
        else{
            tampilanError();
        }
        
        System.out.print("Silahkan masukkan tahun lahir anda :");
        if (in.hasNextInt()){
            tahunLahir = in.nextInt();
        }
        else{
            tampilanError();
        }
        
        System.out.print("Hai "+nama+", Silahkan masukkan tanggal lahir anda (1-31):");
        if(in.hasNextInt()){
        tanggaLahir = in.nextInt();
            if(bulanLahir==2&&(tanggaLahir<0||tanggaLahir>29)){
                tampilanError();
            }
            if((bulanLahir==1&&tanggaLahir>31)||(bulanLahir==3&&tanggaLahir>31)||(bulanLahir==5&&tanggaLahir>31)||(bulanLahir==7&&tanggaLahir>31)||(bulanLahir==8&&tanggaLahir>31)||(bulanLahir==10&&tanggaLahir>31)||(bulanLahir==12&&tanggaLahir>31)){
                tampilanError();
            }
            if((bulanLahir==4&&tanggaLahir>30)||(bulanLahir==6&&tanggaLahir>30)||(bulanLahir==9&&tanggaLahir>30)||(bulanLahir==11&&tanggaLahir>30)){
                tampilanError();
            }
            if(tahunLahir%4==1&&bulanLahir==2&&tanggaLahir>28){
                tampilanError();
            }
        }
        else{
            tampilanError();
        }
                      
                        
        
        System.out.println();
        int shio = tahunLahir%12;
        String hasilShio=zodiakShio(shio);
        System.out.println("Hai "+nama+", shio mu adalah "+hasilShio+"");
        
        String hasilZodiak=zodiak(bulanLahir, tahunLahir);
        System.out.println("Zodiak mu adalah "+hasilZodiak+"");
        System.out.println(logoZodiak(hasilZodiak));
        
        System.out.println();
        String hasilAsmara=asmara(hasilZodiak);
        System.out.println("Berikut adalah hasil prediksi untuk mu");
        System.out.println("Asmara      :"+hasilAsmara);
        
        String hasilPeruntungan=peruntungan();
        System.out.println("Peruntungan :"+hasilPeruntungan);
        
        String hasilKesehatan=kesehatan();
        System.out.println("Kesehatan   :"+hasilKesehatan);
        
        String hasilKeuangan=keuangan();
        System.out.println("Keuangan    :"+hasilKeuangan);
        
 }
    
 public static String zodiakShio (int a){
     String shio = null;
     switch(a){
         case (0) : shio = "Monkey";
         break;
         case (1) : shio = "Rooster";
         break;
         case (2) : shio = "Dog";
         break;
         case (3) : shio = "Pig";
         break;
         case (4) : shio = "Rat";
         break;
         case (5) : shio = "Ox";
         break;
         case (6) : shio = "Tiger";
         break;
         case (7) : shio = "Rabbit";
         break;
         case (8) : shio = "Dragon";
         break;
         case (9) : shio = "Snake";
         break;
         case (10) : shio = "Horse";
         break;
         case (11) : shio = "Ram";
         break;
     }
     return shio;
 }
 
 public static String zodiak (int bulan, int tanggal){
   String zodiak=null;
     if((bulan==12||bulan==1)&&(tanggal>=22||tanggal<=20))
        {
            zodiak="Capricorn";
        }
        else if((bulan==1||bulan==2)&&(tanggal>=21||tanggal<=19))
        {
            zodiak="Aquarius";
        }
        else if((bulan==2||bulan==3)&&(tanggal>=20||tanggal<=20))
        {
            zodiak="Pisces";
        }
        else if((bulan==3||bulan==4)&&(tanggal>=21||tanggal<=20))
        {
            zodiak="Aries";
        }
        else if((bulan==4||bulan==5)&&(tanggal>=21||tanggal<=21))
        {
            zodiak="Taurus";
        }
        else if((bulan==5||bulan==6)&&(tanggal>=22||tanggal<=21))
        {
            zodiak="Gemini";
        }
        else if((bulan==6||bulan==7)&&(tanggal>=22||tanggal<=22))
        {
            zodiak="Cancer";
        }
        else if((bulan==7||bulan==8)&&(tanggal>=23||tanggal<=21))
        {
            zodiak="Leo";
        }
        else if((bulan==8||bulan==9)&&(tanggal>=22||tanggal<=23))
        {
            zodiak="Virgo";
        }
        else if((bulan==9||bulan==10)&&(tanggal>=24||tanggal<=23))
        {
            zodiak="Libra";
        }
        else if((bulan==10||bulan==11)&&(tanggal>=24||tanggal<=22))
        {
            zodiak="Scorpio";
        }
        else if((bulan==11||bulan==12)&&(tanggal>=23||tanggal<=21))
        {
            zodiak="Sagitarius";
        }
        else
        {
            zodiak= "Inputan tanggal atau bulan salah";
        }
     return zodiak;
 }
 
 public static String asmara (String zodiak){
    String hasilAsmara;
    if (zodiak.equals("Capricorn")){
        String[] asmara = new String[4];
         asmara[0] = "Sepertinya harus ada jarak diantara kalian. Jika memang kalian tidak bisa bersama tidak perlu di paksakan. Ikuti saja hati kamu, kebahagiaan ada ditangan kamu sendiri. Kalian masih bisa jadi teman kok";
         asmara[1] = "Kenangan masa lalu yang hanya bikin suasana dengannya menjadi panas sebaiknya dibuang saja dulu";
         asmara[2] = "Jangan abaikan atensi darinya, itu akan membikin si dia menjadi jengkel dan marah saja.";
         int index = (int) (Math.random() * 3);
         hasilAsmara = asmara[index];
    }
    
    else if (zodiak.equals("Aquarius")){
        String[] asmara = new String[4];
         asmara[0] = "Hiburlah dirinya, saat ini dia lagi banyak problem sehingga sangat memerlukan support dari Anda";
         asmara[1] = "Tak perlu mengungkit kenangan pahit di masa lalu, itu hanya bikin jengkel hatinya saja";
         asmara[2] = "Jangan remehkan kerikil-kerikil yang cukup tajam itu, segera cari solusinya";
         int index = (int) (Math.random() * 3);
         hasilAsmara = asmara[index];
    }
    
    else if (zodiak.equals("Pisces")){
        String[] asmara = new String[4];
         asmara[0] = "Topik pembicaraan yang dapat memicu suasana menjadi panas sebaiknya dihindari saja agar suasana tetap terasa mesra dan hangat";
         asmara[1] = "Jangan terlalu dimasukkan hati ucapannya itu karena begitulah orang kalau lagi emosi, jadi bersabarlah saja";
         asmara[2] = "Tetaplah membina hubungan yang baik dengannya";
         int index = (int) (Math.random() * 3);
         hasilAsmara = asmara[index];
    }
    
    else if (zodiak.equals("Aries")){
        String[] asmara = new String[4];
         asmara[0] = "Pahami segala kesulitannya sehingga Anda tak akan ragu untuk membantunya";
         asmara[1] = "Segeralah cari jalan tengah untuk menyelesaikan selisih pendapat itu";
         asmara[2] = "Tampak indah dan romantis. Pertahankan suasana yang baik ini dengan berpikiran sesederhana mungkin";
         int index = (int) (Math.random() * 3);
         hasilAsmara = asmara[index];
    }
    
    else if (zodiak.equals("Taurus")){
         String[] asmara = new String[4];
         asmara[0] = "Insan Taurus sebenarnya sangat romantis dan pénuh gairah,"
                 + "meski kadang terlihat sangat pendiam."
                 + "Bila bertemu pasangan yang sesuai,"
                 + "Taurus akan berusaha menyenangkan dan menghabiskan waktu dengannya."
                 + "Sepanjang 2016 kehidupan cinta Taurus cukup mesra";
         asmara[1] = "Cinta Anda pada pasangan jadi makin kuat. Anda mulai mengerti segalanya perihal pasangan Anda. Sesudah demikian lama terkait, Anda jadi lebih gampang menyesuaikan dengannya. Serta makin lama terasa Anda semakin mantap bila memanglah dia lah jodoh Anda. Jalinan asmara jadi dipenuhi banyak bunga warna-warni nih.";
         asmara[2] = "Minggu ini adalah waktu yang paling bagus untuk membiarkan teman teman kamu mengekspresikan keinginannya, apapun yang mereka lakukan. Mood kamu sedikitpun tidak akan terpengaruh oleh mereka karena yang kamu pikirkan hanyalah dia, pacar kamu";
         int index = (int) (Math.random() * 3);
         hasilAsmara = asmara[index];
     }
    
    else if (zodiak.equals("Gemini")){
         String[] asmara = new String[4];
         asmara[0] = "Sadarilah bahwa usia kekasih Anda memang masih terlalu hijau terutama dalam hal cinta, untuk itu bersabarlah";
         asmara[1] = "Jangan cemburu karena itu hanya akan menyiksa kedua belah pihak";
         asmara[2] = "Masih penuh dengan kegembiraan";
         int index = (int) (Math.random() * 3);
         hasilAsmara = asmara[index];
     }
    
    else if (zodiak.equals("Cancer")){
         String[] asmara = new String[4];
         asmara[0] = "Jangan menyerah! Sebenarnya si dia juga merasakan hal yang sama, cuma dia takut untuk mengungkapkannya";
         asmara[1] = "Jangan biarkan muka cemberut Anda merusak suasana yang sudah tenang ini";
         asmara[2] = "Tampak ada kemajuan dan semakin akrab saja";
         int index = (int) (Math.random() * 3);
         hasilAsmara = asmara[index];
     }
    
    else if (zodiak.equals("Leo")){
         String[] asmara = new String[4];
         asmara[0] = "Maklumilah wataknya yang terlalu banyak pertimbangan sehingga agak lambat untuk membuat keputusan";
         asmara[1] = "Bersabarlah dalam mengarungi bahtera cinta bersamanya karena selisih pendapat itu adalah hal yang wajar dan pasti terjadi";
         asmara[2] = "Kalau menuruti rasa jengkel, maka persoalan kecil akan bisa menjadi besar, maka dari itu pandai-pandailah menimbang persoalan";
         int index = (int) (Math.random() * 3);
         hasilAsmara = asmara[index];
     }
     
    else if (zodiak.equals("Virgo")){
         String[] asmara = new String[4];
         asmara[0] = "Teruslah pacu semangat Anda untuk mendapatkan posisi aman di hadapannya, hanya dengan tekad bulat dan pantang menyerah maka kesempatan akan tetap selalu terbuka";
         asmara[1] = "Cemburu buta dapat merusak segalanya maka dari itu berilah kepercayaan kepadanya";
         asmara[2] = "Masih menjengkelkan dan itu hanya masalah sepele yang sebenarnya bisa diatasi jika Anda mau sedikit mengerti";
         int index = (int) (Math.random() * 3);
         hasilAsmara = asmara[index];
     }
    
    else if (zodiak.equals("Libra")){
         String[] asmara = new String[4];
         asmara[0] = "Sepusing apapun urusan di luar sebaiknya jangan dicampuradukkan ke dalam hubungan asmara, bisa kacau jadinya";
         asmara[1] = "Percuma jika Anda hanya manis di bibir saja, akan tetapi dalam penerapannya tampak jauh sekali dari apa yang Anda ucapkan";
         asmara[2] = "Jangan salah perhitungan agar tidak menjadi pusing sendiri nantinya. Jalinlah selalu komunikasi dua arah yang baik";
         int index = (int) (Math.random() * 3);
         hasilAsmara = asmara[index];
     }
    
    else if (zodiak.equals("Scorpio")){
         String[] asmara = new String[4];
         asmara[0] = "Isu-isu yang beredar sebaiknya tidak perlu didengarkan. Cobalah lebih percaya pada apa yang diucapkan olehnya";
         asmara[1] = "Jangan hanya memikirkan indahnya untuk saat ini saja, akan tetapi kepentingan di masa depan itu yang lebih penting";
         asmara[2] = "Jangan terlalu posesif. Ingatlah bahwa si dia juga punya hak untuk bisa menemukan kebahagiaan";
         int index = (int) (Math.random() * 2);
         hasilAsmara = asmara[index];
     }
    
    else if (zodiak.equals("Sagitarius")){
         String[] asmara = new String[4];
         asmara[0] = "Ada sedikit cekcok mulut dan jika tidak ada yang mau saling mengalah, maka akan tetap seperti itu-itu saja";
         asmara[1] = "Berhati-hatilah dengan setiap ucapan yang Anda keluarkan, jangan sampai memicu pertengkaran";
         asmara[2] = "Cobalah untuk lebih bisa mawas diri agar tak mudah termakan isu yang sengaja disebar olehnya";
         int index = (int) (Math.random() * 3);
         hasilAsmara = asmara[index];
     }
    
    else{
        hasilAsmara= "Inputan salah";
    }
     
     return hasilAsmara;
 }
 
 public static String peruntungan (){
     ArrayList<String> peruntungan = new ArrayList<String>();
     peruntungan.add("Jangan abaikan feeling yang muncul secara tiba-tiba, apalagi di saat Anda berada dalam pilihan yang serba membingungkan sehingga suara hati lebih tepat dan lebih safe daripada mendengarkan dan melaksanakan omongan orang");
     peruntungan.add("Setiap tawaran yang datang bisa ditindaklanjuti. Tak perlu khawatir akan mendapat ganjalan dari beberapa rival Anda. Di hari ini dewi fortuna memayungi perjalanan nasib Anda sehingga Anda bisa sedikit ringan bebannya");
     peruntungan.add("Lakukan hipotesis yang tepat dari semua kejadian akhir-akhir ini. Tak perlu takut untuk gagal. Bukankah keberhasilan itu tidak bisa terlepas dari kegagalan, maka dari itu yang penting jalan dulu");
     peruntungan.add("Jangan terus mempermasalahkan persoalan yang tak terlalu penting apalagi kalau hanya berlandaskan gengsi saja karena itu akan sangat berdampak buruk bagi kelangsungan bisnis dan karir Anda yang mulai gencar diserang dari kanan dan kiri");
     peruntungan.add("Tak perlu terlalu terbebani oleh permasalahan yang memusingkan itu. Biarkan masalah itu bergulir sebagaimana mestinya. Tidak perlu dipaksakan selesai dalam waktu yang singkat");
     peruntungan.add("Jangan berhenti untuk selalu berkreasi, walaupun secara fisik kurang begitu bergairah dan bersemangat akan tetapi secara batin harus tetap selalu berkarya. Kesampingkan dulu keinginan-keinginan yang tidak perlu dan belum waktunya untuk Anda kerjakan");
     peruntungan.add("Simpanlah rahasia pribadi Anda rapat-rapat. Jangan sampai terpancing omongan dari teman-teman Anda yang akhirnya membuka aib sendiri. Ingatlah bahwa teman yang sepintas kelihatan baik belum tentu baik hatinya");
     peruntungan.add("Tak perlu bimbang dan takut gagal karena peruntungan masih memayungi mu sehingga jika ada urusan yang penting dan terlalu beresiko tinggi tetap laksanakan saja, tidak perlu berhenti ataupun mundur selangkahpun");
     peruntungan.add("Kewaspadaan masih diperlukan di hari ini, terutama dalam melaksanakan segala rencana penting. Jangan sampai kesembronoan menghancurkan segala yang sudah hampir ada di tangan");
     peruntungan.add("Masih banyak rencana yang harus diselesaikan dan ditangani secara lebih profesional lagi, untuk itu hindarilah melakukan kegiatan yang hanya akan bikin masalah baru");
     peruntungan.add("Jangan terlalu menaruh harapan pada orang lain. Itu akan menimbulkan kekecewaan yang mendalam seandainya hasilnya jauh dari harapan Anda. Cobalah untuk bersikap lebih mandiri saja supaya apapun hasilnya tidak terlalu membikin down hati Anda");
     peruntungan.add("Inilah saatnya untuk memacu motivasi kerja Anda. Jangan hanya diam dan pasrah dengan keadaan ini, sebab akan bisa fatal akibatnya. Apalagi di hari ini nasib dan peruntungan kurang begitu baik sehingga jalan yang dilalui akan penuh dengan lubang-lubang yang harus dihindari");
     
     int x = (int) (Math.random() * 13);
     String hasilPeruntungan=peruntungan.get(x);
     return hasilPeruntungan;
 }
 
 public static String kesehatan (){
 LinkedList<String> kesehatan = new LinkedList<String>();
     kesehatan.add("Perbanyaklah makan sayur dan buah-buahan, begitu juga dengan waktu istirahat sebaiknya benar-benar diperhatikan dan usahakan untuk tidak sering keluar malam");
     kesehatan.add("Hindari makan pedas jika tak ingin acara yang santai ini menjadi terganggu");
     kesehatan.add("Nikmati suasana santai ini dengan pemikiran yang rileks dan tenang");
     kesehatan.add("Hindari udara malam yang kurang bersahabat terhadap kondisi badan Anda");
     kesehatan.add("Pikiran harus tetap tenang dan dingin walaupun hati terasa panas. Cobalah Anda bekerja sedikit lebih rileks sehingga pikiran terhindarkan dari ketegangan, yang tentu saja itu akan berdampak langsung pada kesehatan Anda");
     kesehatan.add("Jaga kondisi badan agar tetap fit dengan terus berolahraga walaupun yang ringan-ringan saja");
     kesehatan.add("Apa salahnya sejenak perut diisi dulu baru melanjutkan tugas? Jika sampai jatuh sakit bukankah pekerjaan Anda menjadi kacau");
     kesehatan.add("Kondisi badan Anda masih rentan terhadap penyakit. Mintalah nasihat dokter untuk mengantisipasinya dan patuhilah");
     kesehatan.add("Hindari minuman-minuman keras karena jelas kurang baik bagi kesehatan. Oleh karena itu kurangi pesta-pesta yang sering melibatkan jenis minuman tersebut");
     kesehatan.add("Kondisi yang tampak lemah bukan berarti Anda harus berobat, mungkin saja Anda kurang istirahat");
     kesehatan.add("Bersikaplah lepas, tak perlu hati Anda tersakiti oleh pemikiran yang seharusnya tak perlu Anda pikirkan");
     kesehatan.add("Kondisi badan tampak kurang menunjang sehingga perlu istirahat yang cukup dan pola makan yang benar");
     
     int x = (int) (Math.random() * 13);
     String hasilKesehatan=kesehatan.get(x);
     return hasilKesehatan;
 }

 public static String keuangan (){
    HashMap<Integer, String> keuangan = new HashMap<Integer, String>();
    keuangan.put(0, "Jika Anda memutuskan untuk membeli baju dan sepatu baru usahakan di tempat yang obral dan penuh diskon");
    keuangan.put(1, "Solusi untuk kecemasan masalah keuangan terletak pada orang dekat Anda");
    keuangan.put(2, "Income masih cukup baik dan selalu mengalir, untuk itu tak perlu cemas");
    keuangan.put(3, "Pengeluaran sulit untuk dikendalikan dan jika dibiarkan maka bukan tidak mungkin dana Anda akan cukup terkuras");
    keuangan.put(4, "Simpanlah dana yang cukup berlebih dan jangan diobral begitu");
    keuangan.put(5, "Walaupun pemasukan masih lancar tetapi jika tidak dimanage dengan baik maka bukan tidak mungkin pemborosan akan membikin Anda pusing di minggu ini");
    keuangan.put(6, "Tampak lancar-lancar saja dan tidak ada hambatan yang begitu berarti");
    keuangan.put(7, "Kebutuhan di minggu ini lumayan tinggi, belum lagi masalah datang secara mendadak dan cukup bikin kacau keuangan Anda");
    keuangan.put(8, "Makan seadanya tak masalah yang penting tak punya tanggungan");
    keuangan.put(9, "Apa sulitnya bersikap hidup sederhana agar biaya hidup tidak terus membengkak");
    keuangan.put(10,"Jangan biarkan kepala menjadi pusing di kala mendapat uang banyak");
    keuangan.put(11, "Pemasukan masih lumayan lancar, hanya saja terhadap orang yang minta pinjaman sebaiknya jangan diberi dulu");
    
    int x = (int) (Math.random() * 12);
    String hasilKeuangan=keuangan.get(x);
    return hasilKeuangan;
    
 }
 
 public static String logoZodiak (String zodiak){
     String hasilAsmara=null;
    if (zodiak.equals("Capricorn")){
    hasilAsmara="            _\n" +
"    \\      /_)    Capricorn-  The Goat\n" +
"     \\    /`.\n" +
"      \\  /   ;\n" +
"       \\/ __.'";    
    }
    
    else if (zodiak.equals("Aquarius")){
    hasilAsmara=" .-\"-._.-\"-._.-   Aquarius-  The Water Bearer\n" +
" .-\"-._.-\"-._.-";    
    }
    
    else if (zodiak.equals("Pisces")){
    hasilAsmara="     `-.    .-'   Pisces-  The Fishes\n" +
"        :  :\n" +
"      --:--:--\n" +
"        :  :\n" +
"     .-'    `-. ";    
    }
    
    else if (zodiak.equals("Aries")){
    hasilAsmara="   .-.   .-.\n" +
"  (_  \\ /  _)    Aries-  The Ram\n" +
"       |\n" +
"       |";    
    }
    
    else if (zodiak.equals("Taurus")){
     hasilAsmara="    .     .\n" +
"    '.___.'      Taurus-  The Bull\n" +
"    .'   `.    \n" +
"   :       :   \n" +
"   :       :\n" +
"    `.___.' ";    
     }
    
    else if (zodiak.equals("Gemini")){
     hasilAsmara="    ._____.\n" +
"      | |        Gemini-  The Twins\n" +
"      | |\n" +
"     _|_|_\n" +
"    '     '";    
     }
    
    else if (zodiak.equals("Cancer")){
     hasilAsmara="      .--.\n" +
"     /   _`.     Cancer-  The Crab\n" +
"    (_) ( )\n" +
"   '.    /\n" +
"     `--' ";    
     }
    
    else if (zodiak.equals("Leo")){
     hasilAsmara="      .--.\n" +
"     (    )       Leo-  The Lion\n" +
"    (_)  /\n" +
"        (_,";    
     }
     
    else if (zodiak.equals("Virgo")){
     hasilAsmara="   ' `:--.--.\n" +
"     |  |  |_     Virgo-  The Virgin\n" +
"     |  |  | )\n" +
"     |  |  |/\n" +
"          (J";    
     }
    
    else if (zodiak.equals("Libra")){
      hasilAsmara="        __\n" +
"   ___.'  '.___   Libra-  The Balance\n" +
"   ____________";   
     }
    
    else if (zodiak.equals("Scorpio")){
         hasilAsmara = "   _\n" +
"  ' `:--.--.\n" +
"     |  |  |      Scorpius-  The Scorpion\n" +
"     |  |  |\n" +
"     |  |  |  ..,\n" +
"           `---':";
     }
    
    else if (zodiak.equals("Sagitarius")){
      hasilAsmara="          ...\n" +
"          .':     Sagittarius-  The Archer\n" +
"        .'\n" +
"    `..'\n" +
"    .'`.";   
     }
    
    else{
        hasilAsmara= "Inputan salah";
    }
     
     return hasilAsmara;
    }
}
