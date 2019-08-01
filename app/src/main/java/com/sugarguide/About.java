package com.sugarguide;

/* Tanggal : 11 Juli 2019
   Nama    : Agung Nugraha
   Nim     : 10116412
   Kelas   : AKB9-IF9 2016
*/

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mehdi.sakout.aboutpage.Element adsElement = new mehdi.sakout.aboutpage.Element();


        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.main)
                .setDescription("Sugar Guide App")
                .addItem(new mehdi.sakout.aboutpage.Element().setTitle("Version1.0"))
                .addGroup("Connect with me")
                .addEmail("agungn351@email.unikom.ac.id")
                .addWebsite("www.sugarguide.com")
                .addFacebook("NugrahaPlatinum")
                .addTwitter("Aingdidie")
                .addYoutube("UCFrUM2tasvnB7DytHDZeplw")
                .addPlayStore("com.sugarguide")
                .addInstagram("aingdidie")
                .addGitHub("Kntheory")
                .addItem(createCopyright())
                .create();

        setContentView(aboutPage);


    }

    private mehdi.sakout.aboutpage.Element createCopyright() {



        mehdi.sakout.aboutpage.Element copyright = new Element();
        final String copyrightString = String.format("copyright %d by Agung Nugraha", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setIcon(R.drawable.main);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                Toast.makeText(About.this, copyrightString, Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;

        }
    }
