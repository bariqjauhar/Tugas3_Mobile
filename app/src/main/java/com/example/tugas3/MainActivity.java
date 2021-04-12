package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> tanamanDetail = new ArrayList<>();
    private ArrayList<String> namaTanaman = new ArrayList<>();
    private ArrayList<String> namaIlmiah = new ArrayList<>();
    private ArrayList<String> tanaman = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
    }
    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(tanaman, namaTanaman, namaIlmiah, tanamanDetail, info, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void getData() {
        tanaman.add("https://upload.wikimedia.org/wikipedia/commons/6/6f/Capsicum_frutescens_%283%29.jpg");
        namaTanaman.add("Cabai Rawit");
        namaIlmiah.add("Capsicum annuum 'Bird's Eye'");
        tanamanDetail.add("https://www.greeners.co/wp-content/uploads/2019/01/Cabe-Rawit-Si-Kecil-Pedas-Kaya-Kandungan-Kesehatan.jpg");
        info.add(" Cabai rawit adalah buah dan tumbuhan anggota genus Capsicum yang buahnya tumbuh menjulang menghadap ke atas. Warna buahnya hijau kecil sewaktu muda dan jika telah masak berwarna merah tua. Bila ditekan buahnya terasa keras karena jumlah bijinya sangat banyak.\n" +
                " Famili\t: Solanaceae\n Ordo\t\t\t\t\t\t: Solanales\n Tingkatan Takson\t\t\t\t\t: Kultivar\n Kerajaan\t\t\t: Plantae");

        tanaman.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2020/5/11/8522332/8522332_fc1c7d7f-226e-433c-88fc-9aa4727b22e3_965_965.jpg");
        namaTanaman.add("Terung");
        namaIlmiah.add("Solanum melongena");
        tanamanDetail.add("https://images.tokopedia.net/img/cache/700/product-1/2016/6/20/9909746/9909746_dd7935a7-7f0e-46de-8188-098c9f9fee12.jpg");
        info.add(" Terung adalah tumbuhan penghasil buah yang dijadikan sayur-sayuran. Asalnya adalah India dan Sri Lanka. Terung berkerabat dekat dengan kentang dan leunca, dan agak jauh dari tomat. Terung ialah terna yang sering ditanam secara tahunan. Tanaman ini tumbuh hingga 40–150 cm tingginya.\n" +
                " Famili\t: Solanaceae\n Ordo\t\t\t\t\t\t: Solanales\n Tingkatan Takson\t\t\t\t\t: Spesies\n Kerajaan\t\t\t: Plantae");

        tanaman.add("https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//86/MTA-2720900/rezeki-fresh-market_rezeki-fresh-market-mangga-harum-manis--0-9-1-1-kg-3-4-pcs-_full02.jpg");
        namaTanaman.add("Mangga");
        namaIlmiah.add("Mangifera indica");
        tanamanDetail.add("https://thehijau.com/wp-content/uploads/2018/09/5ed055cc3846b2f013c2ae4d5d768545.jpeg");
        info.add(" Mangga atau mempelam adalah nama sejenis buah, demikian pula nama pohonnya. Mangga termasuk ke dalam marga Mangifera, yang terdiri dari 35-40 anggota dari suku Anacardiaceae. Nama \"mangga\" berasal dari bahasa Tamil," +
                " Famili\t: Anacardiaceae\n Ordo\t\t\t\t\t\t: Magnoliopsida\n Tingkatan Takson\t\t\t\t\t: M. indica\n Kerajaan\t\t\t: Plantae");

        tanaman.add("https://asset.kompas.com/crops/jglhOjivGnsycy3U10Q9zl2mFow=/0x39:676x490/750x500/data/photo/2020/02/20/5e4e5b40c6428.jpg");
        namaTanaman.add("Durian");
        namaIlmiah.add("Durio zibethinus");
        tanamanDetail.add("https://rumahtanaman.com/wp-content/uploads/2019/01/sifat-dari-tanaman-durian-monthong.jpg");
        info.add(" Durian adalah nama tumbuhan tropis yang berasal dari wilayah Asia Tenggara, sekaligus nama buahnya yang bisa dimakan. Nama ini diambil dari ciri khas kulit buahnya yang keras dan berlekuk-lekuk tajam sehingga menyerupai duri. Sebutan populernya adalah \"raja dari segala buah\"." +
                " Famili\t: Durio\n Ordo\t\t\t\t\t\t:  Malvales\n Tingkatan Takson\t\t\t\t\t: Spesies\n Kerajaan\t\t\t: Plantae");

        tanaman.add("https://upload.wikimedia.org/wikipedia/commons/0/02/Mangosteen.jpeg");
        namaTanaman.add("Manggis");
        namaIlmiah.add("Garcinia mangostana");
        tanamanDetail.add("https://cf.shopee.co.id/file/8b5a3c367c9f9cb06932b78014dd72f8");
        info.add(" Manggis adalah sejenis pohon hijau abadi dariG. mangostana daerah tropika yang diyakini berasal dari Semenanjung Malaya dan menyebar ke Kepulauan Nusantara. Tumbuh hingga mencapai 7 sampai 25 meter. Buahnya juga disebut manggis, berwarna merah keunguan ketika matang, meskipun ada pula varian yang kulitnya berwarna merah." +
                " Famili\t: Clusiaceae\n Ordo\t\t\t\t\t\t:  G. mangostana\n Tingkatan Takson\t\t\t\t\t: Magnoliopsida\n Kerajaan\t\t\t: Plantae");

        tanaman.add("https://1.bp.blogspot.com/-poDiFT-mYRk/XxPr73jhYxI/AAAAAAAAD9k/VvbKVeSEoroqnNfdXtv_LATN_FVt8KNBQCLcBGAsYHQ/s690/Tips%2BMenanam%2BPohon%2BPepaya%2BAgar%2BDapat%2BBerbuah.jpg");
        namaTanaman.add("Pepaya");
        namaIlmiah.add("Carica papaya");
        tanamanDetail.add("https://asset.kompas.com/crops/7KukJhLAtCUkZAglI17QlQco8LM=/0x0:996x664/750x500/data/photo/2020/06/25/5ef4204d9c44c.jpg");
        info.add(" Pepaya, atau betik adalah tumbuhan yang berasal dari Meksiko bagian selatan dan bagian utara dari Amerika Selatan, dan kini menyebar luas dan banyak ditanam di seluruh daerah tropis untuk diambil buahnya. C. papaya adalah satu-satunya jenis dalam genus Carica." +
                " Famili\t: Caricaceae\n Ordo\t\t\t\t\t\t:  Carica\n Tingkatan Takson\t\t\t\t\t: Spesies\n Kerajaan\t\t\t: Plantae");

        tanaman.add("https://cdn1-production-images-kly.akamaized.net/Z7HA5nVPiMDBkmcAwgkOZMWmsH4=/640x480/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3043851/original/062810500_1581048315-rambutan-2477584_960_720.jpg");
        namaTanaman.add("Rambutan");
        namaIlmiah.add("Nephelium lappaceum");
        tanamanDetail.add("https://kabartani.com/wp-content/uploads/2016/06/Kabartani-rambutan-640x428.jpg");
        info.add(" Rambutan adalah tanaman tropis yang tergolong ke dalam suku lerak-lerakan atau Sapindaceae, berasal dari daerah kepulauan di Asia Tenggara. Kata \"rambutan\" berasal dari bentuk buahnya yang mempunyai kulit menyerupai rambut." +
                " Famili\t: Sapindaceae\n Ordo\t\t\t\t\t\t:  Sapindales\n Tingkatan Takson\t\t\t\t\t: Nephelium\n Kerajaan\t\t\t: Plantae");

        tanaman.add("https://cf.shopee.co.id/file/1a01a78a9fba28f97b33648dea01be5a");
        namaTanaman.add("Stroberi");
        namaIlmiah.add("Fragaria × ananassa");
        tanamanDetail.add("data:image/jpeg;base64,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");
        info.add(" Stroberi atau tepatnya stroberi kebun adalah sebuah varietas stroberi yang paling banyak dikenal di dunia. Seperti spesies lain dalam genus Fragaria, buah ini berada dalam keluarga Rosaceae." +
                " Famili\t: \n Ordo\t\t\t\t\t\t: Rosales\n Tingkatan Takson\t\t\t\t\t: Magnoliopsida\n Kerajaan\t\t\t: Plantae");

        tanaman.add("https://8villages-dashboard.s3.amazonaws.com/1600056030-872-52508.jpg");
        namaTanaman.add("Kaktus");
        namaIlmiah.add("Cactaceae");
        tanamanDetail.add("https://images.tokopedia.net/img/cache/700/VqbcmM/2020/6/18/a50c88e3-43dd-44e6-bd2a-0fa873464a3c.jpg");
        info.add(" Kaktus adalah nama yang diberikan untuk anggota tumbuhan berbunga famili Cactaceae. Kaktus dapat tumbuh pada waktu yang lama tanpa air. Kaktus biasa ditemukan di daerah-daerah yang kering. Kata jamak untuk kaktus adalah kakti." +
                " Famili\t: Clusiaceae\n Ordo\t\t\t\t\t\t:  G. mangostana\n Tingkatan Takson\t\t\t\t\t: Magnoliopsida\n Kerajaan\t\t\t: Plantae");

        tanaman.add("https://www.kampustani.com/wp-content/uploads/2019/11/budidaya-kangkung-cabut.jpg");
        namaTanaman.add("Kangkung");
        namaIlmiah.add("Ipomoea aquatica");
        tanamanDetail.add("https://idnmedis.com/wp-content/uploads/2020/03/kangkung-1-1200x675-cropped.jpg");
        info.add(" Manggis adalah sejenis pohon hijau abadi dariG. mangostana daerah tropika yang diyakini berasal dari Semenanjung Malaya dan menyebar ke Kepulauan Nusantara. Tumbuh hingga mencapai 7 sampai 25 meter. Buahnya juga disebut manggis, berwarna merah keunguan ketika matang, meskipun ada pula varian yang kulitnya berwarna merah." +
                " Famili\t: Clusiaceae\n Ordo\t\t\t\t\t\t:  G. mangostana\n Tingkatan Takson\t\t\t\t\t: Magnoliopsida\n Kerajaan\t\t\t: Plantae");

        prosesRecyclerViewAdapter();

    }


}