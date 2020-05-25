package com.example.customelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.sheikh_mujibur_rahman,R.drawable.tagore,R.drawable.kazi_nazrul_islam,R.drawable.a_k_fazlul_hoque,R.drawable.netaji_subhas_chandra_bose,R.drawable.begum_rokeya,R.drawable.jagadish_chandra_bose,R.drawable.ishwar_chandra_vidyasagar,R.drawable.fakir_lalon_shah,R.drawable.satyajit_ray_in};
    String[] NAMES = {"Sheikh Mujibur Rahman","Rabindranath Tagore","Kazi Nazrul Islam","A. K. Fazlul Huq","Subash Chandra Bose","Begum Rokeya","Jagadish Chandra Bose","Ishwar Chandra Vidyasagar","Lalon Shah","Satyajit Ray",};
    String[] TITLE = {"Bangabandhu","Kobi Guru","Bidrohi Kobi","Sher-e-Bangla","Netaji","Social Reformer","Acharya","Vidyasagar","Baul Shamrat, Fakir","Filmmaker",};
    String[] DESCRIPTION = {
            "Founding Father of Bangladesh. Firebrand politician who shook the foundation of Pakistan and carved out its eastern wing as sovereign Bangladesh. \n Led Bengali's decade long struggle for independence against then autocratic regime, finally resulting the Bangladesh Liberation War and the independence of Bangladesh in 1971.\n" +
                    "Served twice as President and once as Prime Minister of Bangladesh after independence. Assassinated along with almost entire family in military coup.",
            "Referred by many as the Bengali Shakespeare. Most successful and influential writer in Bengali literature. First Nobel Prize winner from Asia. Composer of national anthems of India and Bangladesh.",
            "Renown for lifelong struggle and fiery writings against British colonial rule. Equally popular for romantic and religious (both Islamic and Hindu) poems and songs. Made National Poet of Bangladesh in 1972.",
            "First Prime Minister of undivided Bengal during British rule. First ever democratically elected leader of Bengali nation. Renown for unshakable stance on principles and for pro-poor policies. After partition, served as Chief Minister and Governor of East Pakistan.",
            "One of the principal figures of Indian Independence Movement. Built own army to fight against British colonial rule. Visited around the globe to seek support and assistance for India's independence.",
            "Pioneer of Bengali women uprising. Within the conservative socio-system of her time, managed to educate herself and later became a popular writer and educationist. Inspired millions of girls and women to educate themselves and obtain self-reliance.",
            "Major pioneer in researching radio and microwave optics. Made groundbreaking contributions to plant science. Laid the foundation of experimental science in Indian subcontinent.",
            "Modified Bengali alphabet and typography. Introduced social reforms including widow marriage in the region. A key figure of Bengal Renaissance.",
            "Cultural icon of Bengal and most celebrated Baul saint in history. Often compared with Confucius of China. Inspired prominent figures including from Tagore, Nazrul to Allen Ginsberg.",
            "Regarded as one of the greatest filmmaker of all time.[8] Second Oscar winner from India and first to won Honorary Oscar Award in 1992. Started new era of Indian cinema. One of the most successful writers in modern age Bengali literature. Showed great talent in music and drawing too.",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView =  (ListView) findViewById(R.id.ListView);

        CustomeAdapter customeAdapter = new CustomeAdapter();
        listView.setAdapter(customeAdapter);
    }

    class CustomeAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customelayout, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            TextView textView_name = (TextView) view.findViewById(R.id.textView_name);
            TextView textView_title = (TextView) view.findViewById(R.id.textView_title);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_title.setText(TITLE[i]);
            return view;
        }
    }
}
