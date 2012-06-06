package com.pernix.galeria;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;

public class ScrumDroid extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                showDialog(position);
            }
        });
    }
    
    protected Dialog onCreateDialog(int id) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog);
        dialog.setTitle("Galería de Imágenes");
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);

        final ImageView image = (ImageView) dialog.findViewById(R.id.image);
        image.setImageResource(ImageAdapter.image[id]);
        
        return dialog;
    }
}