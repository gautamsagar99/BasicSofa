package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.google.ar.core.Anchor;
import com.google.ar.core.HitResult;
import com.google.ar.core.Plane;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.HitTestResult;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.ux.BaseArFragment;
import com.google.ar.sceneform.ux.TransformableNode;
import android.os.Bundle;

public class CatalogFrontActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_front);



    }

    public void card1(View view) {
//        Toast.makeText(this, "You have clicked P1", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(view.getContext(),BedActivity.class);
        view.getContext().startActivity(intent);
    }
    public void card2(View view) {
//        Toast.makeText(this, "You have clicked P1", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(view.getContext(),ChairActivity.class);
        view.getContext().startActivity(intent);
    }
    public void card3(View view) {
//        Toast.makeText(this, "You have clicked P1", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(view.getContext(),MainActivity.class);
        view.getContext().startActivity(intent);
    }
    public void card4(View view) {
//        Toast.makeText(this, "You have clicked P1", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(view.getContext(),KitchenActivity.class);
        view.getContext().startActivity(intent);
    }
    public void card5(View view) {
//        Toast.makeText(this, "You have clicked P1", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(view.getContext(),LampActivity.class);
        view.getContext().startActivity(intent);
    }
    public void card6(View view) {
//        Toast.makeText(this, "You have clicked P1", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(view.getContext(),ShowerActivity.class);
        view.getContext().startActivity(intent);
    }




}

