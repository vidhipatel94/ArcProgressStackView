package devlight.io.sample;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import devlight.io.library.ArcProgressStackView;

import static devlight.io.library.ArcProgressStackView.Model;
import static devlight.io.sample.MainActivity.MODEL_COUNT;

/**
 * Created by GIGAMOLE on 9/21/16.
 */

public class PresentationActivity extends Activity {

    private int mCounter = 0;

    private ArcProgressStackView mArcProgressStackView;
    
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);

        mArcProgressStackView = (ArcProgressStackView) findViewById(R.id.apsv_presentation);
        mArcProgressStackView.setShadowColor(Color.argb(200, 0, 0, 0));
        mArcProgressStackView.setAnimationDuration(1000);
        mArcProgressStackView.setSweepAngle(270);

        final String[] stringColors = getResources().getStringArray(R.array.devlight);
        final String[] stringBgColors = getResources().getStringArray(R.array.bg);

        final int[] colors = new int[MODEL_COUNT];
        final int[] bgColors = new int[MODEL_COUNT];
        for (int i = 0; i < MODEL_COUNT; i++) {
            colors[i] = Color.parseColor(stringColors[i]);
            bgColors[i] = Color.parseColor(stringBgColors[i]);
        }

        final ArrayList<ArcProgressStackView.Model> models = new ArrayList<>();
        models.add(new Model("STRATEGY", 1, bgColors[0], colors[0]));
        models.add(new Model("DESIGN", 1, bgColors[1], colors[1]));
        models.add(new Model("DEVELOPMENT", 1, bgColors[2], colors[2]));
        models.add(new Model("QA", 1, bgColors[3], colors[3]));
        mArcProgressStackView.setModels(models);

        final ValueAnimator valueAnimator = ValueAnimator.ofFloat(1.0F, 105.0F);
        valueAnimator.setDuration(800);
        valueAnimator.setStartDelay(200);
        valueAnimator.setRepeatMode(ValueAnimator.RESTART);
        valueAnimator.setRepeatCount(MODEL_COUNT - 1);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(final Animator animation) {
                animation.removeListener(this);
                animation.addListener(this);
                mCounter = 0;

                for (final Model model : mArcProgressStackView.getModels()) model.setProgress(1);
                mArcProgressStackView.animateProgress();
            }

            @Override
            public void onAnimationRepeat(final Animator animation) {
                mCounter++;
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(final ValueAnimator animation) {
                mArcProgressStackView.getModels().get(Math.min(mCounter, MODEL_COUNT - 1))
                        .setProgress((Float) animation.getAnimatedValue());
                mArcProgressStackView.postInvalidate();
            }
        });

        mArcProgressStackView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if (valueAnimator.isRunning()) return;
                if (mArcProgressStackView.getProgressAnimator().isRunning()) return;
                valueAnimator.start();
            }
        });
    }
}
