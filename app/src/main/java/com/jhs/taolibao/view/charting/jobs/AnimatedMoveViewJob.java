package com.jhs.taolibao.view.charting.jobs;

import android.animation.ValueAnimator;
import android.view.View;

import com.jhs.taolibao.view.charting.utils.Transformer;
import com.jhs.taolibao.view.charting.utils.ViewPortHandler;

/**
 * Created by Philipp Jahoda on 19/02/16.
 */
public class AnimatedMoveViewJob extends AnimatedViewPortJob {

    public AnimatedMoveViewJob(ViewPortHandler viewPortHandler, float xValue, float yValue, Transformer trans, View v, float xOrigin, float yOrigin, long duration) {
        super(viewPortHandler, xValue, yValue, trans, v, xOrigin, yOrigin, duration);
    }

    @Override
    public void onAnimationUpdate(ValueAnimator animation) {

        pts[0] = xOrigin + (xValue - xOrigin) * phase;
        pts[1] = yOrigin + (yValue - yOrigin) * phase;

        mTrans.pointValuesToPixel(pts);
        mViewPortHandler.centerViewPort(pts, view);
    }
}
